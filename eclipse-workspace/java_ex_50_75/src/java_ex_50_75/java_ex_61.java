package java_ex_50_75;
import java.util.Scanner;
public class java_ex_61 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();

        double result = calculateResult(operand1, operator, operand2);
        if(operator!='/') {
        	System.out.println((int)result);
        	}
        else
        	System.out.println(result);

        scanner.close();
    }

    private static double calculateResult(int operand1, char operator, int operand2) {
        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
            	result = operand1 / operand2;
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                break;
        }

        return result;
    }
}
