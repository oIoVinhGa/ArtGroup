/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ComponentOther;

import CustomSwing.MyPasswordField;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class RequestPassword extends javax.swing.JDialog {

    private boolean checkShowPassword = false;
    private boolean checkShowConfirmPassword = false;

    public RequestPassword(java.awt.Frame parent, boolean modal, ActionListener acChangePassword) {
        super(parent, modal);
        initComponents();
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        btnConfirm.addActionListener(acChangePassword);
    }

    public MyPasswordField getTxtConfirmNewPassword() {
        return txtConfirmNewPassword;
    }

    public void setTxtConfirmNewPassword(MyPasswordField txtConfirmNewPassword) {
        this.txtConfirmNewPassword = txtConfirmNewPassword;
    }

    public MyPasswordField getTxtNewPassword() {
        return txtNewPassword;
    }

    public void setTxtNewPassword(MyPasswordField txtNewPassword) {
        this.txtNewPassword = txtNewPassword;
    }

    private void showPassword() {
        if (checkShowPassword) {
            txtNewPassword.setEchoChar('*');
            lblShow_HideNewPass.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkShowPassword = !checkShowPassword;
        } else {
            txtNewPassword.setEchoChar((char) 0);
            lblShow_HideNewPass.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkShowPassword = !checkShowPassword;
        }
    }

    private void showConfirmPassword() {
        if (checkShowConfirmPassword) {
            txtConfirmNewPassword.setEchoChar('*');
            lblShow_HideNewConfirmPass.setIcon(new ImageIcon("src\\Image\\view.png"));
            checkShowConfirmPassword = !checkShowConfirmPassword;
        } else {
            txtConfirmNewPassword.setEchoChar((char) 0);
            lblShow_HideNewConfirmPass.setIcon(new ImageIcon("src\\Image\\nonView.png"));
            checkShowConfirmPassword = !checkShowConfirmPassword;
        }
    }
    
//    private boolean validateForm(){
//        if(){
//            
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myLable2 = new CustomSwing.MyLable();
        pnlPassword = new javax.swing.JPanel();
        lblShow_HideNewPass = new javax.swing.JLabel();
        txtNewPassword = new CustomSwing.MyPasswordField();
        myLable3 = new CustomSwing.MyLable();
        pnlPassword1 = new javax.swing.JPanel();
        lblShow_HideNewConfirmPass = new javax.swing.JLabel();
        txtConfirmNewPassword = new CustomSwing.MyPasswordField();
        btnCancel = new CustomSwing.MyButton();
        btnConfirm = new CustomSwing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        myLable2.setText("Mật khẩu mới");

        pnlPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShow_HideNewPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow_HideNewPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShow_HideNewPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShow_HideNewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShow_HideNewPassMouseClicked(evt);
            }
        });
        pnlPassword.add(lblShow_HideNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 40));

        txtNewPassword.setHide("Nhập mật khẩu mới");
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        pnlPassword.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        myLable3.setText("Nhập lại mật khẩu mới");

        pnlPassword1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShow_HideNewConfirmPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShow_HideNewConfirmPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        lblShow_HideNewConfirmPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShow_HideNewConfirmPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShow_HideNewConfirmPassMouseClicked(evt);
            }
        });
        pnlPassword1.add(lblShow_HideNewConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 40));

        txtConfirmNewPassword.setHide("Nhập mật khẩu mới");
        txtConfirmNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmNewPasswordActionPerformed(evt);
            }
        });
        pnlPassword1.add(txtConfirmNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        btnCancel.setBackground(new java.awt.Color(235, 95, 95));
        btnCancel.setText("Hủy bỏ");
        btnCancel.setColor(new java.awt.Color(235, 95, 95));
        btnCancel.setColorEntered(new java.awt.Color(255, 204, 204));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(66, 103, 178));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Xác nhận");
        btnConfirm.setColor(new java.awt.Color(66, 103, 178));
        btnConfirm.setColorEntered(new java.awt.Color(153, 153, 255));
        btnConfirm.setColorNomal(new java.awt.Color(255, 255, 255));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(myLable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myLable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myLable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myLable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblShow_HideNewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideNewPassMouseClicked
        showPassword();
    }//GEN-LAST:event_lblShow_HideNewPassMouseClicked

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void lblShow_HideNewConfirmPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShow_HideNewConfirmPassMouseClicked
        showConfirmPassword();
    }//GEN-LAST:event_lblShow_HideNewConfirmPassMouseClicked

    private void txtConfirmNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmNewPasswordActionPerformed
        
    }//GEN-LAST:event_txtConfirmNewPasswordActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.MyButton btnCancel;
    private CustomSwing.MyButton btnConfirm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblShow_HideNewConfirmPass;
    private javax.swing.JLabel lblShow_HideNewPass;
    private CustomSwing.MyLable myLable2;
    private CustomSwing.MyLable myLable3;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlPassword1;
    private CustomSwing.MyPasswordField txtConfirmNewPassword;
    private CustomSwing.MyPasswordField txtNewPassword;
    // End of variables declaration//GEN-END:variables
}
