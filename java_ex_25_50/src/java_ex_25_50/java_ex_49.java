package java_ex_25_50;
import java.util.Scanner;

public class java_ex_49 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int[] result = calculateTimeBefore(hour, minute);
        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }

    public static int[] calculateTimeBefore(int hour, int minute) {
        int totalMinutes = hour * 60 + minute;
        totalMinutes -= 30;


        totalMinutes = (totalMinutes + 24 * 60) % (24 * 60);

        int[] result = { totalMinutes / 60, totalMinutes % 60 };
        return result;
    }
}
