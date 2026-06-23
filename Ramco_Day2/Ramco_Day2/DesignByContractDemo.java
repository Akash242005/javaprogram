 class BankAccount {

    double balance = 5000;

    void withdraw(double amount) {

       
        if (amount <= 0) {
            System.out.println("Invalid Amount");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }

        
        balance = balance - amount;

        
        System.out.println("Balance Updated");
        System.out.println("Receipt Generated");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class DesignByContractDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.withdraw(1000);
    }
} 
