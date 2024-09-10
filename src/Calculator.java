import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operation;

        int number1, number2;
        int total;

        do {

            System.out.printf("""
                    
                    Select an operation
                    1. Add 
                    2. Extract
                    3. Multiply
                    4. Divide
                    0. Close
                    
                    """);
            operation = Integer.parseInt(scanner.nextLine());


            if ( operation != 0) {
                System.out.print("Number 1: ");
                number1 = Integer.parseInt(scanner.nextLine());


                System.out.print("Number 2: ");
                number2 = Integer.parseInt(scanner.nextLine());

                switch (operation) {
                    case 1 -> {
                        total = number1 + number2;
                        System.out.printf("\n%d + %d = %d\n", number1, number2, total);
                    }
                    case 2 -> {
                        total = number1 - number2;
                        System.out.printf("\n%d - %d = %d\n", number1, number2, total);
                    }
                    case 3 -> {
                        total = number1 * number2;
                        System.out.printf("\n%d * %d = %d\n", number1, number2, total);
                    }
                    case 4 -> {
                        if (number2 == 0)
                            System.out.println("\nCannot divide by 0");
                        else {
                            total = number1 / number2;
                            System.out.printf("\n%d / %d = %d\n", number1, number2, total);
                        }

                    }
                    default -> System.out.println("\nThat is not an option\n");
                }

            } else {
                System.out.println("Bye");
            }

        } while (operation != 0);


    }
}
