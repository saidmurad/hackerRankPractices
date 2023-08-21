import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HashCodeDemo {
    public static void main(String[] args) {
        String s1 = new String("durga");
        String s2 = new String("durga");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String currentTime = df.format(new Date());
        Timestamp timestamp = Timestamp.valueOf("2023-06-21 01:01:01");
        System.out.println(currentTime);
        System.out.println(timestamp);
    }
}
