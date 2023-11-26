package java_ex_75_100;
import java.util.Scanner;
public class java_ex_90 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] attendanceNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            attendanceNumbers[i] = scanner.nextInt();
        }

        reverseAndPrintAttendanceNumbers(attendanceNumbers);

        scanner.close();
    }

    private static void reverseAndPrintAttendanceNumbers(int[] attendanceNumbers) {
        for (int i = attendanceNumbers.length - 1; i >= 0; i--) {
        	 System.out.print((i == attendanceNumbers.length - 1 ? "" : " ") + attendanceNumbers[i]);}
    }
}
