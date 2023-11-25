package java_ex_50_75;
import java.util.Scanner;
public class java_ex_66 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = scanner.nextInt();

        int sum = 0;

        int i = 1;
        while (sum < targetSum) {
            sum += i;
            i++;
        }


        System.out.println(sum);

        scanner.close();
    }

}
