package java_ex_75_100;
import java.util.Scanner;
public class java_ex_93 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[7];
        for (int i = 0; i < 7; i++) {
            words[i] = scanner.next();
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

        if (k >= 1 && k <= 7) {
            System.out.println(words[k - 1]);
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

        }
    }
}
