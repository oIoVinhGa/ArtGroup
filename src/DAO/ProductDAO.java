/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.Product;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ProductDAO extends ArtDAO<Product, String> {

    @Override
    public void insert(Product entity) {
        XJDBCHelper.executeUpdate("Insert into dbo.SanPham( MaSP ,MaNCC ,TenSP ,HinhAnh ,LoaiSP ,DonGiaBan ,DonViTinh ,GhiChu, NgayTao, NguoiTao) VALUES(?,?,?,?,?,?,?,?,getDate(),?)",
                entity.getProductID(), entity.getSupplierID(), entity.getProductName(), entity.getImageProduct(), entity.getProductTypes(), entity.getProductPrice(), entity.getUnit(), entity.getNote(), entity.getCreateBy());
    }

    public void insert2(Product e) {
        XJDBCHelper.executeUpdate("UPDATE dbo.SanPham SET SanPham.TrangThaiXoa = 0, SanPham.MaNCC = ?, SanPham.TenSP = ?, SanPham.HinhAnh = ?, SanPham.LoaiSP = ?, "
                + "SanPham.DonGiaBan = ?, SanPham.DonViTinh = ?, SanPham.GhiChu = ?  WHERE SanPham.MaSP = ?", 
                 e.getSupplierID(), e.getProductName(), e.getImageProduct(), e.getProductTypes(), 
                e.getProductPrice(), e.getUnit(), e.getNote(), e.getProductID());
    }

    @Override
    public void update(Product e) {
        XJDBCHelper.executeUpdate("UPDATE dbo.SanPham SET SanPham.MaNCC = ?, SanPham.TenSP = ?, SanPham.HinhAnh = ?, SanPham.LoaiSP = ?, "
                + "SanPham.DonGiaBan = ?, SanPham.DonViTinh = ?, SanPham.GhiChu = ? WHERE SanPham.MaSP = ?",
                e.getSupplierID(), e.getProductName(), e.getImageProduct(), e.getProductTypes(), 
                e.getProductPrice(), e.getUnit(), e.getNote(), e.getProductID());
    }

    @Override
    public void delete(String k) {
        XJDBCHelper.executeUpdate("UPDATE dbo.SanPham SET SanPham.TrangThaiXoa = 1 WHERE SanPham.MaSP = ?", k);
    }

    @Override
    public List<Product> selectAll() {
        return this.selectBySql("Select * from sanpham where TrangThaiXoa = 0");
    }

    @Override
    public Product selectById(String key) {
        List<Product> list = this.selectBySql("select * from SanPham where SanPham.MaSP = ? AND TrangThaiXoa = 0", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public Product selectByName(String key) {
        List<Product> list = this.selectBySql("select *from SanPham where SanPham.TenSP = ? and trangthaixoa = 0", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<Product> selectByKeyword(String key) {
        String sql = "SELECT * FROM SanPham WHERE TenSP LIKE N'%"+key+"%' and trangthaixoa = 0";
        return selectBySql(sql);
    }
    
    public List<Product> selectSortBy(String key, boolean sort) {
        if(sort){
            key = key + " ASC";
        }else{
            key = key +" DESC";
        }
        return this.selectBySql(" SELECT * FROM dbo.SanPham WHERE SanPham.TrangThaiXoa = 0 ORDER BY "+key);
    }
    
    @Override
    protected List<Product> selectBySql(String sql, Object... args) {
        List<Product> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                Product pd = new Product();
                pd.setProductID(rs.getString("MaSP"));
                pd.setSupplierID(rs.getString("MaNcc"));
                pd.setProductName(rs.getString("TenSP"));
                pd.setImageProduct(rs.getString("HinhAnh"));
                pd.setProductTypes(rs.getInt("LoaiSP"));
                pd.setProductPrice(rs.getDouble("DonGiaBan"));
                pd.setUnit(rs.getInt("DonViTinh"));
                pd.setNote(rs.getString("GhiChu"));
                pd.setCreateDate(rs.getDate("NgayTao"));
                pd.setCreateBy(rs.getString("NguoiTao"));
                pd.setStatus(rs.getBoolean("TrangThaiXoa"));
                list.add(pd);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
