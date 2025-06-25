import java.util.Scanner;

public class LeftSpacing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        int count = scan.nextInt();
        System.out.printf("%-15s%03d\n", input, count);
        scan.close();
    }

}