package ComponentOther;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class Home extends javax.swing.JPanel {

    
    public Home(int w, int h) {
        initComponents();
        this.setVisible(false);
    }

    public JLabel getLblBackground() {
        return lblBackground;
    }

    public void setLblBackground(JLabel lblBackground) {
        this.lblBackground = lblBackground;
    }

    public void showForm(JPanel form){
        this.removeAll();
        this.add(form);
        this.repaint();
        this.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBackground = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(854, 480));
        setPreferredSize(new java.awt.Dimension(854, 480));
        setLayout(new java.awt.BorderLayout());

        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblBackground, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
