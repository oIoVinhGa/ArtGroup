/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Conponent;

import DAO.EmployeeDAO;
import Entities.Employee;
import Helper.XDialogHelper;
import Model.Confirm;
import Model.TypeMessage;
import static Model.TypeMessage.TypeMessages;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author pc
 */
@SuppressWarnings("serial")
public final class AccountJDialog extends javax.swing.JDialog {

    JFrame jf;

    private boolean checkNewPassword = false;
    private boolean checkConfirmPassword = false;

    public AccountJDialog(java.awt.Frame parent, boolean modal, String... ID) {
        super(parent, modal);
        initComponents();
        this.jf = (JFrame) parent;
        init(ID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        lblEmployee = new javax.swing.JLabel();
        txtEmployeeID = new CustomSwing.MyTextField();
        lblAccount = new javax.swing.JLabel();
        txtAccount = new CustomSwing.MyTextField();
        lblPassword = new javax.swing.JLabel();
        pnlPassword = new javax.swing.JPanel();
        lblShowHide1 = new javax.swing.JLabel();
        txtPassword = new CustomSwing.MyPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        pnlPassword2 = new javax.swing.JPanel();
        lblShowHide2 = new javax.swing.JLabel();
        txtConfirmPassword = new CustomSwing.MyPasswordField();
        btnCancel = new CustomSwing.MyButton();
        btnConfirm = new CustomSwing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("TẠO TÀI KHOẢN");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(209, 45));
        getContentPane().add(lblTitle, java.awt.BorderLayout.PAGE_START);

        pnlContainer.setLayout(new java.awt.BorderLayout());

        lblEmployee.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblEmployee.setText("Mã nhân viên");

        txtEmployeeID.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtEmployeeID.setEnabled(false);
        txtEmployeeID.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtEmployeeID.setHide("ID Nhân viên");

        lblAccount.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAccount.setText("Tên tài khoản");

        txtAccount.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtAccount.setEnabled(false);
        txtAccount.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAccount.setHide("Tài khoản đăng nhập của nhân viên");

        lblPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPassword.setText("Tạo mật khẩu");

        pnlPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShowHide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowHide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShowHide1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowHide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowHide1MouseClicked(evt);
            }
        });
        pnlPassword.add(lblShowHide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 40));

        txtPassword.setHide("Nhập mật khẩu mới");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        pnlPassword.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        lblConfirmPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblConfirmPassword.setText("Xác nhận mật khẩu");

        pnlPassword2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShowHide2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowHide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShowHide2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowHide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowHide2MouseClicked(evt);
            }
        });
        pnlPassword2.add(lblShowHide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 40));

        txtConfirmPassword.setHide("Nhập lại mật khẩu mới");
        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        pnlPassword2.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        btnCancel.setBackground(new java.awt.Color(129, 90, 156));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        btnCancel.setText("Hủy bỏ");
        btnCancel.setCheckMouse(true);
        btnCancel.setColor(new java.awt.Color(129, 90, 156));
        btnCancel.setColorEntered(new java.awt.Color(165, 118, 197));
        btnCancel.setColorHover(new java.awt.Color(255, 255, 255));
        btnCancel.setColorNomal(new java.awt.Color(255, 255, 255));
        btnCancel.setColorPressed(new java.awt.Color(116, 81, 140));
        btnCancel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancel.setIconTextGap(12);
        btnCancel.setRadius(50);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(77, 48, 193));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/password.png"))); // NOI18N
        btnConfirm.setText("Thêm");
        btnConfirm.setColor(new java.awt.Color(77, 48, 193));
        btnConfirm.setColorEntered(new java.awt.Color(105, 89, 207));
        btnConfirm.setColorHover(new java.awt.Color(255, 255, 255));
        btnConfirm.setColorNomal(new java.awt.Color(255, 255, 255));
        btnConfirm.setColorPressed(new java.awt.Color(65, 40, 165));
        btnConfirm.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConfirm.setIconTextGap(12);
        btnConfirm.setRadius(50);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEmployee)
                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAccount)
                        .addComponent(lblPassword)
                        .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblConfirmPassword)
                        .addComponent(pnlPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlContainer.add(pnlForm, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblShowHide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowHide1MouseClicked
        showNewPassword();
    }//GEN-LAST:event_lblShowHide1MouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblShowHide2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowHide2MouseClicked
        showConfirmPassword();
    }//GEN-LAST:event_lblShowHide2MouseClicked

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed

    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        if (new Confirm(jf, true, "Thông báo", "Bạn có muốn thoát ?", TypeMessages(TypeMessage.WARNING)).isOk()) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (isValidate()) {
            insertAccount();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        if (!txtPassword.getText().equals("")) {
            txtConfirmPassword.setEnabled(true);
        } else {
            txtConfirmPassword.setEnabled(false);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
//            AccountJDialog dialog = new AccountJDialog(new javax.swing.JFrame(), true, "");
//            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                @Override
//                public void windowClosing(java.awt.event.WindowEvent e) {
//                    System.exit(0);
//                }
//            });
//            dialog.setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.MyButton btnCancel;
    private CustomSwing.MyButton btnConfirm;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblShowHide1;
    private javax.swing.JLabel lblShowHide2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlPassword2;
    private CustomSwing.MyTextField txtAccount;
    private CustomSwing.MyPasswordField txtConfirmPassword;
    private CustomSwing.MyTextField txtEmployeeID;
    private CustomSwing.MyPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    EmployeeDAO elDAO = new EmployeeDAO();

    void init(String... ID) {
        try {
            this.setLocationRelativeTo(null);
            Employee e = elDAO.findByID(ID[0]);
            setForm(e);
            txtAccount.setText(ID[1] + ID[0]);
            txtConfirmPassword.setEnabled(false);
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }

    void setForm(Employee e) {
        txtEmployeeID.setText(e.getEmployeeID());
        txtPassword.setText(e.getPassword());
    }

    @SuppressWarnings("ImplicitArrayToString")
    Employee getForm() {
        Employee e = new Employee();
        e.setEmployeeID(txtEmployeeID.getText());
        e.setAccount(txtAccount.getText());
        e.setPassword(String.valueOf(txtPassword.getPassword()));
        return e;
    }

    private void insertAccount() {
        Employee e = getForm();
        try {

            elDAO.insertAccount(e);
            XDialogHelper.alert(this, "Thêm Tài Khoản thành công !");
            this.dispose();
        } catch (Exception ex) {
            System.out.println(ex);
            XDialogHelper.alert(this, "Thêm Tài Khoản thất bại !");
        }

    }

    private boolean isValidate() {
        boolean checkForm = true;
        String[] errorMess = {"Bạn chưa nhập Mật Khẩu\n",
            "Bạn chưa nhập xác nhận Mật Khẩu\n",
            "Xác nhận Mật Khẩu không đúng \n",
            "Mật Khẩu phải trên 6 kí tự, ít nhất 1 chữ thường, in hoa, kí tự đặc biệt !\n"};
        String regexPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$";
        String mess = "";
        if ((String.valueOf(txtPassword.getPassword())).equals("")) {
            mess += errorMess[0];
            checkForm = false;
        } else if (!String.valueOf(txtPassword.getPassword()).matches(regexPass)) {
            mess += errorMess[3];
            checkForm = false;
        } else if ((String.valueOf(txtPassword.getPassword())).equals("")) {
            mess += errorMess[1];
            checkForm = false;
        } else if (!String.valueOf(txtConfirmPassword.getPassword()).equals(String.valueOf(txtPassword.getPassword()))) {
            mess += errorMess[2];
            checkForm = false;
        }
        if (!mess.equalsIgnoreCase("")) {
            XDialogHelper.alert(this, mess);
            checkForm = false;
        }
        return checkForm;
    }

    private void showNewPassword() {
        if (checkNewPassword) {
            txtPassword.setEchoChar('*');
            lblShowHide1.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkNewPassword = !checkNewPassword;
        } else {
            txtPassword.setEchoChar((char) 0);
            lblShowHide1.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkNewPassword = !checkNewPassword;
        }
    }

    private void showConfirmPassword() {
        if (checkConfirmPassword) {
            txtConfirmPassword.setEchoChar('*');
            lblShowHide2.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkConfirmPassword = !checkConfirmPassword;
        } else {
            txtConfirmPassword.setEchoChar((char) 0);
            lblShowHide2.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkConfirmPassword = !checkConfirmPassword;
        }
    }
}
