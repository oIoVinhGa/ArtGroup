package Conponent;

import DAO.EmployeeDAO;
import Entities.Employee;
import Helper.XDialogHelper;
import Model.Confirm;
import Model.TypeMessage;
import static Model.TypeMessage.TypeMessages;
import Utils.Auth;
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
public class ChangPassJPanel extends javax.swing.JDialog {

    private JFrame jf;
    private String employeeID;
    private String passwordOld;
    private boolean checkOldPassword = false;
    private boolean checkNewPassword = false;
    private boolean checkConfirmPassword = false;

    public ChangPassJPanel(java.awt.Frame parent, boolean modal, String employeeID, String passwordOld) {
        super(parent, modal);
        initComponents();
        this.employeeID = employeeID;
        this.passwordOld = passwordOld;
        this.jf = (JFrame) parent;
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlFormTxt = new javax.swing.JPanel();
        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        pnlOldPassword = new javax.swing.JPanel();
        lblShow_HideOldPass = new javax.swing.JLabel();
        txtPassword = new CustomSwing.MyPasswordField();
        pnlNewPassword = new javax.swing.JPanel();
        lblShow_HideNewPass = new javax.swing.JLabel();
        txtNewPassword = new CustomSwing.MyPasswordField();
        pnlNewPassword1 = new javax.swing.JPanel();
        lblShow_HideConfirmPass = new javax.swing.JLabel();
        txtConfirmPassword = new CustomSwing.MyPasswordField();
        btnConfirm = new CustomSwing.MyButton();
        btnExit = new CustomSwing.MyButton();
        lblAccount = new javax.swing.JLabel();
        txtAccount = new CustomSwing.MyTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CẬP NHẬT TÀI KHOẢN");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(292, 45));
        getContentPane().add(lblTitle, java.awt.BorderLayout.PAGE_START);

        pnlFormTxt.setOpaque(false);

        lblOldPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblOldPassword.setText("Mật khẩu cũ:");

        lblNewPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNewPassword.setText("Mật khẩu mới:");

        lblConfirmPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblConfirmPassword.setText("Xác nhận mật khẩu mới:");

        pnlOldPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShow_HideOldPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow_HideOldPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShow_HideOldPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShow_HideOldPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShow_HideOldPassMouseClicked(evt);
            }
        });
        pnlOldPassword.add(lblShow_HideOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 40));

        txtPassword.setHide("Nhập mật khẩu cũ của bạn");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlOldPassword.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 440, -1));

        pnlNewPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShow_HideNewPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow_HideNewPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShow_HideNewPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShow_HideNewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShow_HideNewPassMouseClicked(evt);
            }
        });
        pnlNewPassword.add(lblShow_HideNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 40));

        txtNewPassword.setHide("Tạo mật khẩu mới");
        txtNewPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNewPasswordMouseClicked(evt);
            }
        });
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        pnlNewPassword.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        pnlNewPassword1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShow_HideConfirmPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow_HideConfirmPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShow_HideConfirmPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShow_HideConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShow_HideConfirmPassMouseClicked(evt);
            }
        });
        pnlNewPassword1.add(lblShow_HideConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 40));

        txtConfirmPassword.setHide("Nhập mật khẩu mới của bạn vào đây");
        pnlNewPassword1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        btnConfirm.setBackground(new java.awt.Color(77, 48, 193));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/password.png"))); // NOI18N
        btnConfirm.setText("Xác nhận");
        btnConfirm.setColor(new java.awt.Color(77, 48, 193));
        btnConfirm.setColorEntered(new java.awt.Color(105, 89, 207));
        btnConfirm.setColorHover(new java.awt.Color(255, 255, 255));
        btnConfirm.setColorNomal(new java.awt.Color(255, 255, 255));
        btnConfirm.setColorPressed(new java.awt.Color(65, 40, 165));
        btnConfirm.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConfirm.setRadius(50);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(129, 90, 156));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        btnExit.setText("Hủy bỏ");
        btnExit.setCheckMouse(true);
        btnExit.setColor(new java.awt.Color(129, 90, 156));
        btnExit.setColorEntered(new java.awt.Color(165, 118, 197));
        btnExit.setColorHover(new java.awt.Color(255, 255, 255));
        btnExit.setColorNomal(new java.awt.Color(255, 255, 255));
        btnExit.setColorPressed(new java.awt.Color(116, 81, 140));
        btnExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnExit.setRadius(50);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblAccount.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAccount.setText("Tên tài khoản");

        txtAccount.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        txtAccount.setEnabled(false);
        txtAccount.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAccount.setHide("Tài khoản đăng nhập của nhân viên");

        javax.swing.GroupLayout pnlFormTxtLayout = new javax.swing.GroupLayout(pnlFormTxt);
        pnlFormTxt.setLayout(pnlFormTxtLayout);
        pnlFormTxtLayout.setHorizontalGroup(
            pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormTxtLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFormTxtLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOldPassword)
                            .addComponent(lblNewPassword)
                            .addComponent(lblConfirmPassword)
                            .addComponent(pnlOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlNewPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormTxtLayout.createSequentialGroup()
                        .addComponent(lblAccount)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlFormTxtLayout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        pnlFormTxtLayout.setVerticalGroup(
            pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormTxtLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOldPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNewPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfirmPassword)
                .addGap(18, 18, 18)
                .addComponent(pnlNewPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFormTxt, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblShow_HideOldPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideOldPassMouseClicked
        showOldPassword();
    }//GEN-LAST:event_lblShow_HideOldPassMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void lblShow_HideNewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideNewPassMouseClicked
        showNewPassword();
    }//GEN-LAST:event_lblShow_HideNewPassMouseClicked

    private void lblShow_HideConfirmPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideConfirmPassMouseClicked
        showConfirmPassword();
    }//GEN-LAST:event_lblShow_HideConfirmPassMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (isValidate()) {
            UpdateAccount();
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (new Confirm(jf, true, "Thông báo", "Bạn có muốn thoát ?", TypeMessages(TypeMessage.WARNING)).isOk()) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNewPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewPasswordMouseClicked

    }//GEN-LAST:event_txtNewPasswordMouseClicked

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        if (String.valueOf(txtPassword.getPassword()).length() >= 6) {
            txtConfirmPassword.setEnabled(true);
        }
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.MyButton btnConfirm;
    private CustomSwing.MyButton btnExit;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblShow_HideConfirmPass;
    private javax.swing.JLabel lblShow_HideNewPass;
    private javax.swing.JLabel lblShow_HideOldPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFormTxt;
    private javax.swing.JPanel pnlNewPassword;
    private javax.swing.JPanel pnlNewPassword1;
    private javax.swing.JPanel pnlOldPassword;
    private CustomSwing.MyTextField txtAccount;
    private CustomSwing.MyPasswordField txtConfirmPassword;
    private CustomSwing.MyPasswordField txtNewPassword;
    private CustomSwing.MyPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    EmployeeDAO elDAO = new EmployeeDAO();
    Employee employee;

    void init() {
        try {
            this.setLocationRelativeTo(jf);
            employee = elDAO.findByID(employeeID);
            setForm(employee);
            txtConfirmPassword.setEnabled(false);
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
    }

    void setForm(Employee e) {
        txtAccount.setText(e.getAccount());
    }

    Employee getForm() {
        Employee e = new Employee();
        e.setEmployeeID(employeeID);
        e.setAccount(txtAccount.getText());
        e.setPassword(String.valueOf(txtNewPassword.getPassword()));
        return e;
    }

    private void UpdateAccount() {
        Employee e = getForm();
        try {
            elDAO.insertAccount(e);
            if (Auth.user.getAccount().equalsIgnoreCase(txtAccount.getText())) {
                Auth.user.setPassword(String.valueOf(txtNewPassword.getPassword()));
            }
            XDialogHelper.alert(this, "Cập nhật Tài Khoản thành công !");
            this.dispose();
        } catch (Exception ex) {
            System.out.println(ex);
            XDialogHelper.alert(this, "Cập nhật Tài Khoản thất bại !");
        }
    }

    private boolean isValidate() {
        String regexPass = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$";

        if (String.valueOf(txtPassword.getPassword()).equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, "Bạn chưa nhập Mật Khẩu hiện tại !");
            txtPassword.requestFocus();
            return false;
        } else if (!String.valueOf(txtPassword.getPassword()).equalsIgnoreCase(passwordOld)) {
            XDialogHelper.alert(this, 0, "Mật Khẩu hiện tại bạn nhập không chính xác !");
            txtPassword.requestFocus();
            return false;
        } else if (String.valueOf(txtNewPassword.getPassword()).equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, "Bạn chưa nhập Mật Khẩu mới !");
            txtNewPassword.requestFocus();
            return false;
        } else if (!String.valueOf(txtNewPassword.getPassword()).matches(regexPass)) {
            XDialogHelper.alert(this, 0, "Mật Khẩu phải trên 6 kí tự, ít nhất 1 chữ thường, in hoa, kí tự đặc biệt !");
            txtNewPassword.requestFocus();
            return false;
        } else {
            if (String.valueOf(txtConfirmPassword.getPassword()).equalsIgnoreCase("")) {
                XDialogHelper.alert(this, 0, "Bạn chưa nhập xác nhận Mật Khẩu mới !");
                txtConfirmPassword.requestFocus();
                return false;
            } else {
                if (!String.valueOf(txtConfirmPassword.getPassword()).equalsIgnoreCase(String.valueOf(txtNewPassword.getPassword()))) {
                    XDialogHelper.alert(this, 0, "Xác nhận Mật Khẩu mới không chính xác !");
                    txtConfirmPassword.requestFocus();
                    return false;
                } else if (String.valueOf(txtPassword.getPassword()).equalsIgnoreCase(String.valueOf(txtNewPassword.getPassword()))) {
                    XDialogHelper.alert(this, 0, "Mật Khẩu mới không được trùng với Mật Khẩu cũ !");
                    txtConfirmPassword.requestFocus();
                    return false;
                }
            }
        }

        return true;
    }

    private void showNewPassword() {
        if (checkNewPassword) {
            txtNewPassword.setEchoChar('*');
            lblShow_HideNewPass.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkNewPassword = !checkNewPassword;
        } else {
            txtNewPassword.setEchoChar((char) 0);
            lblShow_HideNewPass.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkNewPassword = !checkNewPassword;
        }
    }

    private void showOldPassword() {
        if (checkOldPassword) {
            txtPassword.setEchoChar('*');
            lblShow_HideOldPass.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkOldPassword = !checkOldPassword;
        } else {
            txtPassword.setEchoChar((char) 0);
            lblShow_HideOldPass.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkOldPassword = !checkOldPassword;
        }
    }

    private void showConfirmPassword() {
        if (checkConfirmPassword) {
            txtConfirmPassword.setEchoChar('*');
            lblShow_HideConfirmPass.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkConfirmPassword = !checkConfirmPassword;
        } else {
            txtConfirmPassword.setEchoChar((char) 0);
            lblShow_HideConfirmPass.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkConfirmPassword = !checkConfirmPassword;
        }
    }
}
