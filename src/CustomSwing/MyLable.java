 
package CustomSwing;

import Helper.XShareHelper;
import static Helper.XShareHelper.readLogo;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
public class MyLable extends JLabel{

    private int radius = 0;
    
    public MyLable() {
        this.setFont(new Font("Roboto", Font.PLAIN, 18));

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
//        g2.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, radius, radius);

//        g2.setFont(new Font("roboto", Font.PLAIN, 18));
        super.paintComponent(g);
    }
}
