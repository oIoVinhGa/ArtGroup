package ComponentOther;

import CustomSwing.MyButton;
import CustomSwing.MyLable;
import Helper.XShareHelper;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
@SuppressWarnings("serial")
public class HeaderComponent extends javax.swing.JPanel {

    private Color bgColorB = new Color(193, 218, 191);
    private Color bgColorA = new Color(193, 218, 191);

    public HeaderComponent() {
        initComponents();
        this.setOpaque(false);
        lblAvatar.setSize(50, 50);
        lblAvatar.setIcon(XShareHelper.scaledImage("Username.png", lblAvatar));
    }

    public void addMenuEvent(ActionListener event) {
        btnMenu.addActionListener(event);
    }

    public JLabel getLblAvatar() {
        return lblAvatar;
    }

    public void setLblAvatar(JLabel lblAvatar) {
        this.lblAvatar = (MyLable) lblAvatar;
    }

    public MyButton getBtnMiniSize() {
        return btnMiniSize;
    }

    public void setBtnMiniSize(MyButton btnMiniSize) {
        this.btnMiniSize = btnMiniSize;
    }

    public JLabel getLblFullName() {
        return lblFullName;
    }

    public void setLblFullName(MyLable lblFullName) {
        this.lblFullName = lblFullName;
    }

    public JLabel getLblRole() {
        return lblRole;
    }

    public void setLblRole(MyLable lblRole) {
        this.lblRole = lblRole;
    }

    public MyButton getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(MyButton btnExit) {
        this.btnExit = btnExit;
    }

    public MyButton getBtnFullScreen() {
        return btnFullScreen;
    }

    public void setBtnFullScreen(MyButton btnFullScreen) {
        this.btnFullScreen = btnFullScreen;
    }

    public MyButton getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(MyButton btnMenu) {
        this.btnMenu = btnMenu;
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

        jPanel4 = new javax.swing.JPanel();
        btnMiniSize = new CustomSwing.MyButton();
        btnFullScreen = new CustomSwing.MyButton();
        btnExit = new CustomSwing.MyButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAvatar = new CustomSwing.MyLable();
        btnMenu = new CustomSwing.MyButton();
        lblFullName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        jPanel4.setOpaque(false);

        btnMiniSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minus.png"))); // NOI18N
        btnMiniSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniSizeActionPerformed(evt);
            }
        });

        btnFullScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/expand.png"))); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnMiniSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFullScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMiniSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFullScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel1.setOpaque(false);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        lblAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvatar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblAvatar.setMinimumSize(new java.awt.Dimension(50, 50));
        lblAvatar.setPreferredSize(new java.awt.Dimension(50, 50));
        lblAvatar.setRadius(100);
        jPanel2.add(lblAvatar, java.awt.BorderLayout.PAGE_END);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menu.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblFullName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(23, 4, 147));
        lblFullName.setText("...");

        lblRole.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblRole.setForeground(new java.awt.Color(10, 110, 59));
        lblRole.setText("Vai trò");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblRole)
                .addGap(18, 18, 18)
                .addComponent(lblFullName)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRole)
                            .addComponent(lblFullName)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMiniSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiniSizeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomSwing.MyButton btnExit;
    private CustomSwing.MyButton btnFullScreen;
    private CustomSwing.MyButton btnMenu;
    private CustomSwing.MyButton btnMiniSize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private CustomSwing.MyLable lblAvatar;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblRole;
    // End of variables declaration//GEN-END:variables
}
