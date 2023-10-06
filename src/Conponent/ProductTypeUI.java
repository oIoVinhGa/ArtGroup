package Conponent;

import DAO.BaseDAO;
import DAO.EmployeeDAO;
import DAO.ProductTypeDAO;
import Entities.ProductType;
import Helper.XDateHelper;
import Helper.XDialogHelper;
import Model.Colors;
import Utils.Auth;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class ProductTypeUI extends javax.swing.JPanel {

    ProductTypeDAO tyDAO = new ProductTypeDAO();
    private EmployeeDAO eDAO = new EmployeeDAO();
    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);

    public ProductTypeUI() {
        initComponents();
        this.setOpaque(false);
        init();
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

        lblTitle = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        txtCreateBy = new javax.swing.JTextField();
        lblCreateBy = new javax.swing.JLabel();
        lblCreateDate = new javax.swing.JLabel();
        txtCreateDate = new javax.swing.JTextField();
        lblTypeName = new javax.swing.JLabel();
        txtTypeName = new javax.swing.JTextField();
        txtFindType = new CustomSwing.MyTextField();
        cboSortType = new javax.swing.JComboBox<>();
        spType = new javax.swing.JScrollPane();
        tblProductType = new javax.swing.JTable();
        btnInsertType = new javax.swing.JButton();
        btnUpdateType = new javax.swing.JButton();
        btnDeleteType = new javax.swing.JButton();
        btnNewType = new javax.swing.JButton();
        btnFisrtType = new javax.swing.JButton();
        btnPrevType = new javax.swing.JButton();
        btnNextType = new javax.swing.JButton();
        btnLastType = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÝ PHÂN LOẠI SẢN PHẨM");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(386, 45));
        add(lblTitle, java.awt.BorderLayout.PAGE_START);

        pnlContainer.setBackground(new java.awt.Color(51, 255, 51));
        pnlContainer.setOpaque(false);

        txtCreateBy.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtCreateBy.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtCreateBy.setEnabled(false);
        txtCreateBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateByActionPerformed(evt);
            }
        });

        lblCreateBy.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblCreateBy.setText("Người tạo:");

        lblCreateDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblCreateDate.setText("Ngày tạo:");

        txtCreateDate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtCreateDate.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtCreateDate.setEnabled(false);

        lblTypeName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTypeName.setText("Tên loại sản phẩm:");

        txtTypeName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtFindType.setHide("Nhập loại SP cần tìm...");
        txtFindType.setPreferredSize(new java.awt.Dimension(200, 42));
        txtFindType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindTypeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindTypeKeyReleased(evt);
            }
        });

        cboSortType.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboSortType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp theo", "Tên SP", "Ngày tạo" }));
        cboSortType.setToolTipText("");
        cboSortType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSortTypeActionPerformed(evt);
            }
        });

        spType.setBorder(null);

        tblProductType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "LOẠI SP", "TÊN LOẠI SP", "NGÀY TẠO", "NGƯỜI TẠO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductTypeMouseClicked(evt);
            }
        });
        spType.setViewportView(tblProductType);
        if (tblProductType.getColumnModel().getColumnCount() > 0) {
            tblProductType.getColumnModel().getColumn(0).setMinWidth(100);
            tblProductType.getColumnModel().getColumn(0).setMaxWidth(150);
            tblProductType.getColumnModel().getColumn(2).setMinWidth(150);
            tblProductType.getColumnModel().getColumn(2).setMaxWidth(200);
            tblProductType.getColumnModel().getColumn(3).setMinWidth(150);
            tblProductType.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        btnInsertType.setBackground(new java.awt.Color(0, 82, 0));
        btnInsertType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsertType.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-button.png"))); // NOI18N
        btnInsertType.setText("Thêm");
        btnInsertType.setPreferredSize(new java.awt.Dimension(100, 33));
        btnInsertType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTypeActionPerformed(evt);
            }
        });

        btnUpdateType.setBackground(new java.awt.Color(0, 82, 0));
        btnUpdateType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdateType.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnUpdateType.setText("Cập nhật");
        btnUpdateType.setPreferredSize(new java.awt.Dimension(145, 33));
        btnUpdateType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTypeActionPerformed(evt);
            }
        });

        btnDeleteType.setBackground(new java.awt.Color(0, 82, 0));
        btnDeleteType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDeleteType.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDeleteType.setText("Xóa");
        btnDeleteType.setPreferredSize(new java.awt.Dimension(100, 33));
        btnDeleteType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTypeActionPerformed(evt);
            }
        });

        btnNewType.setBackground(new java.awt.Color(0, 82, 0));
        btnNewType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNewType.setForeground(new java.awt.Color(255, 255, 255));
        btnNewType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rotation.png"))); // NOI18N
        btnNewType.setText("Làm mới");
        btnNewType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTypeActionPerformed(evt);
            }
        });

        btnFisrtType.setBackground(new java.awt.Color(0, 82, 0));
        btnFisrtType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnFisrtType.setForeground(new java.awt.Color(255, 255, 255));
        btnFisrtType.setText("|<");
        btnFisrtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFisrtTypeActionPerformed(evt);
            }
        });

        btnPrevType.setBackground(new java.awt.Color(0, 82, 0));
        btnPrevType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnPrevType.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevType.setText("<<");
        btnPrevType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevTypeActionPerformed(evt);
            }
        });

        btnNextType.setBackground(new java.awt.Color(0, 82, 0));
        btnNextType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNextType.setForeground(new java.awt.Color(255, 255, 255));
        btnNextType.setText(">>");
        btnNextType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextTypeActionPerformed(evt);
            }
        });

        btnLastType.setBackground(new java.awt.Color(0, 82, 0));
        btnLastType.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLastType.setForeground(new java.awt.Color(255, 255, 255));
        btnLastType.setText(">|");
        btnLastType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCreateBy)
                                .addComponent(lblCreateBy)
                                .addComponent(txtCreateDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTypeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCreateDate)
                            .addComponent(lblTypeName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(txtFindType, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboSortType, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spType))
                        .addGap(12, 12, 12))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertType, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateType, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFisrtType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrevType)
                        .addGap(5, 5, 5)
                        .addComponent(btnNextType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLastType)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFindType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSortType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(spType, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTypeName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblCreateDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCreateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCreateBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCreateBy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdateType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsertType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNewType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNextType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLastType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnPrevType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFisrtType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        add(pnlContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductTypeMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {
            tblProductType.setRowSelectionAllowed(true);
            this.row = tblProductType.getSelectedRow();
            this.editType();
        }
    }//GEN-LAST:event_tblProductTypeMouseClicked

    private void btnInsertTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertTypeActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            insertType();
        }
    }//GEN-LAST:event_btnInsertTypeActionPerformed

    private void btnUpdateTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTypeActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            updateType();
        }
    }//GEN-LAST:event_btnUpdateTypeActionPerformed

    private void btnDeleteTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTypeActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            if (tblProductType.getRowCount() == 1) {
                XDialogHelper.alert(this, 0, "Phải có tối thiểu 1 loại Sản Phẩm !");
            } else {
                delType();
            }
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Loại Sản Phẩm !");
        }
    }//GEN-LAST:event_btnDeleteTypeActionPerformed

    private void btnNewTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTypeActionPerformed
        // TODO add your handling code here:
        clearFormType();
    }//GEN-LAST:event_btnNewTypeActionPerformed

    private void txtFindTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindTypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindTypeKeyPressed

    private void cboSortTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSortTypeActionPerformed
        // TODO add your handling code here:
        System.out.println(cboSortType.getSelectedIndex());
        sortTblProductType(cboSortType.getSelectedIndex());
    }//GEN-LAST:event_cboSortTypeActionPerformed

    private void btnFisrtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFisrtTypeActionPerformed
        // TODO add your handling code here:
        firstType();
    }//GEN-LAST:event_btnFisrtTypeActionPerformed

    private void btnPrevTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevTypeActionPerformed
        // TODO add your handling code here:\
        prevType();
    }//GEN-LAST:event_btnPrevTypeActionPerformed

    private void btnNextTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextTypeActionPerformed
        // TODO add your handling code here:
        nextType();
    }//GEN-LAST:event_btnNextTypeActionPerformed

    private void btnLastTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastTypeActionPerformed
        // TODO add your handling code here:
        lastType();
    }//GEN-LAST:event_btnLastTypeActionPerformed

    private void txtCreateByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateByActionPerformed

    private void txtFindTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindTypeKeyReleased

        fillToTableProductType(tyDAO.selectByKeyword(txtFindType.getText()));
    }//GEN-LAST:event_txtFindTypeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteType;
    private javax.swing.JButton btnFisrtType;
    private javax.swing.JButton btnInsertType;
    private javax.swing.JButton btnLastType;
    private javax.swing.JButton btnNewType;
    private javax.swing.JButton btnNextType;
    private javax.swing.JButton btnPrevType;
    private javax.swing.JButton btnUpdateType;
    private javax.swing.JComboBox<String> cboSortType;
    private javax.swing.JLabel lblCreateBy;
    private javax.swing.JLabel lblCreateDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTypeName;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JScrollPane spType;
    private javax.swing.JTable tblProductType;
    private javax.swing.JTextField txtCreateBy;
    private javax.swing.JTextField txtCreateDate;
    private CustomSwing.MyTextField txtFindType;
    private javax.swing.JTextField txtTypeName;
    // End of variables declaration//GEN-END:variables

    int row = -1;

    private void init() {
        BaseDAO.setTable(spType, tblProductType, false, 0, 2);

        this.fillToTableProductType(tyDAO.selectAll());

        clearFormType();
        spType.getViewport().setOpaque(false);
        spType.setViewportBorder(BorderFactory.createEmptyBorder());
    }

    private void fillToTableProductType(List<ProductType> ls) {
        DefaultTableModel model = (DefaultTableModel) tblProductType.getModel();
        model.setRowCount(0);
        try {
            List<ProductType> list = ls;
            for (ProductType ty : list) {
                if (!ty.isStatus()) {
                    Object[] row = {
                        ty.getProductTypeID(),
                        ty.getProductTypeName(),
                        XDateHelper.toString(ty.getCreateDate(), "dd-MM-yyyy"),
                        eDAO.findByID(ty.getCreateBy()).getFullName()
                    };
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void setForm(ProductType ty) {
        txtTypeName.setText(ty.getProductTypeName());
        txtCreateDate.setText(XDateHelper.toString(ty.getCreateDate(), "dd-MM-yyyy"));
        txtCreateBy.setText(Auth.user.getFullName());
    }

    ProductType getForm() {
        ProductType ty = new ProductType();
        ty.setProductTypeName(txtTypeName.getText());
        ty.setCreateBy(Auth.user.getEmployeeID());
        ty.setCreateDate(XDateHelper.toDate(txtCreateDate.getText(), "yyyy-MM-dd"));
        return ty;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblProductType.getRowCount() - 1);

        btnInsertType.setEnabled(!edit);
        btnUpdateType.setEnabled(edit);
        if (Auth.user.getRoleID() == 1) {
            btnDeleteType.setEnabled(edit);
        } else {
            btnDeleteType.setEnabled(false);
        }

        btnFisrtType.setEnabled(edit && !first);
        btnPrevType.setEnabled(edit && !first);
        btnNextType.setEnabled(edit && !last);
        btnLastType.setEnabled(edit && !last);
    }

    private void insertType() {
        ProductType ty = getForm();
        if (tyDAO.selectByName(ty.getProductTypeName()) != null) {
            if (tyDAO.selectByName(ty.getProductTypeName()).isStatus() == true) {
                if (XDialogHelper.confirm(this, "Bạn có muốn khôi phục không?")) {
                    tyDAO.insert2(tyDAO.selectByName(ty.getProductTypeName()));
                    this.fillToTableProductType(tyDAO.selectAll());
                    this.clearFormType();
                    XDialogHelper.alert(this, "Thêm mới thành công !");
                }
            } else {
                XDialogHelper.alert(this, "Loại Sản Phẩm đã tồn tại !");
            }
        } else {
            try {
                tyDAO.insert(ty);
                this.fillToTableProductType(tyDAO.selectAll());
                this.clearFormType();
                XDialogHelper.alert(this, "Thêm mới thành công !");
            } catch (Exception e) {
                System.out.println(e);
                XDialogHelper.alert(this, "Thêm mới thất bại !");
            }
        }

    }

    private void updateType() {
        ProductType ty = getForm();
        ty.setProductTypeID(tblProductType.getValueAt(row, 0).toString());
        try {
            tyDAO.update(ty);
            this.fillToTableProductType(tyDAO.selectAll());
            this.clearFormType();
            XDialogHelper.alert(this, "Cập nhật thành công !");
        } catch (Exception e) {
            XDialogHelper.alert(this, "Cập nhật thất bại !");
            System.out.println(e);
        }
    }

    private void delType() {
        String idType = tblProductType.getValueAt(row, 0).toString();
        try {

            if (XDialogHelper.confirm(this, "Xóa Loại SP đang chọn ?")) {
                XDialogHelper.alert(this, "Xóa thành công !");
                tyDAO.delete(idType);
                this.fillToTableProductType(tyDAO.selectAll());
                this.clearFormType();
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Xóa thất bại!");

        }
    }

    private void clearFormType() {
        ProductType ty = new ProductType();
        setForm(ty);
        row = -1;
        updateStatus();
        tblProductType.setRowSelectionAllowed(false);
    }

    private void editType() {
        String tyID = (String) tblProductType.getValueAt(row, 0);
        ProductType ty = tyDAO.selectById(tyID);
        this.setForm(ty);
        this.updateStatus();
    }

    void firstType() {
        this.row = 0;
        this.editType();
        tblProductType.changeSelection(row, 0, false, false);
    }

    void prevType() {
        if (this.row > 0) {
            this.row--;
            this.editType();
            tblProductType.changeSelection(row, 0, false, false);
        }
    }

    void nextType() {
        if (this.row < tblProductType.getRowCount() - 1) {
            this.row++;
            this.editType();
            tblProductType.changeSelection(row, 0, false, false);
        }
    }

    void lastType() {
        this.row = tblProductType.getRowCount() - 1;
        this.editType();
        tblProductType.changeSelection(row, 0, false, false);
    }

    private void sortTblProductType(int index) {
        if (index == 1) {
            fillToTableProductType(tyDAO.selectSortBy("TenLoaiSP", true));
        } else {
            fillToTableProductType(tyDAO.selectSortBy("NgayTao", true));
        }
    }

//    public static void main(String[] args) {
//        JFrame newj = new JFrame();
//        JPanel jp = new ProductTypeJPanel();
//        newj.add(jp);
//        newj.setSize(jp.getWidth(), jp.getHeight());
//        newj.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        newj.setMinimumSize(new java.awt.Dimension(1280, 720));
//        jp.setVisible(true);
//        newj.setVisible(true);
//    }
    private boolean isValidate() {
        if (txtTypeName.getText().isEmpty()) {
            XDialogHelper.alert(this, "Vui lòng nhập Tên Loại SP !");
            return false;
        }
        return true;
    }

    public void handleRoleProductType(boolean isRole) {
        btnDeleteType.setEnabled(isRole);

    }
}
