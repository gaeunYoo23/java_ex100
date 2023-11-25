package java_ex_50_75;
import java.util.Scanner;
public class java_ex_60 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tunnelA = scanner.nextInt();
        int tunnelB = scanner.nextInt();
        int tunnelC = scanner.nextInt();

        int carHeight = 170;

        int result = checkTunnelPass(carHeight, tunnelA, tunnelB, tunnelC);

        if (result == 0) {
            System.out.println("PASS");
        } else {
            System.out.println("CRASH " + result);
        }

        scanner.close();
    }

    private static int checkTunnelPass(int carHeight, int... tunnelHeights) {
        for (int tunnelHeight : tunnelHeights) {
            if (tunnelHeight <= carHeight) {
                return tunnelHeight;
            }
        }
        return 0; 
    }
}
