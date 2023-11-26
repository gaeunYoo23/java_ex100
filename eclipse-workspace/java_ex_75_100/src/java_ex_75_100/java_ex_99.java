package java_ex_75_100;
import java.util.Scanner;
public class java_ex_99 {
	static void printGrade(int score) {
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("E학점");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printGrade(n);

        scanner.close();
    }
}
