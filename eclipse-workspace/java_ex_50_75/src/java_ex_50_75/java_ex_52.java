package java_ex_50_75;
import java.util.Scanner;

public class java_ex_52 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String ordinalNumber = getEnglishOrdinalNumber(number);

        System.out.println(ordinalNumber);
        scanner.close();
    }


    private static String getEnglishOrdinalNumber(int number) {
       
        if (number == 11 || number == 12 || number == 13) {
            return number + "th";
        }
        int lastDigit = number % 10;
        switch (lastDigit) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }
    }
}
