/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.ExportDetailBill;
import Entities.ImportBilldetails;
import Helper.XDateHelper;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ImportBillDetailsDAO extends ArtDAO<ImportBilldetails, String> {

    @Override
    public void insert(ImportBilldetails e) {
        String query = "INSERT INTO dbo.ChiTietNhap(MaCTNhap, MaDonNhap ,MaSP ,SoLuongTrongThung ,SoLuongThung ,DonGiaNhap ,SoLuong ,ThanhTien ,NgaySanXuat ,HanSuDung ,ChiTiet)"
                + "     VALUES (?,?,?,?,?,?,?,?,CONVERT(DATE, ?),CONVERT(DATE, ?),?)";
        XJDBCHelper.executeUpdate(query, e.getImportBillDetailsID(), e.getImportBillID(), e.getProductID(),
                e.getQuantityInBox(), e.getQuantityBox(),
                e.getTotalAmount(), e.getTotalQuantity(),
                e.getIntoMoney(), e.getManufacturingDate(),
                e.getExpiryDate(), e.getNotes());
    }

    @Override
    public void update(ImportBilldetails e) {
        XJDBCHelper.executeUpdate("""
                                    UPDATE dbo.ChiTietNhap SET SoLuongTrongThung = ?, SoLuongThung = ?, DonGiaNhap = ?, 
                                    SoLuong = ?, ThanhTien = ?, NgaySanXuat = ?,HanSuDung = ?, ChiTiet = ? 
                                    WHERE ChiTietNhap.MaCTNhap = ? AND ChiTietNhap.MaDonNhap=?
                                    """,
                            e.getQuantityInBox(), e.getQuantityBox(),
                            e.getTotalAmount(), e.getTotalQuantity(),
                            e.getIntoMoney(), e.getManufacturingDate(),
                            e.getExpiryDate(), e.getNotes(), e.getImportBillDetailsID(), e.getImportBillID());
    }

    @Override
    public void delete(String key) {
        XJDBCHelper.executeUpdate("DELETE dbo.ChiTietNhap WHERE ChiTietNhap.MaCTNhap = ?", key);
    }

    public void updateAmountImport(String k) {
        XJDBCHelper.executeUpdate("""
                     UPDATE dbo.DonNhapHang SET DonNhapHang.TongTienNhap = 
                     (SELECT SUM(ChiTietNhap.ThanhTien) FROM dbo.ChiTietNhap WHERE ChiTietNhap.MaDonNhap = ?)
                     WHERE DonNhapHang.MaDonNhap = ?""",
                k, k);
    }

    public void updateAmountImport0(String k) {
        XJDBCHelper.executeUpdate("""
                     UPDATE dbo.DonNhapHang SET DonNhapHang.TongTienNhap = 0, DonNhapHang.SoTienDaThanhToan = 0
                     WHERE DonNhapHang.MaDonNhap = ?""",
                k);
    }

    public void deleteByImportID(String key) {
        XJDBCHelper.executeUpdate("DELETE dbo.ChiTietNhap WHERE ChiTietNhap.MaDonNhap = ?", key);
    }

    @Override
    public List<ImportBilldetails> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<ImportBilldetails> selectByImportBill(String key) {
        return this.selectBySql("SELECT * FROM dbo.ChiTietNhap WHERE ChiTietNhap.MaDonNhap = ?", key);
    }

    @Override
    public ImportBilldetails selectById(String key) {
        List<ImportBilldetails> list = this.selectBySql("SELECT * FROM dbo.ChiTietNhap WHERE ChiTietNhap.MaCTNhap = ? AND MaDonNhap = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public ImportBilldetails selectById(String key, String keyDetail) {
        List<ImportBilldetails> list = this.selectBySql("SELECT * FROM dbo.ChiTietNhap WHERE ChiTietNhap.MaCTNhap = ? AND MaDonNhap = ?", keyDetail, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public ImportBilldetails selectByImportId(String key) {
        List<ImportBilldetails> list = this.selectBySql("SELECT * FROM dbo.ChiTietNhap WHERE ChiTietNhap.MaDonNhap = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public ImportBilldetails selectByName(String key) {
        return null;
    }

    @Override
    protected List<ImportBilldetails> selectBySql(String sql, Object... args) {
        List<ImportBilldetails> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                ImportBilldetails ibD = new ImportBilldetails();
                ibD.setImportBillDetailsID(rs.getInt("MaCTNhap"));
                ibD.setImportBillID(rs.getString("MaDonNhap"));
                ibD.setProductID(rs.getString("MaSP"));
                ibD.setQuantityInBox(rs.getInt("SoLuongTrongThung"));
                ibD.setQuantityBox(rs.getInt("SoLuongThung"));
                ibD.setTotalAmount(rs.getDouble("DonGiaNhap"));
                ibD.setTotalQuantity(rs.getInt("SoLuong"));
                ibD.setIntoMoney(rs.getDouble("ThanhTien"));
                ibD.setManufacturingDate(XDateHelper.toString(rs.getDate("NgaySanxuat"), "dd-MM-yyyy"));
                ibD.setExpiryDate(XDateHelper.toString(rs.getDate("HanSuDung"), "dd-MM-yyyy"));
                ibD.setNotes(rs.getString("ChiTiet"));
                list.add(ibD);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<ImportBilldetails> selectByIds(String k) {
        String query = """
                       SELECT ct.*, sp.TenSP FROM dbo.ChiTietNhap ct INNER JOIN dbo.SanPham sp ON sp.MaSP = ct.MaSP WHERE MaDonNhap = ?
                       """;
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        List<ImportBilldetails> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(query, k);
            while (rs.next()) {
                ImportBilldetails ibD = new ImportBilldetails();
                ibD.setImportBillDetailsID(rs.getInt("MaCTNhap"));
                ibD.setImportBillID(rs.getString("MaDonNhap"));
                ibD.setProductID(rs.getString("MaSP"));
                list.add(ibD);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
