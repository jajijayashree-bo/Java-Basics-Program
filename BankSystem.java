class BankAccount {

    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        double before = balance;
        balance = balance + amount;

        System.out.println("Before Deposit: " + before);
        System.out.println("After Deposit: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            double before = balance;
            balance = balance - amount;

            System.out.println("Before Withdraw: " + before);
            System.out.println("After Withdraw: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(300);
        account.showBalance();
    }
}