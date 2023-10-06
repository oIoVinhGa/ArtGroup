package DAO;

import Entities.ExportBill;
import Helper.XDateHelper;
import Helper.XJDBCHelper;
import Utils.Auth;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LinhptPC04737
 */
public class ExportBillDAO extends ArtDAO<ExportBill, String> {

    @Override
    public void insert(ExportBill e) {
        String query = "INSERT INTO dbo.DonXuatHang ( MaDonXuat, MaNV, MaKhoHang, TongTienXuat, TrangThaiDonXuat, GhiChu, NguoiTao ,NgayTao) VALUES  ( ?,?,?,?,?,?,?, GETDATE())";
        XJDBCHelper.executeUpdate(query, e.getExportID(), e.getEmployeeID(),
                e.getWareHouseID(), Double.parseDouble(String.valueOf(e.getTotalAmount())),
                e.getStatusExport(), e.getNote(), Auth.user.getEmployeeID());
    }

    @Override
    public void update(ExportBill e) {
        String query = "UPDATE dbo.DonXuatHang SET MaNV=?, MaKhoHang=?, TongTienXuat=?, TrangThaiDonXuat=?, GhiChu=?  WHERE MaDonXuat=?";
        XJDBCHelper.executeUpdate(query, e.getEmployeeID(), e.getWareHouseID(), e.getTotalAmount(),
                e.getStatusExport(), e.getNote(), e.getExportID());
    }

    @Override
    public void delete(String key) {
        String query = "UPDATE dbo.DonXuatHang SET TrangThaiXoa = 1 WHERE MaDonXuat = ?";
        XJDBCHelper.executeUpdate(query, key);
    }

    @Override
    public List<ExportBill> selectAll() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0
                       """;
        return selectBySql(query);
    }

    public List<ExportBill> selectNoExportASC() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 AND TrangThaiDonXuat=2 ORDER BY MaDonXuat ASC
                       """;
        return selectBySql(query);
    }

    public List<ExportBill> selectExportedASC() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 AND TrangThaiDonXuat=1 ORDER BY MaDonXuat ASC
                       """;
        return selectBySql(query);
    }

    public List<ExportBill> selectAlls() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 ORDER BY MaDonXuat ASC
                       """;
        return selectBySql(query);
    }

    public List<ExportBill> selectNoExportDESC() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 AND TrangThaiDonXuat=2 ORDER BY MaDonXuat DESC
                       """;
        return selectBySql(query);
    }

    public List<ExportBill> selectExportedDESC() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 AND TrangThaiDonXuat=1 ORDER BY MaDonXuat DESC
                       """;
        return selectBySql(query);
    }

    public List<ExportBill> selectAllsDESC() {
        String query = """
                       SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 ORDER BY MaDonXuat DESC
                       """;
        return selectBySql(query);
    }
    public List<ExportBill> selectByDate(String keyword) {
        String query = "SELECT * FROM dbo.DonXuatHang Where TrangThaiXoa = 0 AND CONVERT(VARCHAR,NgayTao,105) LIKE N'%"+keyword+"%' ORDER BY MaDonXuat DESC";
        return selectBySql(query);
    }
    
    @Override
    public ExportBill selectById(String key) {
        List<ExportBill> list = this.selectBySql("SELECT * FROM dbo.DonXuatHang WHERE DonXuatHang.MaDonXuat = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public ExportBill selectByName(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected List<ExportBill> selectBySql(String sql, Object... args) {
        List<ExportBill> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                ExportBill eBill = new ExportBill();
                eBill.setExportID(rs.getString("MaDonXuat"));
                eBill.setEmployeeID(rs.getString("MaNV"));
                eBill.setWareHouseID(rs.getInt("MaKhoHang"));
                eBill.setTotalAmount(rs.getLong("TongTienXuat"));
                eBill.setStatusExport(rs.getInt("TrangThaiDonXuat"));
                eBill.setNote(rs.getString("GhiChu"));
                eBill.setCreatedDate(XDateHelper.toDate(XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")));
                eBill.setCreatedBy(rs.getString("NguoiTao"));
                eBill.setDeleted(rs.getBoolean("TrangThaiXoa"));
                list.add(eBill);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void restoredExportBill(String key) {
        String query = "UPDATE dbo.DonXuatHang SET TrangThaiXoa=0  WHERE MaDonXuat=?";
        XJDBCHelper.executeUpdate(query, key);
    }

    public List<ExportBill> selectSortBy(boolean sort) {
        String key;
        if (sort) {
            key = " ASC";
        } else {
            key = " DESC";
        }
        return this.selectBySql("""
                                SELECT *FROM dbo.DonXuatHang a 
                                INNER JOIN dbo.KhoHang b
                                ON b.MaKhoHang = a.MaKhoHang
                                INNER JOIN dbo.TrangThaiHoaDonXuat c
                                ON c.MaTrangThaiHDX = a.TrangThaiDonXuat where a.trangthaixoa = 0 ORDER BY a.MaDonXuat""" + key);
    }
}
