/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.Unit;
import Helper.XJDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class UnitDAO extends ArtDAO<Unit, String> {

    @Override
    public void insert(Unit entity) {
    }

    @Override
    public void update(Unit entity) {
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<Unit> selectAll() {
        return this.selectBySql("SELECT * FROM dbo.DonViTinh");
    }

    @Override
    public Unit selectById(String key) {
        List<Unit> list = this.selectBySql("select * from DonViTinh where MaDVT = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public Unit selectByIds(int key) {
        List<Unit> list = this.selectBySql("select * from DonViTinh where MaDVT = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public Unit selectByName(String key) {
        List<Unit> list = this.selectBySql("select * from DonViTinh where TenDonViTinh = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Unit> selectBySql(String sql, Object... args) {
        List<Unit> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                Unit un = new Unit();
                un.setUnitID(rs.getInt("MADVT"));
                un.setUnitName(rs.getString("TenDonViTinh"));
                list.add(un);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
