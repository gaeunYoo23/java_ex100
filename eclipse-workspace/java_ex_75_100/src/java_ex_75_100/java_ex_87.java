package java_ex_75_100;
import java.util.Scanner;
public class java_ex_87 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            n = scanner.nextInt();
        } while (n < 3);

        printSquare(n);

        scanner.close();
    }

    private static void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
