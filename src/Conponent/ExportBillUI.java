package Conponent;

import CustomSwing.MyButton;
import CustomSwing.ScrollBarCustom;
import DAO.BaseDAO;
import DAO.EmployeeDAO;
import DAO.ExportBillDAO;
import DAO.ExportBillDetailsDAO;
import Entities.ExportBill;
import Entities.ExportDetailBill;
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
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class ExportBillUI extends javax.swing.JPanel {

    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);
    private JFrame frame;

    int row = -1;

    ExportBillDAO eBillDAO = new ExportBillDAO();
    EmployeeDAO eDAO = new EmployeeDAO();
    private ExportBillDetailsDAO eBillDetailDAO = new ExportBillDetailsDAO();
    private boolean checkShortNoExport = true;
    private boolean checkShortExported = true;
    private boolean checkShortAllExport = true;

    public ExportBillUI(JFrame f) {
        initComponents();
        init();
        setLocal();
        this.frame = f;
    }

    private void setLocal() {
        this.setOpaque(false);
        spExportDetails.getViewport().setOpaque(false);
        spExportDetails.setViewportBorder(BorderFactory.createEmptyBorder());
    }

    public MyButton getBtnExportBill() {
        return btnExportBill;
    }

    public void setBtnExportBill(MyButton btnExportBill) {
        this.btnExportBill = btnExportBill;
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
        btnTypeStatus = new javax.swing.ButtonGroup();
        pnlHDNhap = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        tabExportBill = new javax.swing.JTabbedPane();
        pnlUpdate = new javax.swing.JPanel();
        pnlFormInput = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spNote = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        lblNote = new javax.swing.JLabel();
        txtFullName = new CustomSwing.MyTextField();
        txtExportID = new CustomSwing.MyTextField();
        txtTotalAmount = new CustomSwing.MyTextField();
        txtCreatedDate = new CustomSwing.MyTextField();
        btnExportBill = new CustomSwing.MyButton();
        txtStatus = new CustomSwing.MyTextField();
        pnlDetailBill = new javax.swing.JPanel();
        pnlTitleTable = new javax.swing.JPanel();
        lblTitleTable = new javax.swing.JLabel();
        spExportDetails = new javax.swing.JScrollPane();
        tbExportDetails = new javax.swing.JTable();
        pnlButton = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnShowDetails = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        pnlFormSearch = new javax.swing.JPanel();
        btnSort = new CustomSwing.MyButton();
        txtSearch1 = new CustomSwing.MyTextField();
        rdoExported = new javax.swing.JRadioButton();
        rdoNoExport = new javax.swing.JRadioButton();
        rdoAll = new javax.swing.JRadioButton();
        spExportBill = new javax.swing.JScrollPane();
        tblExportBill = new javax.swing.JTable();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(204, 204, 204));
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
        lblTitle.setText("QUẢN LÝ HÓA ĐƠN XUẤT");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(308, 40));
        pnlHDNhap.add(lblTitle, java.awt.BorderLayout.PAGE_START);

        tabExportBill.setFocusable(false);
        tabExportBill.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        pnlUpdate.setOpaque(false);
        pnlUpdate.setLayout(new java.awt.BorderLayout());

        pnlFormInput.setBackground(new java.awt.Color(147, 196, 125));
        pnlFormInput.setMaximumSize(new java.awt.Dimension(205, 394));
        pnlFormInput.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Mã hóa đơn");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Trạng thái:");

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

        txtFullName.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtFullName.setEnabled(false);
        txtFullName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtFullName.setHide("Tên nhân viên");

        txtExportID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtExportID.setEnabled(false);
        txtExportID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtExportID.setHide("...");

        txtTotalAmount.setText("0");
        txtTotalAmount.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtTotalAmount.setEnabled(false);
        txtTotalAmount.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtTotalAmount.setHide("0");

        txtCreatedDate.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtCreatedDate.setEnabled(false);
        txtCreatedDate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtCreatedDate.setHide("...");

        btnExportBill.setBackground(new java.awt.Color(0, 102, 0));
        btnExportBill.setForeground(new java.awt.Color(255, 255, 255));
        btnExportBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/excel_1.png"))); // NOI18N
        btnExportBill.setText("Xuất hóa đơn");
        btnExportBill.setColor(new java.awt.Color(0, 102, 0));
        btnExportBill.setColorBordered(new java.awt.Color(255, 255, 255));
        btnExportBill.setColorEntered(new java.awt.Color(28, 151, 28));
        btnExportBill.setColorHover(new java.awt.Color(255, 255, 255));
        btnExportBill.setColorNomal(new java.awt.Color(255, 255, 255));
        btnExportBill.setColorPressed(new java.awt.Color(0, 102, 0));
        btnExportBill.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnExportBill.setIconTextGap(12);
        btnExportBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportBillActionPerformed(evt);
            }
        });

        txtStatus.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtStatus.setEnabled(false);
        txtStatus.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtStatus.setHide("...");

        javax.swing.GroupLayout pnlFormInputLayout = new javax.swing.GroupLayout(pnlFormInput);
        pnlFormInput.setLayout(pnlFormInputLayout);
        pnlFormInputLayout.setHorizontalGroup(
            pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spNote, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormInputLayout.createSequentialGroup()
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormInputLayout.createSequentialGroup()
                                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtExportID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8)
                                        .addComponent(txtCreatedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(lblNote))
                        .addGap(48, 48, 48)
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportBill, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormInputLayout.setVerticalGroup(
            pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormInputLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormInputLayout.createSequentialGroup()
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormInputLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormInputLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblNote))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spNote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUpdate.add(pnlFormInput, java.awt.BorderLayout.NORTH);

        pnlDetailBill.setBackground(new java.awt.Color(147, 196, 125));
        pnlDetailBill.setOpaque(false);
        pnlDetailBill.setLayout(new java.awt.BorderLayout());

        pnlTitleTable.setOpaque(false);
        pnlTitleTable.setLayout(new java.awt.BorderLayout());

        lblTitleTable.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitleTable.setForeground(new java.awt.Color(66, 103, 178));
        lblTitleTable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitleTable.setText("   Bảng Chi Tiết Hóa Đơn Xuất");
        lblTitleTable.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitleTable.setPreferredSize(new java.awt.Dimension(260, 35));
        pnlTitleTable.add(lblTitleTable, java.awt.BorderLayout.CENTER);

        pnlDetailBill.add(pnlTitleTable, java.awt.BorderLayout.PAGE_START);

        spExportDetails.setVerticalScrollBar(new ScrollBarCustom());

        tbExportDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Tên sản phẩm", "Số lượng", "Giá", "Thành tiền", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbExportDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExportDetailsMouseClicked(evt);
            }
        });
        spExportDetails.setViewportView(tbExportDetails);
        if (tbExportDetails.getColumnModel().getColumnCount() > 0) {
            tbExportDetails.getColumnModel().getColumn(0).setMinWidth(30);
            tbExportDetails.getColumnModel().getColumn(0).setMaxWidth(40);
            tbExportDetails.getColumnModel().getColumn(2).setMinWidth(100);
            tbExportDetails.getColumnModel().getColumn(2).setMaxWidth(150);
            tbExportDetails.getColumnModel().getColumn(3).setMinWidth(150);
            tbExportDetails.getColumnModel().getColumn(3).setMaxWidth(160);
            tbExportDetails.getColumnModel().getColumn(4).setMinWidth(160);
            tbExportDetails.getColumnModel().getColumn(4).setMaxWidth(180);
            tbExportDetails.getColumnModel().getColumn(5).setMinWidth(180);
            tbExportDetails.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        pnlDetailBill.add(spExportDetails, java.awt.BorderLayout.CENTER);

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

        btnShowDetails.setBackground(new java.awt.Color(96, 73, 5));
        btnShowDetails.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnShowDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnShowDetails.setText("Thêm sản phẩm");
        btnShowDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDetailsActionPerformed(evt);
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
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnShowDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst)
                        .addComponent(btnPrev)
                        .addComponent(btnNext)
                        .addComponent(btnLast))
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUpdate.add(pnlButton, java.awt.BorderLayout.SOUTH);

        tabExportBill.addTab("CẬP NHẬT", pnlUpdate);

        pnlList.setOpaque(false);
        pnlList.setLayout(new java.awt.BorderLayout());

        pnlFormSearch.setBackground(new java.awt.Color(147, 196, 125));
        pnlFormSearch.setOpaque(false);

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

        txtSearch1.setHide("Tìm theo ngày lập. VD: 03-09-2023");
        txtSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch1ActionPerformed(evt);
            }
        });
        txtSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearch1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch1KeyReleased(evt);
            }
        });

        btnTypeStatus.add(rdoExported);
        rdoExported.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoExported.setText("Đã xuất");
        rdoExported.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoExportedActionPerformed(evt);
            }
        });

        btnTypeStatus.add(rdoNoExport);
        rdoNoExport.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoNoExport.setText("Chưa xuất");
        rdoNoExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNoExportActionPerformed(evt);
            }
        });

        btnTypeStatus.add(rdoAll);
        rdoAll.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoAll.setSelected(true);
        rdoAll.setText("Tất cả");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormSearchLayout = new javax.swing.GroupLayout(pnlFormSearch);
        pnlFormSearch.setLayout(pnlFormSearchLayout);
        pnlFormSearchLayout.setHorizontalGroup(
            pnlFormSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormSearchLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(rdoExported)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoNoExport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdoAll)
                .addGap(24, 24, 24))
        );
        pnlFormSearchLayout.setVerticalGroup(
            pnlFormSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoExported)
                    .addComponent(rdoNoExport)
                    .addComponent(rdoAll))
                .addContainerGap())
        );

        pnlList.add(pnlFormSearch, java.awt.BorderLayout.PAGE_START);

        spExportBill.setOpaque(false);
        spExportBill.setVerticalScrollBar(new ScrollBarCustom());

        tblExportBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Tổng tiền", "Ngày lập HD", "Trạng thái", "Người lập", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExportBill.setOpaque(false);
        tblExportBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExportBillMouseClicked(evt);
            }
        });
        spExportBill.setViewportView(tblExportBill);
        if (tblExportBill.getColumnModel().getColumnCount() > 0) {
            tblExportBill.getColumnModel().getColumn(0).setMinWidth(150);
            tblExportBill.getColumnModel().getColumn(0).setMaxWidth(200);
            tblExportBill.getColumnModel().getColumn(2).setMinWidth(130);
            tblExportBill.getColumnModel().getColumn(2).setMaxWidth(150);
            tblExportBill.getColumnModel().getColumn(5).setMinWidth(110);
            tblExportBill.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        pnlList.add(spExportBill, java.awt.BorderLayout.CENTER);

        tabExportBill.addTab("DANH SÁCH", pnlList);

        pnlHDNhap.add(tabExportBill, java.awt.BorderLayout.CENTER);

        add(pnlHDNhap, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insertIB();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateIB();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (Auth.isManager()) {
            deleteIB();
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Hóa Đơn Xuất !");
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

    private void btnShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDetailsActionPerformed
        String importBillID = txtExportID.getText();
        openImportDetailsJDialog(frame, null, importBillID, false);
    }//GEN-LAST:event_btnShowDetailsActionPerformed

    private void tblExportBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExportBillMouseClicked
        tblExportBill.setRowSelectionAllowed(true);
        if (evt.getClickCount() == 2) {
            row = tblExportBill.getSelectedRow();
//            fillToForm(String.valueOf(tblExportBill.getValueAt(tblExportBill.getSelectedRow(), 0)));
            this.edit();
        }
    }//GEN-LAST:event_tblExportBillMouseClicked


    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        sortTblProduct();
    }//GEN-LAST:event_btnSortActionPerformed

    private void tbExportDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExportDetailsMouseClicked
        if (evt.getClickCount() == 2) {
            String BillDetailsID = tbExportDetails.getValueAt(tbExportDetails.getSelectedRow(), 0).toString();
            String importBillID = txtExportID.getText();

            openImportDetailsJDialog(frame, BillDetailsID, importBillID, true);
        }
    }//GEN-LAST:event_tbExportDetailsMouseClicked

    private void btnExportBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportBillActionPerformed
        handleExportBill();
    }//GEN-LAST:event_btnExportBillActionPerformed

    private void txtSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1ActionPerformed

    private void rdoNoExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNoExportActionPerformed
        List<ExportBill> listEB;
        if (rdoNoExport.isSelected()) {
            listEB = eBillDAO.selectNoExportASC();
            fillTableExportBill(listEB);
            checkShortNoExport = true;
        }
    }//GEN-LAST:event_rdoNoExportActionPerformed

    private void rdoExportedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoExportedActionPerformed
        List<ExportBill> listEB;
        if (rdoExported.isSelected()) {
            listEB = eBillDAO.selectExportedASC();
            fillTableExportBill(listEB);
            checkShortExported = true;
        }
    }//GEN-LAST:event_rdoExportedActionPerformed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        if (rdoAll.isSelected()) {
            fillTableExportBill(eBillDAO.selectAlls());
            checkShortAllExport = true;
        }
    }//GEN-LAST:event_rdoAllActionPerformed

    private void txtSearch1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch1KeyPressed
