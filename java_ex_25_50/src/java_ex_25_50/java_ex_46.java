package java_ex_25_50;
import java.util.Scanner;
public class java_ex_46 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tunnelHeights = new int[3];
        for (int i = 0; i < 3; i++) {
            tunnelHeights[i] = scanner.nextInt();
            
        }
        checkTunnelPass(tunnelHeights);
        scanner.close();
    }

    public static void checkTunnelPass(int[] tunnelHeights) {
    	for (int i = 0; i < 3; i++) {
           if (tunnelHeights[i] <= 170) {
               System.out.println("CRASH");
           } else {
               System.out.println("PASS");
        }
    }
    	}
}
