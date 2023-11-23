package java_ex_25_50;
import java.util.Scanner;

public class java_ex_34 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			int num=s.nextInt();
			
			if(num==0) {
				System.out.print("0");
				break;
			}
			System.out.print(num);
			System.out.print("\n");
		}
		
		s.close();
	}
}
