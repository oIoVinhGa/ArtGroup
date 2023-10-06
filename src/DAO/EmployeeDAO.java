package DAO;

import Entities.Employee;
import Helper.XDateHelper;
import Helper.XJDBCHelper;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author LinhptPC04737
 */
public class EmployeeDAO {

    public void insert(Employee model) {
        String sql = "INSERT INTO NhanVien (MaNV, HoTen, GioiTinh, SoDienThoai, NgaySinh, DiaChi, Email, MaLoaiNV, MaVaiTro, Hinh) VALUES (?, ?, ?, ?, CONVERT(DATE, ?), ?, ?, 1, ?,?)";
        XJDBCHelper.executeUpdate(sql,
                model.getEmployeeID(),
                model.getFullName(),
                model.isGender(),
                model.getPhone(),
                XDateHelper.toString(model.getDateOfBirth(), "yyyyMMdd"),
                model.getAddress(),
                model.getEmail(),
                model.getRoleID(),
                model.getImage());
    }

    public void insert2(Employee e) {
        String query = """
                UPDATE dbo.NhanVien SET NhanVien.TrangThaiXoa = 0, NhanVien.HoTen = ?, NhanVien.GioiTinh = ?, NhanVien.SoDienThoai = ?,
                                        NhanVien.NgaySinh = CONVERT(DATE, ?), NhanVien.DiaChi = ?, NhanVien.Email = ?, NhanVien.MaVaiTro = ?, NhanVien.Hinh = ? 
                                        WHERE NhanVien.MaNV = ?
                       """;
        XJDBCHelper.executeUpdate(query, e.getFullName(), e.isGender(), e.getPhone(),
                XDateHelper.toString(e.getDateOfBirth(), "yyyyMMdd"), e.getAddress(), e.getEmail(),
                e.getRoleID(), e.getImage(), e.getEmployeeID(), e.getImage());
    }

    public void insertAccount(Employee e) {
        String query = "UPDATE dbo.NhanVien SET TaiKhoan=?, MatKhau = ? WHERE MaNV = ?";
        XJDBCHelper.executeUpdate(query, e.getAccount(), e.getPassword(), e.getEmployeeID());
    }

    public void update(Employee model) {
        String sql = "UPDATE NhanVien SET HoTen=?, GioiTinh=?, SoDienThoai=?, NgaySinh=CONVERT(DATE,?), DiaChi=?, Email=?, MaVaiTro=?, Hinh=? WHERE MaNV=?";
        XJDBCHelper.executeUpdate(sql,
                model.getFullName(),
                model.isGender(),
                model.getPhone(),
                XDateHelper.toString(model.getDateOfBirth(), "yyyyMMdd"),
                model.getAddress(),
                model.getEmail(),
                model.getRoleID(),
                model.getImage(),
                model.getEmployeeID());
    }

    public void delete(String EmployeeID) {
        String sql = "UPDATE dbo.NhanVien SET NhanVien.TrangThaiXoa = 1 WHERE NhanVien.MaNV = ?";
        XJDBCHelper.executeUpdate(sql, EmployeeID);
    }

    public void updatePasswordEmployee(Employee e) {
        String query = "UPDATE NhanVien SET MatKhau=? Where MaNV=? AND Email=?";
        XJDBCHelper.executeUpdate(query, e.getPassword(), e.getEmployeeID(), e.getEmail());
    }

    public void updatePasswordEmployee(String id, String newPass) {
        String query = "UPDATE NhanVien SET MatKhau=? Where MaNV=? ";
        XJDBCHelper.executeUpdate(query, newPass, id);
    }
    
    public Employee findByEmail(String email, String id) throws SQLException {
        String query = "SELECT * FROM NhanVien Where TrangThaiXoa=0 and Email =? and TaiKhoan=?";
        List<Employee> list = select(query, email, id);
        return !list.isEmpty() ? list.get(0) : null;
    }

    public Employee findLogin(String pass, String id) throws SQLException {
        String query = "SELECT * FROM NhanVien Where TrangThaiXoa=0 and MatKhau =? and TaiKhoan=?";
        List<Employee> list = select(query, pass, id);
        return !list.isEmpty() ? list.get(0) : null;
    }

    public Employee findByID(String ID) throws SQLException {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=? AND TrangThaiXoa=0";
        List<Employee> list = select(sql, ID);
        return !list.isEmpty() ? list.get(0) : null;
    }

    public List<Employee> findByName(String name) throws SQLException {
        String sql = "SELECT * FROM NhanVien WHERE HoTen Like N'%" + name + "%' AND TrangThaiXoa=0";
        return select(sql);
    }

    public List<Employee> select() throws SQLException {
        String sql = "SELECT * FROM NhanVien Where TrangThaiXoa=0";
        return select(sql);
    }

    @SuppressWarnings("null")
    private List<Employee> select(String query, Object... objects) throws SQLException {
        List<Employee> list = new ArrayList<>();
        @SuppressWarnings("UnusedAssignment")
        ResultSet rs = null;
        try {
            rs = XJDBCHelper.executeQuery(query, objects);
            while (rs.next()) {
                Employee e = getModel(rs);
                list.add(e);
            }
        } finally {
//                rs.getStatement().getConnection().close();
        }

        return list;
    }

    private Employee getModel(ResultSet rs) throws SQLException {
        Employee e = new Employee();
        e.setEmployeeID(rs.getString("MaNV"));
        e.setPassword(rs.getString("MatKhau"));
        e.setFullName(rs.getString("HoTen"));
        e.setPhone(rs.getString("SoDienThoai"));
        e.setAccount(rs.getString("TaiKhoan"));
        e.setAddress(rs.getString("DiaChi"));
        e.setEmail(rs.getString("Email"));
        e.setRoleID(rs.getInt("MaVaiTro"));
        e.setTypeID(rs.getInt("MaLoaiNV"));
        e.setGender(rs.getBoolean("GioiTinh"));
        e.setDateOfBirth(rs.getDate("NgaySinh"));
        e.setImage(rs.getString("Hinh") == null ? "Username.png" : rs.getString("Hinh"));
        e.setStatus(rs.getBoolean("TrangThaiXoa"));
        return e;
    }

    /**
     * Thiết lập lại table
     *
     * @param scrollPane chứa table
     * @param table là tên bảng cần thiết lập
     * @param isSort nếu đúng thì sẽ sắp xếp bảng theo cột chỉ định
     * @param index giá trị cột cần canh giữa
     */
    public void setTable(JTable table) {
        //Thiết lập lại font chữ
        table.setFont(new Font("Roboto", Font.PLAIN, 18));
        table.setRowHeight(30);

        // Thiết lập chỉ được chọn 1 dòng trong bảng
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
