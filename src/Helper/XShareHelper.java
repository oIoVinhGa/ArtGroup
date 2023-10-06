package Helper;

//import Entities.EmployeeEntity;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
@SuppressWarnings("StaticNonFinalUsedInInitialization")
public class XShareHelper {

    /*
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
//    public static EmployeeEntity USER = null;
    /*
     * Ảnh biểu tượng của ứng dụng
     */
//    public static final Image IconApp;

    /*
     * Load biểu tượng ứng dụng
     */
    static {
//        String urlFile = "/icon/fpt.png";
//        IconApp = new ImageIcon(XShareHelper.class.getResource(urlFile)).getImage();
    }

    /*
     * Sao chép file logo chuyên đề vào thư mục logo
     * @param file là đối tượng file ảnh
     * @return chép được hay không
     */
    public static boolean saveLogo(File file) {
        File f = new File("src/Image");

        if (!f.exists()) {
            f.mkdirs();
        }
        File newFile = new File(f, file.getName());
        try {
            Path path = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(path, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Căn chỉnh ảnh với label
     *
     * @param fileName tên file cần chỉnh
     * @param label label chứa ảnh
     * @return ảnh đã resize
     */
    public static ImageIcon ScaledImage(String fileName, JLabel label) {
        label.setText(null);
        Image image = readLogo(fileName).getImage();
        ImageIcon imageScaled = new ImageIcon(image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        return imageScaled;
    }

    /*
     * Đọc hình ảnh logo chuyên đề
     * @param fileName  là tên file logo
     * @return ảnh đọc được
     */
    public static ImageIcon readLogo(String fileName) {
        File path = new File("Image", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static ImageIcon scaledImage(String fileName, JLabel label) {
        ImageIcon icon = new ImageIcon("src/Image/" +fileName);
        Image image = icon.getImage();
        ImageIcon imageScaled = new ImageIcon(image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        return imageScaled;
    }
    /*
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
//    public static void logoff() {
//        XShareHelper.USER = null;
//    }
//
//    /*
//     * Kiểm tra xem đăng nhập hay chưa
//     * @return đăng nhập hay chưa
//     */
//    public static boolean authenticated() {
//        
//        return XShareHelper.USER != null;
//    }
}
