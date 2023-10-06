package Conponent;

import CustomSwing.ScrollBarCustom;
import DAO.ImportBillDAO;
import DAO.ImportBillDetailsDAO;
import DAO.ProductDAO;
import DAO.UnitDAO;
import Entities.ImportBilldetails;
import Entities.Product;
import Entities.Unit;
import Helper.XDateHelper;
import Helper.XDialogHelper;
import Helper.XShareHelper;
import Utils.Auth;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class ImportBillDetailUI extends javax.swing.JDialog {

    private String detailsID;
    private String importID;
    private int index;

    public ImportBillDetailUI(JFrame parent, boolean modal, String detailsID, String importID, int index) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.detailsID = detailsID;
        this.importID = importID;
        this.index = index;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        pnlListProduct = new javax.swing.JPanel();
        spFindProduct = new javax.swing.JScrollPane();
        lProduct = new javax.swing.JList<>();
        cboProduct = new javax.swing.JComboBox<>();
        jdcManufacturingDate = new com.toedter.calendar.JDateChooser();
        txtQuantityBox = new javax.swing.JSpinner();
        jdcExpiryDate = new com.toedter.calendar.JDateChooser();
        txtQuantityInBox = new javax.swing.JSpinner();
        txtProductPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        lblProductImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImportBillID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        txtUnit = new javax.swing.JTextField();
        txtProduct = new CustomSwing.MyTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm sản phẩm");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(187, 200, 194));

        lblTitle.setBackground(new java.awt.Color(163, 172, 168));
        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("THÊM CHI TIẾT HÓA ĐƠN NHẬP");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContainer.setBackground(new java.awt.Color(187, 200, 194));
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlListProduct.setBackground(new java.awt.Color(199, 216, 220));

        spFindProduct.setBackground(new java.awt.Color(199, 216, 220));
        spFindProduct.setHorizontalScrollBar(new ScrollBarCustom(2));
        spFindProduct.setVerticalScrollBar(new ScrollBarCustom(2));

        lProduct.setBackground(new java.awt.Color(199, 216, 220));
        lProduct.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lProduct.setVisibleRowCount(5);
        lProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lProductMouseClicked(evt);
            }
        });
        spFindProduct.setViewportView(lProduct);

        javax.swing.GroupLayout pnlListProductLayout = new javax.swing.GroupLayout(pnlListProduct);
        pnlListProduct.setLayout(pnlListProductLayout);
        pnlListProductLayout.setHorizontalGroup(
            pnlListProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListProductLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spFindProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlListProductLayout.setVerticalGroup(
            pnlListProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spFindProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        pnlContainer.add(pnlListProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 254, 90));

        cboProduct.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn:" }));
        cboProduct.setBorder(null);
        cboProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductActionPerformed(evt);
            }
        });
        pnlContainer.add(cboProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 254, 30));

        jdcManufacturingDate.setDate(new java.util.Date(1679212547000L));
        jdcManufacturingDate.setDateFormatString("dd-MM-yyyy");
        jdcManufacturingDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jdcManufacturingDate.setNextFocusableComponent(jdcExpiryDate);
        pnlContainer.add(jdcManufacturingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 52, 166, 35));

        txtQuantityBox.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtQuantityBox.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        txtQuantityBox.setNextFocusableComponent(txtQuantityInBox);
        txtQuantityBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuantityBoxStateChanged(evt);
            }
        });
        txtQuantityBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuantityBoxMouseClicked(evt);
            }
        });
        pnlContainer.add(txtQuantityBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 214, 166, 35));

        jdcExpiryDate.setDate(new java.util.Date(1679212547000L));
        jdcExpiryDate.setDateFormatString("dd-MM-yyyy");
        jdcExpiryDate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jdcExpiryDate.setNextFocusableComponent(txtQuantityBox);
        pnlContainer.add(jdcExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 133, 166, 35));

        txtQuantityInBox.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtQuantityInBox.setNextFocusableComponent(txtProductPrice);
        pnlContainer.add(txtQuantityInBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 295, 166, 35));

        txtProductPrice.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtProductPrice.setNextFocusableComponent(txtNote);
        pnlContainer.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 254, 35));

        txtNote.setColumns(20);
        txtNote.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNote.setRows(5);
        txtNote.setNextFocusableComponent(btnInsert);
        jScrollPane1.setViewportView(txtNote);

        pnlContainer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 376, 690, 176));

        lblProductImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlContainer.add(lblProductImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 52, 217, 262));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Mã HD Nhập");
        pnlContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 24, -1, -1));

        lblImportBillID.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblImportBillID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        lblImportBillID.setEnabled(false);
        lblImportBillID.setPreferredSize(new java.awt.Dimension(64, 30));
        lblImportBillID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblImportBillIDActionPerformed(evt);
            }
        });
        pnlContainer.add(lblImportBillID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, 254, 35));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Đơn vị tính");
        pnlContainer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 186, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Ngày sản xuất");
        pnlContainer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 24, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Số lượng thùng");
        pnlContainer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 186, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Hạn sử dụng");
        pnlContainer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 105, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Số lượng trong thùng");
        pnlContainer.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 267, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Đơn giá SP nhập");
        pnlContainer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 267, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Ghi chú");
        pnlContainer.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 348, -1, -1));

        btnInsert.setBackground(new java.awt.Color(2, 66, 2));
        btnInsert.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-button.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.setPreferredSize(new java.awt.Dimension(135, 35));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        pnlContainer.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 140, -1));

        btnUpdate.setBackground(new java.awt.Color(2, 66, 2));
        btnUpdate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.setPreferredSize(new java.awt.Dimension(135, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlContainer.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 140, -1));

        btnDelete.setBackground(new java.awt.Color(2, 66, 2));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setPreferredSize(new java.awt.Dimension(135, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlContainer.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 140, -1));

        btnNew.setBackground(new java.awt.Color(2, 66, 2));
        btnNew.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rotation.png"))); // NOI18N
        btnNew.setText("Làm mới");
        btnNew.setPreferredSize(new java.awt.Dimension(135, 35));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        pnlContainer.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 140, -1));

        txtUnit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtUnit.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtUnit.setEnabled(false);
        pnlContainer.add(txtUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, 254, 35));

        txtProduct.setHide("Nhập tên Sản Phẩm");
        txtProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductKeyReleased(evt);
            }
        });
        pnlContainer.add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 133, 254, 35));

        getContentPane().add(pnlContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 745, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            insert();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            update();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            delete();
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Hóa Đơn Chi Tiết Nhập !");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtQuantityBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantityBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityBoxMouseClicked

    private void txtQuantityBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantityBoxStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityBoxStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void lblImportBillIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblImportBillIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImportBillIDActionPerformed

    private void cboProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductActionPerformed
        // TODO add your handling code here:
        if (cboProduct.getSelectedIndex() > 0) {
            Product pd = (Product) cboProduct.getSelectedItem();
            cboProduct.setToolTipText(pd.getProductID());
            txtUnit.setText(unDAO.selectByIds(pd.getUnit()).getUnitName());
            txtProduct.setText(pd.getProductName());
            if (pd.getImageProduct() != null) {
                lblProductImg.setToolTipText(pd.getImageProduct());
                lblProductImg.setIcon(XShareHelper.scaledImage(pd.getImageProduct(), lblProductImg));
            }
        }
    }//GEN-LAST:event_cboProductActionPerformed

    private void txtProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductKeyReleased
        // TODO add your handling code here:
        if (!txtProduct.getText().trim().equals("")) {
            pnlListProduct.setVisible(true);
            fillListProduct();
        } else {
            lProduct.removeAll();
            pnlListProduct.setVisible(false);
        }
    }//GEN-LAST:event_txtProductKeyReleased

    private void lProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lProductMouseClicked
        Product pd = pdDAO.selectByName(lProduct.getSelectedValue());
        if (pd != null) {
            cboProduct.getModel().setSelectedItem(pd);
            cboProduct.setToolTipText(pd.getProductID());
            pnlListProduct.setVisible(false);
            txtProduct.setText(pd.getProductName());
            txtUnit.setText(unDAO.selectByIds(pd.getUnit()).getUnitName());
            if (pd.getImageProduct() != null) {
                lblProductImg.setToolTipText(pd.getImageProduct());
                lblProductImg.setIcon(XShareHelper.scaledImage(pd.getImageProduct(), lblProductImg));
            }
        }
    }//GEN-LAST:event_lProductMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcExpiryDate;
    private com.toedter.calendar.JDateChooser jdcManufacturingDate;
    private javax.swing.JList<String> lProduct;
    private javax.swing.JTextField lblImportBillID;
    private javax.swing.JLabel lblProductImg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlListProduct;
    private javax.swing.JScrollPane spFindProduct;
    private javax.swing.JTextArea txtNote;
    private CustomSwing.MyTextField txtProduct;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JSpinner txtQuantityBox;
    private javax.swing.JSpinner txtQuantityInBox;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables

