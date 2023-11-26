package java_ex_75_100;
import java.util.Scanner;
public class java_ex_83 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printTriangle(n);

        scanner.close();
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
