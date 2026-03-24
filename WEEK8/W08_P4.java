import java.util.Scanner;

public class W08_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Assume number is prime

// Check divisibility from 2 to sqrt(number)

// Print result

boolean isPrime = true;

if (number <= 1) {
    isPrime = false;
} else {
    for (int i = 2; i * i <= number; i++) {
        if (number % i ==0) {
            isPrime = false;
            break;
        }
    }
}

System.out.print(isPrime ? "Prime" : "Not Prime");
scanner.close();
    }
}