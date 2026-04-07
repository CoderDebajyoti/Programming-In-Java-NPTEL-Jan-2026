import java.util.Scanner;
//Import required packages
// Hint: USE static import by using *
import java.sql.*;
public class W11_P1 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            } catch (Exception e) {
            System.out.println(e);
        }
    }
}