package java_ex_25_50;
import java.util.Scanner;
public class java_ex_38 {
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int base = scanner.nextInt();
	   int height = scanner.nextInt();
	   double area = (double) (base * height) / 2;
	   System.out.printf("%.1f\n", area);

       scanner.close();
    }
}
