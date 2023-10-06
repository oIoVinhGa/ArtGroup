package Conponent;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author daipt
 */
@SuppressWarnings("serial")
public final class ContactUI extends javax.swing.JPanel {

    private Color bgColorA = new Color(244, 208, 63);
    private Color bgColorB = new Color(22, 160, 133);

    public ContactUI() {
        initComponents();
        Run();
        this.setVisible(true);
        this.setOpaque(false);
    }

    public void Run() {
//        Thread threadl = new Thread() {
//            @Override
//            @SuppressWarnings("SleepWhileInLoop")
//            public void run() {
//                String txt = " " + lblTitle.getText() + " ";
//                while (true) {
//                    txt = txt.charAt(txt.length() - 1) + txt.substring(0, txt.length() - 1);
//                    try {
//                        sleep(1000);
//
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ContactUI.class
//                                .getName()).log(Level.SEVERE, null, ex);
//                    }
//                    lblTitle.setText(txt);
//                }
//            }
//
//        };
//        threadl.start();
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

        jLabel13 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        pnlInfor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setLayout(new java.awt.BorderLayout());

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(66, 103, 178));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("THÔNG TIN LIÊN HỆ ");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTitle.setPreferredSize(new java.awt.Dimension(263, 45));
        add(lblTitle, java.awt.BorderLayout.PAGE_START);

        pnlContainer.setOpaque(false);

        pnlInfor.setOpaque(false);
        pnlInfor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-address-32.png"))); // NOI18N
        jLabel3.setText("Địa chỉ:");
        pnlInfor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gmail-logo-32.png"))); // NOI18N
        jLabel4.setText("Email: artgroup@gmail.com");
        pnlInfor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/phone-32.png"))); // NOI18N
        jLabel5.setText("Số điện thoại: (024) 7300 1955");
        pnlInfor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Toà nhà FPT Polytechnic, đường số 22, phường Thường Thạnh, quận Cái Răng, TP Cần Thơ");
        pnlInfor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clock-32.png"))); // NOI18N
        jLabel7.setText("THỜI GIAN HOẠT ĐỘNG");
        pnlInfor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wheat-32.png"))); // NOI18N
        jLabel2.setText("Quý khách có bất kỳ thắc mắc nào xin vui lòng liên hệ với chúng tôi theo thông tin dưới đây.");
        pnlInfor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("8:00 - 12:00 và 13:00 - 17:00");
        pnlInfor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Làm việc từ Thứ 2 đến Chủ nhật");
        pnlInfor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Chúng tôi sẽ phản hồi lại Quý khách trong thời gian sớm nhất. ");
        pnlInfor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 21)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unit-32.png"))); // NOI18N
        jLabel11.setText("Đơn vị vận hành:");
        pnlInfor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel12.setText("Cửa hàng vật tư nông nghiệp ARTGROUP");
        pnlInfor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(pnlInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInfor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        add(pnlContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlInfor;
    // End of variables declaration//GEN-END:variables

}
