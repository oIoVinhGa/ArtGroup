package CustomSwing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

@SuppressWarnings("serial")
public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(94, 139, 231));
        setUnitIncrement(20);
        setOpaque(false);
    }
    public ScrollBarCustom(int width) {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(width, width));
        setForeground(new Color(94, 139, 231));
        setUnitIncrement(20);
        setOpaque(false);
    }
}
