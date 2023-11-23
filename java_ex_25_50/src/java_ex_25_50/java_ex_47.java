package java_ex_25_50;
import java.util.Scanner;
public class java_ex_47 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        String result = isLeapYear(year) ? "yes" : "no";
        System.out.println(result);

        scanner.close();
    }


    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
