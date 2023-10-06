package Conponent;

import CustomSwing.ScrollBarCustom;
import DAO.BaseDAO;
import DAO.EmployeeDAO;
import Entities.Employee;
import Helper.XDateHelper;
import Helper.XDialogHelper;
import Helper.XShareHelper;
import Model.Colors;
import Utils.Auth;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.Normalizer;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import jnafilechooser.api.JnaFileChooser;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public class EmployeeUI extends javax.swing.JPanel {

    JFrame Jframe;
    boolean createAcc = false;
    private Color bgColorA = Colors.homeColor(Colors.LEFT);
    private Color bgColorB = Colors.homeColor(Colors.RIGHT);

    public EmployeeUI(JFrame Jframe) {
        initComponents();
        this.Jframe = Jframe;
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

        btgGender = new javax.swing.ButtonGroup();
        btgRole = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        tabContainer = new javax.swing.JTabbedPane();
        pnlUpdate = new javax.swing.JPanel();
        pnlSmallContainer = new javax.swing.JPanel();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblFullName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        jdcBirthday = new com.toedter.calendar.JDateChooser();
        lblGender = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        rdoManager = new javax.swing.JRadioButton();
        rdoStaff = new javax.swing.JRadioButton();
        lblmage = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        spAddress = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        pnlList = new javax.swing.JPanel();
        spEmployee = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new CustomSwing.MyTextField();

        setBackground(new java.awt.Color(0, 204, 153));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÝ NHÂN VIÊN");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(270, 45));
        add(lblTitle, java.awt.BorderLayout.PAGE_START);

        tabContainer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        pnlUpdate.setOpaque(false);
        pnlUpdate.setLayout(new java.awt.BorderLayout());

        pnlSmallContainer.setOpaque(false);

        lblEmployeeID.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblEmployeeID.setText("Mã nhân viên");

        txtEmployeeID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtEmployeeID.setText("...");
        txtEmployeeID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtEmployeeID.setEnabled(false);
        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        lblFullName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblFullName.setText("Họ tên");

        txtName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNameMouseExited(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        lblPhone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPhone.setText("Số điện thoại");

        txtPhone.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblDateOfBirth.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDateOfBirth.setText("Ngày sinh");

        jdcBirthday.setDate(new java.util.Date(1679212547000L));
        jdcBirthday.setDateFormatString("dd-MM-yyyy");
        jdcBirthday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdcBirthday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdcBirthdayKeyPressed(evt);
            }
        });

        lblGender.setBackground(new java.awt.Color(51, 51, 51));
        lblGender.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(51, 51, 51));
        lblGender.setText("Giới Tính:");

        rdoMale.setBackground(new java.awt.Color(147, 196, 125));
        btgGender.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoMale.setForeground(new java.awt.Color(51, 51, 51));
        rdoMale.setSelected(true);
        rdoMale.setText("Nam");

        rdoFemale.setBackground(new java.awt.Color(147, 196, 125));
        btgGender.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoFemale.setForeground(new java.awt.Color(51, 51, 51));
        rdoFemale.setText("Nữ");

        rdoManager.setBackground(new java.awt.Color(147, 196, 125));
        btgRole.add(rdoManager);
        rdoManager.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoManager.setForeground(new java.awt.Color(51, 51, 51));
        rdoManager.setText("Quản lý");

        rdoStaff.setBackground(new java.awt.Color(147, 196, 125));
        btgRole.add(rdoStaff);
        rdoStaff.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdoStaff.setForeground(new java.awt.Color(51, 51, 51));
        rdoStaff.setSelected(true);
        rdoStaff.setText("Nhân viên");

        lblmage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblmage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmageMouseClicked(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblEmail1.setText("Vai trò");

        javax.swing.GroupLayout pnlSmallContainerLayout = new javax.swing.GroupLayout(pnlSmallContainer);
        pnlSmallContainer.setLayout(pnlSmallContainerLayout);
        pnlSmallContainerLayout.setHorizontalGroup(
            pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblmage, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                        .addComponent(rdoManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoStaff))
                    .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                        .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFullName)
                            .addComponent(lblEmail)
                            .addComponent(lblEmployeeID)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtEmployeeID)
                            .addComponent(txtEmail))
                        .addGap(48, 48, 48)
                        .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                                        .addComponent(rdoMale)
                                        .addGap(30, 30, 30)
                                        .addComponent(rdoFemale))
                                    .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDateOfBirth)
                                            .addComponent(jdcBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(lblEmail1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSmallContainerLayout.setVerticalGroup(
            pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                        .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                                .addComponent(lblDateOfBirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoMale)
                                    .addComponent(rdoFemale))
                                .addGap(6, 6, 6))
                            .addGroup(pnlSmallContainerLayout.createSequentialGroup()
                                .addComponent(lblEmployeeID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFullName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSmallContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoManager)
                            .addComponent(rdoStaff)))
                    .addComponent(lblmage, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUpdate.add(pnlSmallContainer, java.awt.BorderLayout.PAGE_START);

        pnlButton.setBackground(new java.awt.Color(147, 196, 125));
        pnlButton.setOpaque(false);

        btnInsert.setBackground(new java.awt.Color(0, 82, 0));
        btnInsert.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Thêm");
        btnInsert.setPreferredSize(new java.awt.Dimension(120, 33));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 82, 0));
        btnUpdate.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Cập nhật");
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
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(0, 82, 0));
        btnFirst.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(0, 82, 0));
        btnPrev.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 82, 0));
        btnNext.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(0, 82, 0));
        btnLast.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnCreateAccount.setBackground(new java.awt.Color(96, 73, 5));
        btnCreateAccount.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setText("Tạo Tài Khoản");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAddress.setText("Địa chỉ");

        spAddress.setVerticalScrollBar(new ScrollBarCustom());

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtAddress.setRows(5);
        spAddress.setViewportView(txtAddress);

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlButtonLayout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonLayout.createSequentialGroup()
                        .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlButtonLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(btnCreateAccount)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(btnFirst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast)
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))))
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlUpdate.add(pnlButton, java.awt.BorderLayout.CENTER);

        tabContainer.addTab("CẬP NHẬT", pnlUpdate);

        pnlList.setOpaque(false);
        pnlList.setLayout(new java.awt.BorderLayout());

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NV", "TÀI KHOẢN", "MẬT KHẨU", "HỌ TÊN", "GIỚI TÍNH", "EMAIL", "SĐT", "NGÀY SINH", "ĐỊA CHỈ", "VAI TRÒ", "TRẠNG THÁI TK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        spEmployee.setViewportView(tblEmployee);

        pnlList.add(spEmployee, java.awt.BorderLayout.CENTER);

        pnlSearch.setOpaque(false);

        txtSearch.setHide("Nhập tên nhân viên cần tìm...");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(582, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlList.add(pnlSearch, java.awt.BorderLayout.PAGE_START);

        tabContainer.addTab("DANH SÁCH", pnlList);

        add(tabContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void lblmageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmageMouseClicked
        // TODO add your handling code here:
        chooseImg();
    }//GEN-LAST:event_lblmageMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            insertEmployee();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (isValidate()) {
            updateEmployee();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            deleteEmployee();
        } else {
            XDialogHelper.alert(this, 0, "Bạn không được quyền xóa Nhân Viên");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            tblEmployee.setRowSelectionAllowed(true);
            row = tblEmployee.getSelectedRow();
            edit();

        }
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        try {
            // TODO add your handling code here:
            String employeeID = txtEmployeeID.getText();
            Employee e = elDAO.findByID(employeeID);
            if (e.getPassword() == null && e.getAccount() == null) {
                openCreateAccount(Jframe, employeeID);
            } else {
                openChangePass(Jframe, employeeID, e.getPassword());
            }
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void jdcBirthdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcBirthdayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdcBirthdayKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseExited

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        setID();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchEmployee(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGender;
    private javax.swing.ButtonGroup btgRole;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jdcBirthday;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblmage;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSmallContainer;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JRadioButton rdoManager;
    private javax.swing.JRadioButton rdoStaff;
    private javax.swing.JScrollPane spAddress;
    private javax.swing.JScrollPane spEmployee;
    private javax.swing.JTabbedPane tabContainer;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private CustomSwing.MyTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    int row = -1;
    EmployeeDAO elDAO = new EmployeeDAO();
    JnaFileChooser fileChooser = new JnaFileChooser();

    private void init() {
        try {
            fillTableEmployee(elDAO.select());
            clearForm();
            BaseDAO.setTable(spEmployee, tblEmployee, false, 0, 2, 4, 6, 7, 9, 10);
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }

    void action(JDialog jd) {
        jd.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    // Xử lý khi JDialog bị đóng
                    fillTableEmployee(elDAO.select());
                    for (int i = 0; i < tblEmployee.getRowCount(); i++) {
                        if (txtEmployeeID.getText().equalsIgnoreCase(String.valueOf(tblEmployee.getValueAt(i, 0)))) {
                            row = i;
                            tblEmployee.changeSelection(i, i, false, false);
                            break;
                        }
                    }
                    tabContainer.setSelectedIndex(1);
                } catch (SQLException ex) {
                    XDialogHelper.alert(Jframe, 0, "Lỗi truy vấn dữ liệu !");
                }
            }
        });
    }

    private void fillTableEmployee(List<Employee> e) {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);
        try {
            List<Employee> list = e;
            for (Employee i : list) {
                Object[] row = {
                    i.getEmployeeID(),
                    i.getAccount(),
                    i.getPassword() == null ? "" : "**********",
                    i.getFullName(),
                    i.isGender() ? "Nữ" : "Nam",
                    i.getEmail(),
                    i.getPhone(),
                    XDateHelper.toString(i.getDateOfBirth(), "dd-MM-yyyy"),
                    i.getAddress(),
                    i.getRoleID() == 1 ? "Quản lý" : "Nhân Viên",
                    i.getPassword() == null ? "Chưa tạo" : "Đã tạo"
                };
                model.addRow(row);
            }
            tblEmployee.setModel(model);
        } catch (Exception ex) {
            System.out.println(ex);
            XDialogHelper.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void chooseImg() {
        if (fileChooser.showOpenDialog(this.Jframe)) {
            File file = fileChooser.getSelectedFile();
            if (file.getName().endsWith(".jpg") || file.getName().endsWith(".png")) {
                XShareHelper.saveLogo(file);
                lblmage.setIcon(XShareHelper.scaledImage(file.getName(), lblmage));
                lblmage.setToolTipText(file.getName());
                System.out.println(lblmage.getToolTipText());
            } else {
                XDialogHelper.alert(this, "Hình ảnh không đúng định dạng ! (Định dạng ảnh là 'jpg' hoặc 'png')");
            }
        } else {
            XDialogHelper.alert(this, "Bạn chưa chọn hình ảnh !");
        }
    }

    void setForm(Employee e) {
        if (e.getEmployeeID() == null) {
            try {
                txtEmployeeID.setText(BaseDAO.setExportID("NhanVien", "NV", 5));
            } catch (SQLException ex) {
                XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
            }
        } else {
            txtEmployeeID.setText(e.getEmployeeID());
        }
        txtName.setText(e.getFullName());
        txtPhone.setText(e.getPhone());
        txtAddress.setText(e.getAddress());
        txtEmail.setText(e.getEmail());
        if (e.getDateOfBirth() == null) {
            jdcBirthday.setDate(XDateHelper.nowDate());
        } else {
            jdcBirthday.setDate(e.getDateOfBirth());
        }
        if (e.isGender()) {
            rdoFemale.setSelected(true);
        } else {
            rdoMale.setSelected(true);
        }
        if (String.valueOf(e.getRoleID()) != null) {
            if (String.valueOf(e.getRoleID()).equals("1")) {
                rdoManager.setSelected(true);
            } else {
                rdoStaff.setSelected(true);
            }
        }

        if (e.getImage() != null) {
            lblmage.setToolTipText(e.getImage());
            lblmage.setIcon(XShareHelper.scaledImage(e.getImage(), lblmage));
        } else {
            lblmage.setIcon(null);
        }

        btnCreateAccount.setVisible(true);
    }

    Employee getForm() {
        Employee e = new Employee();
        e.setEmployeeID(txtEmployeeID.getText().trim());
        e.setFullName(txtName.getText().trim());
        e.setPhone(txtPhone.getText().trim());
        e.setAddress(txtAddress.getText().trim());
        e.setCreatedBy(Auth.user.getEmployeeID()); // Chỉnh sửa !!!
        e.setEmail(txtEmail.getText().trim());
        e.setDateOfBirth(jdcBirthday.getDate());

        if (rdoFemale.isSelected()) {
            e.setGender(true);
        } else {
            e.setGender(false);
        }

        if (rdoManager.isSelected()) {
            e.setRoleID(1);
        } else {
            e.setRoleID(2);
        }
        e.setTypeID(1);
        e.setImage(lblmage.getToolTipText().trim());
        System.out.println(lblmage.getToolTipText().trim() + " getform");
        return e;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblEmployee.getRowCount() - 1);

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
    }

    private void clearForm() {
        Employee e = new Employee();
        setForm(e);
        row = -1;
        updateStatus();
        lblmage.setIcon(null);
        lblmage.setToolTipText(null);
        tblEmployee.setRowSelectionAllowed(false);
        btnCreateAccount.setVisible(false);
    }

    void edit() {
        try {
            String eID = tblEmployee.getValueAt(row, 0).toString();
            Employee e = elDAO.findByID(eID);
            txtEmployeeID.setEnabled(false);
            this.setForm(e);
            tabContainer.setSelectedIndex(0);
            this.updateStatus();
            if (e.getPassword() == null) {
                btnCreateAccount.setVisible(true);
                btnCreateAccount.setText("Tạo Tài Khoản");

            } else {
                btnCreateAccount.setVisible(true);
                btnCreateAccount.setText("Cập nhật Tài Khoản");
            }
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }

    private void insertEmployee() {
        Employee e = getForm();
        try {
            elDAO.insert(e);
            this.fillTableEmployee(elDAO.select());
            for (int i = 0; i < tblEmployee.getRowCount(); i++) {
                if (e.getEmployeeID().equalsIgnoreCase(String.valueOf(tblEmployee.getValueAt(i, 0)))) {
                    row = i;
                    tblEmployee.changeSelection(i, i, false, false);
                    break;
                }
            }
            tabContainer.setSelectedIndex(1);
            this.clearForm();
            tblEmployee.setRowSelectionAllowed(true);
            XDialogHelper.alert(this, "Thêm mới thành công !");
        } catch (Exception ex) {
            XDialogHelper.alert(this, "Thêm thất bại !");
        }

    }

    private void deleteEmployee() {
        String eID = tblEmployee.getValueAt(row, 0).toString();
        try {
            if (XDialogHelper.confirm(this, "Xóa Nhân Viên đang chọn ?")) {
                if (Auth.user.getEmployeeID().equalsIgnoreCase(txtEmployeeID.getText())) {
                    XDialogHelper.alert(this, 0, "Bạn không thể xóa chính bạn !");
                } else {
                    elDAO.delete(eID);
                    this.fillTableEmployee(elDAO.select());
                    this.clearForm();
                    XDialogHelper.alert(this, "Xóa thành công !");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            XDialogHelper.alert(this, "Xóa thất bại");
        }
    }

    private void updateEmployee() {
        Employee e = getForm();
        try {
            if (XDialogHelper.confirm(this, "Cập nhật Nhân Viên đang chọn ?")) {
                elDAO.update(e);
                this.fillTableEmployee(elDAO.select());
                this.clearForm();
                XDialogHelper.alert(this, "Cập nhật thành công !");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            XDialogHelper.alert(this, "Cập nhật thất bại !");
        }
    }

    void first() {
        this.row = 0;
        this.edit();
        tblEmployee.changeSelection(row, 0, false, false);
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
            tblEmployee.changeSelection(row, 0, false, false);
        }
    }

    void next() {
        if (this.row < tblEmployee.getRowCount() - 1) {
            this.row++;
            this.edit();
            tblEmployee.changeSelection(row, 0, false, false);
        }
    }

    void last() {
        this.row = tblEmployee.getRowCount() - 1;
        this.edit();
        tblEmployee.changeSelection(row, 0, false, false);
    }

    private boolean isValidate() {
        boolean checkForm = true;
        try {
            List<Employee> listE = elDAO.select();
            String[] error
                    = {"Bạn chưa nhập Mã NV\n",
                        "Mã NV chỉ tối đa 8 kí tự",
                        "Bạn chưa nhập Họ Tên\n",
                        "Tuổi không hợp lệ (Tuổi phải lớn hơn 18t)\n",
                        "Bạn chưa nhập Email\n",
                        "Email không hợp lệ\n",
                        "Bạn chưa nhập SĐT\n",
                        "Số điện thoại không hợp lệ (vd: 0909333666)\n",
                        "Bạn chưa nhập Địa Chỉ\n",
                        "Bạn chưa chọn Ảnh\n",
                        "Mã NV chưa đúng định dạng (VD: NV12345)\n",
                        "Họ Tên không hợp lệ\n",
                        "Email đã tồn tại\n",
                        "Số điện thoại đã tồn tại\n"};
            String mess = "";

//        String regexID = "NV[0-9_-]{1,6}$";
            String regexName = "^[a-zA-Z\\s\\u00C0-\\u024F\\u1E00-\\u1EFF]{3,50}+$";

            if (txtName.getText().equals("")) {
                mess += error[2];
                checkForm = false;
            } else if (!txtName.getText().matches(regexName)) {
                mess += error[11];
                checkForm = false;
            }

            Date now = XDateHelper.nowDate();
            Date birthD = jdcBirthday.getDate();
            int age = (int) ((now.getTime() - birthD.getTime()) / (1000 * 60 * 60 * 24 * 365.25));
            if (age < 18) {
                mess += error[3];
                checkForm = false;
            }

            String regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            if (txtEmail.getText().equals("")) {
                mess += error[4];
                checkForm = false;
            } else if (!txtEmail.getText().matches(regexEmail)) {
                mess += error[5];
                checkForm = false;
            } else {
                for (Employee e : listE) {
                    if (txtEmail.getText().trim().equalsIgnoreCase(e.getEmail())) {
                        mess += error[12];
                        checkForm = false;
                    }
                }
            }
            String regexPhone = "^([+84|84|0]+(3|5|7|8|9|1[2|6|8|9]))+([0-9]{8})$";
            if (txtPhone.getText().equals("")) {
                mess += error[6];
                checkForm = false;
            } else if (txtPhone.getText().length() != 10 || !txtPhone.getText().matches(regexPhone)) {
                mess += error[7];
                checkForm = false;
            } else {
                for (Employee e : listE) {
                    if (txtPhone.getText().trim().equalsIgnoreCase(e.getPhone())) {
                        mess += error[13];
                        checkForm = false;
                    }
                }
            }

            if (txtAddress.getText().equals("")) {
                mess += error[8];
                checkForm = false;
            }

            if (lblmage.getToolTipText() == null) {
                mess += error[9];
                checkForm = false;
            }
            if (!mess.equalsIgnoreCase("")) {
                XDialogHelper.alert(this, mess);
                checkForm = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkForm;
    }

    private void openCreateAccount(JFrame Jframe, String employeeID) {
        AccountJDialog acc = new AccountJDialog(Jframe, true, employeeID, setID());
        action(acc);
        acc.setVisible(true);
    }

    private void openChangePass(JFrame Jframe, String employeeID, String passwordOld) {
        ChangPassJPanel cp = new ChangPassJPanel(Jframe, true, employeeID, passwordOld);
        action(cp);
        cp.setVisible(true);
    }

    public String setID() {
        String result = "";
        if (!txtName.getText().equals("")) {
            String fullName = Normalizer.normalize(txtName.getText(), Normalizer.Form.NFD);
            fullName = fullName.replace("đ", "d");
            fullName = fullName.replaceAll("[^\\p{ASCII}]", "");

            String[] nameParts = fullName.split(" ");
            
            if (nameParts.length > 2) {
                String code = nameParts[nameParts.length - 1].substring(0, 1).toUpperCase()
                        + nameParts[nameParts.length - 1].substring(1, nameParts[nameParts.length - 1].length()).toLowerCase()
                        + nameParts[0].substring(0, 1).toLowerCase() + nameParts[1].substring(0, 1).toLowerCase();
//                txtEmployeeID.setText(code);
                result = code;
                System.out.println(code);
            } else {
//                if (!txtName.getText().equalsIgnoreCase("Đ")) {
                String code = nameParts[nameParts.length - 1].substring(0, 1).toUpperCase()
                        + nameParts[nameParts.length - 1].substring(1, nameParts[nameParts.length - 1].length()).toLowerCase()
                        + nameParts[0].substring(0, 1).toUpperCase();
//                txtEmployeeID.setText(code);
                result = code;
                System.out.println(code);
//                }
            }
        }
        return result;
    }

    public void handleRoleEmployee(boolean isRole) {
        btnDelete.setEnabled(isRole);

    }

    private void searchEmployee(String name) {
        try {
            List<Employee> listE = elDAO.findByName(name);
            fillTableEmployee(listE);
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }

    }
}
