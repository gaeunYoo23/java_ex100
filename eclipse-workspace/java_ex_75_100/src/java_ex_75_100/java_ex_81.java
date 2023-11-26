package java_ex_75_100;
import java.util.Scanner;
public class java_ex_81 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        scanner.close();
    }
}
