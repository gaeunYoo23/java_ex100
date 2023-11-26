package java_ex_75_100;
import java.util.Scanner;
public class java_ex_78 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0; 
        int operand = 0;
        char operator = ' ';
        while (true) {
            operand = scanner.nextInt();
            operator = scanner.next().charAt(0);

            if (operator == '=') {
                break;
            }

            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    result /= operand;
                    break;
                default:
                    return;
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
