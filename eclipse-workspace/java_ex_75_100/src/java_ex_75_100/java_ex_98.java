package java_ex_75_100;
import java.util.Scanner;
public class java_ex_98 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();

	        int[][] board = new int[10][10];

	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();
	            board[x - 1][y - 1] = 1;
	        }

	        printBoard(board);

	        scanner.close();
	    }

	    private static void printBoard(int[][] board) {
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
