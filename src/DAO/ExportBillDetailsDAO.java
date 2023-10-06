package DAO;

import Entities.ExportDetailBill;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LinhptPC04737
 */
public class ExportBillDetailsDAO extends ArtDAO<ExportDetailBill, String> {

    @Override
    public void insert(ExportDetailBill e) {
        String query = "INSERT  INTO dbo.ChiTietXuat ( MaCTXuat, MaDonXuat, MaSP, GiaNiemYet, SoLuong, ThanhTien, ChiTiet ) VALUES  ( ?,?,?,?,?,?,? )";
        XJDBCHelper.executeUpdate(query, e.getDetailID(), e.getExportID(),
                e.getProductID(), e.getPrice(), e.getAmount(),
                e.getTotalAmount(), e.getNote());
    }

    @Override
    public void update(ExportDetailBill e) {
        String query = "UPDATE  dbo.ChiTietXuat SET GiaNiemYet=?, SoLuong=?, ThanhTien=?, ChiTiet=? WHERE MaCTXuat = ? AND MaDonXuat = ?";
        XJDBCHelper.executeUpdate(query, e.getPrice(), e.getAmount(), e.getTotalAmount(),
                e.getNote(), e.getDetailID(), e.getExportID());
    }

    @Override
    public void delete(String k) {
        XJDBCHelper.executeUpdate("DELETE dbo.ChiTietXuat WHERE ChiTietNhap.MaCTXuat = ?", k);
    }

    public void deletes(String key, String keyDetail) {
        XJDBCHelper.executeUpdate("DELETE FROM dbo.ChiTietXuat WHERE MaCTXuat = ? AND MaDonXuat = ?", keyDetail, key);
    }

    @Override
    public List<ExportDetailBill> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<ExportDetailBill> selectByIds(String k) {
        String query = """
                       SELECT ct.*, sp.TenSP FROM dbo.ChiTietXuat ct INNER JOIN dbo.SanPham sp ON sp.MaSP = ct.MaSP WHERE MaDonXuat = ?
                       """;
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<ExportDetailBill> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(query, k);
            while (rs.next()) {
                ExportDetailBill ebD = new ExportDetailBill();
                ebD.setDetailID(rs.getInt("MaCTXuat"));
                ebD.setExportID(rs.getString("MaDonXuat"));
                ebD.setProductID(rs.getString("MaSP"));
                ebD.setProductName(rs.getString("TenSP"));
                ebD.setAmount(rs.getInt("SoLuong"));
                ebD.setPrice(rs.getLong("GiaNiemYet"));
                ebD.setTotalAmount(rs.getDouble("ThanhTien"));
                ebD.setNote(rs.getString("ChiTiet"));
                list.add(ebD);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public ExportDetailBill selectByName(String k) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected List<ExportDetailBill> selectBySql(String sql, Object... args) {
        List<ExportDetailBill> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                ExportDetailBill ebD = new ExportDetailBill();
                ebD.setDetailID(rs.getInt("MaCTXuat"));
                ebD.setExportID(rs.getString("MaDonXuat"));
                ebD.setProductID(rs.getString("MaSP"));
                ebD.setAmount(rs.getInt("SoLuong"));
                ebD.setPrice(rs.getLong("GiaNiemYet"));
                ebD.setTotalAmount(rs.getDouble("ThanhTien"));
                ebD.setNote(rs.getString("ChiTiet"));
                list.add(ebD);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public ExportDetailBill selectED(String keyE, String keyD) {
        String query = "SELECT * FROM dbo.ChiTietXuat WHERE MaDonXuat =? AND MaCTXuat =?";
        return this.selectBySql(query, keyE, keyD).isEmpty()? null: this.selectBySql(query, keyE, keyD).get(0) ;
    }

    public void updateAmountExport0(String k) {
        String query = """
                       UPDATE dbo.DonXuatHang SET DonXuatHang.TongTienXuat = 0
                       WHERE DonXuatHang.MaDonXuat = ?
                       """;
        XJDBCHelper.executeUpdate(query, k);
    }

    public void updateAmountExport(String k) {
        String query = """
                       UPDATE dbo.DonXuatHang SET DonXuatHang.TongTienXuat = 
                       (SELECT SUM(ChiTietXuat.ThanhTien) FROM dbo.ChiTietXuat WHERE ChiTietXuat.MaDonXuat = ?)
                       WHERE DonXuatHang.MaDonXuat = ?
                       """;
        XJDBCHelper.executeUpdate(query, k, k);
    }

    public void deleteByImportID(String key) {
        XJDBCHelper.executeUpdate("DELETE dbo.ChiTietXuat WHERE ChiTietXuat.MaDonXuat = ?", key);
    }

    @Override
    public ExportDetailBill selectById(String k) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
