import java.util.Scanner;

public class W08_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int r, sum = 0;
while (number > 0){
  r = number%10;
  sum+=r;
  number/=10;
}
System.out.print(sum);
scanner.close();
    }
}