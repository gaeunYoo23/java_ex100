package java_ex_50_75;
import java.util.Scanner;
public class java_ex_74 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        printDivisors(N);

        scanner.close();
    }

    private static void printDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