//    ImportBillJPanel ib = new ImportBillJPanel(jf);
    ImportBillDAO ibDAO = new ImportBillDAO();
    ImportBillDetailsDAO ibDDAO = new ImportBillDetailsDAO();
    ProductDAO pdDAO = new ProductDAO();
    UnitDAO unDAO = new UnitDAO();
    boolean clear = true;

    private void init() {
        fillComboBoxProduct();
        if (index == 1) {
            fillToForm1();
        } else if (index == 2) {
            fillToForm2();

        }
        pnlListProduct.setVisible(false);
        lProduct.setBorder(BorderFactory.createEmptyBorder(6, 0, 6, 0));
        spFindProduct.getViewport().setOpaque(false);
        spFindProduct.setViewportBorder(BorderFactory.createEmptyBorder());
        lProduct.setFixedCellHeight(40);
        txtProduct.setBorder(BorderFactory.createEmptyBorder(1, 10, 1, 10));
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxProduct() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboProduct.getModel();
        model.removeAllElements();
        model.addElement("Chọn Sản Phẩm:");
        List<Product> listPD = pdDAO.selectAll();
        for (Product pd : listPD) {
            model.addElement(pd);
        }
        cboProduct.setModel(model);
    }

    @SuppressWarnings("unchecked")
    private void fillListProduct() {
        DefaultListModel model = new DefaultListModel();
        List<Product> listPD = pdDAO.selectByKeyword(txtProduct.getText().trim());
        if (listPD != null) {
            model.removeAllElements();
            for (Product pd : listPD) {
                model.addElement(pd.getProductName());
            }
        } else {
            model.addElement("Không tìm thấy !");
        }
        lProduct.setModel(model);
    }

    void setForm1(ImportBilldetails d) {
        lblImportBillID.setText(importID);

        cboProduct.setSelectedIndex(0);
        txtUnit.getToolTipText();

        jdcManufacturingDate.setDate(XDateHelper.nowDate());
        jdcExpiryDate.setDate(XDateHelper.addDays(XDateHelper.nowDate(), 120));
        txtQuantityBox.setValue(Integer.valueOf(d.getQuantityBox() + ""));
        txtQuantityInBox.setValue(Integer.valueOf(d.getQuantityInBox() + ""));
        txtProductPrice.setText(d.getTotalAmount() + "");
        txtNote.setText(d.getNotes());
        lblProductImg.setIcon(null);
    }

    void setForm2(ImportBilldetails d) {
        lblImportBillID.setText(importID);

        if (index == 2) {
            Unit unitID = unDAO.selectById(pdDAO.selectById(d.getProductID()).getUnit() + "");
            cboProduct.getModel().setSelectedItem(pdDAO.selectById(d.getProductID()));
            cboProduct.setToolTipText(d.getProductID());
            txtUnit.setText(unitID.getUnitName());
            txtUnit.setToolTipText(unitID.getUnitID() + "");
        }

        jdcManufacturingDate.setDate(XDateHelper.toDate(d.getManufacturingDate(), "dd-MM-yyyy"));
        jdcExpiryDate.setDate(XDateHelper.toDate(d.getExpiryDate(), "dd-MM-yyyy"));

        txtQuantityBox.setValue(Integer.valueOf(d.getQuantityBox() + ""));
        txtQuantityInBox.setValue(Integer.valueOf(d.getQuantityInBox() + ""));
        txtProductPrice.setText(d.getTotalAmount() + "");
        txtNote.setText(d.getNotes());
        Product pd = pdDAO.selectById(d.getProductID());
        if (pd.getImageProduct() != null) {
            lblProductImg.setToolTipText(pd.getImageProduct());
            lblProductImg.setIcon(XShareHelper.scaledImage(pd.getImageProduct(), lblProductImg));
        }
    }

    private int setIdDetail(String importID) {
        int id = 0;
        List<ImportBilldetails> listID = ibDDAO.selectByIds(importID);
        if (listID != null) {
            for (ImportBilldetails ed : listID) {
                if (id < ed.getImportBillDetailsID()) {
                    id = ed.getImportBillDetailsID();
                }
            }
        }
        return id + 1;
    }

    void fillToForm1() {
        ImportBilldetails ibd = new ImportBilldetails();
        setForm1(ibd);
        clearForm();
    }

    void fillToForm2() {
        ImportBilldetails ibBD = ibDDAO.selectById(importID, detailsID);
        System.out.println(detailsID);
        setForm2(ibBD);

        btnInsert.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        txtProduct.setEnabled(false);
        cboProduct.setEnabled(false);
    }

    ImportBilldetails getForm() {
        ImportBilldetails ibD = new ImportBilldetails();

        int quantityInBox = Integer.parseInt(txtQuantityInBox.getValue().toString()),
                quantityBox = Integer.parseInt(txtQuantityBox.getValue().toString()),
                totalQuantity = quantityBox * quantityInBox;
        double totalAmount = Double.parseDouble(txtProductPrice.getText());
        if (detailsID == null) {
            ibD.setImportBillDetailsID(setIdDetail(importID));
        } else {
            ibD.setImportBillDetailsID(Integer.parseInt(detailsID));
        }
        ibD.setImportBillID(lblImportBillID.getText());
        System.out.println(setIdDetail(importID));
        ibD.setProductID(cboProduct.getToolTipText() + "");
        ibD.setQuantityInBox(quantityInBox);
        ibD.setQuantityBox(quantityBox);
        ibD.setTotalAmount(totalAmount);
        ibD.setTotalQuantity(totalQuantity);
        ibD.setIntoMoney(Double.parseDouble(totalAmount * totalQuantity + ""));
        ibD.setManufacturingDate(XDateHelper.toString(jdcManufacturingDate.getDate(), "yyyy-MM-dd"));
        ibD.setExpiryDate(XDateHelper.toString(jdcExpiryDate.getDate(), "yyyy-MM-dd"));

        ibD.setNotes(txtNote.getText());
        return ibD;
    }

    private void clearForm() {
        ImportBilldetails ibd = new ImportBilldetails();
        setForm1(ibd);
        cboProduct.setSelectedIndex(0);
        txtUnit.setText("...");
        txtProduct.setText("");
        pnlListProduct.setVisible(false);
        btnInsert.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        txtProduct.setEnabled(true);
        cboProduct.setEnabled(true);
    }

    private void insert() {
        ImportBilldetails ibd = getForm();
        try {
            ibDDAO.insert(ibd);
            if (XDialogHelper.confirm(this, "Thêm thành công, Bạn có muốn tiếp tục không ?")) {
                this.clearForm();
            } else {
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Thêm thất bại");

        }
    }

    private void update() {
        ImportBilldetails ibd = getForm();
        System.out.println("ibd: " + ibd);
        try {
            if (XDialogHelper.confirm(this, "Cập nhật HĐCT Nhập đang chọn ?")) {
                ibDDAO.update(ibd);
                this.clearForm();
                XDialogHelper.alert(this, "Cập nhật thành công !");
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println(this);
            XDialogHelper.alert(this, "Cập nhật thất bại !");
        }
    }

    private void delete() {
        try {
            if (XDialogHelper.confirm(this, "Xóa Hóa Đơn đang chọn ?")) {
                ibDDAO.delete(detailsID);
                this.clearForm();
                XDialogHelper.alert(this, "Xóa thành công !");
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Xóa thất bại");
        }
    }

    boolean isValidate() {
        boolean checkForm = true;
        String[] errorMess = {"Bạn chưa chọn Sản Phẩm\n",
            "Bạn chưa chọn Đơn Vị Tính\n",
            "Số lượng thùng phải là số nguyên lớn hơn 0\n",
            "Số lượng SP trong thùng phải là số nguyên lớn hơn 0\n",
            "NSX phải nhỏ hơn HSD\n",
            "HSD phải lớn hơn NSX\n",
            "Bạn chưa nhập Đơn Giá SP\n",
            "Đơn Giá SP phải là số nguyên\n",
            "Đơn Giá SP phải lớn hơn 0\n"};
        String mess = "";

        if (cboProduct.getSelectedIndex() == 0) {
            mess += errorMess[0];
        }

        try {
            int mount = Integer.parseInt(txtQuantityBox.getValue().toString());
            if (mount <= 0) {
                mess += errorMess[2];
                txtQuantityBox.requestFocus();
            }
        } catch (NumberFormatException e) {
            mess += errorMess[2];
            txtQuantityBox.requestFocus();
        }

        try {
            int mount = Integer.parseInt(txtQuantityInBox.getValue().toString());
            if (mount <= 0) {
                mess += errorMess[3];
                txtQuantityInBox.requestFocus();
            }
        } catch (NumberFormatException e) {
            mess += errorMess[3];
            txtQuantityInBox.requestFocus();
        }

        Date manu = jdcManufacturingDate.getDate();
        Date expi = jdcExpiryDate.getDate();

//        if (manu.compareTo(expi) >= 0) {
//            mess += errorMess[4];
//            jdcManufacturingDate.requestFocus();
//        }

        if (expi.compareTo(manu) < 0) {
            mess += errorMess[5];
            jdcExpiryDate.requestFocus();
        }

        if (txtProductPrice.getText().trim().isEmpty()) {
            mess += errorMess[6];
            txtProductPrice.requestFocus();
        }
        if (Double.parseDouble(txtProductPrice.getText().trim()) == 0) {
            mess += errorMess[8];
            txtProductPrice.requestFocus();
        }
        try {
            Double.valueOf(txtProductPrice.getText().trim());
        } catch (NumberFormatException e) {
            mess += errorMess[7];
            txtProductPrice.requestFocus();
        }

        if (!mess.equals("")) {
            XDialogHelper.alert(this, mess);
            checkForm = false;
        }
        return checkForm;
    }

}
