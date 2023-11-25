package java_ex_50_75;
import java.util.Scanner;
public class java_ex_57 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int menu1 = scanner.nextInt();
        int menu2 = scanner.nextInt();

        int calories1 = calculateCalories(menu1);
        int calories2 = calculateCalories(menu2);

        int totalCalories = calories1 + calories2;

        if (totalCalories > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }

        scanner.close();
    }

    private static int calculateCalories(int menu) {
        switch (menu) {
            case 1:
                return 400;
            case 2:
                return 340;
            case 3:
                return 170;
            case 4:
                return 100;
            case 5:
                return 70;
            default:
                return 0;
        }
    }
}
