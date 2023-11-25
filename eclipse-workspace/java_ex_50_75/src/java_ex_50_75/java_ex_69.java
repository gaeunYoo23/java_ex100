package java_ex_50_75;
import java.util.Scanner;
public class java_ex_69 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int result = calculateNthNumber(a, d, n);
        System.out.println(result);

        scanner.close();
    }

    private static int calculateNthNumber(int a, int d, int n) {

        return a + (n - 1) * d;
    }
}
