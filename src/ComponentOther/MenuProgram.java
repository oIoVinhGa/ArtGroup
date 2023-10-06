package ComponentOther;

import CustomSwing.ScrollBarCustom;
import Model.Colors;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class MenuProgram extends javax.swing.JPanel {

    private boolean enableMenu = true;
    private boolean showMenu = true;
    private Color bgColorB = Colors.menuColor(Colors.RIGHT);
    private Color bgColorA = Colors.menuColor(Colors.LEFT);
    private Color bgActive = Colors.menuColor(Colors.ACTIVE);

    public MenuProgram() {
        initComponents();
        init();
        this.setOpaque(false);
    }

    private void init() {
        spMenu.getViewport().setOpaque(false);
        spMenu.setViewportBorder(BorderFactory.createEmptyBorder());
        spMenu.setVerticalScrollBar(new ScrollBarCustom());
        handleMouse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical, pnlhome);
    }

    public boolean isEnableMenu() {
        return enableMenu;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public boolean isShowMenu() {
        return showMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public Color getBgColorB() {
        return bgColorB;
    }

    public void setBgColorB(Color bgColorB) {
        this.bgColorB = bgColorB;
    }

    public Color getBgColorA() {
        return bgColorA;
    }

    public void setBgColorA(Color bgColorA) {
        this.bgColorA = bgColorA;
    }

    public JPanel getPnlLogout() {
        return pnlLogout;
    }

    public void setPnlLogout(JPanel pnlLogout) {
        this.pnlLogout = pnlLogout;
    }

    public JPanel getPnlChangePassword() {
        return pnlChangePassword;
    }

    public void setPnlChangePassword(JPanel pnlChangePassword) {
        this.pnlChangePassword = pnlChangePassword;
    }

    public JPanel getPnlContact() {
        return pnlContact;
    }

    public void setPnlContact(JPanel pnlContact) {
        this.pnlContact = pnlContact;
    }

    public JPanel getPnlEmployee() {
        return pnlEmployee;
    }

    public void setPnlEmployee(JPanel pnlEmployee) {
        this.pnlEmployee = pnlEmployee;
    }

    public JPanel getPnlExportBill() {
        return pnlExportBill;
    }

    public void setPnlExportBill(JPanel pnlExportBill) {
        this.pnlExportBill = pnlExportBill;
    }

    public JPanel getPnlGuide() {
        return pnlGuide;
    }

    public void setPnlGuide(JPanel pnlGuide) {
        this.pnlGuide = pnlGuide;
    }

    public JPanel getPnlImportBill() {
        return pnlImportBill;
    }

    public void setPnlImportBill(JPanel pnlImportBill) {
        this.pnlImportBill = pnlImportBill;
    }

    public JPanel getPnlProduct() {
        return pnlProduct;
    }

    public void setPnlProduct(JPanel pnlProduct) {
        this.pnlProduct = pnlProduct;
    }

    public JPanel getPnlProductType() {
        return pnlProductType;
    }

    public void setPnlProductType(JPanel pnlProductType) {
        this.pnlProductType = pnlProductType;
    }

    public JPanel getPnlStatistical() {
        return pnlStatistical;
    }

    public void setPnlStatistical(JPanel pnlStatistical) {
        this.pnlStatistical = pnlStatistical;
    }

    public JPanel getPnlSupplier() {
        return pnlSupplier;
    }

    public void setPnlSupplier(JPanel pnlSupplier) {
        this.pnlSupplier = pnlSupplier;
    }

    public JLabel getLblEmployee() {
        return lblEmployee;
    }

    public void setLblEmployee(JLabel lblEmployee) {
        this.lblEmployee = lblEmployee;
    }

    public HeaderMenu getPnlhome() {
        return pnlhome;
    }

    public void setPnlhome(HeaderMenu pnlhome) {
        this.pnlhome = pnlhome;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint paint = new GradientPaint(0, 0, bgColorA, getWidth(), 0, bgColorB);
        g2.setPaint(paint);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    private void handleMouse(JPanel... form) {
        for (JPanel jPanel : form) {
            JPanel p = jPanel;
            jPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseExited(MouseEvent e) {
                    p.setCursor(new Cursor(Cursor.MOVE_CURSOR));
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    p.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
            });
        }
    }

    private void setBackggroundFalse(JPanel... form) {
        for (JPanel jPanel : form) {
            jPanel.setOpaque(false);
            jPanel.setBackground(getBackground());
        }
    }

    private void setActiveMenu(JPanel panel) {
        panel.setBackground(bgActive);
        panel.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlhome = new ComponentOther.HeaderMenu();
        spMenu = new javax.swing.JScrollPane();
        pnlMenu = new javax.swing.JPanel();
        pnlImportBill = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlExportBill = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlProduct = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlProductType = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlSupplier = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlStatistical = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlEmployee = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        pnlChangePassword = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnlContact = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlGuide = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setOpaque(false);

        pnlhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlhomeMouseClicked(evt);
            }
        });

        spMenu.setBorder(null);
        spMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spMenu.setOpaque(false);
        spMenu.setVerticalScrollBar(new ScrollBarCustom(0));

        pnlMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlMenu.setOpaque(false);

        pnlImportBill.setOpaque(false);
        pnlImportBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlImportBillMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bill.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Quản Lý Hóa Đơn Nhập");

        javax.swing.GroupLayout pnlImportBillLayout = new javax.swing.GroupLayout(pnlImportBill);
        pnlImportBill.setLayout(pnlImportBillLayout);
        pnlImportBillLayout.setHorizontalGroup(
            pnlImportBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImportBillLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlImportBillLayout.setVerticalGroup(
            pnlImportBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImportBillLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlImportBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlExportBill.setOpaque(false);
        pnlExportBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExportBillMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/invoice.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Quản Lý Hóa Đơn Xuất");

        javax.swing.GroupLayout pnlExportBillLayout = new javax.swing.GroupLayout(pnlExportBill);
        pnlExportBill.setLayout(pnlExportBillLayout);
        pnlExportBillLayout.setHorizontalGroup(
            pnlExportBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExportBillLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlExportBillLayout.setVerticalGroup(
            pnlExportBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExportBillLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlExportBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlProduct.setOpaque(false);
        pnlProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProductMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/product.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Quản Lý Sản Phẩm");

        javax.swing.GroupLayout pnlProductLayout = new javax.swing.GroupLayout(pnlProduct);
        pnlProduct.setLayout(pnlProductLayout);
        pnlProductLayout.setHorizontalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProductLayout.setVerticalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlProductType.setOpaque(false);
        pnlProductType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProductTypeMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cubes.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Quản Lý Phân Loại");

        javax.swing.GroupLayout pnlProductTypeLayout = new javax.swing.GroupLayout(pnlProductType);
        pnlProductType.setLayout(pnlProductTypeLayout);
        pnlProductTypeLayout.setHorizontalGroup(
            pnlProductTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductTypeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProductTypeLayout.setVerticalGroup(
            pnlProductTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductTypeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlProductTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlSupplier.setOpaque(false);
        pnlSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSupplierMouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/supplier.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Quản Lý Nhà Cung Cấp");

        javax.swing.GroupLayout pnlSupplierLayout = new javax.swing.GroupLayout(pnlSupplier);
        pnlSupplier.setLayout(pnlSupplierLayout);
        pnlSupplierLayout.setHorizontalGroup(
            pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSupplierLayout.setVerticalGroup(
            pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlStatistical.setOpaque(false);
        pnlStatistical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlStatisticalMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/analysis.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Tổng Hợp - Thống Kê");

        javax.swing.GroupLayout pnlStatisticalLayout = new javax.swing.GroupLayout(pnlStatistical);
        pnlStatistical.setLayout(pnlStatisticalLayout);
        pnlStatisticalLayout.setHorizontalGroup(
            pnlStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisticalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStatisticalLayout.setVerticalGroup(
            pnlStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatisticalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlEmployee.setOpaque(false);
        pnlEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEmployeeMouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/achievement.png"))); // NOI18N

        lblEmployee.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblEmployee.setText("Quản Ký Nhân Viên");

        javax.swing.GroupLayout pnlEmployeeLayout = new javax.swing.GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(24, 24, 24)
                .addComponent(lblEmployee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlChangePassword.setOpaque(false);
        pnlChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlChangePasswordMouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/forgot.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout pnlChangePasswordLayout = new javax.swing.GroupLayout(pnlChangePassword);
        pnlChangePassword.setLayout(pnlChangePasswordLayout);
        pnlChangePasswordLayout.setHorizontalGroup(
            pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChangePasswordLayout.setVerticalGroup(
            pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlContact.setOpaque(false);
        pnlContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlContactMouseClicked(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/message.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setText("Liên Hệ");

        javax.swing.GroupLayout pnlContactLayout = new javax.swing.GroupLayout(pnlContact);
        pnlContact.setLayout(pnlContactLayout);
        pnlContactLayout.setHorizontalGroup(
            pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(24, 24, 24)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContactLayout.setVerticalGroup(
            pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlGuide.setOpaque(false);
        pnlGuide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGuideMouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/information.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setText("Hướng Dẫn Sử Dụng");

        javax.swing.GroupLayout pnlGuideLayout = new javax.swing.GroupLayout(pnlGuide);
        pnlGuide.setLayout(pnlGuideLayout);
        pnlGuideLayout.setHorizontalGroup(
            pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuideLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(24, 24, 24)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGuideLayout.setVerticalGroup(
            pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuideLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnlLogout.setOpaque(false);
        pnlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseClicked(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout (1).png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel22.setText("Đăng Xuất");

        javax.swing.GroupLayout pnlLogoutLayout = new javax.swing.GroupLayout(pnlLogout);
        pnlLogout.setLayout(pnlLogoutLayout);
        pnlLogoutLayout.setHorizontalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogoutLayout.setVerticalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGuide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChangePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStatistical, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProductType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlExportBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlImportBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlImportBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlExportBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlGuide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        spMenu.setViewportView(pnlMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlhome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlhome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlImportBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImportBillMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlImportBill);

    }//GEN-LAST:event_pnlImportBillMouseClicked

    private void pnlExportBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExportBillMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlExportBill);
    }//GEN-LAST:event_pnlExportBillMouseClicked

    private void pnlProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProductMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlProduct);
    }//GEN-LAST:event_pnlProductMouseClicked

    private void pnlProductTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProductTypeMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlProductType);
    }//GEN-LAST:event_pnlProductTypeMouseClicked

    private void pnlSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSupplierMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlSupplier);
    }//GEN-LAST:event_pnlSupplierMouseClicked

    private void pnlStatisticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStatisticalMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlStatistical);
    }//GEN-LAST:event_pnlStatisticalMouseClicked

    private void pnlEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEmployeeMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlEmployee);
    }//GEN-LAST:event_pnlEmployeeMouseClicked

    private void pnlChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlChangePasswordMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlChangePassword);
    }//GEN-LAST:event_pnlChangePasswordMouseClicked

    private void pnlContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlContactMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
        setActiveMenu(pnlContact);
    }//GEN-LAST:event_pnlContactMouseClicked

    private void pnlGuideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGuideMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
//        setActiveMenu(pnlGuide);
    }//GEN-LAST:event_pnlGuideMouseClicked

    private void pnlLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
//        setActiveMenu(pnlLogout);

    }//GEN-LAST:event_pnlLogoutMouseClicked

    private void pnlhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlhomeMouseClicked
        setBackggroundFalse(pnlChangePassword, pnlContact, pnlEmployee, pnlExportBill, pnlGuide, pnlImportBill, pnlLogout, pnlProduct, pnlProductType, pnlSupplier, pnlStatistical);
    }//GEN-LAST:event_pnlhomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JPanel pnlChangePassword;
    private javax.swing.JPanel pnlContact;
    private javax.swing.JPanel pnlEmployee;
    private javax.swing.JPanel pnlExportBill;
    private javax.swing.JPanel pnlGuide;
    private javax.swing.JPanel pnlImportBill;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlProduct;
    private javax.swing.JPanel pnlProductType;
    private javax.swing.JPanel pnlStatistical;
    private javax.swing.JPanel pnlSupplier;
    private ComponentOther.HeaderMenu pnlhome;
    private javax.swing.JScrollPane spMenu;
    // End of variables declaration//GEN-END:variables
}
