package Conponent;

import ComponentOther.RevenueChart;
import DAO.StatisticalDAO;
import Helper.XDateHelper;
import Helper.XDialogHelper;
import Model.Colors;
import Utils.Auth;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class StatiStical extends javax.swing.JPanel {

    private boolean checkTotalProduct = false;
    private boolean checkExpiry = false;
    private boolean checkIB = false;
    private boolean checkEB = false;
    private boolean checkThematicChart = false;
    private StatisticalDAO sDAO;
    private RevenueChart revenueChart;
    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);

    public StatiStical() {
        initComponents();
        init();
        this.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint paint = new GradientPaint(0, 0, bgColorA, getWidth(), getHeight(), bgColorB);
        g2.setPaint(paint);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpBill = new javax.swing.ButtonGroup();
        tabContainer = new javax.swing.JTabbedPane();
        pnlTotalProduct = new javax.swing.JPanel();
        pnlSmallTotalProduct = new javax.swing.JPanel();
        btnSortTableTP = new CustomSwing.MyButton();
        txtSearchTP = new CustomSwing.MyTextField();
        spTotalProduct = new javax.swing.JScrollPane();
        tblTotalProduct = new javax.swing.JTable();
        pnlRevenue = new javax.swing.JPanel();
        pnlSmallRevenue = new javax.swing.JPanel();
        btnChartRevenue = new CustomSwing.MyButton();
        cboYearRevenue = new javax.swing.JComboBox<>();
        cboMonthRevenue = new javax.swing.JComboBox<>();
        cboTypeRevenue = new javax.swing.JComboBox<>();
        spRevenue = new javax.swing.JScrollPane();
        tblRevenue = new javax.swing.JTable();
        pnlBill = new javax.swing.JPanel();
        pnlSmallBill = new javax.swing.JPanel();
        btnSortBill = new CustomSwing.MyButton();
        rdoNow = new javax.swing.JRadioButton();
        rdoAll = new javax.swing.JRadioButton();
        cboTypeBill = new javax.swing.JComboBox<>();
        spImportBill = new javax.swing.JScrollPane();
        tblImportBill = new javax.swing.JTable();
        pnlExpiry = new javax.swing.JPanel();
        pnlSmallExpiry = new javax.swing.JPanel();
        btnSortExpiry = new CustomSwing.MyButton();
        txtSearchExpiry = new CustomSwing.MyTextField();
        spExpiry = new javax.swing.JScrollPane();
        tblExpiry = new javax.swing.JTable();

        setBackground(new java.awt.Color(198, 204, 206));

        tabContainer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabContainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabContainerMouseClicked(evt);
            }
        });

        pnlTotalProduct.setOpaque(false);
        pnlTotalProduct.setLayout(new java.awt.BorderLayout());

        pnlSmallTotalProduct.setOpaque(false);

        btnSortTableTP.setBackground(new java.awt.Color(76, 47, 136));
        btnSortTableTP.setForeground(new java.awt.Color(255, 255, 255));
        btnSortTableTP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sort (1).png"))); // NOI18N
        btnSortTableTP.setText("Xếp theo số lượng");
        btnSortTableTP.setColor(new java.awt.Color(76, 47, 136));
        btnSortTableTP.setColorEntered(new java.awt.Color(100, 65, 172));
        btnSortTableTP.setColorHover(new java.awt.Color(255, 255, 255));
        btnSortTableTP.setColorNomal(new java.awt.Color(255, 255, 255));
        btnSortTableTP.setColorPressed(new java.awt.Color(55, 55, 146));
        btnSortTableTP.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSortTableTP.setRadius(50);
        btnSortTableTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortTableTPActionPerformed(evt);
            }
        });

        txtSearchTP.setHide("Nhập tên sản phẩm cần tìm...");
        txtSearchTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchTPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchTPKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSmallTotalProductLayout = new javax.swing.GroupLayout(pnlSmallTotalProduct);
        pnlSmallTotalProduct.setLayout(pnlSmallTotalProductLayout);
        pnlSmallTotalProductLayout.setHorizontalGroup(
            pnlSmallTotalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallTotalProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchTP, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(btnSortTableTP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlSmallTotalProductLayout.setVerticalGroup(
            pnlSmallTotalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallTotalProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSmallTotalProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortTableTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTotalProduct.add(pnlSmallTotalProduct, java.awt.BorderLayout.PAGE_START);

        tblTotalProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng trong kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTotalProduct.setOpaque(false);
        spTotalProduct.setViewportView(tblTotalProduct);

        pnlTotalProduct.add(spTotalProduct, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("Tổng số lượng Sản Phẩm", pnlTotalProduct);

        pnlRevenue.setOpaque(false);
        pnlRevenue.setLayout(new java.awt.BorderLayout());

        pnlSmallRevenue.setOpaque(false);

        btnChartRevenue.setBackground(new java.awt.Color(55, 55, 146));
        btnChartRevenue.setForeground(new java.awt.Color(255, 255, 255));
        btnChartRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/analysis.png"))); // NOI18N
        btnChartRevenue.setText("Biểu đồ");
        btnChartRevenue.setColor(new java.awt.Color(55, 55, 146));
        btnChartRevenue.setColorEntered(new java.awt.Color(76, 76, 182));
        btnChartRevenue.setColorHover(new java.awt.Color(255, 255, 255));
        btnChartRevenue.setColorNomal(new java.awt.Color(255, 255, 255));
        btnChartRevenue.setColorPressed(new java.awt.Color(76, 47, 136));
        btnChartRevenue.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnChartRevenue.setRadius(50);
        btnChartRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartRevenueActionPerformed(evt);
            }
        });

        cboYearRevenue.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboYearRevenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm" }));
        cboYearRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboYearRevenueActionPerformed(evt);
            }
        });

        cboMonthRevenue.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboMonthRevenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng" }));
        cboMonthRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMonthRevenueActionPerformed(evt);
            }
        });

        cboTypeRevenue.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboTypeRevenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thống kê theo ngày", "Thống kê theo tháng", "Thống kê theo năm" }));
        cboTypeRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTypeRevenueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSmallRevenueLayout = new javax.swing.GroupLayout(pnlSmallRevenue);
        pnlSmallRevenue.setLayout(pnlSmallRevenueLayout);
        pnlSmallRevenueLayout.setHorizontalGroup(
            pnlSmallRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallRevenueLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cboTypeRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboMonthRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboYearRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(btnChartRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlSmallRevenueLayout.setVerticalGroup(
            pnlSmallRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallRevenueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSmallRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSmallRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMonthRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboTypeRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboYearRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnChartRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRevenue.add(pnlSmallRevenue, java.awt.BorderLayout.PAGE_START);

        tblRevenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ngày", "Tổng HDN", "Chưa TT", "SLHD Đang TT", "SLHD Đã TT", "Tổng tiền HDN", "Số tiền đã TT", "Tiền nợ", "Tổng HDX", "Tổng tiền HDX", "Doanh Thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRevenue.setOpaque(false);
        spRevenue.setViewportView(tblRevenue);

        pnlRevenue.add(spRevenue, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("Doanh Thu", pnlRevenue);

        pnlBill.setOpaque(false);
        pnlBill.setLayout(new java.awt.BorderLayout());

        pnlSmallBill.setOpaque(false);

        btnSortBill.setBackground(new java.awt.Color(76, 47, 136));
        btnSortBill.setForeground(new java.awt.Color(255, 255, 255));
        btnSortBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sort (1).png"))); // NOI18N
        btnSortBill.setText("Xếp theo tổng tiền");
        btnSortBill.setColor(new java.awt.Color(76, 47, 136));
        btnSortBill.setColorEntered(new java.awt.Color(100, 65, 172));
        btnSortBill.setColorHover(new java.awt.Color(255, 255, 255));
        btnSortBill.setColorNomal(new java.awt.Color(255, 255, 255));
        btnSortBill.setColorPressed(new java.awt.Color(55, 55, 146));
        btnSortBill.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSortBill.setRadius(50);
        btnSortBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortBillActionPerformed(evt);
            }
        });

        bgpBill.add(rdoNow);
        rdoNow.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoNow.setText("Hôm nay");
        rdoNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNowActionPerformed(evt);
            }
        });

        bgpBill.add(rdoAll);
        rdoAll.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoAll.setSelected(true);
        rdoAll.setText("Tất cả");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });

        cboTypeBill.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboTypeBill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hóa đơn nhập", "Hóa đơn xuất" }));
        cboTypeBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTypeBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSmallBillLayout = new javax.swing.GroupLayout(pnlSmallBill);
        pnlSmallBill.setLayout(pnlSmallBillLayout);
        pnlSmallBillLayout.setHorizontalGroup(
            pnlSmallBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallBillLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cboTypeBill, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(btnSortBill, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlSmallBillLayout.setVerticalGroup(
            pnlSmallBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSmallBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNow)
                    .addComponent(rdoAll)
                    .addComponent(btnSortBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTypeBill, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBill.add(pnlSmallBill, java.awt.BorderLayout.PAGE_START);

        spImportBill.setOpaque(false);

        tblImportBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Tổng tiền", "Trạng thái", "Mã nhân viên", "Ngày tạo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblImportBill.setOpaque(false);
        spImportBill.setViewportView(tblImportBill);

        pnlBill.add(spImportBill, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("Hóa Đơn", pnlBill);

        pnlExpiry.setOpaque(false);
        pnlExpiry.setLayout(new java.awt.BorderLayout());

        pnlSmallExpiry.setOpaque(false);

        btnSortExpiry.setBackground(new java.awt.Color(76, 47, 136));
        btnSortExpiry.setForeground(new java.awt.Color(255, 255, 255));
        btnSortExpiry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sort (1).png"))); // NOI18N
        btnSortExpiry.setText("Xếp theo hạn sử dụng");
        btnSortExpiry.setColor(new java.awt.Color(76, 47, 136));
        btnSortExpiry.setColorEntered(new java.awt.Color(100, 65, 172));
        btnSortExpiry.setColorHover(new java.awt.Color(255, 255, 255));
        btnSortExpiry.setColorNomal(new java.awt.Color(255, 255, 255));
        btnSortExpiry.setColorPressed(new java.awt.Color(55, 55, 146));
        btnSortExpiry.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSortExpiry.setRadius(50);
        btnSortExpiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortExpiryActionPerformed(evt);
            }
        });

        txtSearchExpiry.setHide("Nhập tên sản phẩm cần tìm...");
        txtSearchExpiry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchExpiryKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchExpiryKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSmallExpiryLayout = new javax.swing.GroupLayout(pnlSmallExpiry);
        pnlSmallExpiry.setLayout(pnlSmallExpiryLayout);
        pnlSmallExpiryLayout.setHorizontalGroup(
            pnlSmallExpiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSmallExpiryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(btnSortExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlSmallExpiryLayout.setVerticalGroup(
            pnlSmallExpiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallExpiryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSmallExpiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlExpiry.add(pnlSmallExpiry, java.awt.BorderLayout.PAGE_START);

        spExpiry.setOpaque(false);

        tblExpiry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng", "Đơn giá nhập", "Hạn sử dụng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExpiry.setOpaque(false);
        spExpiry.setViewportView(tblExpiry);

        pnlExpiry.add(spExpiry, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("Hạn sử dụng Sản Phẩm", pnlExpiry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabContainer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabContainer)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortExpiryActionPerformed
        fillToTableExpiry();
    }//GEN-LAST:event_btnSortExpiryActionPerformed

    private void btnSortBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortBillActionPerformed

        fillToTableIB(cboTypeBill.getSelectedIndex(), handleRdoBill());
    }//GEN-LAST:event_btnSortBillActionPerformed

    private void btnSortTableTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortTableTPActionPerformed
        fillToTableTP();
    }//GEN-LAST:event_btnSortTableTPActionPerformed

    private void txtSearchTPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchTPKeyPressed

    }//GEN-LAST:event_txtSearchTPKeyPressed

    private void txtSearchExpiryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchExpiryKeyPressed

    }//GEN-LAST:event_txtSearchExpiryKeyPressed

    private void rdoNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNowActionPerformed
        fillToTableIB(cboTypeBill.getSelectedIndex(), handleRdoBill());
    }//GEN-LAST:event_rdoNowActionPerformed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        fillToTableIB(cboTypeBill.getSelectedIndex(), handleRdoBill());
    }//GEN-LAST:event_rdoAllActionPerformed

    private void tabContainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabContainerMouseClicked

    }//GEN-LAST:event_tabContainerMouseClicked

    private void txtSearchTPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchTPKeyReleased
        searchTP();
    }//GEN-LAST:event_txtSearchTPKeyReleased

    private void txtSearchExpiryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchExpiryKeyReleased
        searchExpiry();
    }//GEN-LAST:event_txtSearchExpiryKeyReleased

    private void cboTypeBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTypeBillActionPerformed
        List list = null;
        fillToTableIB(cboTypeBill.getSelectedIndex(), list);
    }//GEN-LAST:event_cboTypeBillActionPerformed

    private void cboYearRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboYearRevenueActionPerformed
        // TODO add your handling code here:
        if (cboTypeRevenue.getSelectedIndex() == 1) {
            fillToTableRevenue(cboTypeRevenue.getSelectedIndex());
        }
        if (cboYearRevenue.getItemCount() > 0) {
            fillToCboMonthRevenue();
        }
    }//GEN-LAST:event_cboYearRevenueActionPerformed

    private void cboMonthRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMonthRevenueActionPerformed
        if (cboTypeRevenue.getSelectedIndex() == 0) {
            fillToTableRevenue(cboTypeRevenue.getSelectedIndex());
        }
    }//GEN-LAST:event_cboMonthRevenueActionPerformed

    private void cboTypeRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTypeRevenueActionPerformed
        handleCboType(cboTypeRevenue.getSelectedIndex());
    }//GEN-LAST:event_cboTypeRevenueActionPerformed

    private void btnChartRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartRevenueActionPerformed
        if (cboTypeRevenue.getSelectedIndex() > 0) {
            handleBtnRevenue();
        }
    }//GEN-LAST:event_btnChartRevenueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpBill;
    private CustomSwing.MyButton btnChartRevenue;
    private CustomSwing.MyButton btnSortBill;
    private CustomSwing.MyButton btnSortExpiry;
    private CustomSwing.MyButton btnSortTableTP;
    private javax.swing.JComboBox<String> cboMonthRevenue;
    private javax.swing.JComboBox<String> cboTypeBill;
    private javax.swing.JComboBox<String> cboTypeRevenue;
    private javax.swing.JComboBox<String> cboYearRevenue;
    private javax.swing.JPanel pnlBill;
    private javax.swing.JPanel pnlExpiry;
    private javax.swing.JPanel pnlRevenue;
    private javax.swing.JPanel pnlSmallBill;
    private javax.swing.JPanel pnlSmallExpiry;
    private javax.swing.JPanel pnlSmallRevenue;
    private javax.swing.JPanel pnlSmallTotalProduct;
    private javax.swing.JPanel pnlTotalProduct;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoNow;
    private javax.swing.JScrollPane spExpiry;
    private javax.swing.JScrollPane spImportBill;
    private javax.swing.JScrollPane spRevenue;
    private javax.swing.JScrollPane spTotalProduct;
    private javax.swing.JTabbedPane tabContainer;
    private javax.swing.JTable tblExpiry;
    private javax.swing.JTable tblImportBill;
    private javax.swing.JTable tblRevenue;
    private javax.swing.JTable tblTotalProduct;
    private CustomSwing.MyTextField txtSearchExpiry;
    private CustomSwing.MyTextField txtSearchTP;
    // End of variables declaration//GEN-END:variables

    private void init() {
        sDAO = new StatisticalDAO();
        StatisticalDAO.setTable(spTotalProduct, tblTotalProduct, false, 0, 2);
        StatisticalDAO.setTable(spExpiry, tblExpiry, false, 0, 2, 4);
        StatisticalDAO.setTable(spImportBill, tblImportBill, false, 0, 2, 3, 4);

        fillToCboYearRevenue();
        fillToCboMonthRevenue();
        List listIB = null;
        fillToTableTP();
        fillToTableExpiry();
        fillToTableIB(cboTypeBill.getSelectedIndex(), listIB);
        if (cboMonthRevenue.getItemCount() > 0) {
            fillToTableRevenue(cboTypeRevenue.getSelectedIndex());
        }
        btnChartRevenue.setEnabled(false);
        
        if (!Auth.isManager()) {
            tabContainer.remove(1);
        } 
    }

    public void fillToTableTP() {
        DefaultTableModel model = (DefaultTableModel) tblTotalProduct.getModel();
        model.setRowCount(0);
        List<Object[]> list;
        if (checkTotalProduct) {
            list = sDAO.getTotalProductDESC();
            checkTotalProduct = !checkTotalProduct;
        } else {
            list = sDAO.getTotalProductASC();
            checkTotalProduct = !checkTotalProduct;
        }
        for (Object object : list) {
            model.addRow((Object[]) object);
        }
        tblTotalProduct.setModel(model);
    }

    public void searchTP() {
        DefaultTableModel model = (DefaultTableModel) tblTotalProduct.getModel();
        model.setRowCount(0);
        List<Object[]> list = sDAO.getTotalProductSearchASC(txtSearchTP.getText().trim());
        for (Object object : list) {
            model.addRow((Object[]) object);
        }
        tblTotalProduct.setModel(model);
    }

    public void fillToTableExpiry() {
        DefaultTableModel model = (DefaultTableModel) tblExpiry.getModel();
        model.setRowCount(0);
        List<Object[]> list;
        if (checkExpiry) {
            list = sDAO.getExpiryDESC();
            checkExpiry = !checkExpiry;
        } else {
            list = sDAO.getExpiryASC();
            checkExpiry = !checkExpiry;
        }
        for (Object object : list) {
            model.addRow((Object[]) object);
        }
        tblExpiry.setModel(model);
    }

    public void searchExpiry() {
        DefaultTableModel model = (DefaultTableModel) tblExpiry.getModel();
        model.setRowCount(0);
        List<Object[]> list = sDAO.getExpirySearchDESC(txtSearchExpiry.getText().trim());
        for (Object object : list) {
            model.addRow((Object[]) object);
        }
        tblExpiry.setModel(model);
    }

    public void createTableNew(Object cols) {
        JScrollPane spExport = new JScrollPane();
        JTable tblExport = new JTable();
        spExport.add(tblExport);
        spExport.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) tblExport.getModel();
        model.setColumnIdentifiers((Object[]) cols);
    }

    @SuppressWarnings({"UnusedAssignment", "null"})
    public void fillToTableIB(int index, List list) {
        DefaultTableModel model = (DefaultTableModel) tblImportBill.getModel();
        model.setRowCount(0);
        if (rdoAll.isSelected()) {
            if (list == null) {
                switch (index) {
                    case 0 -> {
                        list = sDAO.getImportBillDESC();
                    }
                    case 1 -> {
                        list = sDAO.getEmportBillDESC();
                    }
                }
            }
        } else {
            if (list == null) {
                switch (index) {
                    case 0 -> {
                        list = sDAO.getImportBillNowASC();
                    }
                    case 1 -> {
                        list = sDAO.getExportBillNowDESC();
                    }
                }
            }
        }
        for (Object object : list) {
            model.addRow((Object[]) object);
        }
        tblImportBill.setModel(model);

    }

    private List handleRdoBill() {
        List list = null;
        if (rdoAll.isSelected()) {
            switch (cboTypeBill.getSelectedIndex()) {
                case 0 -> {
                    if (checkIB) {
                        list = sDAO.getImportBillDESC();
                        checkIB = !checkIB;
                    } else {
                        list = sDAO.getImportBillASC();
                        checkIB = !checkIB;
                    }
                }
                case 1 -> {
                    if (checkEB) {
                        list = sDAO.getEmportBillDESC();
                        checkEB = !checkEB;
                    } else {
                        list = sDAO.getEmportBillASC();
                        checkEB = !checkEB;
                    }
                }
            }
        } else {
            switch (cboTypeBill.getSelectedIndex()) {
                case 0 -> {
                    if (checkIB) {
                        list = sDAO.getImportBillNowDESC();
                        checkIB = !checkIB;
                    } else {
                        list = sDAO.getImportBillNowASC();
                        checkIB = !checkIB;
                    }
                }
                case 1 -> {
                    if (checkEB) {
                        list = sDAO.getExportBillNowDESC();
                        checkEB = !checkEB;
                    } else {
                        list = sDAO.getExportBillNowASC();
                        checkEB = !checkEB;
                    }
                }
            }
        }
        return list;
    }

    @SuppressWarnings({"unchecked", "unchecked"})
    public void handleCboType(int index) {
        switch (index) {
            case 0 -> {
                cboMonthRevenue.setEnabled(true);
                cboYearRevenue.setEnabled(true);
                btnChartRevenue.setEnabled(false);
                fillToTableRevenue(index);
            }
            case 1 -> {
                cboMonthRevenue.setEnabled(false);
                cboYearRevenue.setEnabled(true);
                btnChartRevenue.setEnabled(true);
                fillToTableRevenue(index);
                cboMonthRevenue.setSelectedIndex(0);
            }
            default -> {
                cboMonthRevenue.setEnabled(false);
                cboYearRevenue.setEnabled(false);
                btnChartRevenue.setEnabled(true);
                fillToTableRevenue(index);
                cboMonthRevenue.setSelectedIndex(0);
                cboYearRevenue.setSelectedIndex(0);
            }
        }
    }

    @SuppressWarnings("null")
    public void fillToTableRevenue(int index) {
        DefaultTableModel model = (DefaultTableModel) tblRevenue.getModel();
        model.setRowCount(0);
        List<Object[]> list = null;
        Object cols = new Object[]{"Ngày", "Tổng HDN", "Chưa TT", "Đang TT", "Đã TT", "Tổng tiền nhập", "Số tiền đã TT", "Số tiền còn nợ", "Tổng HDX", "Tổng tiền xuất", "Doanh thu"};
        switch (index) {
            case 0 -> {
                cols = new Object[]{"Ngày", "Tổng HDN", "Chưa TT", "Đang TT", "Đã TT", "Tổng tiền nhập", "Số tiền đã TT", "Số tiền còn nợ", "Tổng HDX", "Tổng tiền xuất", "Doanh thu"};
                list = sDAO.getRevenueDayASC(statisticalDay());
            }
            case 1 -> {
                cols = new Object[]{"Tháng", "Tổng HDN", "Chưa TT", "Đang TT", "Đã TT", "Tổng tiền nhập", "Số tiền đã TT", "Số tiền còn nợ", "Tổng HDX", "Tổng tiền xuất", "Doanh thu"};
                list = sDAO.getRevenueMonthASC(statisticalMonth());
            }
            case 2 -> {
                cols = new Object[]{"Năm", "Tổng HDN", "Chưa TT", "Đang TT", "Đã TT", "Tổng tiền nhập", "Số tiền đã TT", "Số tiền còn nợ", "Tổng HDX", "Tổng tiền xuất", "Doanh thu"};
                list = sDAO.getRevenueYearASC(XDateHelper.toString(XDateHelper.nowDate(), "yyyyMMdd"));

            }
        }
        model.setColumnIdentifiers((Object[]) cols);
        for (Object object : list) {
            model.addRow((Object[]) object);
        }
        tblRevenue.setModel(model);
        StatisticalDAO.setTable(spRevenue, tblRevenue, false, 0, 1, 2, 3, 4, 8);
    }

    @SuppressWarnings("unchecked")
    public void fillToCboYearRevenue() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboYearRevenue.getModel();
        model.removeAllElements();
        @SuppressWarnings("deprecation")
        int year = getCalendarNow().get(Calendar.YEAR);
        for (int i = year; i >= 2022; i--) {
            model.addElement(i);
        }
        cboYearRevenue.setModel(model);
        cboYearRevenue.setSelectedItem(getCalendarNow().get(Calendar.YEAR));
    }

    @SuppressWarnings({"unchecked", "unchecked"})
    public void fillToCboMonthRevenue() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMonthRevenue.getModel();
        model.removeAllElements();
        int month = 0;
        if (Integer.parseInt(String.valueOf(cboYearRevenue.getSelectedItem())) == getCalendarNow().get(Calendar.YEAR)) {
            month = getCalendarNow().get(Calendar.MONTH) + 1;
        } else {
            month = 12;
        }
        for (int i = month; i >= 1; i--) {
            if (i < 10) {
                model.addElement("0" + i);
            } else {
                model.addElement(i);
            }
        }
        cboMonthRevenue.setModel(model);
        if (month < 10) {
            cboMonthRevenue.setSelectedItem("0" + (getCalendarNow().get(Calendar.MONTH) + 1));
        } else {
            cboMonthRevenue.setSelectedItem(getCalendarNow().get(Calendar.MONTH) + 1);
        }
    }

    public String statisticalMonth() {
        String date = "";
        if (Integer.parseInt(String.valueOf(cboYearRevenue.getSelectedItem())) == getCalendarNow().get(Calendar.YEAR)) {
            date = XDateHelper.toString(XDateHelper.nowDate(), "yyyyMMdd");
        } else {
            date = cboYearRevenue.getSelectedItem() + "1231";
        }
        return date;
    }

    public String statisticalDay() {
        String date = XDateHelper.toString(XDateHelper.nowDate(), "yyyyMMdd");
//        System.out.println(cboMonthRevenue.getSelectedItem());
        if (cboMonthRevenue.getItemCount() > 0) {
            if (Integer.parseInt(String.valueOf(cboYearRevenue.getSelectedItem())) == getCalendarNow().get(Calendar.YEAR)
                    && Integer.parseInt(String.valueOf(cboMonthRevenue.getSelectedItem())) == getCalendarNow().get(Calendar.MONTH) + 1) {
                date = XDateHelper.toString(XDateHelper.nowDate(), "yyyyMMdd");
            } else {
                int month = Integer.parseInt(String.valueOf(cboMonthRevenue.getSelectedItem()));
                int year = Integer.parseInt(String.valueOf(cboYearRevenue.getSelectedItem()));
                if (month < 10) {
                    date = year + "0" + month + "" + dateInMonth(month, year);
                } else {
                    date = year + "" + month + "" + dateInMonth(month, year);
                }
            }
        }
        return date;
    }

    public Calendar getCalendarNow() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        calendar.setTime(date);
        return calendar;
    }

    public boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int dateInMonth(int month, int year) {
        int day = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                day = 31;
            case 4, 6, 9, 11 ->
                day = 30;
            case 2 ->
                day = checkYear(year) ? 29 : 28;
            default ->
                XDialogHelper.alert(this, "Error");
        }
        return day;
    }

    public void handleRoleStatistical(boolean isRole) {
        if (!isRole) {
            tabContainer.remove(1);
        }
    }

    public void handleBtnRevenue() {
        if (checkThematicChart) {
            tblRevenue.setVisible(checkThematicChart);
            spRevenue.setVisible(checkThematicChart);
            revenueChart.setVisible(!checkThematicChart);
            pnlRevenue.remove(revenueChart);
            pnlRevenue.add(spRevenue, BorderLayout.CENTER);
            btnChartRevenue.setText("Biểu đồ");
            cboTypeRevenue.setEnabled(checkThematicChart);
            cboYearRevenue.setEnabled(checkThematicChart);
            checkThematicChart = !checkThematicChart;
        } else {
            revenueChart = new RevenueChart(tblRevenue);
            tblRevenue.setVisible(checkThematicChart);
            spRevenue.setVisible(checkThematicChart);
            pnlRevenue.add(revenueChart, BorderLayout.CENTER);
            revenueChart.setVisible(!checkThematicChart);
            btnChartRevenue.setText("Quay lại");
            cboTypeRevenue.setEnabled(checkThematicChart);
            cboYearRevenue.setEnabled(checkThematicChart);
            checkThematicChart = !checkThematicChart;
        }
    }
}
