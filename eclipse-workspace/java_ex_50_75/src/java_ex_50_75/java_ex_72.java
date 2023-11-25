package java_ex_50_75;
import java.util.Scanner;
public class java_ex_72 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            max = Math.max(max, num);
        }


        System.out.println(max);

        scanner.close();
    }
}
