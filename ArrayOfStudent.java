import java.util.Scanner;

public class ArrayOfStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = Integer.parseInt(sc.nextLine());
        Student1[] students = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll number:");
            int roll = Integer.parseInt(sc.nextLine());

            System.out.println("Enter number of subjects:");
            int num = Integer.parseInt(sc.nextLine());

            float[] marks = new float[num];
            for (int j = 0; j < num; j++) {
                System.out.println("Enter marks: ");
                marks[j] = Float.parseFloat(sc.nextLine());
            }

            System.out.println("Enter name:");
            String name = sc.nextLine();

            students[i] = new Student1(roll, num, marks, name);
        }

        System.out.println("Printing Details");
        for (Student1 student : students) {
            student.calculatePercentage();
            student.calculateGrade();
            student.printDetails();
            System.out.println("------------------");
        }
        sc.close();
    }
}