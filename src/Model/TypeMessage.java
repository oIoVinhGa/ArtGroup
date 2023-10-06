
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author LinhptPC04737
 */
public enum TypeMessage {
    ERROR, WARNING, OK;

    public static ImageIcon TypeMessages(TypeMessage type) {
        ImageIcon icon = new ImageIcon("src/Image/error.png");
        switch (type) {
            case ERROR -> icon = new ImageIcon("src/Image/error.png");
            case WARNING -> icon = new ImageIcon("src/Image/warning.png");
            case OK -> icon = new ImageIcon("src/Image/check-mark.png");
            default -> throw new AssertionError();
        }
        return icon;
    }
}
