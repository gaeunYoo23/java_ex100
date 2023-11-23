package java_ex_25_50;
import java.util.Scanner;
public class java_ex_41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ballPosition = scanner.nextInt();
		if ((ballPosition >= 30 && ballPosition <= 40) || (ballPosition >= 60 && ballPosition <= 70)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
        scanner.close();
	}
}
	
