import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedOption;
        int totalAmount = 1000;
        int amountToOperate;

        do {
            System.out.printf("""
            --------------------
            CURRENT AMOUNT: %d€
            --------------------
            
            1. Deposit
            2. Withdraw
            3. exit
            
            """, totalAmount);


            System.out.println("Select an option(1, 2, 3, 4)");
            selectedOption = Integer.parseInt(scanner.nextLine());

            switch (selectedOption){
                case 1 -> {
                    System.out.printf("""
                            
                            How much you want to deposit on the account?
                            your current amount is %d€
                            
                            """, totalAmount);
                    amountToOperate = Integer.parseInt(scanner.nextLine());

                    if (amountToOperate > 0){
                        totalAmount += amountToOperate;

                        System.out.printf("""
                            
                            You deposit %d€
                            The new current amount is %d€
                            
                            """, amountToOperate, totalAmount);
                    } else {
                        System.out.println("You cannot add that quantity");
                    }


                }

                case 2 -> {
                    System.out.printf("""
                            
                            How much you want to withdraw?
                            your current amount is %d€
                            
                            """, totalAmount);
                    amountToOperate = Integer.parseInt(scanner.nextLine());

                    if ( amountToOperate <= totalAmount && totalAmount > 0) {
                        totalAmount -= amountToOperate;

                        System.out.printf("""
                                
                                You withdraw %d€
                                The new current amount is %d€
                                
                                """, amountToOperate, totalAmount);
                    } else {
                        System.out.println("You don't have enough money");
                    }
                }
                case 3 -> System.out.println("Exit");
                default -> System.out.println("That is not an option");
            }

        } while (selectedOption != 3);
    }
}
