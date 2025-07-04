import java.util.Scanner;

public class CustomerPayment extends Thread {
    String name;
    double amount;
    MerchantAccount merchantAccount;

    
    public void run() {
        merchantAccount.deposit(amount, name);
    }

    public CustomerPayment(MerchantAccount merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

     public void setCustomerName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setMerchantAccount(MerchantAccount merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

}