//        handleSearch();
    }//GEN-LAST:event_txtSearch1KeyPressed

    private void txtSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch1KeyReleased
        handleSearch();
    }//GEN-LAST:event_txtSearch1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private CustomSwing.MyButton btnExportBill;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnShowDetails;
    private CustomSwing.MyButton btnSort;
    private javax.swing.ButtonGroup btnTypeStatus;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleTable;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlDetailBill;
    private javax.swing.JPanel pnlFormInput;
    private javax.swing.JPanel pnlFormSearch;
    private javax.swing.JPanel pnlHDNhap;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlTitleTable;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoExported;
    private javax.swing.JRadioButton rdoNoExport;
    private javax.swing.JScrollPane spExportBill;
    private javax.swing.JScrollPane spExportDetails;
    private javax.swing.JScrollPane spNote;
    private javax.swing.JTabbedPane tabExportBill;
    private javax.swing.JTable tbExportDetails;
    private javax.swing.JTable tblExportBill;
    private CustomSwing.MyTextField txtCreatedDate;
    private CustomSwing.MyTextField txtExportID;
    private CustomSwing.MyTextField txtFullName;
    private javax.swing.JTextArea txtNotes;
    private CustomSwing.MyTextField txtSearch1;
    private CustomSwing.MyTextField txtStatus;
    private CustomSwing.MyTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables

    private void init() {

        fillTableExportBill(eBillDAO.selectAll());
        clearForm();

        setAttribute();

    }

    private void setAttribute() {
        try {
            txtExportID.setText(BaseDAO.setExportID("DonXuatHang", "HDX", 8));
            txtExportID.setEnabled(false);
            txtCreatedDate.setEnabled(false);
            txtStatus.setEnabled(false);
            txtTotalAmount.setEnabled(false);
            btnShowDetails.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            txtCreatedDate.setText(XDateHelper.toString(XDateHelper.nowDate(), "dd-MM-yyyy"));
            btnExportBill.setEnabled(false);
            BaseDAO.setTable(spExportBill, tblExportBill, false, 0, 2, 3, 4, 5);
            BaseDAO.setTable(spExportDetails, tbExportDetails, false, 0, 1, 2, 5);
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }

    public void action(JDialog jd) {
        jd.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Xử lý khi JDialog bị đóng
                fillToForm(txtExportID.getText());
                if (tbExportDetails.getRowCount() == 0) {
                    eBillDetailDAO.updateAmountExport0(txtExportID.getText());
                    txtTotalAmount.setText("0");
                } else {
                    eBillDetailDAO.updateAmountExport(txtExportID.getText());
                }

                fillTableExportBill(eBillDAO.selectAll());
            }
        });
    }

    public void openImportDetailsJDialog(JFrame frame, String detailsID, String importID, boolean isBtn) {
        ExportBillDetailUI exportBillDetailUI = new ExportBillDetailUI(frame, true, detailsID, importID, isBtn);
        action(exportBillDetailUI);
        exportBillDetailUI.setVisible(true);
    }

    public void fillTableExportBill(List<ExportBill> ib) {
        DefaultTableModel model = (DefaultTableModel) tblExportBill.getModel();
        model.setRowCount(0);
        try {
            List<ExportBill> list = ib;
            for (ExportBill e : list) {
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                Object[] row = {
                    e.getExportID(),
                    e.getTotalAmount(),
                    XDateHelper.toString(e.getCreatedDate(), "dd-MM-yyyy"),
                    e.getStatusExport() == 1 ? "Đã xuất hàng" : "Chưa xuất hàng",
                    eDAO.findByID(e.getEmployeeID()).getFullName(),
                    e.getNote()
                };
                model.addRow(row);
            }
            tblExportBill.setModel(model);
        } catch (Exception e) {
            System.out.println("aaaa");
            e.printStackTrace();
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    public void fillToForm(String id) {
        ExportBill eb = eBillDAO.selectById(id);
        txtExportID.setText(eb.getExportID());
        txtCreatedDate.setText(XDateHelper.toString(eb.getCreatedDate(), "dd-MM-yyyy"));
        txtNotes.setText(eb.getNote());
        txtTotalAmount.setText(String.valueOf(eb.getTotalAmount()));
        tabExportBill.setSelectedIndex(0);
        txtStatus.setText(eb.getStatusExport() == 1 ? "Đã xuất hàng" : "Chưa xuất hàng");
        if (row >= 0) {
            try {
                txtFullName.setText(eDAO.findByID(eb.getEmployeeID()).getFullName());
                txtFullName.setToolTipText(eb.getEmployeeID());
            } catch (SQLException ex) {
                XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
            }
        }
        fillTableImportDetails(id);
    }

    public void fillTableImportDetails(String id) {
        DefaultTableModel model = (DefaultTableModel) tbExportDetails.getModel();
        model.setRowCount(0);
        List<ExportDetailBill> edb = eBillDetailDAO.selectByIds(id);
        try {
            for (ExportDetailBill i : edb) {
                @SuppressWarnings("LocalVariableHidesMemberVariable")
                Object[] row = {
                    i.getDetailID(),
                    i.getProductName(),
                    i.getAmount(),
                    i.getPrice(),
                    i.getTotalAmount(),
                    i.getNote()
                };
                model.addRow(row);
            }
            tbExportDetails.setModel(model);
            if (tbExportDetails.getRowCount() > 0) {
                btnExportBill.setEnabled(true);
            } else {
                btnExportBill.setEnabled(false);
            }
        } catch (Exception e) {
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    public ExportBill getForm() {
        ExportBill ib = new ExportBill();
        ib.setExportID(txtExportID.getText());
        ib.setWareHouseID(1);
        ib.setEmployeeID(txtFullName.getToolTipText());
        ib.setTotalAmount(Long.valueOf(txtTotalAmount.getText()));
        ib.setNote(txtNotes.getText());
        ib.setStatusExport(txtStatus.getText().equalsIgnoreCase("Đã xuất hàng") ? 1 : 2);
        ib.setCreatedDate(XDateHelper.toDate(txtCreatedDate.getText(), "yyyy-MM-dd"));
        return ib;
    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblExportBill.getRowCount() - 1);

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

        btnShowDetails.setEnabled(edit);
    }

    private void clearForm() {
        try {
            row = -1;
            updateStatus();
            txtExportID.setText(BaseDAO.setExportID("DonXuatHang", "HDX", 8));
            txtNotes.setText("");
            txtTotalAmount.setText("0");
            tblExportBill.setRowSelectionAllowed(false);
            btnExportBill.setEnabled(false);

            txtStatus.setText("...");

            txtFullName.setText(Auth.user.getFullName());
            txtFullName.setToolTipText(Auth.user.getEmployeeID());
            //clear bảng chi tiết
            DefaultTableModel model = (DefaultTableModel) tbExportDetails.getModel();
            model.setRowCount(0);
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }

    private void edit() {
        //fill vào bảng chi tiết theo mã hóa đơn
        fillToForm(String.valueOf(tblExportBill.getValueAt(row, 0)));

        tabExportBill.setSelectedIndex(0);
        txtExportID.setEnabled(false);
        this.updateStatus();

    }

    private void insertIB() {
        ExportBill eb = getForm();
        try {
            eBillDAO.insert(eb);
            this.fillTableExportBill(eBillDAO.selectAll());
            XDialogHelper.alert(this, "Thêm mới thành công !");
            tabExportBill.setSelectedIndex(1);
            for (int i = 0; i < tblExportBill.getRowCount(); i++) {
                if (txtExportID.getText().equalsIgnoreCase(String.valueOf(tblExportBill.getValueAt(i, 0)))) {
                    tblExportBill.changeSelection(i, i, false, false);
                    tblExportBill.setRowSelectionAllowed(true);
                    fillToForm(txtExportID.getText());
                    btnShowDetails.setEnabled(true);
                    row = i;
                    updateStatus();
                    break;
                }
            }

//            this.clearForm();
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Thêm mới thất bại !");
        }
    }

    private void deleteIB() {
        String ibID = tblExportBill.getValueAt(row, 0).toString();
        try {
            if (XDialogHelper.confirm(this, "Xóa Hóa Đơn đang chọn ?")) {
                eBillDAO.delete(ibID);
                this.fillTableExportBill(eBillDAO.selectAll());
                this.clearForm();
                XDialogHelper.alert(this, "Xóa thành công !");
            }
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Xóa thất bại");
        }
    }

    private void updateIB() {
        ExportBill ib = getForm();
        try {
            if (XDialogHelper.confirm(this, "Cập nhật Hóa Đơn Nhập đang chọn ?")) {
                eBillDAO.update(ib);
                this.fillTableExportBill(eBillDAO.selectAll());
                fillToForm(txtExportID.getText());
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
        tblExportBill.changeSelection(row, 0, false, false);
    }

    void prevIB() {
        if (this.row > 0) {
            this.row--;
            this.edit();
            tblExportBill.changeSelection(row, 0, false, false);
        }
    }

    void nextIB() {
        if (this.row < tblExportBill.getRowCount() - 1) {
            this.row++;
            this.edit();
            tblExportBill.changeSelection(row, 0, false, false);
        }
    }

    void lastIB() {
        this.row = tblExportBill.getRowCount() - 1;
        this.edit();
        tblExportBill.changeSelection(row, 0, false, false);
    }

    private void sortTblProduct() {
        List<ExportBill> listEB;
        if (rdoNoExport.isSelected()) {
            if (checkShortNoExport) {
                listEB = eBillDAO.selectNoExportDESC();
                checkShortNoExport = !checkShortNoExport;
            } else {
                listEB = eBillDAO.selectNoExportASC();
                checkShortNoExport = !checkShortNoExport;
            }
        } else if (rdoExported.isSelected()) {
            if (checkShortExported) {
                listEB = eBillDAO.selectExportedDESC();
                checkShortExported = !checkShortExported;
            } else {
                listEB = eBillDAO.selectExportedASC();
                checkShortExported = !checkShortExported;
            }
        } else {
            if (checkShortAllExport) {
                listEB = eBillDAO.selectAllsDESC();
                checkShortAllExport = !checkShortAllExport;
            } else {
                listEB = eBillDAO.selectAlls();
                checkShortAllExport = !checkShortAllExport;
            }
        }
        fillTableExportBill(listEB);
    }

    public void handleExportBill() {
        ExportBill eb = getForm();
        MessageFormat hf = new MessageFormat("Chi Tiết Hóa Đơn");
        MessageFormat ft = new MessageFormat("Tổng tiền: " + Double.valueOf(txtTotalAmount.getText()));
        if (tbExportDetails.getRowCount() > 0) {
            try {
                if (tbExportDetails.print(JTable.PrintMode.FIT_WIDTH, hf, ft)) {
                    XDialogHelper.alert(this, "Đã xuất file thành công !");
                    eb.setStatusExport(1);
                    eBillDAO.update(eb);
                    txtStatus.setText("Đã xuất hàng");
                    fillTableExportBill(eBillDAO.selectAll());
                }
            } catch (PrinterException ex) {
                Logger.getLogger(ExportBillUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            XDialogHelper.alert(this, JOptionPane.WARNING_MESSAGE, "Không có thông tin trong hóa đơn !");
        }
    }

    public void handleRoleExportbill(boolean isRole) {
        btnDelete.setEnabled(isRole);
    }

    private void handleSearch() {
        List<ExportBill> listEB = eBillDAO.selectByDate(txtSearch1.getText());
        fillTableExportBill(listEB);
    }
}
