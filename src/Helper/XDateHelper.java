package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Phan Tuấn Linh (LinhPTPC04737)
 */
public class XDateHelper {

    static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    /*
     * Chuyển đổi String sang Date
     * @param date là String cần chuyển
     * @param pattern là định dạng thời gian
     * @return Date kết quả
     */
    public static Date toDate(String date, String... pattern) {
        try {
            if (pattern.length > 0) {
                df.applyPattern(pattern[0]);
            }
            if (date == null) {
                return nowDate();
            }
            return df.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    /*
     * Chuyển đổi từ Date sang String
     * @param date là Date cần chuyển đổi
     * @param pattern là định dạng thời gian
     * @return String kết quả
     */
    public static String toString(Date date, String... pattern) {
        if (pattern.length > 0) {
            df.applyPattern(pattern[0]);
        }
        if (date == null) {
            date = nowDate();
        }
        return df.format(date);
    }

    /*
     * Lấy thời gian hiện tại
     * @return Date kết quả
     */
    public static Date nowDate() {
        return new Date();
    }
    
    /*
     * Bổ sung số ngày vào thời gian
     * @param date thời gian hiện có
     * @param days số ngày cần bổ sung váo date
     * @return Date kết quả
     */
    public static Date addDays(Date date, int days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
    
    /*
     * Bổ sung số ngày vào thời gian hiện hành
     * @param days số ngày cần bổ sung vào thời gian hiện tại
     * @return Date kết quả
     */
    public static Date add(int days){
        Date now = nowDate();
        now.setTime(now.getTime()+days*24*60*60*1000);
        return now;
    }
}
