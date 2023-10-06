package Conponent;

import CustomSwing.ScrollBarCustom;
import DAO.ExportBillDetailsDAO;
import DAO.ProductDAO;
import DAO.StatisticalDAO;
import DAO.UnitDAO;
import Entities.ExportDetailBill;
import Entities.Product;
import Helper.XDialogHelper;
import Helper.XShareHelper;
import Utils.Auth;
import java.awt.Image;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class ExportBillDetailUI extends javax.swing.JDialog {

    private String detailsID;
    private String exportID;
    private boolean isBtn;
    private ExportBillDetailsDAO ebDDAO = new ExportBillDetailsDAO();
    private ProductDAO pdDAO = new ProductDAO();
    private UnitDAO unDAO = new UnitDAO();
    private StatisticalDAO sDAO = new StatisticalDAO();
    private ExportBillDetailsDAO eBillDetailDAO = new ExportBillDetailsDAO();

    ;

    public ExportBillDetailUI(JFrame parent, boolean modal, String detailsID, String exportID, boolean isBtn) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.detailsID = detailsID;
        this.exportID = exportID;
        this.isBtn = isBtn;
        init(exportID, detailsID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        txtProduct = new CustomSwing.MyTextField();
        pnlListProduct = new javax.swing.JPanel();
        spFindProduct = new javax.swing.JScrollPane();
        lProduct = new javax.swing.JList<>();
        spNote = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        lblProductImg = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        lblNote = new javax.swing.JLabel();
        txtProductPrice = new CustomSwing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtUnit = new CustomSwing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        cboProduct = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM CHI TIẾT HÓA ĐƠN XUẤT");
        setBackground(new java.awt.Color(0, 204, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(187, 200, 194));
        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("THÊM CHI TIẾT HÓA ĐƠN XUẤT");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setOpaque(true);
        lblTitle.setPreferredSize(new java.awt.Dimension(406, 45));
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pnlContainer.setBackground(new java.awt.Color(187, 200, 194));
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProduct.setHide("Nhập tên Sản Phẩm");
        txtProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductKeyReleased(evt);
            }
        });
        pnlContainer.add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 323, 40));

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
                .addComponent(spFindProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlListProductLayout.setVerticalGroup(
            pnlListProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spFindProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        pnlContainer.add(pnlListProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, 323, 90));

        spNote.setVerticalScrollBar(new ScrollBarCustom());

        txtNote.setColumns(20);
        txtNote.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNote.setRows(5);
        spNote.setViewportView(txtNote);

        pnlContainer.add(spNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 558, 130));

        lblProductImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlContainer.add(lblProductImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 36, 217, 262));

        pnlButton.setOpaque(false);

        btnInsert.setBackground(new java.awt.Color(2, 66, 2));
        btnInsert.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-button.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.setIconTextGap(8);
        btnInsert.setPreferredSize(new java.awt.Dimension(150, 33));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(2, 66, 2));
        btnUpdate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setIconTextGap(8);
        btnUpdate.setPreferredSize(new java.awt.Dimension(165, 33));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(2, 66, 2));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setIconTextGap(8);
        btnDelete.setPreferredSize(new java.awt.Dimension(150, 33));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(2, 66, 2));
        btnNew.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rotation.png"))); // NOI18N
        btnNew.setText("Làm mới");
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setIconTextGap(8);
        btnNew.setPreferredSize(new java.awt.Dimension(150, 39));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlContainer.add(pnlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 576, 558, -1));

        lblNote.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNote.setText("Ghi chú");
        pnlContainer.add(lblNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtProductPrice.setHide("Giá niêm yết");
        txtProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductPriceActionPerformed(evt);
            }
        });
        txtProductPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductPriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductPriceKeyReleased(evt);
            }
        });
        pnlContainer.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 323, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Giá");
        pnlContainer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        txtQuantity.setBorder(null);
        txtQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuantityStateChanged(evt);
            }
        });
        txtQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuantityMouseClicked(evt);
            }
        });
        pnlContainer.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 323, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Số lượng");
        pnlContainer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtUnit.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtUnit.setHide("Đơn vị");
        pnlContainer.add(txtUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 323, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Đơn vị tính");
        pnlContainer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cboProduct.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboProduct.setBorder(null);
        cboProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductActionPerformed(evt);
            }
        });
        pnlContainer.add(cboProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, 323, 40));

        getContentPane().add(pnlContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 620, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            insert();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isValidate()) {
            update();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (Auth.isManager()) {
            delete();
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Hóa Đơn Chi Tiết Xuất !");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityMouseClicked

    private void txtQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantityStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityStateChanged

    private void cboProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductActionPerformed
        if (cboProduct.getSelectedIndex() > 0) {
            Product pd = (Product) cboProduct.getSelectedItem();
            cboProduct.setToolTipText(pd.getProductID());
            txtProduct.setText(pd.getProductName());
            if (pd.getImageProduct() != null) {
                lblProductImg.setToolTipText(pd.getImageProduct());
                handleCboProduct();
            }
        }
    }//GEN-LAST:event_cboProductActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosed

    private void txtProductPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductPriceKeyReleased
//        int amount = (int) txtQuantity.getValue();
//        if(txtProductPrice.isFocusCycleRoot()){
//        try {
//            txtTotalAmount.setText(String.valueOf(amount * Double.parseDouble(txtProductPrice.getText())));
//        } catch (NumberFormatException e) {
//            XDialogHelper.alert(this, "Bạn phải nhập số !");
//        }}
    }//GEN-LAST:event_txtProductPriceKeyReleased

    private void txtProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductPriceActionPerformed

    }//GEN-LAST:event_txtProductPriceActionPerformed

    private void txtProductPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductPriceKeyPressed

    }//GEN-LAST:event_txtProductPriceKeyPressed

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
            cboProduct.setToolTipText(pd.getProductID());
            cboProduct.getModel().setSelectedItem(pd);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> lProduct;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblProductImg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlListProduct;
    private javax.swing.JScrollPane spFindProduct;
    private javax.swing.JScrollPane spNote;
    private javax.swing.JTextArea txtNote;
    private CustomSwing.MyTextField txtProduct;
    private CustomSwing.MyTextField txtProductPrice;
    private javax.swing.JSpinner txtQuantity;
    private CustomSwing.MyTextField txtUnit;
    // End of variables declaration//GEN-END:variables

    private void init(String... id) {
        fillComboBoxProduct();
        fillToFormByID(id);
        setAttribute();
        setStatusBtn();
        pnlListProduct.setVisible(false);
        lProduct.setBorder(BorderFactory.createEmptyBorder(6, 0, 6, 0));
        spFindProduct.getViewport().setOpaque(false);
        spFindProduct.setViewportBorder(BorderFactory.createEmptyBorder());
        lProduct.setFixedCellHeight(40);
    }

    private void setAttribute() {
        txtUnit.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        if (cboProduct.getSelectedIndex() == 0) {
            txtProductPrice.setEnabled(false);
            txtQuantity.setEnabled(false);
        }
        txtQuantity.setBorder(BorderFactory.createEmptyBorder());
        txtUnit.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 10));
        Image IconApp = new ImageIcon(this.getClass().getResource("/Image/invoice.png")).getImage();
        if (IconApp != null) {
            this.setIconImage(IconApp);
        }
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

    @SuppressWarnings("null")
    public void fillToFormByID(String... id) {
        ExportDetailBill eb = eBillDetailDAO.selectED(id[0], id[1]);
        if (eb != null) {
            Product p = pdDAO.selectById(eb.getProductID());
            cboProduct.getModel().setSelectedItem(p);
            txtUnit.setText(unDAO.selectByIds(p.getUnit()).getUnitName());
            txtQuantity.setValue(eb.getAmount());
            txtProductPrice.setText(String.valueOf(eb.getPrice()));
            lblProductImg.setIcon(XShareHelper.scaledImage(p.getImageProduct(), lblProductImg));
            txtNote.setText(eb.getNote());
            txtProduct.setEnabled(false);
        } else {
            cboProduct.setSelectedIndex(0);
            txtQuantity.setValue(0);
            lblProductImg.setIcon(null);
            txtNote.setText("");
            txtProductPrice.setText("");
            txtProductPrice.setHide("0.0");
        }
    }

    public void handleCboProduct() {
        List<Object[]> list = sDAO.getTotalProductDESC();
        boolean checkAmout = false;
        if (cboProduct.getSelectedIndex() > 0) {
            for (Object[] objects : list) {
                if (String.valueOf(cboProduct.getToolTipText()).equalsIgnoreCase(String.valueOf(objects[0]))) {
                    Product p = (Product) cboProduct.getSelectedItem();
                    txtUnit.setText(unDAO.selectByIds(p.getUnit()).getUnitName());
                    txtProductPrice.setHide("Niêm yết: " + p.getProductPrice());
                    lblProductImg.setIcon(XShareHelper.scaledImage(p.getImageProduct(), lblProductImg));
                    checkAmout = true;

                    txtProductPrice.setEnabled(true);
                    txtQuantity.setEnabled(true);
                    break;
                }
            }
            if (!checkAmout) {
                cboProduct.setSelectedIndex(0);
                clearForm();
                if (cboProduct.isPopupVisible()) {
                    cboProduct.setPopupVisible(false);
                }
                XDialogHelper.alert(this, 0, "Sản phẩm tạm thời hết hàn !");
            }
        }
    }

    private int setIdDetail(String exportID) {
        int id = 0;
        List<ExportDetailBill> listED = eBillDetailDAO.selectByIds(exportID);
        if (listED != null) {
            for (ExportDetailBill ed : listED) {
                if (id < ed.getDetailID()) {
                    id = ed.getDetailID();
                }
            }
        }
        return id + 1;
    }

    public ExportDetailBill getForm() {
        ExportDetailBill ebD = new ExportDetailBill();
        int totalAmount = (int) txtQuantity.getValue();
        double price = Double.parseDouble(txtProductPrice.getText());
        if (detailsID != null) {
            ebD.setDetailID(Integer.parseInt(detailsID));
        } else {
            ebD.setDetailID(setIdDetail(exportID));
        }
        ebD.setExportID(exportID);
        ebD.setProductID(cboProduct.getToolTipText() + "");
        ebD.setPrice(price);
        ebD.setAmount((int) txtQuantity.getValue());
        ebD.setTotalAmount(Double.parseDouble(totalAmount * price + ""));
        ebD.setNote(txtNote.getText());
        return ebD;
    }

    private void clearForm() {
        cboProduct.setSelectedIndex(0);
        txtQuantity.setValue(0);
        txtUnit.setText("");
        txtProductPrice.setHide("0.0");
        txtProductPrice.setText("");
        txtNote.setText("");
        txtProduct.setText("");
        cboProduct.setEnabled(true);
        lblProductImg.setIcon(null);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnInsert.setEnabled(true);
        txtProductPrice.setEnabled(false);
        txtQuantity.setEnabled(false);
        pnlListProduct.setVisible(false);
        txtProduct.setEnabled(true);
    }

    private void setStatusBtn() {
        if (isBtn) {
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnInsert.setEnabled(false);
            cboProduct.setEnabled(false);
        } else {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnInsert.setEnabled(true);
            cboProduct.setEnabled(true);
        }
    }

    private void insert() {
        ExportDetailBill ibd = getForm();
        List<Object[]> list = sDAO.getTotalProductDESC();
        boolean checkAmount = true;
        for (Object[] objects : list) {
            if (String.valueOf(ibd.getProductID()).equals(String.valueOf(objects[0]))) {
                if (ibd.getAmount() > Integer.parseInt(String.valueOf(objects[2]))) {
                    XDialogHelper.alert(this, 2, "Số lượng trong kho chỉ còn:" + objects[2]);
                    checkAmount = false;
                }
                break;
            }
        }
        try {
            if (checkAmount) {
                ebDDAO.insert(ibd);
                if (XDialogHelper.confirm(this, "Thêm thành công, Bạn có muốn tiếp tục không ?")) {
                    detailsID = String.valueOf(ibd.getDetailID() + 1);
                    this.clearForm();
                } else {
                    this.dispose();
                }
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Thêm thất bại");
        }
    }

    private void update() {
        ExportDetailBill ibd = getForm();
        try {
            if (XDialogHelper.confirm(this, "Cập nhật HĐCT Nhập đang chọn ?")) {
                ebDDAO.update(ibd);
                this.clearForm();
                XDialogHelper.alert(this, "Cập nhật thành công !");
                this.dispose();
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Cập nhật thất bại !");
        }
    }

    private void delete() {
        try {
            if (XDialogHelper.confirm(this, "Xóa Hóa Đơn đang chọn ?")) {
                ebDDAO.deletes(exportID, detailsID);
                this.clearForm();
                XDialogHelper.alert(this, "Xóa thành công !");
                this.dispose();
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Xóa thất bại");
        }
    }

    boolean isValidate() {
        if (cboProduct.getSelectedIndex() == 0) {
            XDialogHelper.alert(this, 0, "Bạn chưa chọn Sản Phẩm !");
            cboProduct.requestFocus();
            return false;
        }
        try {
            int amount = Integer.parseInt(txtQuantity.getValue().toString());
            if (amount <= 0) {
                XDialogHelper.alert(this, 0, "Số lượng phải là số nguyên lớn hơn 0 !");
                txtQuantity.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            XDialogHelper.alert(this, 0, "Số lượng phải là số nguyên lớn hơn 0 !");
            txtQuantity.requestFocus();
            return false;
        }
        if (txtProductPrice.getText().trim().isEmpty()) {
            XDialogHelper.alert(this, 0, "Giá không được để trống !");
            txtProductPrice.requestFocus();
            return false;
        }
        try {
            double price = Double.parseDouble(txtProductPrice.getText().trim());
            if (price == 0) {
                XDialogHelper.alert(this, 0, "Đơn Giá SP phải là số nguyên lớn hơn 0 !");
                txtProductPrice.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            XDialogHelper.alert(this, 0, "Đơn Giá SP phải là số nguyên lớn hơn 0 !");
            txtProductPrice.requestFocus();
            return false;
        }
        return true;
    }

}
