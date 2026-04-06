import java.sql.*;

public class W10_P3 {
    public static void main(String[] args) {
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/studentdb";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
conn = DriverManager.getConnection(DB_URL);
System.out.println(conn.isValid(1));
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}