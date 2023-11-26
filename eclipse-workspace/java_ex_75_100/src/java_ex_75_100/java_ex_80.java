package java_ex_75_100;
import java.util.Scanner;
public class java_ex_80 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String encryptedMessage = scanner.nextLine();

	        String decryptedMessage = decryptCaesarCipher(encryptedMessage);
	        System.out.println(decryptedMessage);

	        scanner.close();
	    }

	    private static String decryptCaesarCipher(String encryptedMessage) {
	        StringBuilder decryptedMessage = new StringBuilder();

	        for (char ch : encryptedMessage.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                char base = Character.isUpperCase(ch) ? 'A' : 'a';
	                char decryptedChar = (char) ((ch - base - 3 + 26) % 26 + base);
	                decryptedMessage.append(decryptedChar);
	            } else {
	                decryptedMessage.append(ch);
	            }
	        }

	        return decryptedMessage.toString();
	    }
}
