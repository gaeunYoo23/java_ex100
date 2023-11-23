package java_ex_25_50;
import java.util.Scanner;
public class java_ex_43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String result = numberToKorean(n);
        System.out.println(result);

        scanner.close();
    }
	public static String numberToKorean(int n) {
        if (n == 0) {
            return "영";
        }

        String[] units = {"", "십", "백", "천", "만"};
        String[] numbers = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

        StringBuilder result = new StringBuilder();
        int unitIndex = 0;
        boolean isTen = false;

        while (n > 0) {
            int digit = n % 10;

            if (digit > 0) {
                if (isTen && digit == 1) {
                    result.insert(0, units[unitIndex]);
                } else {
                    result.insert(0, numbers[digit] + units[unitIndex]);
                }
            }

            isTen = (digit == 1);
            unitIndex++;
            n /= 10;
        }

        return result.toString();
    }
}
