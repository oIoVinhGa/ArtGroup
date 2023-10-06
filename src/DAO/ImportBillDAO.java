package DAO;

import Entities.ExportBill;
import Entities.ImportBill;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ImportBillDAO extends ArtDAO<ImportBill, String> {

    @Override
    public void insert(ImportBill e) {
        String query = " INSERT INTO dbo.DonNhapHang ( MaDonNhap ,MaNV ,MaKhoHang ,TongTienNhap ,TrangThaiThanhToan ,SoTienDaThanhToan ,GhiChu ,NgayTao ,NguoiTao)"
                + "values (?,?,1,?,?,?,?, getDate(),?)";
        XJDBCHelper.executeUpdate(query, e.getImportBillID(), e.getEmployeeID(), e.getTotalAmount(), 3, e.getTotalPay(), e.getNote(), e.getCreatedBy());
    }

    public void insert2(ImportBill e) {
        String query = """
                       UPDATE dbo.DonNhapHang SET DonNhapHang.MaNV = ?, DonNhapHang.TongTienNhap = ?,
          DonNhapHang.TrangThaiThanhToan = 3, DonNhapHang.SoTienDaThanhToan = ?, 
          DonNhapHang.GhiChu = ? , DonNhapHang.TrangThaiXoa = 0 
          WHERE DonNhapHang.MaDonNhap = ?""";
        XJDBCHelper.executeUpdate(query, e.getEmployeeID(), e.getTotalAmount(),
                e.getTotalPay(), e.getNote(), e.getImportBillID());
    }

    @Override
    public void update(ImportBill e) {
        String query = """
                       UPDATE dbo.DonNhapHang SET DonNhapHang.MaNV = ?, DonNhapHang.TongTienNhap = ?,
                                                    DonNhapHang.TrangThaiThanhToan = ?, DonNhapHang.SoTienDaThanhToan = ?, 
                                                    DonNhapHang.GhiChu = ?
                                                    WHERE DonNhapHang.MaDonNhap = ?""";
        XJDBCHelper.executeUpdate(query, e.getEmployeeID(), e.getTotalAmount(), e.getPayMentStatusID(),
                e.getTotalPay(), e.getNote(), e.getImportBillID());
    }

    @Override
    public void delete(String key) {
        String query = "UPDATE dbo.DonNhapHang SET DonNhapHang.TrangThaiXoa = 1 WHERE DonNhapHang.MaDonNhap = ?";
        XJDBCHelper.executeUpdate(query, key);
    }

    public List<ImportBill> selectSortBy(boolean sort) {
        String key;
        if (sort) {
            key = " ASC";
        } else {
            key = " DESC";
        }
        return this.selectBySql("""
                                SELECT *FROM dbo.DonNhapHang a 
                                INNER JOIN dbo.KhoHang b
                                ON b.MaKhoHang = a.MaKhoHang
                                INNER JOIN dbo.TrangThaiThanhToan c
                                ON c.MaTrangThai = a.TrangThaiThanhToan where a.trangthaixoa = 0 ORDER BY a.MaDonNhap""" + key);
    }

    @Override
    public List<ImportBill> selectAll() {
        String SQL = """
                     SELECT *FROM dbo.DonNhapHang a 
                      INNER JOIN dbo.KhoHang b
                      ON b.MaKhoHang = a.MaKhoHang
                      INNER JOIN dbo.TrangThaiThanhToan c
                      ON c.MaTrangThai = a.TrangThaiThanhToan where a.trangthaixoa = 0""";
        return this.selectBySql(SQL);
    }

    public List<ImportBill> selectByKey(String key) {
        String SQL = """
                     SELECT *FROM dbo.DonNhapHang a 
                      INNER JOIN dbo.KhoHang b
                      ON b.MaKhoHang = a.MaKhoHang
                      INNER JOIN dbo.TrangThaiThanhToan c
                      ON c.MaTrangThai = a.TrangThaiThanhToan where a.trangthaixoa = 0 and a.MaDonNhap like ?""";
        return this.selectBySql(SQL, "%" + key + "%");
    }


    @Override
    public ImportBill selectById(String key) {
        List<ImportBill> list = this.selectBySql("""
                                                 SELECT *FROM dbo.DonNhapHang a 
                                                INNER JOIN dbo.KhoHang b
                                                ON b.MaKhoHang = a.MaKhoHang
                                                INNER JOIN dbo.TrangThaiThanhToan c
                                                ON c.MaTrangThai = a.TrangThaiThanhToan where a.MaDonNhap = ?""", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public ImportBill selectByName(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<ImportBill> selectBySql(String sql, Object... args) {
        List<ImportBill> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                ImportBill iBill = new ImportBill();
                iBill.setImportBillID(rs.getString("MaDonNhap"));
                iBill.setEmployeeID(rs.getString("MaNV"));
                iBill.setWareHouseID(rs.getString("TenKhoHang"));
                iBill.setTotalAmount(rs.getDouble("tongtiennhap"));
                iBill.setPayMentStatusID(rs.getString("TenTrangThai"));
                iBill.setTotalPay(rs.getDouble("sotiendathanhtoan"));
                iBill.setNote(rs.getString("GhiChu"));
                iBill.setCreateDate(rs.getDate("NgayTao"));
                iBill.setCreatedBy(rs.getString("NguoiTao"));
                iBill.setStatus(rs.getBoolean("TrangThaiXoa"));
                list.add(iBill);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
