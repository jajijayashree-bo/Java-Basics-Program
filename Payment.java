import java.util.Scanner;

// Parent Class
class PaymentMethod {
    void makePayment(double amount) {
        System.out.println("Processing payment...");
    }
}

// UPI Payment
class UPIPayment extends PaymentMethod {
    @Override
    void makePayment(double amount) {
        if (amount > 0) {
            System.out.println("UPI Payment of ₹" + amount + " Successful");
        } else {
            System.out.println("UPI Payment Failed");
        }
    }
}

// Card Payment
class CardPayment extends PaymentMethod {
    @Override
    void makePayment(double amount) {
        if (amount >= 100) {
            System.out.println("Card Payment of ₹" + amount + " Successful");
        } else {
            System.out.println("Card Payment Failed (Minimum ₹100 required)");
        }
    }
}

// Net Banking
class NetBankingPayment extends PaymentMethod {
    @Override
    void makePayment(double amount) {
        if (amount <= 50000) {
            System.out.println("Net Banking Payment of ₹" + amount + " Successful");
        } else {
            System.out.println("Net Banking Payment Failed (Limit Exceeded)");
        }
    }
}

// Main Class
public class Payment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=== PAYMENT SYSTEM ===");
            System.out.println("1. UPI Payment");
            System.out.println("2. Card Payment");
            System.out.println("3. Net Banking");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thank you! Exiting...");
                break;
            }

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            PaymentMethod p = null;

            if (choice == 1) {
                p = new UPIPayment();
            } 
            else if (choice == 2) {
                p = new CardPayment();
            } 
            else if (choice == 3) {
                p = new NetBankingPayment();
            } 
            else {
                System.out.println("Invalid Choice");
                continue;
            }

            p.makePayment(amount);   // Runtime Polymorphism
        }

        sc.close();
    }
}
