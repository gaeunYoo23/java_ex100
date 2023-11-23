package java_ex_25_50;
import java.util.Scanner;
public class java_ex_32 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		switch(c) {
		case 'A':
			System.out.print("best!!!");
		    break;
		case 'B':
			System.out.print("good!!");
			break;
		case 'C':
			System.out.print("run!");
			break;
		case 'D':
			System.out.print("slowly~");
			break;
		default:
			System.out.print("what?");
			break;
			
		
		}
		
		
		s.close();
	}
}
