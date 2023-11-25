package java_ex_50_75;
import java.util.Scanner;
public class java_ex_56 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] yutStates = new int[4];
        for (int i = 0; i < 4; i++) {
            yutStates[i] = scanner.nextInt();
        }

        printYutResult(yutStates);

        scanner.close();
    }


    private static void printYutResult(int[] yutStates) {
        int flippedCount = countFlippedYuts(yutStates);

        if (flippedCount == 0) {
            System.out.println("모");
        } else if (flippedCount == 1) {
            System.out.println("도");
        } else if (flippedCount == 2) {
            System.out.println("개");
        } else if (flippedCount == 3) {
            System.out.println("걸");
        } else {
            System.out.println("윷");
        }
    }

    private static int countFlippedYuts(int[] yutStates) {
        int count = 0;
        for (int state : yutStates) {
            count += state;
        }
        return count;
    }
}
