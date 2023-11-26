package java_ex_75_100;
import java.util.Scanner;
public class java_ex_82 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        printMultiplicationTable(start, end);

        scanner.close();
    }

    private static void printMultiplicationTable(int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
