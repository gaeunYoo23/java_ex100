package java_ex_75_100;
import java.util.Scanner;
import java.util.TreeMap;
public class java_ex_96 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        TreeMap<Integer, String> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
      
            String name = scanner.next();
            int score = scanner.nextInt();

            students.put(score, name);
        }

     
        String thirdHighest = getThirdHighestStudent(students);

        System.out.println(thirdHighest);

 
        scanner.close();
    }

    private static String getThirdHighestStudent(TreeMap<Integer, String> students) {
        if (students.size() < 3) {
            System.out.println("There are not enough students.");
            return "";
        }

        int count = 0;
        String thirdHighest = "";
        for (int score : students.descendingKeySet()) {
            count++;
            if (count == 3) {
                thirdHighest = students.get(score);
                break;
            }
        }

        return thirdHighest;
    }
}
