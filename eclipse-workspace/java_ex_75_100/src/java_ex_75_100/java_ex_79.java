package java_ex_75_100;
import java.util.Scanner;
public class java_ex_79 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String sentence = scanner.next();

	        String result = convertCase(sentence);
	        System.out.println(result);

	        scanner.close();
	    }

	    private static String convertCase(String input) {
	        char[] charArray = input.toCharArray();

	        for (int i = 0; i < charArray.length; i++) {
	            char currentChar = charArray[i];
	            if (Character.isUpperCase(currentChar)) {
	                charArray[i] = Character.toLowerCase(currentChar);
	            } else if (Character.isLowerCase(currentChar)) {
	                charArray[i] = Character.toUpperCase(currentChar);
	            }
	        }

	        return new String(charArray);
	    }
}
