
public class First50Prime {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count < 50) {
            int i = 2;
            while (i < num) {
                if (num % i == 0)
                    break;
                i++;
            }
            if (i == num) {
                System.out.println(num + " is prime. " + "count = " + count);
                count++;
            }
            num++;
        }
    }
}
