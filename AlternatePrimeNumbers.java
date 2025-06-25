public class AlternatePrimeNumbers {

    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count < 100) {
            int i = 2;
            while (i < num) {
                if (num % i == 0)
                    break;
                i++;
            }
            if (i == num) {
                count++;
                if(count % 2 != 0)
                    System.out.println(num + " is prime. " + "count = " + count);
            } 
            num++;
        }
        
    }
}
