package java_ex_50_75;
import java.util.Scanner;
public class java_ex_67 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
