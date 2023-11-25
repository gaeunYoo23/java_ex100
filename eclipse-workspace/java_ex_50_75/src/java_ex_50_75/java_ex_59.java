package java_ex_50_75;
import java.util.Scanner;
import java.util.Arrays;
public class java_ex_59 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] winningNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            winningNumbers[i] = scanner.nextInt();
        }
        int bonusNumber = scanner.nextInt();

        int[] juheeNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            juheeNumbers[i] = scanner.nextInt();
        }

        int result = checkLottoResult(winningNumbers, bonusNumber, juheeNumbers);

        System.out.println(result);

        scanner.close();
    }

    private static int checkLottoResult(int[] winningNumbers, int bonusNumber, int[] juheeNumbers) {

        int matchCount = countMatchNumbers(winningNumbers, juheeNumbers);

        boolean bonusMatch = Arrays.stream(juheeNumbers).anyMatch(num -> num == bonusNumber);


        if (matchCount == 6) {
            return 1; 
        } else if (matchCount == 5 && bonusMatch) {
            return 2; 
        } else if (matchCount == 5) {
            return 3; 
        } else if (matchCount == 4) {
            return 4; 
        } else if (matchCount == 3) {
            return 5; 
        } else {
            return 0; 
        }
    }

    private static int countMatchNumbers(int[] array1, int[] array2) {
        int count = 0;
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    count++;
                    break; 
                }
            }
        }
        return count;
    }
}
