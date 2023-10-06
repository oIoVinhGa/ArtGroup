
package ComponentOther;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class Login_ForgetPassword extends javax.swing.JPanel {

    private ForgetPassword forgetPassword;
    private LoginJPanel login;

    public Login_ForgetPassword(ActionListener acSendCode,ActionListener acGetPass, ActionListener acLogin, ActionListener acCancel, KeyListener keyLogin) {
        initComponents();
        this.setVisible(false);
        forgetPassword = new ForgetPassword(acSendCode, acGetPass, acCancel);
        login = new LoginJPanel(acLogin, acCancel, keyLogin);
        init();
    }

    public ForgetPassword getForgetPassword() {
        return forgetPassword;
    }

    public void setForgetPassword(ForgetPassword forgetPassword) {
        this.forgetPassword = forgetPassword;
    }

    public LoginJPanel getLogin() {
        return login;
    }

    public void setLogin(LoginJPanel login) {
        this.login = login;
    }

    private void init() {
        changeForm(false);
        login.getLblForgetPassword().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeForm(true);
            }
        });
        forgetPassword.getLblLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeForm(false);
            }
        });

    }

    public void changeForm(boolean isTrueForm) {
        if (isTrueForm) {
            login.setVisible(!isTrueForm);
            pnlContainer.remove(login);
            pnlContainer.add(forgetPassword, BorderLayout.CENTER);
            forgetPassword.setVisible(isTrueForm);

        } else {
            forgetPassword.setVisible(isTrueForm);
            pnlContainer.remove(forgetPassword);
            pnlContainer.add(login, BorderLayout.CENTER);
            login.setVisible(!isTrueForm);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 51));
        setLayout(new java.awt.BorderLayout());

        pnlLogo.setOpaque(false);
        pnlLogo.setPreferredSize(new java.awt.Dimension(600, 580));
        pnlLogo.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 191, 99));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoLogin.gif"))); // NOI18N
        jLabel1.setOpaque(true);
        pnlLogo.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(pnlLogo, java.awt.BorderLayout.LINE_START);

        pnlContainer.setLayout(new java.awt.BorderLayout());
        add(pnlContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLogo;
    // End of variables declaration//GEN-END:variables
}
