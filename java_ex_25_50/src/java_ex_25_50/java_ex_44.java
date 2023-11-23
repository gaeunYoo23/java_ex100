package java_ex_25_50;
import java.util.Scanner; 
public class java_ex_44 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        String result = isWorkDay(dayOfWeek) ? "oh my god" : "enjoy";
        System.out.println(result);
        scanner.close();
    }

   
    public static boolean isWorkDay(int dayOfWeek) {
        return (dayOfWeek == 1 || dayOfWeek == 3 || dayOfWeek == 5 || dayOfWeek == 7);
    }
}
