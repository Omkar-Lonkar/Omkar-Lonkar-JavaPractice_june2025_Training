import java.util.Scanner;

public class TestPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MerchantAccount merchantAccount = new MerchantAccount();
        CustomerPayment[] payments = new CustomerPayment[5];
        for (int i = 0; i < payments.length; i++) {
            payments[i] = new CustomerPayment(merchantAccount);
            System.out.println("Enter Amount: ");
            payments[i].setAmount(Double.parseDouble(sc.nextLine()));
            System.out.println("Enter Name: ");
            payments[i].setCustomerName(sc.nextLine());
        }
        for(CustomerPayment payment : payments){
            payment.start();
        }
    }
}