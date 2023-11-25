package java_ex_50_75;
import java.util.Scanner;

public class java_ex_53 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double result = calculateMaxValue(a, b);
        System.out.printf("%.6f\n", result);

        scanner.close();
    }

 
    private static double calculateMaxValue(double a, double b) {
        double sum = a + b;
        double difference1 = a - b;
        double difference2 = b - a;
        double product = a * b;
        double quotient1 = a / b;
        double quotient2 = b / a;
        double square1 = Math.pow(a, b);
        double square2 = Math.pow(b, a);

        double[] results = {sum, difference1, difference2, product, quotient1, quotient2, square1, square2};

        double max = results[0];
        for (double result : results) {
            if (result > max) {
                max = result;
            }
        }

        return max;
    }
}
