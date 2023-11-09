package java_ex_1_25;
import java.util.Scanner;

public class java_ex_25 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if (a!=b)
		    System.out.print("1");
		else
			System.out.print("0");
		s.close();
	}

}
