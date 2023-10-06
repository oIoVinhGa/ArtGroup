
package CustomSwing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ADMIN
 */
@SuppressWarnings("serial")
public class Table extends JTable {

    private TableCTHeader header;
    private TableCTCell cell;

    public Table() {
        header = new TableCTHeader();
        cell = new TableCTCell();
        getTableHeader().setDefaultRenderer(header);
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, cell);
        setRowHeight(30);
    }

    public void SetColumnAligment(int column, int align) {
        header.setAlignment(column, align);
    }

    public void setCellAligment(int column, int align) {
        cell.setAlignment(column, align);
    }

    public void setColumnWidth(int column, int width) {
        getColumnModel().getColumn(column).setPreferredWidth(width);
        getColumnModel().getColumn(column).setMinWidth(width);
        getColumnModel().getColumn(column).setMaxWidth(width);
        getColumnModel().getColumn(column).setMinWidth(10);
        getColumnModel().getColumn(column).setMaxWidth(10000);
    }

    private class TableCTHeader extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(new Color(11, 159, 194));
            com.setForeground(new Color(255, 255, 255));
            com.setFont(com.getFont().deriveFont(Font.BOLD, 18));
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.CENTER);
            }
            return com;
        }

    }

    private class TableCTCell extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (isCellSelected(row, column)) {
                if (row % 2 == 0) {
                    com.setBackground(new Color(73, 185, 238));
                } else {
                    com.setBackground(new Color(73, 185, 238));
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(new Color(188, 225, 211));
                } else {
                    com.setBackground(new Color(188, 225, 211));
                }
            }
            // Sét màu chữ trong bảng
            com.setForeground(new Color(82, 85, 78));
            com.setFont(new Font("Roboto", Font.PLAIN, 18));
            setBorder(new EmptyBorder(0, 5, 0, 5));
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.CENTER);
            }
            return com;
        }

    }

    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(30, 30, 30));
        scroll.getViewport().setOpaque(false);
//        scroll.setBorder(BorderFactory.createEmptyBorder());
    }
}
