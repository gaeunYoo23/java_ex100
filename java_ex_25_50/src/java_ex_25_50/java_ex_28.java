package java_ex_25_50;
import java.util.Scanner;

public class java_ex_28 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a%2==0) {
			System.out.print(a);
			System.out.print("\n");
		}
		if(b%2==0) {
			System.out.print(b);
			System.out.print("\n");
		}
		if(c%2==0) {
			System.out.print(c);
			System.out.print("\n");
		}
		
		s.close();
	}
	
}
