package Conponent;

import DAO.BaseDAO;
import DAO.SupplierDAO;
import Entities.Supplier;
import Helper.XDialogHelper;
import Model.Colors;
import Utils.Auth;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
@SuppressWarnings("serial")
public class SupplierUI extends javax.swing.JPanel {

    SupplierDAO splDAO = new SupplierDAO();
    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);

    public SupplierUI() {
        initComponents();
        init();
        spSupplier.setViewportBorder(BorderFactory.createEmptyBorder());
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

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSupplirAddress = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSupplirDetail = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSupplierID = new CustomSwing.MyTextField();
        txtSupplierName = new CustomSwing.MyTextField();
        txtSupplierPhone = new CustomSwing.MyTextField();
        btnDelete = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnRefesh = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlButton = new javax.swing.JPanel();
        spSupplier = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();

        setBackground(new java.awt.Color(147, 196, 125));
        setForeground(new java.awt.Color(153, 255, 153));
        setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(147, 196, 125));
        jPanel6.setForeground(new java.awt.Color(153, 255, 153));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(147, 196, 125));
        jPanel7.setLayout(new java.awt.BorderLayout());
        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(66, 103, 178));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Quản Lý Nhà Cung Cấp");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setPreferredSize(new java.awt.Dimension(289, 45));
        jPanel11.add(jLabel15, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(147, 196, 125));
        jPanel8.setLayout(new java.awt.BorderLayout());

        pnlForm.setBackground(new java.awt.Color(147, 196, 125));

        txtSupplirAddress.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(txtSupplirAddress);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ghi chú");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Số Điện Thoại");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Mã Nhà Cung Cấp");

        txtSupplirDetail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jScrollPane5.setViewportView(txtSupplirDetail);

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Tên Nhà Cung Cấp");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Địa Chỉ:");

        txtSupplierID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtSupplierID.setEnabled(false);
        txtSupplierID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtSupplierID.setHide("");

        txtSupplierName.setHide("");
        txtSupplierName.setNextFocusableComponent(txtSupplierPhone);

        txtSupplierPhone.setHide("");
        txtSupplierPhone.setNextFocusableComponent(txtSupplirAddress);

        btnDelete.setBackground(new java.awt.Color(0, 82, 0));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(0, 82, 0));
        btnPrev.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("<<");
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnRefesh.setBackground(new java.awt.Color(0, 82, 0));
        btnRefesh.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnRefesh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rotation.png"))); // NOI18N
        btnRefesh.setText("Làm Mới");
        btnRefesh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 82, 0));
        btnNext.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText(">>");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 82, 0));
        btnUpdate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(0, 82, 0));
        btnFirst.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("|<");
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 82, 0));
        btnInsert.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-button.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(0, 82, 0));
        btnLast.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText(">|");
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(36, 36, 36)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane3)))
                    .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlFormLayout.createSequentialGroup()
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFirst)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPrev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNext)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLast))
                        .addGroup(pnlFormLayout.createSequentialGroup()
                            .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane5)))
                .addGap(24, 24, 24)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnRefesh)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap())
        );

        jPanel8.add(pnlForm, java.awt.BorderLayout.NORTH);

        pnlButton.setOpaque(false);

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Số điện thoại", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        spSupplier.setViewportView(tblSupplier);
        if (tblSupplier.getColumnModel().getColumnCount() > 0) {
            tblSupplier.getColumnModel().getColumn(0).setMinWidth(160);
            tblSupplier.getColumnModel().getColumn(0).setMaxWidth(180);
            tblSupplier.getColumnModel().getColumn(3).setMinWidth(150);
            tblSupplier.getColumnModel().getColumn(3).setMaxWidth(180);
        }

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonLayout.createSequentialGroup()
                .addComponent(spSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(pnlButton, java.awt.BorderLayout.CENTER);

        add(jPanel8, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            if (validateForm()) {
                this.insertSupplier();
            }
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền Thêm Nhà Cung Cấp !");
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblSupplirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplirMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblSupplier.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.editSupplier();

            }
        }
    }//GEN-LAST:event_tblSupplirMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            this.updateSupplier();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            if (tblSupplier.getRowCount() == 1) {
                XDialogHelper.alert(this, 0, "Phải có tối thiểu 1 Nhà Cung Cấp !");
            } else {
                this.deleteSupplier();
            }
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Nhà Cung Cấp !");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.editSupplier();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.editSupplier();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.editSupplier();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index = tblSupplier.getRowCount() - 1;
        this.editSupplier();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        if (evt.getClickCount() == 2) {
            this.index = tblSupplier.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.editSupplier();

            }
        }
    }//GEN-LAST:event_tblSupplierMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JScrollPane spSupplier;
    private javax.swing.JTable tblSupplier;
    private CustomSwing.MyTextField txtSupplierID;
    private CustomSwing.MyTextField txtSupplierName;
    private CustomSwing.MyTextField txtSupplierPhone;
    private javax.swing.JTextPane txtSupplirAddress;
    private javax.swing.JTextPane txtSupplirDetail;
    // End of variables declaration//GEN-END:variables
    int index = 0;

    private void init() {
        fillToTableSupplier();
        clear();
        BaseDAO.setTable(spSupplier, tblSupplier, false, 0, 3);
    }

    private void fillToTableSupplier() {
        DefaultTableModel model = (DefaultTableModel) tblSupplier.getModel();
        model.setRowCount(0);
        try {
            List<Supplier> list = splDAO.select();
            for (Supplier spl : list) {
                Object[] row = {
                    spl.getSupplierID(),
                    spl.getSupplierName(),
                    spl.getSupplierAdress(),
                    spl.getSupplierPhone(),
                    spl.getSupplierDetail()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    private void insertSupplier() {
        Supplier model = getModel();
        try {
            splDAO.insert(model);
            XDialogHelper.alert(this, "Thêm mới thành công!");
            this.fillToTableSupplier();
            this.clear();

        } catch (Exception e) {
            e.printStackTrace();
            XDialogHelper.alert(this, "Thêm mới thất bại!");
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    void updateSupplier() {
        Supplier model = getModel();
        String note = "Tên NCC: " + txtSupplierName.getText() + ", SĐT: " + txtSupplierPhone.getText() + ", Địa chỉ: " + txtSupplirAddress.getText() + ", Chi tiết: " + txtSupplirDetail.getText();
        try {
            splDAO.updates(model, note);
            this.fillToTableSupplier();
            XDialogHelper.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            XDialogHelper.alert(this, "Cập nhật thất bại!");
        }

    }

    void deleteSupplier() {
        String MaNCC = txtSupplierID.getText();

        try {
            splDAO.delete(MaNCC);
            this.fillToTableSupplier();
            this.clear();
            XDialogHelper.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            XDialogHelper.alert(this, "Xóa thất bại!");
        }

    }

    void editSupplier() {
        try {
            String maNV = (String) tblSupplier.getValueAt(this.index, 0);
            Supplier model = splDAO.findByID(maNV);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private Supplier getModel() {
        Supplier model = new Supplier();
        model.setSupplierID(txtSupplierID.getText());
        model.setSupplierName(txtSupplierName.getText());
        model.setSupplierDetail(txtSupplirDetail.getText());
        model.setSupplierPhone(txtSupplierPhone.getText());
        model.setSupplierAdress(txtSupplirAddress.getText());
        return model;
    }

    void setModel(Supplier model) {
        txtSupplierID.setText(model.getSupplierID());
        txtSupplierName.setText(model.getSupplierName());
        txtSupplirDetail.setText(model.getSupplierDetail());
        txtSupplierPhone.setText(model.getSupplierPhone());
        txtSupplirAddress.setText(model.getSupplierAdress());
    }

    void setnull() {
        try {
            txtSupplierID.setText(BaseDAO.setExportID("NhaCungCap", "NCC", 3));
            txtSupplierName.setText("");
            txtSupplirDetail.setText("");
            txtSupplirAddress.setText("");
            txtSupplierPhone.setText("");
        } catch (SQLException ex) {
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }

    }

    void setStatus(boolean insertable) {
        txtSupplierID.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        if (Auth.user.getRoleID() == 1) {
            btnDelete.setEnabled(!insertable);
        } else {
            btnDelete.setEnabled(false);
        }
        boolean first = this.index > 0;
        boolean last = this.index < tblSupplier.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
        txtSupplierName.requestFocus();
    }

    void clear() {
        this.setnull();
        this.setStatus(true);
    }

    public void handleRoleSupplier(boolean isRole) {
        btnDelete.setEnabled(isRole);
    }

    private boolean validateForm() {
        Pattern regexSpecial = Pattern.compile("^.*[!@#$%&*()_+=|<>?{}\\[\\]~]+.*$");
        String regexNumberPhone = "^([+84|84|0]+(3|5|7|8|9|1[2|6|8|9]))+([0-9]{8})$";
        if (txtSupplierName.getText().trim().equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, "Không được để trống tên nhà cung cấp !");
            txtSupplierName.requestFocus();
            return false;
        } else {
            if (regexSpecial.matcher(txtSupplierName.getText()).find()) {
                XDialogHelper.alert(this, 0, "Lỗi tên nhà cung cấp chứa ký tự đặc biệt !");
                txtSupplierName.requestFocus();
                return false;
            }
        }
        if (txtSupplierPhone.getText().trim().equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, "Bạn chưa nhập số điện thoại !");
            txtSupplierPhone.requestFocus();
            return false;
        } else {
            if (!txtSupplierPhone.getText().matches(regexNumberPhone)) {
                XDialogHelper.alert(this, 0, "Lỗi định dạng số điện thoại (0999333666) !");
                txtSupplierPhone.requestFocus();
                return false;
            }
        }

        if (txtSupplirAddress.getText().trim().equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, "Không được để địa chỉ !");
            txtSupplirAddress.requestFocus();
            return false;
        } else {
            if (regexSpecial.matcher(txtSupplirAddress.getText()).find()) {
                XDialogHelper.alert(this, 0, "Lỗi địa chỉ chứa ký tự đặc biệt !");
                txtSupplirAddress.requestFocus();
                return false;
            }
        }
        return true;

    }
}
