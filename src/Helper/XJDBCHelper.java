package Helper;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
public class XJDBCHelper {

    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    @SuppressWarnings("FieldMayBeFinal")
    private static String databaseName = "KhoVatTu";
    @SuppressWarnings({"FieldMayBeFinal", "StaticNonFinalUsedInInitialization"})
    private static String url = "jdbc:sqlserver://localhost:1433; databaseName=" + databaseName + "; encrypt = false; trustServerCertificate = true";
    @SuppressWarnings("FieldMayBeFinal")
    private static String user = "sa";
    @SuppressWarnings("FieldMayBeFinal")
    private static String password = "123";

    public XJDBCHelper() {
        /**
         * Thiết lập driver cho phần mềm
         */
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XJDBCHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Xây dựng hàm preparedStatement
     *
     * @param query là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một
     * lời gọi thủ tục lưu
     * @param objects là danh sách các giá trị được cung cấp cho các tham số
     * trong câu lệnh sql
     * @return trả về PrepareStatement
     * @throws java.sql.SQLException
     */
    public static PreparedStatement preparedStatement(String query, Object... objects) throws SQLException {
        PreparedStatement ps = null;
        Connection conn = DriverManager.getConnection(url, user, password);
        if (query.trim().startsWith("{")) {
            ps = conn.prepareCall(query);
        } else {
            ps = conn.prepareStatement(query);
        }

        for (int i = 0; i < objects.length; i++) {
            ps.setObject(i + 1, objects[i]);
        }
        return ps;
    }

    /**
     * Xây dựng hàm executeUpdate Thực hiện câu lệnh SQL thao tác (INSERT,
     * UPDATE, DELETE) hoặc thủ tục lưu thao tác dữ liệu
     *
     * @param query là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một
     * lời gọi thủ tục lưu
     * @param objects là danh sách các giá trị được cung cấp cho các tham số
     * trong câu lệnh sql
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static void executeUpdate(String query, Object... objects) {
        try {

            PreparedStatement ps = preparedStatement(query, objects);
            try {
                ps.executeUpdate();
            } finally {
                ps.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * Xây dựng hàm executeQuery Thực hiện câu lệnh SQL try vấn (SELECT) hoặc
     * thủ tục lưu truy vấn dữ liệu
     *
     * @param query -> câu lệnh SQL. Có thể là một lời gọi hoặc một thủ tục lưu
     * @param objects -> danh sách các giá trị được cung cấp cho các tham số
     * trong câu lệnh sql
     * @return trả về giá trị ResultSet
     * @throws java.sql.SQLException
     */
    public static ResultSet executeQuery(String query, Object... objects) throws SQLException {
        PreparedStatement ps = preparedStatement(query, objects);
        return ps.executeQuery();
    }
}
