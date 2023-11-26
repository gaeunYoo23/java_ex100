package java_ex_75_100;
import java.util.Scanner;
public class java_ex_77 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = factorial(n);

        System.out.println(result);

        scanner.close();
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
