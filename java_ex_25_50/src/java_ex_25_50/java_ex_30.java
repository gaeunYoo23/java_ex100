package java_ex_25_50;
import java.util.Scanner;

public class java_ex_30 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a<0) {
			System.out.print("minus\n");
			
			if(a%2==0) {
				System.out.print("even");
			}		
			else {
				System.out.print("odd");}
		}
		else {
			System.out.print("plus\n");
			
			if(a%2==0) {
				System.out.print("even");
			}		
			else {
				System.out.print("odd");}
		}
	
		s.close();
    }
}
