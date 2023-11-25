package java_ex_50_75;
import java.util.Scanner;
public class java_ex_73 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int h = scanner.nextInt();

        int[] donations = calculateDonations();
        int sum = donations[(k - 1) * 2] + donations[(h - 1) * 2];


        System.out.println(sum);


        scanner.close();
    }

    private static int[] calculateDonations() {
        int[] donations = new int[24];
        for (int i = 0; i < 24; i++) {
            donations[i] = (i / 2 + 1) * 10;
        }
        return donations;
    }
}
