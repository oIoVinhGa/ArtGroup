
package CustomSwing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
@SuppressWarnings("serial")
public class MyMenu extends JMenu {

    private boolean checkMouse;
    private Color color;
    private Color colorEntered;
    private Color colorPressed;
    private Color colorHover;
    private Color colorNomal;
    private Color backgroundColorActive;
    private Color textColorActive;

    public MyMenu() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        this.setColor(color);
        this.setFont(new Font("Roboto", Font.PLAIN, 18));
        colorEntered = new Color(107,124,150);
        colorPressed = new Color(205, 205, 205);
        colorHover = new Color(222,234,251);
        colorNomal = Color.BLACK;
        backgroundColorActive = new Color(90, 105, 127);
        textColorActive = Color.white;
        this.setContentAreaFilled(false);
        
    }

    public boolean isCheckMouse() {
        return checkMouse;
    }

    public void setCheckMouse(boolean checkMouse) {
        this.checkMouse = checkMouse;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColorEntered() {
        return colorEntered;
    }

    public void setColorEntered(Color colorEntered) {
        this.colorEntered = colorEntered;
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorHover() {
        return colorHover;
    }

    public void setColorHover(Color colorHover) {
        this.colorHover = colorHover;
    }

    public Color getColorNomal() {
        return colorNomal;
    }

    public void setColorNomal(Color colorNomal) {
        this.colorNomal = colorNomal;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(color);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintComponent(g);
    }
    
    
}
