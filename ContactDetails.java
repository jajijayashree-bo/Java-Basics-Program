import java.util.Scanner;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class ContactDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        long[] numbers = new long[10];

        int count = 0;

        while (count < 10) {

            System.out.println("\nEnter Contact " + (count + 1));

            System.out.print("Enter Name: ");
            names[count] = sc.nextLine();

            System.out.print("Enter Number: ");
            long newNumber = sc.nextLong();
            sc.nextLine(); // clear buffer

            try {
                for (int i = 0; i < count; i++) {
                    if (numbers[i] == newNumber) {
                        throw new DuplicateNumberException("Number already exists!");
                    }
                }

                numbers[count] = newNumber;
                count++;

                System.out.println("Contact Saved Successfully.");

            } catch (DuplicateNumberException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nAll Contacts Stored Successfully.");
        sc.close();
    }
}