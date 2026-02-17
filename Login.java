import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        int correctPass = 1234;

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        if (username.equals(correctUser)) {

            int attempts = 0;

            while (attempts < 3) {

                System.out.print("Enter Password: ");
                int password = sc.nextInt();

                if ((password - correctPass == 0) && username.equals(correctUser)) {

                    System.out.println("Login Successful");
                    break;   // stop loop if correct
                } else {

                    attempts++;
                    if (attempts == 3) {
                        System.out.println("Account Blocked");
                    } else {
                        System.out.println("Wrong Password. Attempts left: " + (3 - attempts));
                    }
                }
            }

        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}
