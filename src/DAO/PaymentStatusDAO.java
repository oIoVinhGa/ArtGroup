/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.PaymentStatus;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class PaymentStatusDAO extends ArtDAO<PaymentStatus, String>{

    @Override
    public void insert(PaymentStatus entity) {
    }

    @Override
    public void update(PaymentStatus entity) {
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<PaymentStatus> selectAll() {
        return this.selectBySql("SELECT *FROM dbo.TrangThaiThanhToan");
    }

    @Override
    public PaymentStatus selectById(String key) {
        List<PaymentStatus> list = this.selectBySql("select * from dbo.TrangThaiThanhToan where MaTrangThai = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public PaymentStatus selectByName(String key) {
         List<PaymentStatus> list = this.selectBySql("select * from TrangThaiTHanhToan where TenTrangThai = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<PaymentStatus> selectBySql(String sql, Object... args) {
        List<PaymentStatus> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBCHelper.executeQuery(sql, args);
            while (rs.next()) {
                PaymentStatus pt = new PaymentStatus();
                pt.setPaymentStatusID(rs.getString("MaTrangThai"));
                pt.setPaymentStatusName(rs.getString("TenTrangThai"));
                list.add(pt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
