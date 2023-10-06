
package CustomSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
public class MyCombobox extends JComboBox<Object>{
    private final int radius=0;

    public MyCombobox() {
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setFont(new Font("Roboto", Font.PLAIN, 18));
    }

    
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(new Color(237, 247, 242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(g);
    }
    
    
}
