package ComponentOther;

import CustomSwing.MyButton;
import CustomSwing.ScrollBarCustom;
import Entities.Employee;
import Helper.Model_Message;
import Helper.Service_Mail;
import Helper.XDialogHelper;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class Contact extends javax.swing.JPanel {

    public Contact() {
        initComponents();
    }

    public MyButton getBtnSend() {
        return myButton1;
    }

    public void setBtnSend(MyButton btnSend) {
        this.myButton1 = btnSend;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myLable1 = new CustomSwing.MyLable();
        jPanel2 = new javax.swing.JPanel();
        myLable2 = new CustomSwing.MyLable();
        txtFullname = new CustomSwing.MyTextField();
        txtEmail = new CustomSwing.MyTextField();
        myLable3 = new CustomSwing.MyLable();
        myLable4 = new CustomSwing.MyLable();
        txtTitle = new CustomSwing.MyTextField();
        myLable5 = new CustomSwing.MyLable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();
        myButton1 = new CustomSwing.MyButton();

        myLable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myLable1.setText("LIÊN HỆ VỚI CHÚNG TÔI");
        myLable1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N

        myLable2.setText("Họ và tên");

        txtFullname.setHide("Nhập họ và tên của bạn");
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        txtEmail.setHide("Nhập email của bạn");

        myLable3.setText("Email");

        myLable4.setText("Tiêu đề");

        txtTitle.setHide("Bạn đang thắc mắc nội dung gì?");

        myLable5.setText("Nội dung");

        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());

        txtContent.setColumns(20);
        txtContent.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtContent.setRows(5);
        jScrollPane1.setViewportView(txtContent);

        myButton1.setBackground(new java.awt.Color(66, 103, 178));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/send.png"))); // NOI18N
        myButton1.setText("Gửi ngay");
        myButton1.setColor(new java.awt.Color(66, 103, 178));
        myButton1.setColorEntered(new java.awt.Color(63, 129, 232));
        myButton1.setColorHover(new java.awt.Color(255, 255, 255));
        myButton1.setColorNomal(new java.awt.Color(255, 255, 255));
        myButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        myButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        myButton1.setMargin(new java.awt.Insets(2, 14, 6, 24));
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myLable2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                            .addComponent(myLable3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myLable4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myLable5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myLable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myLable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myLable4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myLable5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myLable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1ActionPerformed

     private void sendMain(Employee e) {
        new Thread(() -> {
            System.out.println(txtEmail.getText());
            Model_Message ms = new Service_Mail().sendMain(txtEmail.getText(), String.valueOf(txtFullname));
            System.out.println(ms.isSuccess());
            if (ms.isSuccess()) {
//                loading.setVisible(false);
            }
        }).start();
    }
    public boolean validateForm(JTextArea content, JTextField... txtForm) {
        boolean checkForm = true;
        String regexEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String[] errorMessages = {"Bạn phải điền đầy đủ thông tin !\n", "Email không hợp lệ (user@domain.com)!"};
        String message = "";
        for (JTextField txt : txtForm) {
            if (txt.getText().trim().equalsIgnoreCase("")) {
                message += errorMessages[0];
                txt.requestFocus();
            }
        }
        if (message.equalsIgnoreCase("")) {
            if (!txtEmail.getText().matches(regexEmail)) {
                message += errorMessages[1];
                txtEmail.requestFocus();
            }
        }
        if (!message.equalsIgnoreCase("")) {
            XDialogHelper.alert(this, 0, message);
            checkForm = false;
        }
        return checkForm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomSwing.MyButton myButton1;
    private CustomSwing.MyLable myLable1;
    private CustomSwing.MyLable myLable2;
    private CustomSwing.MyLable myLable3;
    private CustomSwing.MyLable myLable4;
    private CustomSwing.MyLable myLable5;
    private javax.swing.JTextArea txtContent;
    private CustomSwing.MyTextField txtEmail;
    private CustomSwing.MyTextField txtFullname;
    private CustomSwing.MyTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
