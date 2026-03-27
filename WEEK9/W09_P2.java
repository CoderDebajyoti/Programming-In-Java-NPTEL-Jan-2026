import java.util.Scanner;
public class W09_P2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
        // Declare and initialize the required variable(s)

// Split the input string into character array

/*
Write your method to separate two operands
and operators and then perform the required operation.
*/

// Print the output as stated in the question

double result = 0;
char operator = ' ';

for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                operator = ch;
                String part1 = input.substring(0, i);
                String part2 = input.substring(i + 1);

                double num1 = Double.parseDouble(part1);
                double num2 = Double.parseDouble(part2);


                if(operator == '+'){
                    result = num1 + num2;
                }
                else if(operator == '-'){
                    result = num1 - num2;
                }
                else if(operator == '*'){
                    result = num1 * num2;
                }
                else if(operator == '/'){
                    result = num1 / num2;
                }
                break; // Exit the loop after finding the operator and performing the calculation
            }
        }
        System.out.print(input + " = " + Math.round(result));
    } // The main() ends here
} // The main class ends here