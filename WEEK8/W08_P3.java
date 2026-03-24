import java.util.Scanner;

public class W08_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int r,result = 0;
while (number > 0) {
  r= number%10;
  result= result* 10 + r;
    number /= 10;
}
System.out.print(result); 
scanner.close();
    }
}