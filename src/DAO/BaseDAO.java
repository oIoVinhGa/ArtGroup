package DAO;

import Entities.Employee;
import Entities.ExportBill;
import Entities.StatusExport;
import Entities.WareHouse;
import Helper.XJDBCHelper;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public class BaseDAO {

    public WareHouseDAO wDao = new WareHouseDAO();

    /**
     * Thiết lập lại table
     *
     * @param scrollPane chứa table
     * @param table là tên bảng cần thiết lập
     * @param isSort nếu đúng thì sẽ sắp xếp bảng theo cột chỉ định
     * @param cols
     * @param index giá trị cột cần canh giữa
     */
    public static void setTable(JScrollPane scrollPane, JTable table, boolean isSort, int... index) {
        //Thiết lập lại font chữ
        table.setFont(new Font("Roboto", Font.PLAIN, 18));
        table.setRowHeight(30);

        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Roboto", Font.BOLD, 18));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        if (index.length > 0) {
            for (int i : index) {
                table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
            }
        }

        // Thiết lập chỉ được chọn 1 dòng trong bảng
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Thiết lập mặt định bảng sắp xếp theo mã chuyên đề
        if (isSort) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
            table.setRowSorter(sorter);
            List<RowSorter.SortKey> sortKey = new ArrayList<>(25);
            sortKey.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKey);
        }

        //Xóa back ground bảng
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        table.setOpaque(false);
        table.setBackground(new Color(182, 198, 211));
    }

    public static List<WareHouse> getWareHouse() {
        return selectWareHouse("SELECT * FROM dbo.KhoHang");
    }

    public static List<WareHouse> selectWareHouse(String sql, Object... args) {
        List<WareHouse> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                WareHouse wh = new WareHouse();
                wh.setWareHouseID(rs.getString("MaKhohang"));
                wh.setWareHouseName(rs.getString("tenkhohang"));
                list.add(wh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<StatusExport> getStastus() {
        return selectStastus("select * from TrangThaiHoaDonXuat");
    }

    public static List<StatusExport> selectStastus(String sql, Object... args) {
        List<StatusExport> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                StatusExport st = new StatusExport();
                st.setStatusID(rs.getString("MaTrangThaiHDX"));
                st.setStatusName(rs.getString("TenTrangThai"));
                list.add(st);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<Employee> getEmployee() {
        return selectEmployee("select * from NhanVien Where TrangThaiXoa=0");
    }

    @SuppressWarnings("null")
    public static List<Employee> selectEmployee(String query, Object... objects) {
        List<Employee> list = new ArrayList<>();
        try {
            @SuppressWarnings("UnusedAssignment")
            ResultSet rs = null;
            try {
                rs = XJDBCHelper.executeQuery(query, objects);
                while (rs.next()) {
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
                    list.add(e);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    @SuppressWarnings({"UseOfIndexZeroInJDBCResultSet", "null"})
    public static List<String> selectAlls(String tableName) throws SQLException {
        String query = "SELECT * FROM " + tableName;
        List<String> ids = new ArrayList<>();
        @SuppressWarnings("UnusedAssignment")
        ResultSet rs = null;
        rs = XJDBCHelper.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString(1));
                ids.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ids;
    }

    @SuppressWarnings("UnusedAssignment")
    public static String setExportID(String tableName, String type, int len) throws SQLException {
        List<String> ids = selectAlls(tableName);
        String id = null;
        int i = 0;
        if (ids == null) {
            id = type + "00000001";
        } else {
            for (String s : ids) {
                String dx = type;
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                int index = Integer.parseInt(s.substring(type.length()));
                if (i < index) {
                    i = index;
                }

                String lenID = String.valueOf(index + 1);
                if (lenID.length() < len) {
                    while (lenID.length() < len) {
                        lenID = "0" + lenID;
                    }
                }
                id = dx + lenID;
            }

        }

        return id;
    }
}
