package Conponent;

import CustomSwing.ScrollBarCustom;
import DAO.BaseDAO;
import DAO.EmployeeDAO;
import DAO.ImportBillDAO;
import DAO.ImportBillDetailsDAO;
import DAO.PaymentStatusDAO;
import DAO.WareHouseDAO;
import Entities.ImportBill;
import Entities.ImportBilldetails;
import Entities.PaymentStatus;
import Helper.XDateHelper;
import Helper.XDialogHelper;
import Model.Colors;
import Utils.Auth;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class ImportBillUI extends javax.swing.JPanel {

    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);
    private JFrame frame;

    public ImportBillUI(JFrame f) {
        initComponents();
        init();
        this.setOpaque(false);
        spImportDetails.getViewport().setOpaque(false);
        spImportDetails.setViewportBorder(BorderFactory.createEmptyBorder());
        this.frame = f;
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        pnlHDNhap = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        tabImportBill = new javax.swing.JTabbedPane();
        pnlUpdate = new javax.swing.JPanel();
        pnlFormInput = new javax.swing.JPanel();
        cboPayStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spNote = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        lblNote = new javax.swing.JLabel();
        txtEmployee = new CustomSwing.MyTextField();
        txtImportID = new CustomSwing.MyTextField();
        txtDateCreated = new CustomSwing.MyTextField();
        txtTotalAmount = new CustomSwing.MyTextField();
        txtTotalPay = new CustomSwing.MyTextField();
        pnlDetailBill = new javax.swing.JPanel();
        pblTitleTable = new javax.swing.JLabel();
        spImportDetails = new javax.swing.JScrollPane();
        tblmportDetails = new javax.swing.JTable();
        pnlButton = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnShowImportDetails = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        pnlFormSearch = new javax.swing.JPanel();
        txtFind = new CustomSwing.MyTextField();
        btnSort = new CustomSwing.MyButton();
        spImportBill = new javax.swing.JScrollPane();
        tblImportBill = new javax.swing.JTable();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        pnlHDNhap.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pnlHDNhap.setOpaque(false);
        pnlHDNhap.setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÝ HÓA ĐƠN NHẬP");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(308, 40));
        pnlHDNhap.add(lblTitle, java.awt.BorderLayout.PAGE_START);

        tabImportBill.setFocusable(false);
        tabImportBill.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        pnlUpdate.setOpaque(false);
        pnlUpdate.setLayout(new java.awt.BorderLayout());

        pnlFormInput.setBackground(new java.awt.Color(147, 196, 125));
        pnlFormInput.setMaximumSize(new java.awt.Dimension(205, 394));
        pnlFormInput.setOpaque(false);

        cboPayStatus.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cboPayStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang thanh toán", "Đã thanh toán" }));
        cboPayStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPayStatusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Mã hóa đơn");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Trạng thái thanh toán");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Số tiền đã thanh toán");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Tổng tiền");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Ngày tạo hóa đơn");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Nhân viên");

        spNote.setOpaque(false);
        spNote.setVerticalScrollBar(new ScrollBarCustom());

        txtNotes.setColumns(20);
        txtNotes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNotes.setRows(5);
        spNote.setViewportView(txtNotes);

        lblNote.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNote.setText("Ghi chú");

        txtEmployee.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtEmployee.setEnabled(false);
        txtEmployee.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtEmployee.setHide("Tên nhân viên");

        txtImportID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtImportID.setEnabled(false);
        txtImportID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtImportID.setHide("...");

        txtDateCreated.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtDateCreated.setEnabled(false);
        txtDateCreated.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDateCreated.setHide("...");

        txtTotalAmount.setText("0");
        txtTotalAmount.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtTotalAmount.setEnabled(false);
        txtTotalAmount.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtTotalAmount.setHide("...");

        txtTotalPay.setText("0");
        txtTotalPay.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtTotalPay.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtTotalPay.setHide("...");
        txtTotalPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalPayFocusLost(evt);
            }
        });
        txtTotalPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalPayKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlFormInputLayout = new javax.swing.GroupLayout(pnlFormInput);
        pnlFormInput.setLayout(pnlFormInputLayout);
        pnlFormInputLayout.setHorizontalGroup(
            pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormInputLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spNote)
                    .addGroup(pnlFormInputLayout.createSequentialGroup()
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(txtImportID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNote))
                        .addGap(48, 48, 48)
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateCreated, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cboPayStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtTotalPay, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        pnlFormInputLayout.setVerticalGroup(
            pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormInputLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormInputLayout.createSequentialGroup()
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateCreated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormInputLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPayStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spNote, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlUpdate.add(pnlFormInput, java.awt.BorderLayout.NORTH);

        pnlDetailBill.setBackground(new java.awt.Color(147, 196, 125));
        pnlDetailBill.setOpaque(false);
        pnlDetailBill.setLayout(new java.awt.BorderLayout());

        pblTitleTable.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        pblTitleTable.setForeground(new java.awt.Color(66, 103, 178));
        pblTitleTable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pblTitleTable.setText("   Bảng Chi Tiết Hóa Đơn Nhập");
        pblTitleTable.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pblTitleTable.setPreferredSize(new java.awt.Dimension(260, 35));
        pnlDetailBill.add(pblTitleTable, java.awt.BorderLayout.PAGE_START);

        spImportDetails.setVerticalScrollBar(new ScrollBarCustom());

        tblmportDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã HD", "Mã SP", "SL/Thùng", "SL Thùng", "Giá", "Tổng SL", "Thành Tiền", "HSD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmportDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmportDetailsMouseClicked(evt);
            }
        });
        spImportDetails.setViewportView(tblmportDetails);
        if (tblmportDetails.getColumnModel().getColumnCount() > 0) {
            tblmportDetails.getColumnModel().getColumn(0).setMinWidth(30);
            tblmportDetails.getColumnModel().getColumn(0).setMaxWidth(40);
            tblmportDetails.getColumnModel().getColumn(1).setMinWidth(100);
            tblmportDetails.getColumnModel().getColumn(1).setMaxWidth(150);
            tblmportDetails.getColumnModel().getColumn(2).setMinWidth(100);
            tblmportDetails.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        pnlDetailBill.add(spImportDetails, java.awt.BorderLayout.CENTER);

        pnlUpdate.add(pnlDetailBill, java.awt.BorderLayout.CENTER);

        pnlButton.setOpaque(false);

        btnInsert.setBackground(new java.awt.Color(0, 82, 0));
        btnInsert.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Thêm");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.setPreferredSize(new java.awt.Dimension(110, 33));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 82, 0));
        btnUpdate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Cập nhật");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setPreferredSize(new java.awt.Dimension(145, 33));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 82, 0));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 33));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 82, 0));
        btnClear.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Làm mới");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnShowImportDetails.setBackground(new java.awt.Color(96, 73, 5));
        btnShowImportDetails.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnShowImportDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnShowImportDetails.setText("Thêm sản phẩm");
        btnShowImportDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowImportDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowImportDetailsActionPerformed(evt);
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

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnShowImportDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrev)
                        .addComponent(btnNext)
                        .addComponent(btnLast))
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowImportDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUpdate.add(pnlButton, java.awt.BorderLayout.SOUTH);

        tabImportBill.addTab("CẬP NHẬT", pnlUpdate);

        pnlList.setOpaque(false);
        pnlList.setLayout(new java.awt.BorderLayout());

        pnlFormSearch.setBackground(new java.awt.Color(147, 196, 125));
        pnlFormSearch.setOpaque(false);

        txtFind.setHide("Nhập mã hóa đơn cần tìm...");
        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });
        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindKeyReleased(evt);
            }
        });

        btnSort.setBackground(new java.awt.Color(76, 47, 136));
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sort (1).png"))); // NOI18N
        btnSort.setText("Sắp xếp theo mã hóa đơn");
        btnSort.setColor(new java.awt.Color(76, 47, 136));
        btnSort.setColorEntered(new java.awt.Color(100, 65, 172));
        btnSort.setColorHover(new java.awt.Color(255, 255, 255));
        btnSort.setColorNomal(new java.awt.Color(255, 255, 255));
        btnSort.setColorPressed(new java.awt.Color(55, 55, 146));
        btnSort.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSort.setRadius(50);
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormSearchLayout = new javax.swing.GroupLayout(pnlFormSearch);
        pnlFormSearch.setLayout(pnlFormSearchLayout);
        pnlFormSearchLayout.setHorizontalGroup(
            pnlFormSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormSearchLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        pnlFormSearchLayout.setVerticalGroup(
            pnlFormSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlList.add(pnlFormSearch, java.awt.BorderLayout.PAGE_START);

        spImportBill.setOpaque(false);
        spImportBill.setVerticalScrollBar(new ScrollBarCustom());

        tblImportBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ HD", "NGƯỜI LẬP", "KHO", "TỔNG TIỀN", "TRẠNG THÁI", "TIỀN ĐÃ THANH TOÁN", "NGÀY LẬP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblImportBill.setOpaque(false);
        tblImportBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblImportBillMouseClicked(evt);
            }
        });
        spImportBill.setViewportView(tblImportBill);
        if (tblImportBill.getColumnModel().getColumnCount() > 0) {
            tblImportBill.getColumnModel().getColumn(0).setMinWidth(150);
            tblImportBill.getColumnModel().getColumn(0).setMaxWidth(200);
            tblImportBill.getColumnModel().getColumn(2).setMinWidth(100);
            tblImportBill.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        pnlList.add(spImportBill, java.awt.BorderLayout.CENTER);

        tabImportBill.addTab("DANH SÁCH", pnlList);

        pnlHDNhap.add(tabImportBill, java.awt.BorderLayout.CENTER);

        add(pnlHDNhap, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        if (isValidate()) {
            insertIB();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isValidate()) {
            updateIB();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (Auth.isManager()) {
            deleteIB();

        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Hóa Đơn Nhập !");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        firstIB();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prevIB();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        nextIB();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        lastIB();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnShowImportDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowImportDetailsActionPerformed
        String importBillID = txtImportID.getText();
        openImportDetailsJDialog(frame, null, importBillID, 1);
    }//GEN-LAST:event_btnShowImportDetailsActionPerformed

    private void cboPayStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPayStatusActionPerformed
        if (cboPayStatus.getItemCount() > 0 && cboPayStatus.getSelectedIndex() > 0) {
            int CboIndex = cboPayStatus.getSelectedIndex();
            PaymentStatus pt = (PaymentStatus) cboPayStatus.getSelectedItem();
            cboPayStatus.setToolTipText(pt.getPaymentStatusID());
            switch (CboIndex) {
                case 1 -> {
                    txtTotalPay.setText(txtTotalAmount.getText());
                    txtTotalPay.setEnabled(true);
                }
                case 2 -> {
                    txtTotalPay.setEnabled(true);

                }
                case 3 -> {
//                    txtTotalPay.setEnabled(false);
                    txtTotalPay.setText("0");
                }
            }
        }
    }//GEN-LAST:event_cboPayStatusActionPerformed

    private void tblImportBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblImportBillMouseClicked
        if (evt.getClickCount() == 2) {
            tblImportBill.setRowSelectionAllowed(true);
            row = tblImportBill.getSelectedRow();
            edit();
            BigDecimal number = new BigDecimal(iBillDAO.selectById(txtImportID.getText()).getTotalPay().toString());
            long priceInt = number.longValue();
            txtTotalPay.setHide(priceInt + "");
        }
    }//GEN-LAST:event_tblImportBillMouseClicked
    boolean index = true;

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        if (!index) {
            index = !index;
        } else {
            index = !index;
        }
        sortTblProduct(index);
        txtFind.setText("");
    }//GEN-LAST:event_btnSortActionPerformed

    private void tblmportDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmportDetailsMouseClicked
        if (evt.getClickCount() == 2) {
            String BillDetailsID = tblmportDetails.getValueAt(tblmportDetails.getSelectedRow(), 0).toString();
            String importBillID = txtImportID.getText();

            openImportDetailsJDialog(frame, BillDetailsID, importBillID, 2);
        }
    }//GEN-LAST:event_tblmportDetailsMouseClicked

    private void txtFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyReleased
        // TODO add your handling code here:
        this.fillTableImportBill(iBillDAO.selectByKey(txtFind.getText()));
    }//GEN-LAST:event_txtFindKeyReleased

    private void txtTotalPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPayKeyReleased
        try {
            if (!txtTotalPay.getText().isEmpty()) {
                double pay = Double.parseDouble(txtTotalPay.getText());
                double amount = Double.parseDouble(txtTotalAmount.getText());
                Double pay1 = iBillDAO.selectById(txtImportID.getText()).getTotalPay();
                BigDecimal number = new BigDecimal(pay1);
                long priceInt = number.longValue();
                if (pay == amount) {
                    cboPayStatus.setSelectedIndex(1);
                } else if (pay < amount) {
                    cboPayStatus.setSelectedIndex(2);
                } else if (pay == 0) {
                    cboPayStatus.setSelectedIndex(3);
                } else if (pay > amount) {
                    XDialogHelper.alert(this, 0, "Số tiền thanh toán không được lớn hơn Tổng giá nhập !");
                    System.out.println(priceInt);
                    cboPayStatus.setSelectedIndex(2);
                    txtTotalPay.setText(priceInt + "");

                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtTotalPayKeyReleased

    private void txtTotalPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalPayFocusLost
        if (txtTotalPay.getText().equalsIgnoreCase("0")) {
            cboPayStatus.setSelectedIndex(3);
        }
    }//GEN-LAST:event_txtTotalPayFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnShowImportDetails;
    private CustomSwing.MyButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboPayStatus;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel pblTitleTable;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlDetailBill;
    private javax.swing.JPanel pnlFormInput;
    private javax.swing.JPanel pnlFormSearch;
    private javax.swing.JPanel pnlHDNhap;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JScrollPane spImportBill;
    private javax.swing.JScrollPane spImportDetails;
    private javax.swing.JScrollPane spNote;
    private javax.swing.JTabbedPane tabImportBill;
    private javax.swing.JTable tblImportBill;
    private javax.swing.JTable tblmportDetails;
    private CustomSwing.MyTextField txtDateCreated;
    private CustomSwing.MyTextField txtEmployee;
    private CustomSwing.MyTextField txtFind;
    private CustomSwing.MyTextField txtImportID;
    private javax.swing.JTextArea txtNotes;
    private CustomSwing.MyTextField txtTotalAmount;
    private CustomSwing.MyTextField txtTotalPay;
    // End of variables declaration//GEN-END:variables

    int row = -1;

    ImportBillDAO iBillDAO = new ImportBillDAO();
    WareHouseDAO whDAO = new WareHouseDAO();
    PaymentStatusDAO ptDAO = new PaymentStatusDAO();
    EmployeeDAO elDAO = new EmployeeDAO();
    ImportBillDetailsDAO ibDeDAO = new ImportBillDetailsDAO();

    private void init() {
        fillTableImportBill(iBillDAO.selectAll());

        fillComboBoxPaymentStatus();
        clearForm();

        cboPayStatus.setSelectedIndex(3);
        txtDateCreated.setEnabled(false);
        cboPayStatus.setEnabled(false);
        txtTotalPay.setEnabled(false);
        txtTotalAmount.setEnabled(false);
        BaseDAO.setTable(spImportBill, tblImportBill, false, 0, 1, 2, 4, 6);
        BaseDAO.setTable(spImportDetails, tblmportDetails, false, 0, 1, 2, 3, 4, 6, 8);

    }

    void action(JDialog jd) {
        jd.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Xử lý khi JDialog bị đóng
                fillTableImportDetails(ibDeDAO.selectByImportBill(txtImportID.getText()));
                if (tblmportDetails.getRowCount() == 0) {
                    ibDeDAO.updateAmountImport0(txtImportID.getText());
                    txtTotalAmount.setText("0");
                } else {
                    ibDeDAO.updateAmountImport(txtImportID.getText());

                }
                double pay = Double.parseDouble(txtTotalPay.getText());
                double amount = Double.parseDouble(txtTotalAmount.getText());

                fillTableImportBill(iBillDAO.selectAll());
                edit();
                if (pay < amount) {
                    cboPayStatus.setSelectedIndex(2);
                }
            }
        });
    }

    public void openImportDetailsJDialog(JFrame frame, String detailsID, String importID, int index) {
        ImportBillDetailUI ibDetailsJDialog = new ImportBillDetailUI(frame, true, detailsID, importID, index);
//        ibDetailsJDialog.setID(ibDe);
        action(ibDetailsJDialog);
        ibDetailsJDialog.setVisible(true);
    }

    private void fillTableImportBill(List<ImportBill> ib) {
        DefaultTableModel model = (DefaultTableModel) tblImportBill.getModel();
        model.setRowCount(0);
        try {
            List<ImportBill> list = ib;
            for (ImportBill i : list) {
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                Object[] row = {
                    i.getImportBillID(),
                    elDAO.findByID(i.getEmployeeID()).getFullName(),
                    i.getWareHouseID(),
                    i.getTotalAmount(),
                    i.getPayMentStatusID(),
                    i.getTotalPay(),
                    XDateHelper.toString(i.getCreateDate(), "dd-MM-yyy")
                };
                model.addRow(row);
            }
            tblImportBill.setModel(model);
        } catch (SQLException e) {
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void fillTableImportDetails(List<ImportBilldetails> ibD) {
        DefaultTableModel model = (DefaultTableModel) tblmportDetails.getModel();
        model.setRowCount(0);
        try {
            List<ImportBilldetails> list = ibD;
            for (ImportBilldetails i : list) {
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                Object[] row = {
                    i.getImportBillDetailsID(),
                    i.getImportBillID(),
                    i.getProductID(),
                    i.getQuantityInBox(),
                    i.getQuantityBox(),
                    i.getTotalAmount(),
                    i.getTotalQuantity(),
                    i.getIntoMoney(),
                    i.getExpiryDate()
                };
                model.addRow(row);
            }
            tblmportDetails.setModel(model);
        } catch (Exception e) {
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    @SuppressWarnings("unchecked")
    private void fillComboBoxPaymentStatus() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPayStatus.getModel();
        model.removeAllElements();
        model.addElement("--Chọn trạng thái--");
        List<PaymentStatus> listpt = ptDAO.selectAll();
        for (PaymentStatus pt : listpt) {
            model.addElement(pt);
        }
        cboPayStatus.setModel(model);
    }

    void setForm(ImportBill ib) {
        txtDateCreated.setText(XDateHelper.toString(ib.getCreateDate(), "dd-MM-yyyy"));
        if (ib.getImportBillID() != null) {
            txtImportID.setText(ib.getImportBillID());
        } else {
            try {
                txtImportID.setText(BaseDAO.setExportID("DonNhapHang", "HDN", 8));
            } catch (SQLException ex) {
                XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
            }
        }
        if (ib.getTotalAmount() == null) {
            txtTotalAmount.setText("0");
        } else {
            BigDecimal number = new BigDecimal(ib.getTotalAmount() + "");
            long priceInt = number.longValue();
            txtTotalAmount.setText(priceInt + "");
        }
        if (ib.getImportBillID() == null) {
            txtEmployee.setText(Auth.user.getFullName());
            txtEmployee.setToolTipText(Auth.user.getEmployeeID());
        } else {
            try {
                txtEmployee.setText(elDAO.findByID(ib.getEmployeeID()).getFullName());
                txtEmployee.setToolTipText(ib.getEmployeeID());
            } catch (SQLException ex) {
                XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
            }
        }
        if (ib.getTotalPay() == null) {
            txtTotalPay.setText("0");
        } else {
            BigDecimal number = new BigDecimal(ib.getTotalPay() + "");
            long priceInt = number.longValue();
            txtTotalPay.setText(priceInt + "");
        }
        if (row >= 0) {
            cboPayStatus.getModel().setSelectedItem(ptDAO.selectByName(ib.getPayMentStatusID()));
        }
        txtNotes.setText(ib.getNote());
    }

    ImportBill getForm() {
        ImportBill ib = new ImportBill();
        ib.setImportBillID(txtImportID.getText());
        ib.setWareHouseID("1");
        ib.setPayMentStatusID(cboPayStatus.getToolTipText());
        ib.setEmployeeID(txtEmployee.getToolTipText());
        ib.setTotalAmount(Double.valueOf(txtTotalAmount.getText()));
        ib.setTotalPay(Double.valueOf(txtTotalPay.getText()));
        ib.setNote(txtNotes.getText());
        ib.setCreateDate(XDateHelper.toDate(txtDateCreated.getText(), "yyyy-MM-dd"));
        ib.setCreatedBy(Auth.user.getEmployeeID());
        return ib;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblImportBill.getRowCount() - 1);

        btnInsert.setEnabled(!edit);
        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);
        if (Auth.user.getRoleID() == 1) {
            btnDelete.setEnabled(edit);
        } else {
            btnDelete.setEnabled(false);
        }

        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);

        btnShowImportDetails.setEnabled(edit);
    }

    private void clearForm() {
        ImportBill ib = new ImportBill();
        row = -1;
        setForm(ib);
        updateStatus();
        tblImportBill.setRowSelectionAllowed(false);

        cboPayStatus.setSelectedIndex(3);

        //clear bảng chi tiết
        DefaultTableModel model = (DefaultTableModel) tblmportDetails.getModel();
        model.setRowCount(0);
        CheckCountBill(model.getRowCount());
    }

    private void edit() {
        String ibID = (String) tblImportBill.getValueAt(row, 0);
        ImportBill ib = iBillDAO.selectById(ibID);

        //fill vào bảng chi tiết theo mã hóa đơn
        fillTableImportDetails(ibDeDAO.selectByImportBill(ibID));

        CheckCountBill(tblmportDetails.getRowCount());

        tabImportBill.setSelectedIndex(0);
        txtImportID.setEnabled(false);

        this.setForm(ib);

        PaymentStatus pt = (PaymentStatus) cboPayStatus.getSelectedItem();
        cboPayStatus.setToolTipText(pt.getPaymentStatusID());

        this.updateStatus();
    }

    //set các button
    private void CheckCountBill(int number) {
        if (number > 0) {
            txtTotalPay.setEnabled(true);
            cboPayStatus.setEnabled(true);
        } else {
            txtTotalPay.setEnabled(false);
            cboPayStatus.setEnabled(false);
            cboPayStatus.setSelectedIndex(3);
        }
    }

    private void insertIB() {
        ImportBill ib = getForm();
        try {
            iBillDAO.insert(ib);
            this.fillTableImportBill(iBillDAO.selectAll());
            tblImportBill.setRowSelectionAllowed(true);
            for (int i = 0; i < tblImportBill.getRowCount(); i++) {
                if (String.valueOf(tblImportBill.getValueAt(i, 0)).equalsIgnoreCase(txtImportID.getText())) {
                    row = i;
                    tblImportBill.changeSelection(i, i, false, false);
                    break;
                }
            }
            edit();
            XDialogHelper.alert(this, "Thêm mới thành công !");
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Thêm mới thất bại !");
        }
    }

    private void deleteIB() {
        String ibID = tblImportBill.getValueAt(row, 0).toString();
        try {
            if (XDialogHelper.confirm(this, "Xóa Hóa Đơn đang chọn ?")) {
                iBillDAO.delete(ibID);
                ibDeDAO.deleteByImportID(ibID);
                this.fillTableImportBill(iBillDAO.selectAll());
                this.clearForm();
                XDialogHelper.alert(this, "Xóa thành công !");
            }
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Xóa thất bại");
        }
    }

    private void updateIB() {
        ImportBill ib = getForm();
        System.out.println(ib.getEmployeeID());
        System.out.println(ib.getPayMentStatusID());
        System.out.println(ib.getWareHouseID());

        try {
            if (XDialogHelper.confirm(this, "Cập nhật Hóa Đơn Nhập đang chọn ?")) {
                iBillDAO.update(ib);
                this.fillTableImportBill(iBillDAO.selectAll());
                this.clearForm();
                XDialogHelper.alert(this, "Cập nhật thành công !");
            }
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Cập nhật thất bại !");
        }
    }

    void firstIB() {
        this.row = 0;
        this.edit();
        tblImportBill.changeSelection(row, 0, false, false);
    }

    void prevIB() {
        if (this.row > 0) {
            this.row--;
            this.edit();
            tblImportBill.changeSelection(row, 0, false, false);
        }
    }

    void nextIB() {
        if (this.row < tblImportBill.getRowCount() - 1) {
            this.row++;
            this.edit();
            tblImportBill.changeSelection(row, 0, false, false);
        }
    }

    void lastIB() {
        this.row = tblImportBill.getRowCount() - 1;
        this.edit();
        tblImportBill.changeSelection(row, 0, false, false);
    }

    private void sortTblProduct(boolean index) {
        fillTableImportBill(iBillDAO.selectSortBy(index));
    }

    private boolean isValidate() {
        if (cboPayStatus.getSelectedIndex() == 0) {
            XDialogHelper.alert(this, 0, "Bạn chưa chọn Trạng thái thanh toán !");
            return false;
        }
        if (txtTotalPay.getText().trim().isEmpty()) {
            XDialogHelper.alert(this, 0, "Bạn chưa nhập Số tiền thanh toán !");
            txtTotalPay.requestFocus();
            return false;
        }
        try {
            Double.valueOf(txtTotalPay.getText());
        } catch (NumberFormatException e) {
            XDialogHelper.alert(this, 0, "Số tiền đã thanh toán phải là số !");
            txtTotalPay.requestFocus();
            return false;
        }
        return true;
    }

    public void handleRoleImportBill(boolean isRole) {
        btnDelete.setEnabled(isRole);

    }
}
