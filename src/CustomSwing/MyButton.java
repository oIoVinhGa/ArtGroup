package CustomSwing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
public class MyButton extends JButton {

    private boolean checkMouse;
    private Color color;
    private Color colorEntered;
    private Color colorPressed;
    private Color colorBordered;
    private Color colorHover;
    private Color colorNomal;
    private int radius = 0;
    private boolean status;

    public MyButton() {
        status = this.isEnabled();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setFont(new Font("Roboto", Font.PLAIN, 18));
        color = this.getBackground();
        this.setBackground(color);
        colorEntered = new Color(189, 198, 212);
        colorPressed = new Color(205, 205, 205);
        colorBordered = new Color(227, 227, 227);
        colorHover = new Color(29, 78, 154);
        colorNomal = Color.BLACK;
        this.setContentAreaFilled(false);
        if (status) {
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseExited(MouseEvent e) {

                    setCursor(new Cursor(Cursor.MOVE_CURSOR));
                    setForeground(getColorNomal());
                    setBackground(getColor());
                    checkMouse = false;
                }
//            

                @Override
                public void mouseEntered(MouseEvent e) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                    setForeground(getColorHover());
                    setBackground(getColorEntered());
                    checkMouse = true;
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    setBackground(getColorPressed());
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (checkMouse) {
                        setBackground(getColorEntered());
                        setForeground(getColorHover());
                    } else {
                        setBackground(getColor());
                        setForeground(getColorNomal());
                    }
                }
            });
        } else {
            this.setEnabled(status);
        }
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

    public Color getColorBordered() {
        return colorBordered;
    }

    public void setColorBordered(Color colorBordered) {
        this.colorBordered = colorBordered;
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

        g2.setColor(colorBordered);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
//        g2.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, radius, radius);

//        g2.setFont(new Font("roboto", Font.PLAIN, 18));
        super.paintComponent(g);
    }

}
