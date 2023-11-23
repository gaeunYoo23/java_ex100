package java_ex_25_50;
import java.util.Scanner;
public class java_ex_48 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int birthDate = scanner.nextInt();
	        int gender = scanner.nextInt();

	        int currentAge = calculateCurrentAge(birthDate, gender);
	        System.out.println(currentAge);

	        scanner.close();
	    }

	    public static int calculateCurrentAge(int birthDate, int gender) {
	        int birthYear = (gender == 1 || gender == 2) ? 1900 + birthDate / 10000 : 2000 + birthDate / 10000;
	        int age = 2018 - birthYear;
	        

	        int birthMonthDay = birthDate % 10000;
	        int currentMonthDay = 201812;
	        		
	        if (birthMonthDay > currentMonthDay) {
	            age--;
	        }
	        return age;
	    }
}
