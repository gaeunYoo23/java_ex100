package java_ex_75_100;
import java.util.Scanner;
public class java_ex_88 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        int sum = calculateSequenceSum(n);
	        System.out.println(sum);

	        scanner.close();
	    }

	    private static int calculateSequenceSum(int n) {
	        int sum = 0;
	        int partialSum = 0;

	        for (int i = 1; i <= n; i++) {
	            partialSum += i;
	            sum += partialSum;
	        }

	        return sum;
	    }
}
