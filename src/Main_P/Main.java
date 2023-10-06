package Main_P;

import ComponentOther.ForgetPassword;
import ComponentOther.HelloJPanel;
import ComponentOther.LoadingForgetPassword;
import ComponentOther.LoginJPanel;
import ComponentOther.Login_ForgetPassword;
import ComponentOther.Main_program;
import ComponentOther.RequestPassword;
import Conponent.ChangePassword;
import Conponent.ContactUI;
import Conponent.EmployeeUI;
import Conponent.ExportBillUI;
import Conponent.ImportBillUI;
import Conponent.InforPerson;
import Conponent.ProductTypeUI;
import Conponent.ProductUI;
import Conponent.StatiStical;
import Conponent.SupplierUI;
import DAO.EmployeeDAO;
import Entities.Employee;
import Helper.Model_Message;
import Helper.Service_Mail;
import Helper.XDialogHelper;
import Helper.XShareHelper;
import Model.Confirm;
import Model.TypeMessage;
import static Model.TypeMessage.TypeMessages;
import Utils.Auth;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author LinhptPC04737
 */
@SuppressWarnings("serial")
public class Main extends javax.swing.JFrame {

    HelloJPanel hello;
    Login_ForgetPassword login_forget;
    private Timer timer;
    Thread thread2;
    Thread thread1;
    private ForgetPassword forgetPassword;
    private LoginJPanel login;
    private LoadingForgetPassword loading;
    private EmployeeDAO eDAO;
    private MigLayout layout;
    private ActionListener acSendCode;
    private ActionListener acGetCode;
    private ActionListener acChangePassword;
    private ActionListener acLogin;
    private ActionListener acResize;
    private ActionListener acMiniSize;
    private ActionListener acCancel;

    private MouseListener mlLogout;
    private MouseListener mlGuide;
    private MouseListener mlStatistical;
    private MouseListener mlChangePassword;
    private MouseListener mlEmployee;
    private MouseListener mlSupplier;
    private MouseListener mlImportBill;
    private MouseListener mlProduct;
    private MouseListener mlProductType;
    private MouseListener mlExportBill;
    private MouseListener mlHome;
    private MouseListener mlContact;

    private KeyListener keyLogin;
    private int code;
    private RequestPassword newPassword;
    private Main_program main;
    private Dimension screenSize;
    private int x;
    private int y;
    JFrame _this;

    private StatiStical statiStical;
    private ChangePassword changePassword;
    private SupplierUI supplierUI;
    private ImportBillUI importBillUI;
    private ProductUI productUI;
    private ProductTypeUI productTypeUI;
    private ExportBillUI exportBillUI;
    private EmployeeUI employeeUI;
    private InforPerson inforPerson;
    private ContactUI contactUI;

    public Main() {
        this.setSize(1510, 720);
        initComponents();
        loading = new LoadingForgetPassword();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        _this = this;
        init();
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/rice.png")).getImage());

    }

    private void init() {
        layout = new MigLayout("fill, insets 0");
        createAction();
        createKeyListener();
        createComponents();
        createMouseListener();
        pnlContainer.setLayout(layout);
        pnlContainer.setLayer(loading, JLayeredPane.POPUP_LAYER);
        pnlContainer.add(loading, "pos 0 0 100% 100%");
        addComponents(pnlContainer, hello);
        this.setLocationRelativeTo(null);
        hello.setVisible(true);
        waitHello();
        handleHello();

    }

    private void createAction() {
        acSendCode = (ActionEvent e) -> {
            handleBtnSendCode();
        };
        acGetCode = (ActionEvent e) -> {
            handleForgetPassword();
        };
        acChangePassword = (ActionEvent e) -> {
            handleChangePassword(String.valueOf(newPassword.getTxtNewPassword().getPassword()));
        };
        acLogin = (ActionEvent e) -> {
            handleLogin();
        };
        acCancel = (ActionEvent e) -> {
            if (new Confirm(_this, true, "Thông báo", "Bạn có chắc là muốn thoát ?", TypeMessages(TypeMessage.WARNING)).isOk()) {
                System.exit(0);
            }
        };
        acResize = (ActionEvent e) -> {
            setResize(this);
        };

        _this.pack();
        acMiniSize = (ActionEvent e) -> {
            _this.setState(JFrame.ICONIFIED);
        };
    }

