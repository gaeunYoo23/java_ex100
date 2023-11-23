package java_ex_25_50;
import java.util.Scanner;
public class java_ex_50 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bmi = scanner.nextInt();

        String result = judgeObesity(bmi);
        System.out.println(result);

        scanner.close();
    }

    public static String judgeObesity(int bmi) {
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi >= 18.5 && bmi <= 23) {
            return "정상체중";
        } else {
            return "과체중";
        }
    }
}
