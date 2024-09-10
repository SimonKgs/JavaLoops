import java.util.Scanner;

public class interactiveMenu {
    public static void main(String[] args) {
        // This is an interactive menu generated with a while loop.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Administration system\n");
        int selectedOption;
        do {
            System.out.println("""
            1. Create account
            2. Delete account
            3. exit
            """);


            System.out.println("Select an option(1, 2 o 3)");
            selectedOption = Integer.parseInt(scanner.nextLine());

            switch (selectedOption){
                case 1 -> System.out.println("Creating new account");
                case 2 -> System.out.println("Deleting account");
                case 3 -> System.out.println("Exit");
                default -> System.out.println("That is not an option");
            }

        } while (selectedOption != 3);
    }
}
