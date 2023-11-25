package java_ex_50_75;
import java.util.Scanner;
public class java_ex_70 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();

        int result = calculateNthNumber(a, r, n);
        System.out.println(result);

        scanner.close();
    }


    private static int calculateNthNumber(int a, int r, int n) {

        return a * (int) Math.pow(r, n - 1);
    }
}
