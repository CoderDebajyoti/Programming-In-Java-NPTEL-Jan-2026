
public class W10_P2 {
    public static void main(String[] args) {
        try {
Class.forName("org.sqlite.JDBC");
System.out.println(true);
        } catch (Exception e) {
            System.out.println(false);
        }
    }
}