import java.sql.*;
import java.lang.*;

public class W11_P5 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            // The statement containing SQL command to create table "STUDENTS"
            String CREATE_TABLE_SQL = "CREATE TABLE STUDENTS (UID INT, Name VARCHAR(45), ROLL VARCHAR(12), Age INT);";
            // Execute the statement containing SQL command
            stmt.executeUpdate(CREATE_TABLE_SQL);
            // Write the SQL command to rename a table
            String alter = "ALTER TABLE STUDENTS RENAME TO GRADUATES;";
            // Execute the SQL command
            stmt.executeUpdate(alter);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}