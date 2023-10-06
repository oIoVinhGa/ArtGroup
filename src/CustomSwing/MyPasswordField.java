
package CustomSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
public class MyPasswordField extends JPasswordField{
    private int radius;
    private String hide = "Mật khẩu";
    private Color boderColor;
    private Color color ;
    private Color bgColor = new Color(255, 255, 255);

    public MyPasswordField() {
        color = new Color(237, 247, 242);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(10,10,10,10));
        this.setFont(new Font("Roboto", Font.PLAIN, 18));
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                boderColor = color;
                super.focusGained(e);
            }

            @Override
            public void focusLost(FocusEvent e) {
                boderColor = bgColor;
                super.focusLost(e);
            }
        });
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(new Color(237, 247, 242));
        g2.setBackground(boderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(g);
    }

    /**
     * Thiết lập nội dung ẩn trong ô nhập liệu
     * @param g 
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(bgColor);
        if(String.valueOf(this.getPassword()).length()==0){
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
            Insets insets = getInsets();
            FontMetrics fm = g.getFontMetrics();
            
            g.setColor(Color.GRAY);
            g.drawString(hide, insets.left, getHeight()/2 + fm.getAscent()/2 - 2);
        }
    }
    
    
    
}
