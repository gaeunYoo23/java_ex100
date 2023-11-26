package java_ex_75_100;
import java.util.Scanner;
public class java_ex_86 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            n = scanner.nextInt();
        } while (n < 3 || n > 99 || n % 2 == 0);

        printTriangle(n);

        scanner.close();
    }

    private static void printTriangle(int n) {
        int spaces = n / 2;
        int stars = 1;

        for (int i = 1; i <= n; i += 2) {

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            System.out.println();

            spaces--;
            stars += 2;
        }
    }
}
