package java_ex_25_50;
import java.util.Scanner;
public class java_ex_39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min = Math.min(Math.min(num1, num2), num3);
        System.out.println(min);
        scanner.close();
    }
}