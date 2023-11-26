package java_ex_75_100;
import java.util.Scanner;
public class java_ex_91 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        rotateAndPrintNumbers(numbers);

        scanner.close();
    }

    private static void rotateAndPrintNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[(i + j) % numbers.length] + " ");
            }
            System.out.println();
        }
    }
}
