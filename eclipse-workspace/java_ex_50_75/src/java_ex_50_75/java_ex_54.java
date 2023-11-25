package java_ex_50_75;
import java.util.Scanner;

public class java_ex_54 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printMultipleRelation(a, b);

        scanner.close();
    }

    private static void printMultipleRelation(int a, int b) {
        if (b % a == 0) {
    
            int x = b / a;
            System.out.printf("%d*%d=%d\n", a, x, b);
        } else if (a % b == 0) {

            int x = a / b;
            System.out.printf("%d*%d=%d\n", b, x, a);
        } else {

            System.out.println("none");
        }
    }
}
