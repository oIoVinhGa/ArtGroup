/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.ProductType;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ProductTypeDAO extends ArtDAO<ProductType, String>{

    @Override
    public void insert(ProductType e) {
        XJDBCHelper.executeUpdate("INSERT INTO dbo.PhanLoaiSP( TenLoaiSP ,NgayTao ,NguoiTao)VALUES(?, getDate(), ?)", 
                    e.getProductTypeName(), e.getCreateBy());
    }
    
    public void insert2(ProductType e) {
        XJDBCHelper.executeUpdate("UPDATE dbo.PhanLoaiSP SET PhanLoaiSP.TrangThaiXoa = 0 WHERE PhanLoaiSP.TenLoaiSP = ?", e.getProductTypeName());
    }
    
    @Override
    public void update(ProductType e) {
                XJDBCHelper.executeUpdate("  UPDATE dbo.PhanLoaiSP SET PhanLoaiSP.TenLoaiSP = ? WHERE PhanLoaiSP.LoaiSP = ?", e.getProductTypeName(),e.getProductTypeID());
    }

    @Override
    public void delete(String e) {
        XJDBCHelper.executeUpdate("UPDATE dbo.PhanLoaiSP SET PhanLoaiSP.TrangThaiXoa = 1 WHERE PhanLoaiSP.LoaiSP = ?", e);
    }

    @Override
    public List<ProductType> selectAll() {
        return this.selectBySql("SELECT * FROM PhanLoaiSP");
    }

    @Override
    public ProductType selectById(String key) {
        List<ProductType> list = this.selectBySql("select * from PhanLoaiSP where LoaiSP = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<ProductType> selectSortBy(String key, boolean sort) {
        if(sort){
            key = key + " ASC";
        }else{
            key = key +" DESC";
        }
        return this.selectBySql(" SELECT * FROM dbo.PhanLoaiSP WHERE PhanLoaiSP.TrangThaiXoa = 0 ORDER BY "+key);
    }
    
    public List<ProductType> selectByKeyword(String key) {
        String sql = "SELECT * FROM PhanLoaiSP WHERE TenLoaiSP LIKE ?";
        return selectBySql(sql, "%" + key + "%");
    }
    
    @Override
    public ProductType selectByName(String key) {
        List<ProductType> list = this.selectBySql("select * from PhanLoaiSP where TenLoaiSP = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ProductType> selectBySql(String sql, Object... args) {
        List<ProductType> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                ProductType sp = new ProductType();
                sp.setProductTypeID(rs.getString("LoaiSP"));
                sp.setProductTypeName(rs.getString("TenLoaiSP"));
                sp.setCreateDate(rs.getDate("NgayTao"));
                sp.setCreateBy(rs.getString("NguoiTao"));
                sp.setStatus(rs.getBoolean("TrangThaiXoa"));
                list.add(sp);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

   
}
