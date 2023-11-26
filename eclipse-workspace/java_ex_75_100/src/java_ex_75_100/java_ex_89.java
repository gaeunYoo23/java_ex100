package java_ex_75_100;
import java.util.Scanner;
public class java_ex_89 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int k = scanner.nextInt();

	        printDiceCombinations(k);

	        scanner.close();
	    }

	    private static void printDiceCombinations(int k) {
	        for (int i = 1; i <= 6; i++) {
	            int j = k - i;
	            if (j >= 1 && j <= 6) {
	                System.out.println(i + " " + j);
	            }
	        }
	    }
}
