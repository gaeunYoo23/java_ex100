package java_ex_50_75;
import java.util.Scanner;
public class java_ex_65 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (is369(i)) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    private static boolean is369(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
