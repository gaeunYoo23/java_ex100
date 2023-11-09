package java_ex_1_25;
import java.util.Scanner;

public class java_ex_15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		int m=s.nextInt();
		int d=s.nextInt();
		System.out.printf("%04d.%02d.%02d",y,m,d);
        s.close();
    }
}
