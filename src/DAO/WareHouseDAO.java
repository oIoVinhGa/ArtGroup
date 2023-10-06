
package DAO;


import Entities.WareHouse;
import Helper.XJDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class WareHouseDAO extends ArtDAO<WareHouse, String> {

    @Override
    public void insert(WareHouse entity) {
    }

    @Override
    public void update(WareHouse entity) {
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<WareHouse> selectAll() {
        return this.selectBySql("select * from Khohang");
    }

    @Override
    public WareHouse selectById(String key) {
        List<WareHouse> list = this.selectBySql("select * from Khohang where MaKhoHang = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public WareHouse selectByName(String key) {
        List<WareHouse> list = this.selectBySql("select * from Khohang where TenKhoHang = ?", key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<WareHouse> selectBySql(String sql, Object... args) {
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

}
