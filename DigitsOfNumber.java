import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int count = 0;
        int[] digits = new int[15];
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        int n = number;
        int sum=0;
        while (n != 0) {
            int digit = n % 10;
            digits[count++] = digit;
            n /= 10;
            }
            for (int i = count - 1; i >= 0; i--){
                sum = sum + digits[i];
                System.out.print(digits[i] + " ");
            }   
            System.out.println("Sum: " + sum); 
        }
    }

