package java_ex_50_75;
import java.util.Scanner;
public class java_ex_62 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();
        int classroom = scanner.nextInt();
        int number = scanner.nextInt();

        String studentID = generateStudentID(grade, classroom, number);
        System.out.println(studentID);

        scanner.close();
    }

    private static String generateStudentID(int grade, int classroom, int number) {

        String gradeStr = String.format("%01d", grade);
        String classroomStr = String.format("%02d", classroom);
        String numberStr = String.format("%03d", number);

        return gradeStr + classroomStr + numberStr;
    }
}
