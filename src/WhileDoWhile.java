public class WhileDoWhile {

    public static void main(String[] args) {

        int i = 0;

        // WHILE loop will be executed while the variable is less than the condition
        // if the condition is never reached, it will generate an infinite loop
        System.out.println("WHILE");
        while( i < 10) {
            System.out.print(i++ + " ");
        }
        // use while to get the even numbers between 1 and 20
        System.out.println("\nFrom 1 to 20");
        int num = 1;
        while( num <= 20) {
            if ( num % 2 == 0){
                System.out.print(num + " ");
            }
            num++;
        }

        // DO WHILE evaluates the condition after the execution of the code
        // It is the same as while, but it will  be executed at least once
        System.out.println("\nDO WHILE");
        int x = 0;
        do {
            System.out.print(x++ + " ");
        } while (x < 3);

        // print the numbers from 10 to 1 using do while
        System.out.println("\nFrom 10 to 0");
        int num_inv = 10;
        do {
            System.out.print(num_inv-- + " ");
        } while (num_inv > 0);

        // use do while to print even numbers form 0 to 20
        System.out.println("\nEven Numbers");
        int even_number = 0;
        do {
            if (even_number % 2 != 0) System.out.print(even_number + " ");
            even_number++;
        } while (even_number <= 20);

        // triangular number of 5
        System.out.println("\nPrint triangular numbers of 5");
        final int triangularNumber = 5;
        int tNumber = 1;
        int total = 0;
        while(tNumber <= triangularNumber) {
            if (tNumber != triangularNumber)
                System.out.print(tNumber + " + ");
            else
                System.out.print(tNumber + " = ");
            total += tNumber;
            tNumber++;
        }
        System.out.println(total);

    }

}
