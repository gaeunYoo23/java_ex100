package java_ex_50_75;
import java.util.Scanner;
public class java_ex_63 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int hour = convertDayToHour(day);
        System.out.println(hour);
        scanner.close();
    }
    private static int convertDayToHour(int day) {

        return day * 24;
    }
}
