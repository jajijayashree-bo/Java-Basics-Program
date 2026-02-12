import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {

                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;

                    case 4:
                        if (b != 0)
                            System.out.println("Result: " + (a / b));
                        else
                            System.out.println("Cannot divide by zero!");
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
