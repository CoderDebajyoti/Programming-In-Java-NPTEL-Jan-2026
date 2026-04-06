import java.sql.*;

public class W10_P4 {
    public static void main(String[] args) {
        try {
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/tempfs/studentdb");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE students(roll INTEGER, name VARCHAR(30))";
stmt.executeUpdate(sql);
System.out.println("success");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}