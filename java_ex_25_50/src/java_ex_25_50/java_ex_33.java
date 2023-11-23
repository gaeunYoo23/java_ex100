package java_ex_25_50;
import java.util.Scanner;
public class java_ex_33 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a) {
		case 12:
		case 1:
		case 2:
			System.out.print("winter");
		    break;
		case 3:
		case 4:
		case 5:
			System.out.print("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("fall");
			break;
	
		
		}
		
		
		s.close();
	}
}
