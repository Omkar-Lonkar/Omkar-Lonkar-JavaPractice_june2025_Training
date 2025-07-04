public class MerchantAccount {
    double balance = 0;

    public void deposit(double amount, String name) {
        // balance = balance + amount;
        System.out.println("Amount " + amount + " deposited in account by " + name + " and current balance="
                + (balance = balance + amount));
        // System.out.println("Current Balance: " + balance);
    }
}