package Model;

import java.awt.Color;

/**
 *
 * @author LinhptPC04737
 */
public enum Colors {
    LEFT, RIGHT, ACTIVE;

    public static Color homeColor(Colors type) {
        Color c;
        switch (type) {
            case LEFT -> {
                c = new Color(140, 188, 103);
            }
            case RIGHT -> {
                c = new Color(202, 228, 182);
            }
            default -> {
                c = new Color(255, 255, 255);
            }
        }
        return c;
    }

    public static Color menuColor(Colors type) {
        Color c = new Color(255, 255, 255);
        switch (type) {
            case LEFT -> {
                c = new Color(240, 255, 66);
//                c = new Color(55, 146, 55);
            }
            case RIGHT -> {
                c = new Color(122, 175, 28);
            }
            case ACTIVE -> {
                c = new Color(55, 146, 55);
            }
        }
        return c;
    }

}
