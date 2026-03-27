
import java.io.*;

class W09_P4 {

    public static void main(String args[]) {
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            String number = br.readLine();
            int x = Integer.parseInt(number);
            System.out.println(x * x);
        } catch (Exception e) {
            System.out.print("Please enter valid data");
        }
    } // The main() ends here
} // The main class ends here
