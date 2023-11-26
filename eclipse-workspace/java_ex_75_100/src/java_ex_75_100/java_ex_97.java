package java_ex_75_100;
import java.util.Arrays;
import java.util.Scanner;
public class java_ex_97 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = scanner.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        Arrays.sort(heights);

        printSeatingArrangement(heights, c);

        scanner.close();
    }

    private static void printSeatingArrangement(int[] heights, int c) {
        int rows = (int) Math.ceil((double) heights.length / c);
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < c; j++) {
                if (index < heights.length) {
                    System.out.print(heights[index] + " ");
                    index++;
                }
            }
            System.out.println();
        }
    }
}
