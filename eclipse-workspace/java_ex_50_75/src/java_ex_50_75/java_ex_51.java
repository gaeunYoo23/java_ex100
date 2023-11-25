package java_ex_50_75;
import java.util.Scanner;

public class java_ex_51 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int compressedAmount = compressTrashCan(n);
	        System.out.println(compressedAmount);
	        if (compressedAmount <= 50) {
	            System.out.println("GOOD");
	        } else {
	            System.out.println("OH MY GOD");
	        }
	        scanner.close();
	    }
	    private static int compressTrashCan(int n) {
	        int result = ((n % 10) * 10 + (n / 10)) * 2;

	        if (result > 100) {
	            result %= 100;
	        }

	        return result;
	    }
}
