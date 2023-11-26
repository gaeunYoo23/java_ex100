package java_ex_75_100;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class java_ex_95 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(); 
        Map<Character, Integer> alphabetCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetCount.put(c, alphabetCount.getOrDefault(c, 0) + 1);
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + ":" + alphabetCount.getOrDefault(c, 0));
        }

        scanner.close();
    }
}