    private void createKeyListener() {
        keyLogin = new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    handleLogin();
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
    }

    private void createMouseListener() {
        mlLogout = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (new Confirm(_this, true, "Thông báo", "Bạn có chắc là muốn đăng xuất?", TypeMessages(TypeMessage.WARNING)).isOk()) {
                    handleLogout();
                }
            }
        };
        mlGuide = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsiteGuide();
            }
        };
        mlStatistical = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statiStical = new StatiStical();
                statiStical.handleRoleStatistical(Auth.user.getRoleID() == 1);
                main.getHome().showForm(statiStical);
            }
        };
        mlChangePassword = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(changePassword);
            }
        };
        mlEmployee = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Auth.user.getRoleID() == 1) {
                    main.getHome().showForm(employeeUI);
                } else {
                    inforPerson = new InforPerson();
                    inforPerson.fillToForm(Auth.user);
                    main.getHome().showForm(inforPerson);
                }
            }
        };
        mlSupplier = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(supplierUI);
            }
        };
        mlImportBill = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(importBillUI);
            }
        };
        mlProduct = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(productUI);
            }
        };
        mlProductType = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(productTypeUI);
            }
        };
        mlExportBill = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(exportBillUI);
            }
        };
        mlHome = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(createBackgroundHome());
            }
        };
        mlContact = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.getHome().showForm(contactUI);
            }
        };
    }

    public void createComponents() {
        hello = new HelloJPanel();
        login_forget = new Login_ForgetPassword(acSendCode, acGetCode, acLogin, acCancel, keyLogin);
        forgetPassword = login_forget.getForgetPassword();
        login = login_forget.getLogin();
        eDAO = new EmployeeDAO();
        newPassword = new RequestPassword(this, true, acChangePassword);
        contactUI = new ContactUI();
    }

    public void createComponentManage() {
        changePassword = new ChangePassword();
        employeeUI = new EmployeeUI(this);
        supplierUI = new SupplierUI();
        importBillUI = new ImportBillUI(this);
        productUI = new ProductUI(this);
        productTypeUI = new ProductTypeUI();
        exportBillUI = new ExportBillUI(this);
    }

    private JPanel createBackgroundHome() {
        JPanel p = new JPanel(new BorderLayout());
        p.add(main.getHome().getLblBackground());
        return p;
    }

    public void addComponents(JLayeredPane container, JPanel... panel) {
        for (JPanel jPanel : panel) {
            container.add(jPanel, "pos 0 0 100% 100%");
        }
    }

    @SuppressWarnings("SynchronizeOnNonFinalField")
    private void waitHello() {
        thread1 = new Thread(() -> {
            synchronized (hello) {
                while (hello.isVisible()) {
                    try {
                        hello.wait();
                    } catch (InterruptedException e) {
                        XDialogHelper.alert(this, 0, "Lỗi đồng bộ !");
                    }
                }
            }
            login_forget.setVisible(true);
            addComponents(pnlContainer, login_forget);
        });

        thread1.start();
    }

    @SuppressWarnings("SynchronizeOnNonFinalField")
    public void handleHello() {
        timer = new Timer(20, (ActionEvent e) -> {
            int value = hello.getPgbLoading().getValue();
            int x = 0;
            if (value < 100) {
                hello.getPgbLoading().setValue(value + 1);
                x += 1280 * (value + 1) / 100;
                hello.getLblImage().setBounds(0 + x - 460, 430, hello.getLblImage().getWidth(), hello.getLblImage().getHeight());
            } else {
                stopTimer(timer);
                thread2 = new Thread(() -> {
                    synchronized (hello) {
                        hello.setVisible(false);
                        hello.notify();
                    }
                });
                thread2.start();
            }
        });
        timer.start();
    }

    public boolean stopTimer(Timer timer) {
        timer.stop();
        return timer.isRunning();
    }

    public Employee getListEmployeeByPassword() {
        Employee e = null;
        try {
            e = eDAO.findLogin(String.valueOf(login.getTxtPassword().getPassword()), login.getTxtUsername().getText());

        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
        }
        return e;
    }

    private void handleBtnSendCode() {
        if (forgetPassword.validateForm()) {
            try {
                Employee e = eDAO.findByEmail(forgetPassword.getTxtEmail().getText(), forgetPassword.getTxtUsername().getText());
                if (e != null) {
                    loading.setVisible(true);
                    new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(6000);
                                loading.setVisible(false);
                                forgetPassword.getBtnSendCode().setText("Gửi lại");
                                forgetPassword.getBtnForget().setEnabled(true);
                                forgetPassword.getTxtVeriCode().setEnabled(true);
                                sendMain(e);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }.start();
                } else {
                    XDialogHelper.alert(this, 0, "Tài khoản hoặc email chưa chính xác !");
                }
            } catch (SQLException ex) {
                XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
            }
        }
    }

    private void sendMain(Employee e) {
        new Thread(() -> {
            code = (int) Math.floor(((Math.random() * 899999) + 100000));
            System.out.println(e.getEmail());
            System.out.println(code);
            Model_Message ms = new Service_Mail().sendMain(e.getEmail(), String.valueOf(code));
            System.out.println(ms.isSuccess());
            if (ms.isSuccess()) {
                loading.setVisible(false);
            }
        }).start();
    }

    private void handleForgetPassword() {
        String veriCode = String.valueOf(code);
        if (veriCode != null) {
            if (veriCode.matches(forgetPassword.getTxtVeriCode().getText())) {
                newPassword.setVisible(true);
            } else {
                XDialogHelper.alert(this, 0, "Mã xác nhận không đúng. Vui lòng kiểm tra lại !");
            }
        } else {
            XDialogHelper.alert(this, 0, "Bạn chưa nhập mã xác nhận!");
        }
    }

    private void handleChangePassword(String newPass) {
        String regexPass = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
        if (String.valueOf(newPassword.getTxtNewPassword().getPassword()).matches(regexPass)) {
            if (String.valueOf(newPassword.getTxtNewPassword().getPassword()).matches(String.valueOf(newPassword.getTxtConfirmNewPassword().getPassword()))) {
                try {
                    Employee e = eDAO.findByEmail(forgetPassword.getTxtEmail().getText(), forgetPassword.getTxtUsername().getText());
                    e.setPassword(newPass);
                    eDAO.updatePasswordEmployee(e);
                    XDialogHelper.alert(this, "Đã lấy lại mật khẩu thành công\nQuay lại giao diện đăng nhập !");
                    newPassword.dispose();
                    login_forget.changeForm(false);
                } catch (SQLException ex) {
                    XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu !");
                }
            } else {
                XDialogHelper.alert(this, "Mật khẩu không khớp!");
            }
        } else {
            XDialogHelper.alert(this, 0, "Mật khẩu phải từ 6 ký tự trở lên.\n Chứa ít nhất 1 chữ in hoa, 1 chữ in thường, 1 số và 1 ký tự đặc biệt !");
        }
    }

    private void handleLogin() {
        try {
            Employee e = eDAO.findLogin(String.valueOf(login.getTxtPassword().getPassword()), login.getTxtUsername().getText());
            main = new Main_program(acResize, acCancel, acMiniSize, mlLogout, mlGuide,
                    mlStatistical, mlChangePassword, mlEmployee, mlSupplier,
                    mlImportBill, mlProduct, mlProductType, mlExportBill, mlHome, mlContact);
            pnlContainer.add(main, "pos 0 0 100% 100%");
            if (e != null) {
                if (exportBillUI == null) {
                    loading.setVisible(true);
                }
                new Thread() {
                    @Override
                    public void run() {
                        Auth.user = e;
                        createComponentManage();
                        if (exportBillUI != null) {
                            loading.setVisible(false);
                            main.setVisible(true);
                            login_forget.setVisible(false);
                            setStatus(Auth.user);
                            handleRole(Auth.user);
                            initMoveTitlBar();
                            showForm();
                        }
                    }
                }.start();
            } else {
                if (login.getTxtUsername().getText().trim().equalsIgnoreCase("") || String.valueOf(login.getTxtPassword().getPassword()).trim().equalsIgnoreCase("")) {
                    XDialogHelper.alert(this, 0, "Vui lòng điền đầy đủ thông tin !");
                } else {
                    XDialogHelper.alert(this, 0, "Tài khoản hoặc mật khẩu không chính xác");
                }
            }
        } catch (SQLException ex) {
            XDialogHelper.alert(this, 0, "Lỗi truy vấn dữ liệu");
        }
    }

    private void setStatus(Employee e) {
        main.getHeader().getLblFullName().setText(e.getFullName());
        if (e.getRoleID() == 1) {
            main.getHeader().getLblRole().setText("Quản lý");
        } else {
            main.getHeader().getLblRole().setText("Nhân viên");
        }
        main.getHeader().getLblAvatar().setIcon(XShareHelper.scaledImage(e.getImage(), main.getHeader().getLblAvatar()));

    }

    public void setResize(JFrame f) {
        if (f.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            f.setExtendedState(JFrame.NORMAL);
            if (main.getMenu().isShowMenu()) {
                main.initLabel(980, 660);
            } else {
                main.initLabel(1210, 660);
            }
        } else {
            f.setExtendedState(JFrame.MAXIMIZED_BOTH);
            if (main.getMenu().isShowMenu()) {
                main.initLabel(screenSize.width - 300, screenSize.height - 60);
            } else {
                main.initLabel(screenSize.width - 70, screenSize.height - 60);
            }
        }
    }

    public void initMoveTitlBar() {
        main.getHeader().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (_this.getExtendedState() != JFrame.MAXIMIZED_BOTH && SwingUtilities.isLeftMouseButton(me)) {
                    if (main.getMenu().isShowMenu()) {
                        x = me.getX() + 300;
                    } else {
                        x = me.getX() + 70;
                    }
                    y = me.getY() + 0;
                }
            }

            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me) && me.getClickCount() == 2) {
                    setResize(_this);
                }
            }
        });
        main.getHeader().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (_this.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        _this.setExtendedState(JFrame.NORMAL);
                        if (main.getMenu().isShowMenu()) {
                            main.initLabel(980, 660);
                        } else {
                            main.initLabel(1210, 660);
                        }
                    }
                    _this.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
                }
            }
        });
    }

    public void handleRole(Employee e) {
        if (e != null) {
            boolean isRole = e.getRoleID() == 1;
            if (isRole) {
                main.getMenu().getLblEmployee().setText("Quản Lý Nhân Viên");
            } else {
                main.getMenu().getLblEmployee().setText("Thông Tin Cá Nhân");
            }
            if (!isRole) {
                supplierUI.handleRoleSupplier(isRole);
                productUI.handleRoleProduct(isRole);
                productTypeUI.handleRoleProductType(isRole);
                importBillUI.handleRoleImportBill(isRole);
                exportBillUI.handleRoleExportbill(isRole);
                employeeUI.handleRoleEmployee(isRole);
            }
        }
    }

    private void handleLogout() {
        this.remove(main);
        main.setVisible(false);
        login_forget.setVisible(true);
        Auth.user = null;
        if (this.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
            this.setExtendedState(JFrame.NORMAL);
            if (main.getMenu().isShowMenu()) {
                main.initLabel(980, 660);
            } else {
                main.initLabel(1210, 660);
            }
        }
        changePassword = null;
        employeeUI = null;
        supplierUI = null;
        importBillUI = null;
        productUI = null;
        productTypeUI = null;
        exportBillUI = null;
        statiStical = null;
    }

    private void openWebsiteGuide() {
        try {
            Desktop.getDesktop().browse(new URL("https://viettravleix.000webhostapp.com/index.html").toURI());
        } catch (IOException | URISyntaxException e) {
        }
    }

    private void showForm() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(pnlContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
//                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                new Main().setVisible(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane pnlContainer;
    // End of variables declaration//GEN-END:variables
}
