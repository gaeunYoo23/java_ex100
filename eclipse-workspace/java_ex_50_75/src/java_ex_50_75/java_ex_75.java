package java_ex_50_75;
import java.util.Scanner;
public class java_ex_75 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

     
        scanner.close();
    }


    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true; 
    }
}
