package java_ex_25_50;
import java.util.Scanner;
public class java_ex_42 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballPosition = scanner.nextInt();


        if ((ballPosition >= 50 && ballPosition <= 70) || (ballPosition % 6 == 0)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }

        scanner.close();
    }
}
