package ComponentOther;

import java.awt.BorderLayout;
import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
@SuppressWarnings("serial")
public class RevenueChart extends javax.swing.JPanel {

    public RevenueChart(JTable table) {
        initComponents();
        init(table);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void init(JTable table) {
        this.setSize(960, 600);
        ChartPanel chartPanel = new ChartPanel(createChart(table));
        this.add(chartPanel, BorderLayout.CENTER);
    }

    public JFreeChart createChart(JTable table) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "BIỂU ĐỒ THỐNG KÊ SỐ LƯỢNG SẢN PHẨM",
                "Hóa Đơn Và Doanh Thu", "số lượng hóa đơn/tổng tiền (Đơn vị: 1.000.000 VNĐ)",
                createDataset(table), PlotOrientation.VERTICAL, true, true, true);
        return barChart;
    }

    private CategoryDataset createDataset(JTable table) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < table.getRowCount(); i++) {
            Double totalIb = Double.valueOf(String.valueOf(table.getValueAt(i, 1)));
            Double totaleb = Double.valueOf(String.valueOf(table.getValueAt(i, 8)));
            Double ib = Double.parseDouble(String.valueOf(table.getValueAt(i, 5)))/1000000;
            Double eb = Double.parseDouble(String.valueOf(table.getValueAt(i, 9)))/1000000;
            dataset.addValue(totalIb, "Hóa đơn nhập", (Comparable) String.valueOf(table.getValueAt(i, 0)));
            dataset.addValue(totaleb, "Hóa đơn xuất", (Comparable) String.valueOf(table.getValueAt(i, 0)));
            dataset.addValue(ib, "Tổng tiền nhập", (Comparable) String.valueOf(table.getValueAt(i, 0)));
            dataset.addValue(eb, "Tổng tiền xuất", (Comparable) String.valueOf(table.getValueAt(i, 0)));
        }
        return dataset;
    }

}
