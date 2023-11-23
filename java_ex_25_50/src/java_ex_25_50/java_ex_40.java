package java_ex_25_50;
import java.util.Scanner;
public class java_ex_40 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double ballPosition = scanner.nextDouble();

	        if (ballPosition >= 50 && ballPosition <= 60) {
	            System.out.println("win");
	        } else {
	            System.out.println("lose");
	        }

	        scanner.close();
	    }

}
