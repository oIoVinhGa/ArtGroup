package DAO;

import Helper.XDateHelper;
import Helper.XJDBCHelper;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LinhptPC04737
 */
public class StatisticalDAO {

    /**
     * Thiết lập lại table
     *
     * @param scrollPane chứa table
     * @param table là tên bảng cần thiết lập
     * @param isSort nếu đúng thì sẽ sắp xếp bảng theo cột chỉ định
     * @param index giá trị cột cần canh giữa
     */
    public static void setTable(JScrollPane scrollPane, JTable table, boolean isSort, int... index) {
        //Thiết lập lại font chữ
        table.setFont(new Font("Roboto", Font.PLAIN, 18));
        table.setRowHeight(30);

        // Thiết lập lại tên cột của bảng
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("Roboto", Font.BOLD, 18));
        ((DefaultTableCellRenderer) tableHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        //Thiết lập canh giũa giá trị của cột cần thiết
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        if (index.length > 0) {
            for (int i : index) {
                table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
            }
        }

        // Thiết lập chỉ được chọn 1 dòng trong bảng
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Thiết lập mặt định bảng sắp xếp theo mã chuyên đề
        if (isSort) {
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
            table.setRowSorter(sorter);
            List<RowSorter.SortKey> sortKey = new ArrayList<>(25);
            sortKey.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKey);
        }

