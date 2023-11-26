package java_ex_75_100;
import java.util.Scanner;
public class java_ex_84 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        printInvertedTriangle(n);

	        scanner.close();
	    }

	    private static void printInvertedTriangle(int n) {
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
