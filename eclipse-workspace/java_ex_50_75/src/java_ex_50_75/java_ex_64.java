package java_ex_50_75;
import java.util.Scanner;
public class java_ex_64 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();

	        int remainder = calculateRemainder(a, b);
	        System.out.println(remainder);

	        scanner.close();
	    }

	    private static int calculateRemainder(int a, int b) {

	        return a % b;
	    }
}