        //Xóa back ground bảng
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        table.setOpaque(true);
        table.setBackground(new Color(182, 198, 211));
    }

    @SuppressWarnings("null")
    public List<Object[]> getTotalProductASC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKSoLuongSP}";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongTrongKho"),};
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

    @SuppressWarnings("null")
    public List<Object[]> getTotalProductDESC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT  KhoHangSP.MaSP ,
                                             TenSP ,
                                             SUM(SoLuongSPTrongKho) AS SoLuongTrongKho 
                                     FROM    dbo.KhoHangSP
                                             INNER JOIN dbo.SanPham ON SanPham.MaSP = KhoHangSP.MaSP
                             \t\tWHERE KhoHangSP.TrangThaiXoa = 0 AND HanSuDung > GETDATE()
                             \t\tGROUP BY KhoHangSP.MaSP ,
                                             TenSP
                             \t\tORDER BY SoLuongTrongKho DESC""";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongTrongKho")};
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

    @SuppressWarnings("null")
    public List<Object[]> getTotalProductSearchASC(String name) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT KhoHangSP.MaSP, TenSP, SUM(SoLuongSPTrongKho) AS SoLuongTrongKho 
                             FROM dbo.KhoHangSP INNER JOIN dbo.SanPham ON SanPham.MaSP = KhoHangSP.MaSP
                             \t\tWHERE KhoHangSP.TrangThaiXoa = 0 AND HanSuDung > GETDATE() AND TenSP LIKE N'%""" + name + "%'\n"
                        + "		GROUP BY KhoHangSP.MaSP ,\n"
                        + "                TenSP\n"
                        + "		ORDER BY SoLuongTrongKho ASC";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongTrongKho"),};
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

    @SuppressWarnings("null")
    public List<Object[]> getExpiryASC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKHangTon}";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongTrongKho"),
                        rs.getLong("DonGiaNhap"),
                        XDateHelper.toString(rs.getDate("HanSuDung"), "dd-MM-yyyy")};
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

    @SuppressWarnings("null")
    public List<Object[]> getExpiryDESC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT  KhoHangSP.MaSP, TenSP, TenDonViTinh, SUM(SoLuongSPTrongKho) AS SoLuongTrongKho, DonGiaNhap, SUM( SoLuongSPTrongKho * DonGiaNhap ) AS ThanhTien, NgaySanXuat, HanSuDung
                             FROM dbo.KhoHangSP INNER JOIN dbo.SanPham ON SanPham.MaSP = KhoHangSP.MaSP
                                                INNER JOIN dbo.DonViTinh ON MaDVT = dbo.SanPham.DonViTinh
                             WHERE KhoHangSP.TrangThaiXoa = 0 AND HanSuDung > GETDATE()
                             GROUP BY KhoHangSP.MaSP, TenSP, DonGiaNhap, NgaySanXuat, HanSuDung, TenDonViTinh ORDER BY HanSuDung DESC""";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongTrongKho"),
                        rs.getLong("DonGiaNhap"),
                        XDateHelper.toString(rs.getDate("HanSuDung"), "dd-MM-yyyy")};
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

    @SuppressWarnings("null")
    public List<Object[]> getExpirySearchDESC(String name) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT  KhoHangSP.MaSP, TenSP, TenDonViTinh, SUM(SoLuongSPTrongKho) AS SoLuongTrongKho, DonGiaNhap, SUM( SoLuongSPTrongKho * DonGiaNhap ) AS ThanhTien, NgaySanXuat, HanSuDung
                             FROM dbo.KhoHangSP INNER JOIN dbo.SanPham ON SanPham.MaSP = KhoHangSP.MaSP
                                                INNER JOIN dbo.DonViTinh ON MaDVT = dbo.SanPham.DonViTinh
                             WHERE KhoHangSP.TrangThaiXoa = 0 AND HanSuDung > GETDATE() AND TenSP Like N'%""" + name
                        + "%' GROUP BY KhoHangSP.MaSP, TenSP, DonGiaNhap, NgaySanXuat, HanSuDung, TenDonViTinh ORDER BY HanSuDung ASC";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongTrongKho"),
                        rs.getLong("DonGiaNhap"),
                        XDateHelper.toString(rs.getDate("HanSuDung"), "dd-MM-yyyy")};
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

    @SuppressWarnings("null")
    public List<Object[]> getImportBillASC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKHoaDonNhap}";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonNhap"),
                        rs.getLong("TongTienNhap"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getImportBillDESC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT MaDonNhap, TongTienNhap, TrangThaiThanhToan.TenTrangThai, SoTienDaThanhToan, MaNV, NgayTao
                             FROM dbo.DonNhapHang
                             		INNER JOIN dbo.TrangThaiThanhToan ON TrangThaiThanhToan.MaTrangThai = DonNhapHang.TrangThaiThanhToan
                             		WHERE TrangThaiXoa = 0
                             		ORDER BY TongTienNhap DESC
                             """;
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonNhap"),
                        rs.getLong("TongTienNhap"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getEmportBillASC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKHoaDonXuat}";
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonXuat"),
                        rs.getLong("TongTienXuat"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getEmportBillDESC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT MaDonXuat, TongTienXuat, TenTrangThai, MaNV, NgayTao
                             FROM dbo.DonXuatHang
                             INNER JOIN dbo.TrangThaiHoaDonXuat ON TrangThaiHoaDonXuat.MaTrangThaiHDX = DonXuatHang.TrangThaiDonXuat
                             WHERE TrangThaiXoa = 0
                             ORDER BY TongTienXuat DESC
                             """;
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonXuat"),
                        rs.getLong("TongTienXuat"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getImportBillNowASC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                             SELECT  MaDonNhap, TongTienNhap, TrangThaiThanhToan.TenTrangThai, SoTienDaThanhToan, MaNV, NgayTao
                             FROM    dbo.DonNhapHang
                                     INNER JOIN dbo.TrangThaiThanhToan ON TrangThaiThanhToan.MaTrangThai = DonNhapHang.TrangThaiThanhToan
                             WHERE   TrangThaiXoa = 0 AND CONVERT(DATE, GETDATE(), 105) = CONVERT(DATE, NgayTao, 105)
                             ORDER BY TongTienNhap ASC
                             """;
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                   Object[] model = {
                        rs.getString("MaDonNhap"),
                        rs.getLong("TongTienNhap"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getImportBillNowDESC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                            SELECT  MaDonNhap, TongTienNhap, TrangThaiThanhToan.TenTrangThai, SoTienDaThanhToan, MaNV, NgayTao
                            FROM    dbo.DonNhapHang
                                    INNER JOIN dbo.TrangThaiThanhToan ON TrangThaiThanhToan.MaTrangThai = DonNhapHang.TrangThaiThanhToan
                            WHERE   TrangThaiXoa = 0 AND CONVERT(DATE, GETDATE(), 105) = CONVERT(DATE, NgayTao, 105)
                            ORDER BY TongTienNhap DESC
                             """;
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonNhap"),
                        rs.getLong("TongTienNhap"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getExportBillNowASC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                            SELECT  MaDonXuat, TongTienXuat, TenTrangThai, MaNV, NgayTao
                            FROM    dbo.DonXuatHang
                                    INNER JOIN dbo.TrangThaiHoaDonXuat ON TrangThaiHoaDonXuat.MaTrangThaiHDX = DonXuatHang.TrangThaiDonXuat
                            WHERE   TrangThaiXoa = 0 AND CONVERT(DATE, GETDATE(), 105) = CONVERT(DATE, NgayTao, 105)
                            ORDER BY TongTienXuat ASC
                            """;
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonXuat"),
                        rs.getLong("TongTienXuat"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getExportBillNowDESC() {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = """
                            SELECT  MaDonXuat, TongTienXuat, TenTrangThai, MaNV, NgayTao
                            FROM    dbo.DonXuatHang
                                    INNER JOIN dbo.TrangThaiHoaDonXuat ON TrangThaiHoaDonXuat.MaTrangThaiHDX = DonXuatHang.TrangThaiDonXuat
                            WHERE   TrangThaiXoa = 0 AND CONVERT(DATE, GETDATE(), 105) = CONVERT(DATE, NgayTao, 105)
                            ORDER BY TongTienXuat DESC
                             """;
                rs = XJDBCHelper.executeQuery(sql);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaDonXuat"),
                        rs.getLong("TongTienXuat"),
                        rs.getString("TenTrangThai"),
                        rs.getString("MaNV"),
                        XDateHelper.toString(rs.getDate("NgayTao"), "dd-MM-yyyy")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getRevenueDayASC(String date) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKTheoNgay (?)}";
                XJDBCHelper.executeUpdate(sql, date);
                String query = "SELECT * FROM ThongKeTheoNgay";
                rs = XJDBCHelper.executeQuery(query);
                while (rs.next()) {
                    Object[] model = {
                        XDateHelper.toString(rs.getDate("Ngay"), "dd-MM-yyyy"),
                        rs.getInt("TongHDN"),
                        rs.getInt("ChuaThanhToan"),
                        rs.getInt("DangThanhToan"),
                        rs.getInt("DaThanhToan"),
                        rs.getLong("TongTienNhap"),
                        rs.getLong("SoTienDaThanhToan"),
                        rs.getLong("SoTienConNo"),
                        rs.getInt("TongHDX"),
                        rs.getLong("TongTienXuat"),
                        rs.getLong("DoanhThu")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getRevenueMonthASC(String month) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKTheoThang (?)}";
                XJDBCHelper.executeUpdate(sql, month);
                String query = "SELECT * FROM ThongKeTheoThang";
                rs = XJDBCHelper.executeQuery(query);
                while (rs.next()) {
                    Object[] model = {
                        rs.getInt("Thang"),
                        rs.getInt("TongHDN"),
                        rs.getInt("ChuaThanhToan"),
                        rs.getInt("DangThanhToan"),
                        rs.getInt("DaThanhToan"),
                        rs.getLong("TongTienNhap"),
                        rs.getLong("SoTienDaThanhToan"),
                        rs.getLong("SoTienConNo"),
                        rs.getInt("TongHDX"),
                        rs.getLong("TongTienXuat"),
                        rs.getLong("DoanhThu")
                    };
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

    @SuppressWarnings("null")
    public List<Object[]> getRevenueYearASC(String year) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_TKTheoNam (?)}";
                XJDBCHelper.executeUpdate(sql, year);
                String query = "SELECT * FROM ThongKeTheoNam";
                rs = XJDBCHelper.executeQuery(query);
                while (rs.next()) {
                    Object[] model = {
                        rs.getInt("Nam"),
                        rs.getInt("TongHDN"),
                        rs.getInt("ChuaThanhToan"),
                        rs.getInt("DangThanhToan"),
                        rs.getInt("DaThanhToan"),
                        rs.getLong("TongTienNhap"),
                        rs.getLong("SoTienDaThanhToan"),
                        rs.getLong("SoTienConNo"),
                        rs.getInt("TongHDX"),
                        rs.getLong("TongTienXuat"),
                        rs.getLong("DoanhThu")
                    };
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
}
