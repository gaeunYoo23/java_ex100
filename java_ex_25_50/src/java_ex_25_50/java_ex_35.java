package java_ex_25_50;
import java.util.Scanner;
public class java_ex_35 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		for(int i=2;i<n;i+=2) {
			sum+=i;
		}
		System.out.print(sum);
		s.close();
	}

}
