package java_ex_75_100;
import java.util.Scanner;
public class java_ex_76 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int result = power(n, k);

        System.out.println(result);
        scanner.close();
    }

    private static int power(int n, int k) {
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= n;
        }
        return result;
    }
}
