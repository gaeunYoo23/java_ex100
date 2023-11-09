package java_ex_1_25;
import java.util.Scanner;
public class java_ex_20 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int sum=a+b+c;
		float avg=sum/3;
		System.out.printf("%d\n%.1f",sum,avg);
		s.close();
		}

}
