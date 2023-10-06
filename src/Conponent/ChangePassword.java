package Conponent;

import DAO.EmployeeDAO;
import Helper.XDialogHelper;
import Utils.Auth;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class ChangePassword extends javax.swing.JPanel {

    private EmployeeDAO eDAO;
    private boolean checkOldPassword = false;
    private boolean checkNewPassword = false;
    private boolean checkConfirmPassword = false;
    private Color bgColorA = new Color(244, 208, 63);
    private Color bgColorB = new Color(22, 160, 133);

    public ChangePassword() {
        initComponents();
        this.setOpaque(false);
        eDAO = new EmployeeDAO();
        txtConfirmPassword.setEnabled(false);
    }

    public Color getBgColorA() {
        return bgColorA;
    }

    public void setBgColorA(Color bgColorA) {
        this.bgColorA = bgColorA;
    }

    public Color getBgColorB() {
        return bgColorB;
    }

    public void setBgColorB(Color bgColorB) {
        this.bgColorB = bgColorB;
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

        pnlFormTxt = new javax.swing.JPanel();
        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        pnlOldPassword = new javax.swing.JPanel();
        lblShow_HideOldPass = new javax.swing.JLabel();
        txtOldPassword = new CustomSwing.MyPasswordField();
        pnlNewPassword = new javax.swing.JPanel();
        lblShow_HideNewPass = new javax.swing.JLabel();
        txtNewPassword = new CustomSwing.MyPasswordField();
        pnlNewPassword1 = new javax.swing.JPanel();
        lblShow_HideConfirmPass = new javax.swing.JLabel();
        txtConfirmPassword = new CustomSwing.MyPasswordField();
        pnlButton = new javax.swing.JPanel();
        btnConfirm = new CustomSwing.MyButton();
        btnRefesh = new CustomSwing.MyButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(198, 210, 213));

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

        txtOldPassword.setHide("Nhập mật khẩu cũ của bạn");
        txtOldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldPasswordActionPerformed(evt);
            }
        });
        pnlOldPassword.add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 440, -1));

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

        javax.swing.GroupLayout pnlFormTxtLayout = new javax.swing.GroupLayout(pnlFormTxt);
        pnlFormTxt.setLayout(pnlFormTxtLayout);
        pnlFormTxtLayout.setHorizontalGroup(
            pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormTxtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormTxtLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormTxtLayout.createSequentialGroup()
                        .addGroup(pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOldPassword)
                            .addComponent(lblNewPassword)
                            .addComponent(lblConfirmPassword)
                            .addComponent(pnlOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlNewPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFormTxtLayout.setVerticalGroup(
            pnlFormTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormTxtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOldPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNewPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNewPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pnlButton.setOpaque(false);

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

        btnRefesh.setBackground(new java.awt.Color(129, 90, 156));
        btnRefesh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        btnRefesh.setText("Làm mới");
        btnRefesh.setCheckMouse(true);
        btnRefesh.setColor(new java.awt.Color(129, 90, 156));
        btnRefesh.setColorEntered(new java.awt.Color(165, 118, 197));
        btnRefesh.setColorHover(new java.awt.Color(255, 255, 255));
        btnRefesh.setColorNomal(new java.awt.Color(255, 255, 255));
        btnRefesh.setColorPressed(new java.awt.Color(116, 81, 140));
        btnRefesh.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnRefesh.setRadius(50);
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 103, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlFormTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(pnlFormTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        clearForm();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        handleChangePassword();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void lblShow_HideOldPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideOldPassMouseClicked
        showOldPassword();
    }//GEN-LAST:event_lblShow_HideOldPassMouseClicked

    private void txtOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldPasswordActionPerformed

    }//GEN-LAST:event_txtOldPasswordActionPerformed

    private void lblShow_HideNewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideNewPassMouseClicked
        showNewPassword();
    }//GEN-LAST:event_lblShow_HideNewPassMouseClicked

    private void lblShow_HideConfirmPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideConfirmPassMouseClicked
        showConfirmPassword();
    }//GEN-LAST:event_lblShow_HideConfirmPassMouseClicked

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        if (txtNewPassword.getText().equals("")) {
            txtConfirmPassword.setEnabled(false);
        } else {
            txtConfirmPassword.setEnabled(true);
        }
    }//GEN-LAST:event_txtNewPasswordKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.MyButton btnConfirm;
    private CustomSwing.MyButton btnRefesh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblShow_HideConfirmPass;
    private javax.swing.JLabel lblShow_HideNewPass;
    private javax.swing.JLabel lblShow_HideOldPass;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlFormTxt;
    private javax.swing.JPanel pnlNewPassword;
    private javax.swing.JPanel pnlNewPassword1;
    private javax.swing.JPanel pnlOldPassword;
    private CustomSwing.MyPasswordField txtConfirmPassword;
    private CustomSwing.MyPasswordField txtNewPassword;
    private CustomSwing.MyPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables

    public void clearForm() {
        txtOldPassword.setText("");
        txtNewPassword.setText("");
        txtConfirmPassword.setText("");
    }

    public void handleChangePassword() {
        String regexPass = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
        if (String.valueOf(txtOldPassword.getPassword()).equalsIgnoreCase("")
                || String.valueOf(txtNewPassword.getPassword()).equalsIgnoreCase("")
                || String.valueOf(txtConfirmPassword.getPassword()).equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, "Vui lòng nhập đầy đủ thông tin trước khi cập nhật lại mật khẩu !");
        } else {
            if (Auth.user.getPassword().equalsIgnoreCase(String.valueOf(txtOldPassword.getPassword()))) {
                if (String.valueOf(txtNewPassword.getPassword()).matches(regexPass)) {
                    if (String.valueOf(txtConfirmPassword.getPassword()).matches(String.valueOf(txtNewPassword.getPassword()))) {
                        eDAO.updatePasswordEmployee(Auth.user.getEmployeeID(),String.valueOf(txtNewPassword.getPassword()));
                        Auth.user.setPassword(String.valueOf(txtNewPassword.getPassword()));
                        XDialogHelper.alert(this, "Đổi mật khẩu thành công !");
                        clearForm();
                    } else {
                        XDialogHelper.alert(this, 0, "Nhập lại mật khẩu mới không khớp !");
                        txtConfirmPassword.requestFocus();
                    }
                } else {
                    XDialogHelper.alert(this, 0, "Mật khẩu phải từ 6 ký tự trở lên.\n Chứa ít nhất 1 chữ in hoa, 1 chữ in thường, 1 số và 1 ký tự đặc biệt !");
                    txtNewPassword.requestFocus();
                }
            } else {
                XDialogHelper.alert(this, 0, "Mật khẩu cũ không đúng !");
                txtOldPassword.requestFocus();
            }
        }
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
            txtOldPassword.setEchoChar('*');
            lblShow_HideOldPass.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkOldPassword = !checkOldPassword;
        } else {
            txtOldPassword.setEchoChar((char) 0);
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
