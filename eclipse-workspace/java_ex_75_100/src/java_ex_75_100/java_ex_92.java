package java_ex_75_100;
import java.util.Scanner;
public class java_ex_92 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            System.out.println("Waiting for 5 seconds...");
            Thread.sleep(5000); 
            clearConsole(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();

        if (k >= 1 && k <= 10) {
            System.out.println(numbers[k - 1]);
        } else {
            System.out.println("Invalid value of k.");
        }

        scanner.close();
    }

    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            // 예외 처리
        }
    }
}
