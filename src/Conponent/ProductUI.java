package Conponent;

import CustomSwing.ScrollBarCustom;
import DAO.BaseDAO;
import DAO.ProductDAO;
import DAO.ProductTypeDAO;
import DAO.SupplierDAO;
import DAO.UnitDAO;
import Entities.Product;
import Entities.ProductType;
import Entities.Supplier;
import Entities.Unit;
import Helper.XDateHelper;
import Helper.XDialogHelper;
import Helper.XShareHelper;
import Model.Colors;
import Utils.Auth;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import jnafilechooser.api.JnaFileChooser;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class ProductUI extends javax.swing.JPanel {

    private JFrame _this;
    ProductDAO pdDAO = new ProductDAO();
    SupplierDAO spDAO = new SupplierDAO();
    ProductTypeDAO tyDAO = new ProductTypeDAO();
    UnitDAO unDAO = new UnitDAO();
    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);

    public ProductUI(JFrame parent) {
        initComponents();
        this._this = parent;
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

        lblTitle = new javax.swing.JLabel();
        tabContainer = new javax.swing.JTabbedPane();
        pnlUpdate = new javax.swing.JPanel();
        pnl = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        lblSupplier1 = new javax.swing.JLabel();
        cboSupplier = new javax.swing.JComboBox<>();
        lblProductID1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        lblProductType1 = new javax.swing.JLabel();
        cboProductType = new javax.swing.JComboBox<>();
        lblDateCreated1 = new javax.swing.JLabel();
        txtDateCreated = new javax.swing.JTextField();
        cboUnit = new javax.swing.JComboBox<>();
        lblUnit1 = new javax.swing.JLabel();
        lblPrice1 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblProductName1 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        lblNote1 = new javax.swing.JLabel();
        spNote = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        pnlButton = new javax.swing.JPanel();
        btnInsertProduct = new javax.swing.JButton();
        btnUpdateProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnFirstProduct = new javax.swing.JButton();
        btnPrevProduct = new javax.swing.JButton();
        btnNextProduct = new javax.swing.JButton();
        btnLastProduct = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        pnlSmallList = new javax.swing.JPanel();
        btnSortProduct = new javax.swing.JComboBox<>();
        txtFindProduct = new CustomSwing.MyTextField();
        spProduct = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÝ SẢN PHẨM");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(267, 45));
        add(lblTitle, java.awt.BorderLayout.PAGE_START);

        tabContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabContainer.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        pnlUpdate.setOpaque(false);
        pnlUpdate.setLayout(new java.awt.BorderLayout());

        pnl.setOpaque(false);
        pnl.setLayout(new java.awt.BorderLayout());

        pnlTop.setOpaque(false);

        lblSupplier1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblSupplier1.setText("Nhà cung cấp:");

        cboSupplier.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSupplierMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboSupplierMousePressed(evt);
            }
        });
        cboSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSupplierActionPerformed(evt);
            }
        });

        lblProductID1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblProductID1.setText("Mã sản phẩm:");

        txtProductID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtProductID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtProductID.setEnabled(false);

        lblProductType1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblProductType1.setText("Loại sản phẩm:");

        cboProductType.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboProductType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboProductTypeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboProductTypeMousePressed(evt);
            }
        });
        cboProductType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductTypeActionPerformed(evt);
            }
        });

        lblDateCreated1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDateCreated1.setText("Ngày tạo:");

        txtDateCreated.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDateCreated.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtDateCreated.setEnabled(false);

        cboUnit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUnitActionPerformed(evt);
            }
        });

        lblUnit1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblUnit1.setText("Đơn vị tính:");

        lblPrice1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPrice1.setText("Đơn giá bán:");

        txtPrice.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        lblProductName1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblProductName1.setText("Tên sản phẩm:");

        txtProductName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProductName1)
                    .addComponent(txtProductName)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProductType1)
                            .addComponent(lblSupplier1)
                            .addComponent(lblUnit1)
                            .addComponent(cboSupplier, 0, 360, Short.MAX_VALUE)
                            .addComponent(cboProductType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductID1)
                            .addComponent(lblPrice1)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDateCreated1)
                            .addComponent(txtDateCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier1)
                    .addComponent(lblProductID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDateCreated1)
                            .addComponent(lblProductType1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTopLayout.createSequentialGroup()
                                .addComponent(txtDateCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrice1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTopLayout.createSequentialGroup()
                                .addComponent(cboProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblUnit1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblProductName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setOpaque(false);

        lblNote1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNote1.setText("Ghi chú:");

        spNote.setVerticalScrollBar(new ScrollBarCustom());

        txtNote.setColumns(20);
        txtNote.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNote.setRows(5);
        spNote.setViewportView(txtNote);

        pnlButton.setOpaque(false);

        btnInsertProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnInsertProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsertProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-button.png"))); // NOI18N
        btnInsertProduct.setText("Thêm");
        btnInsertProduct.setPreferredSize(new java.awt.Dimension(120, 33));
        btnInsertProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertProductActionPerformed(evt);
            }
        });

        btnUpdateProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnUpdateProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btnUpdateProduct.setText("Cập nhật");
        btnUpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateProduct.setPreferredSize(new java.awt.Dimension(145, 33));
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnDeleteProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDeleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/trash.png"))); // NOI18N
        btnDeleteProduct.setText("Xóa");
        btnDeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteProduct.setPreferredSize(new java.awt.Dimension(100, 33));
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnNewProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnNewProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rotation.png"))); // NOI18N
        btnNewProduct.setText("Làm mới");
        btnNewProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });

        btnFirstProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnFirstProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnFirstProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnFirstProduct.setText("|<");
        btnFirstProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstProductActionPerformed(evt);
            }
        });

        btnPrevProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnPrevProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnPrevProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevProduct.setText("<<");
        btnPrevProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevProductActionPerformed(evt);
            }
        });

        btnNextProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnNextProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNextProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnNextProduct.setText(">>");
        btnNextProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextProductActionPerformed(evt);
            }
        });

        btnLastProduct.setBackground(new java.awt.Color(0, 82, 0));
        btnLastProduct.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLastProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnLastProduct.setText(">|");
        btnLastProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLastProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnInsertProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnFirstProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnPrevProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnNextProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnLastProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirstProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNote1)
                    .addComponent(spNote)
                    .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNote1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spNote, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlUpdate.add(pnl, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("Cập nhật", pnlUpdate);

        pnlList.setOpaque(false);
        pnlList.setLayout(new java.awt.BorderLayout());

        pnlSmallList.setOpaque(false);

        btnSortProduct.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSortProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp theo", "Tên SP", "Đơn giá bán" }));
        btnSortProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortProductActionPerformed(evt);
            }
        });

        txtFindProduct.setHide("Nhập tên sản phẩm cần tìm...");
        txtFindProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFindProductMouseClicked(evt);
            }
        });
        txtFindProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindProductKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSmallListLayout = new javax.swing.GroupLayout(pnlSmallList);
        pnlSmallList.setLayout(pnlSmallListLayout);
        pnlSmallListLayout.setHorizontalGroup(
            pnlSmallListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallListLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnSortProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtFindProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        pnlSmallListLayout.setVerticalGroup(
            pnlSmallListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSmallListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSmallListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSmallListLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSortProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(txtFindProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlList.add(pnlSmallList, java.awt.BorderLayout.NORTH);

        spProduct.setVerticalScrollBar(new ScrollBarCustom());

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SP", "NCC", "TÊN SP", "HÌNH ẢNH", "LOẠI SP", "ĐƠN GIÁ BÁN", "ĐƠN VỊ TÍNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        spProduct.setViewportView(tblProduct);

        pnlList.add(spProduct, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("Danh Sách", pnlList);

        add(tabContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void btnSortProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortProductActionPerformed
        // TODO add your handling code here:
        sortTblProduct(btnSortProduct.getSelectedIndex());

    }//GEN-LAST:event_btnSortProductActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
        tblProduct.setRowSelectionAllowed(true);
        if (evt.getClickCount() == 2) {
            row = tblProduct.getSelectedRow();
            edit();
        }
    }//GEN-LAST:event_tblProductMouseClicked

    private void cboSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSupplierMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboSupplierMouseClicked

    private void cboSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSupplierActionPerformed
        // TODO add your handling code here:
        if (cboSupplier.getItemCount() > 0) {
            Supplier sp = (Supplier) cboSupplier.getSelectedItem();
            cboSupplier.setToolTipText(sp.getSupplierID());
            System.out.println(cboSupplier.getToolTipText());
        }
    }//GEN-LAST:event_cboSupplierActionPerformed

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        chooseImg();
    }//GEN-LAST:event_lblImageMouseClicked

    private void btnInsertProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertProductActionPerformed
        if (isValidate()) {
            insertProduct();
        }
    }//GEN-LAST:event_btnInsertProductActionPerformed

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductActionPerformed
        if (isValidate()) {
            updateProduct();
        }
    }//GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        deleteProduct();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnFirstProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstProductActionPerformed
        firstProdcut();
    }//GEN-LAST:event_btnFirstProductActionPerformed

    private void btnPrevProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevProductActionPerformed
        prevProdcut();
    }//GEN-LAST:event_btnPrevProductActionPerformed

    private void btnNextProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextProductActionPerformed
        nextProdcut();
    }//GEN-LAST:event_btnNextProductActionPerformed

    private void btnLastProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastProductActionPerformed
        lastProdcut();
    }//GEN-LAST:event_btnLastProductActionPerformed

    private void cboProductTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductTypeActionPerformed
        // TODO add your handling code here:
        if (cboProductType.getItemCount() > 0) {
            ProductType ty = (ProductType) cboProductType.getSelectedItem();
            cboProductType.setToolTipText(ty.getProductTypeID());
            System.out.println(cboProductType.getToolTipText());
        }
    }//GEN-LAST:event_cboProductTypeActionPerformed

    private void cboUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUnitActionPerformed
        // TODO add your handling code here:
        if (cboUnit.getItemCount() > 0) {
            Unit un = (Unit) cboUnit.getSelectedItem();
            cboUnit.setToolTipText(un.getUnitID() + "");
            System.out.println(cboUnit.getToolTipText());
        }
    }//GEN-LAST:event_cboUnitActionPerformed

    private void txtFindProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindProductKeyReleased
        fillToTableProduct(pdDAO.selectByKeyword(txtFindProduct.getText()));
    }//GEN-LAST:event_txtFindProductKeyReleased

    private void txtFindProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFindProductMouseClicked
        btnSortProduct.setSelectedIndex(0);
    }//GEN-LAST:event_txtFindProductMouseClicked

    private void cboProductTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboProductTypeMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cboProductTypeMouseClicked

    private void cboProductTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboProductTypeMousePressed
        // TODO add your handling code here:
        fillComboBoxProductTypes();
    }//GEN-LAST:event_cboProductTypeMousePressed

    private void cboSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSupplierMousePressed
        // TODO add your handling code here:
        fillComboBoxSupplier();
    }//GEN-LAST:event_cboSupplierMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnFirstProduct;
    private javax.swing.JButton btnInsertProduct;
    private javax.swing.JButton btnLastProduct;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnNextProduct;
    private javax.swing.JButton btnPrevProduct;
    private javax.swing.JComboBox<String> btnSortProduct;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JComboBox<String> cboProductType;
    private javax.swing.JComboBox<String> cboSupplier;
    private javax.swing.JComboBox<String> cboUnit;
    private javax.swing.JLabel lblDateCreated1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNote1;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblProductID1;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblProductType1;
    private javax.swing.JLabel lblSupplier1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnit1;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlSmallList;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JScrollPane spNote;
    private javax.swing.JScrollPane spProduct;
    private javax.swing.JTabbedPane tabContainer;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtDateCreated;
    private CustomSwing.MyTextField txtFindProduct;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables

    int row = -1;
    JnaFileChooser fileChooser = new JnaFileChooser();

    private void init() {
        this.fillToTableProduct(pdDAO.selectAll());

        this.fillComboBoxSupplier();
        this.fillComboBoxProductTypes();
        this.fillComboBoxUnit();
        BaseDAO.setTable(spProduct, tblProduct, false, 0, 4, 6);

        clearForm();
    }

    public class ImageRender extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            String photoName = value.toString();

            ImageIcon imageIcon = new ImageIcon(
                    new ImageIcon("src\\Image\\" + photoName).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
//            JLabel lbl = new JLabel(imageIcon);
            JLabel lblimgCell = (JLabel) super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
            lblimgCell.setLayout(new BorderLayout());
            lblimgCell.setIcon(imageIcon);
            lblimgCell.setHorizontalAlignment(CENTER);

            if (imageIcon.getImage().getWidth(labelFor) > 0) {
                lblimgCell.setText(null);
            } else {
                lblimgCell.setText(photoName);
            }

            if (isSelected) {
                lblimgCell.setBackground(tblProduct.getSelectionBackground());
            } else {
                lblimgCell.setBackground(tblProduct.getBackground());
            }
            return lblimgCell;
        }
    }

    private void fillToTableProduct(List<Product> product) {
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        model.setRowCount(0);
        try {
            List<Product> list = product;
            for (Product pd : list) {
                if (!pd.isStatus()) {
                    Object[] row = {
                        pd.getProductID(),
                        spDAO.selectById(pd.getSupplierID()).getSupplierName(),
                        pd.getProductName(),
                        pd.getImageProduct(),
                        tyDAO.selectById(pd.getProductTypes() + "").getProductTypeName(),
                        pd.getProductPrice(),
                        unDAO.selectById(pd.getUnit() + "").getUnitName()
                    };
                    model.addRow(row);
                }
            }
            tblProduct.getColumnModel().getColumn(3).setCellRenderer(new ImageRender());
        } catch (Exception e) {
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxSupplier() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSupplier.getModel();
        model.removeAllElements();
        List<Supplier> listSP = spDAO.selectAll();
        for (Supplier sp : listSP) {
            model.addElement(sp);

        }
        cboSupplier.setModel(model);
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxProductTypes() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboProductType.getModel();
        model.removeAllElements();
        List<ProductType> listPD = tyDAO.selectAll();
        for (ProductType ty : listPD) {
            if (!ty.isStatus()) {
                model.addElement(ty);
            }
        }
        cboProductType.setModel(model);
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxUnit() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboUnit.getModel();
        model.removeAllElements();
        List<Unit> listUN = unDAO.selectAll();
        for (Unit unit : listUN) {
            model.addElement(unit);
        }
        cboUnit.setModel(model);
    }

    void chooseImg() {
        if (fileChooser.showOpenDialog(_this)) {
            File file = fileChooser.getSelectedFile();
            if (file.getName().endsWith(".jpg") || file.getName().endsWith(".png")) {
                XShareHelper.saveLogo(file);
//                ImageIcon icon = XImage.readImage(file.getName(), lblImage);
//                Image image = icon.getImage();
//                ImageIcon icon2 = new ImageIcon(image.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
                lblImage.setIcon(XShareHelper.scaledImage(file.getName(), lblImage));
                lblImage.setToolTipText(file.getName());
            } else {
                XDialogHelper.alert(this, "Hình ảnh không đúng định dạng ! (Định dạng ảnh là 'jpg' hoặc 'png')");
            }
        } else {
            XDialogHelper.alert(this, "Bạn chưa chọn hình ảnh !");
        }
    }

    @SuppressWarnings("UnusedAssignment")
    void setForm(Product pd) {
        if (pd.getProductID() == null) {
            try {
                txtProductID.setText(BaseDAO.setExportID("SanPham", "SP", 6));
            } catch (SQLException ex) {
                XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
            }
        } else {
            txtProductID.setText(pd.getProductID());
        }
        txtProductName.setText(pd.getProductName());
        txtDateCreated.setText(XDateHelper.toString(pd.getCreateDate(), "yyyy-MM-dd"));
        if (pd.getProductPrice() == null) {
            txtPrice.setText("0");
        } else {
            BigDecimal number = new BigDecimal(pd.getProductPrice() + "");
            long priceInt = number.longValue();
            System.out.println("price: " + priceInt);
            txtPrice.setText(priceInt + "");

        }

        txtNote.setText(pd.getNote());

        cboProductType.setToolTipText(pd.getProductTypes() + "");
        cboSupplier.setToolTipText(pd.getSupplierID());
        cboUnit.setToolTipText(pd.getUnit() + "");

        if (pd.getImageProduct() != null) {
            System.out.println(pd.getImageProduct());
            lblImage.setToolTipText(pd.getImageProduct());
            lblImage.setIcon(XShareHelper.scaledImage(pd.getImageProduct(), lblImage));
        }
    }

    Product getForm() {
        Product pd = new Product();
        pd.setProductID(txtProductID.getText().trim());
        pd.setProductName(txtProductName.getText().trim());
        pd.setCreateDate(XDateHelper.toDate(txtDateCreated.getText(), "yyyy-MM-dd"));
        pd.setProductPrice(Double.valueOf(txtPrice.getText().trim()));
        pd.setNote(txtNote.getText().trim());
        pd.setImageProduct(lblImage.getToolTipText().trim());

        pd.setProductTypes(Integer.parseInt(cboProductType.getToolTipText()));
        pd.setSupplierID(cboSupplier.getToolTipText());
        pd.setUnit(Integer.parseInt(cboUnit.getToolTipText()));

        pd.setCreateBy("NguyenTC");
        return pd;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblProduct.getRowCount() - 1);

        btnInsertProduct.setEnabled(!edit);
        btnUpdateProduct.setEnabled(edit);
        if (Auth.user.getRoleID() == 1) {
            btnDeleteProduct.setEnabled(edit);
        } else {
            btnDeleteProduct.setEnabled(false);
        }

        btnFirstProduct.setEnabled(edit && !first);
        btnPrevProduct.setEnabled(edit && !first);
        btnNextProduct.setEnabled(edit && !last);
        btnLastProduct.setEnabled(edit && !last);
    }

    private void clearForm() {
        Product pd = new Product();
        ProductType ty = (ProductType) cboProductType.getSelectedItem();
        Supplier sp = (Supplier) cboSupplier.getSelectedItem();
        Unit un = (Unit) cboUnit.getSelectedItem();
        tblProduct.setRowHeight(85);
//        pd.setCreateBy(Auther);
        pd.setCreateDate(XDateHelper.nowDate());

        pd.setSupplierID(sp.getSupplierID());
        pd.setProductTypes(Integer.parseInt(ty.getProductTypeID()));
        pd.setUnit(un.getUnitID());

        lblImage.setIcon(null);
        lblImage.setToolTipText(null);
        setForm(pd);

        row = -1;
        updateStatus();
        tblProduct.setRowSelectionAllowed(false);
    }

    private void edit() {
        String pdID = (String) tblProduct.getValueAt(row, 0);

        Product pd = pdDAO.selectById(pdID);
        txtProductID.setEnabled(false);
        tabContainer.setSelectedIndex(0);

        cboProductType.getModel().setSelectedItem(tyDAO.selectByName(tblProduct.getValueAt(row, 4).toString()));

        cboSupplier.getModel().setSelectedItem(spDAO.selectByName(tblProduct.getValueAt(row, 1).toString()));

        cboUnit.getModel().setSelectedItem(unDAO.selectByName(tblProduct.getValueAt(row, 6).toString()));
        this.setForm(pd);

        this.updateStatus();
    }

    private void insertProduct() {
        Product pd = getForm();
        if (pdDAO.selectById(pd.getProductID()) != null) {
            if (pdDAO.selectById(pd.getProductID()).isStatus() == true) {
                if (XDialogHelper.confirm(this, "Bạn có muốn khôi phục không?")) {
                    Product pd2 = getForm();
                    pdDAO.insert2(pd2);
                    this.fillToTableProduct(pdDAO.selectAll());
                    this.clearForm();
                    XDialogHelper.alert(this, "Thêm mới thành công !");
                }
            } else {
                XDialogHelper.alert(this, "Sản Phẩm đã tồn tại !");
            }
        } else {
            try {
                pdDAO.insert(pd);
                this.fillToTableProduct(pdDAO.selectAll());
                tabContainer.setSelectedIndex(1);
                for (int i = 0; i < tblProduct.getRowCount(); i++) {
                    if (txtProductID.getText().equalsIgnoreCase(String.valueOf(tblProduct.getValueAt(i, 0)))) {
                        tblProduct.changeSelection(i, i, false, false);
                        break;
                    }
                }
                this.clearForm();
                tblProduct.setRowSelectionAllowed(true);
                XDialogHelper.alert(this, "Thêm mới thành công !");
            } catch (Exception e) {
                System.out.println(e);
                XDialogHelper.alert(this, "Thêm mới thất bại !");
            }
        }
    }

    private void deleteProduct() {
        String productID = tblProduct.getValueAt(row, 0).toString();
        try {
            if (XDialogHelper.confirm(this, "Xóa Sản Phẩm đang chọn ?")) {
                pdDAO.delete(productID);
                this.fillToTableProduct(pdDAO.selectAll());
                this.clearForm();
                XDialogHelper.alert(this, "Xóa thành công !");
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Xóa thất bại");
        }
    }

    private void updateProduct() {
        Product pd = getForm();
        try {
            if (XDialogHelper.confirm(this, "Cập nhật Sản Phẩm đang chọn ?")) {
                pdDAO.update(pd);
                this.fillToTableProduct(pdDAO.selectAll());
                this.clearForm();
                XDialogHelper.alert(this, "Cập nhật thành công !");
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Cập nhật thất bại !");
        }
    }

    void firstProdcut() {
        this.row = 0;
        this.edit();
        tblProduct.changeSelection(row, 0, false, false);
    }

    void prevProdcut() {
        if (this.row > 0) {
            this.row--;
            this.edit();
            tblProduct.changeSelection(row, 0, false, false);
        }
    }

    void nextProdcut() {
        if (this.row < tblProduct.getRowCount() - 1) {
            this.row++;
            this.edit();
            tblProduct.changeSelection(row, 0, false, false);
        }
    }

    void lastProdcut() {
        this.row = tblProduct.getRowCount() - 1;
        this.edit();
        tblProduct.changeSelection(row, 0, false, false);
    }

    private void sortTblProduct(int index) {
        switch (index) {
            case 1 -> {
                fillToTableProduct(pdDAO.selectSortBy("TenSP", true));
                txtFindProduct.setText("");
            }
            case 2 -> {
                fillToTableProduct(pdDAO.selectSortBy("DonGiaBan", false));
                txtFindProduct.setText("");
            }
            default -> {
                fillToTableProduct(pdDAO.selectAll());
                txtFindProduct.setText("");
            }
        }
    }

    boolean isValidate() {
        boolean checkForm = true;
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        String[] error = {"Bạn chưa nhập Mã SP\n",
            "Mã SP chưa đúng định dạng (VD: SP000)\n",
            "Bạn chưa nhập Tên SP\n",
            "Bạn chưa nhập Đơn Giá Bán\n",
            "Đơn Giá Bán phải là số\n",
            "Bạn chưa chọn Ảnh SP\n",
            "Đơn Giá Bán phải lớn hơn 0\n"};
        String mess = "";

        if (txtProductName.getText().trim().isEmpty()) {
            mess += error[2];
            txtProductName.requestFocus();
        }

        if (txtPrice.getText().trim().isEmpty()) {
            mess += error[3];
            txtProductID.requestFocus();
        } else if (Double.parseDouble(txtPrice.getText().trim()) <= 0) {
            mess += error[6];
            txtProductID.requestFocus();
        }
        try {
            Double.valueOf(txtPrice.getText().trim());
        } catch (NumberFormatException e) {
            mess += error[4];
            txtPrice.requestFocus();
        }

        if (lblImage.getToolTipText() == null) {
            mess += error[5];
        }
        if (!mess.equals("")) {
            XDialogHelper.alert(this, mess);
            checkForm = false;
        }
        return checkForm;
    }

    public void handleRoleProduct(boolean isRole) {
        btnDeleteProduct.setEnabled(isRole);

    }
}
