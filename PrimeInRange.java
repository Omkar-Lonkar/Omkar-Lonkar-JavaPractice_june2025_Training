import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        int fromNumber;
        int toNumber;
        System.out.println("Enter Number Range(smallest to largest with space separated): ");
        Scanner scanner = new Scanner(System.in);
        fromNumber = scanner.nextInt();
        toNumber = scanner.nextInt();
        int num = fromNumber;
        int count = 0;
        while(num<toNumber){    
        int i = 2;
        while(i< num){
            if(num%i==0)
                break;
            i++;
        }
        if(i==num){
        System.out.println(num + " is prime. " + "count = "+ count);
        count++;
        }
        num++;
    }
    }
}



    

