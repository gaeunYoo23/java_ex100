package java_ex_25_50;
import java.util.Scanner;

public class java_ex_31 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>=90 && a<=100) {
			System.out.print("A");
		}
		else if(a>=70&&a<90) {
			System.out.print("B");
		}
		else if(a>=40&&a<70) {
			System.out.print("C");
		}
		else if(a>=0&&a<40) {
			System.out.print("D");
		}
		
		s.close();
	}
}
