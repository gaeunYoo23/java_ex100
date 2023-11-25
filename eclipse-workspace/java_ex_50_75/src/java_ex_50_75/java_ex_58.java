package java_ex_50_75;
import java.util.Scanner;
public class java_ex_58 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String result = checkTriangle(a, b, c);

        System.out.println(result);

        scanner.close();
    }

    private static String checkTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return "yes";
        } else {
            return "no";
        }
    }
}
