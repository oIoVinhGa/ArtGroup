package DAO;

import Entities.Supplier;
import Helper.XJDBCHelper;
import Utils.Auth;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tpvin
 */
public class SupplierDAO extends ArtDAO<Supplier, String> {

    public List<Supplier> select() {
        String sql = "SELECT * FROM NhaCungCap Where TrangThaiXoa=0";
        return select(sql);
    }

    public Supplier findByID(String ID) {
        String sql = "SELECT * FROM NhaCungCap WHERE MaNCC=?";
        List<Supplier> list = select(sql, ID);
        return !list.isEmpty() ? list.get(0) : null;
    }

    @SuppressWarnings("null")
    private List<Supplier> select(String sql, Object... args) {
        List<Supplier> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Supplier model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Supplier readFromResultSet(ResultSet rs) throws SQLException {
        Supplier model = new Supplier();
        model.setSupplierID(rs.getString("MaNCC"));
        model.setSupplierName(rs.getString("TenNCC"));
        model.setSupplierAdress(rs.getString("DiaChi"));
        model.setSupplierPhone(rs.getString("SoDienThoai"));
        model.setSupplierDetail(rs.getString("ChiTiet"));
        return model;
    }

    @Override
    public void insert(Supplier e) {
        XJDBCHelper.executeUpdate(" INSERT INTO dbo.NhaCungCap( MaNCC ,TenNCC ,DiaChi ,SoDienThoai ,ChiTiet ,NgayTao ,NguoiTao)"
                + "VALUES  (?, ?, ?, ?, ?, GETDATE(), ?)", e.getSupplierID(), e.getSupplierName(), e.getSupplierAdress(), e.getSupplierPhone(), e.getSupplierDetail(), Auth.user.getEmployeeID());
    }

    @Override
    public void update(Supplier e) {
        XJDBCHelper.executeUpdate("Update dbo.NhaCungCap SET TenNCC = ?, DiaChi =?, SoDienTHoai = ?, ChiTiet = ? WHERE MaNCC = ?",
                e.getSupplierName(), e.getSupplierAdress(), e.getSupplierPhone(), e.getSupplierDetail(), e.getSupplierID());
    }

    public void updates(Supplier e, String note) {
        XJDBCHelper.executeUpdate("Update dbo.NhaCungCap SET TenNCC = ?, DiaChi =?, SoDienTHoai = ?, ChiTiet = ? WHERE MaNCC = ?",
                e.getSupplierName(), e.getSupplierAdress(), e.getSupplierPhone(), e.getSupplierDetail(), e.getSupplierID());
        XJDBCHelper.executeUpdate("INSERT INTO dbo.CapNhatThongTinNCC ( MaNCC, NgaySua, NguoiSua, GhiChu ) VALUES (?,GETDATE(),?,?)", e.getSupplierID(), Auth.user.getEmployeeID(), note);
    }

    @Override
    public void delete(String key) {
        XJDBCHelper.executeUpdate("UPDATE dbo.NhaCungCap SET NhaCungCap.TrangThaiXoa = 1 WHERE NhaCungCap.MaNCC = ?", key);
        XJDBCHelper.executeUpdate("INSERT INTO dbo.XoaThongTinNCC ( MaNCC, NgayXoa, NguoiXoa, GhiChu ) VALUES (?,GETDATE(),?,?)", key, Auth.user.getEmployeeID(), "");
    }

    @Override
    public List<Supplier> selectAll() {
        return this.selectBySql("select * from NhaCungCap");
    }

    @Override
    public Supplier selectById(String key) {
        List<Supplier> list = this.selectBySql("SELECT *FROM dbo.NhaCungCap WHERE NhaCungCap.MaNCC = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public Supplier selectByName(String key) {
        List<Supplier> list = this.selectBySql("SELECT *FROM dbo.NhaCungCap WHERE NhaCungCap.TenNCC = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Supplier> selectBySql(String sql, Object... args) {
        List<Supplier> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                Supplier sp = new Supplier();
                sp.setSupplierID(rs.getString("MaNCC"));
                sp.setSupplierName(rs.getString("TenNCC"));
                sp.setSupplierAdress(rs.getString("DiaChi"));
                sp.setSupplierPhone(rs.getString("SoDienThoai"));
                sp.setSupplierDetail(rs.getString("ChiTiet"));
                sp.setCreateDate(rs.getDate("NgayTao"));
                sp.setCreateBy(rs.getString("NguoiTao"));
                list.add(sp);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
