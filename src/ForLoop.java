public class ForLoop {
    public static void main(String[] args) {

        // In FOR loops, the variable, condition, and update (modification of the variable)
        // are all declared together in the loop's header.
        System.out.println("FOR LOOP");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        // get the even numbers now using for loop
        System.out.println("\nEven numbers with for loop");
        for (int even = 0; even <= 20; even++ ) {
            if (even % 2 == 0) System.out.print(even + " ");
        }


        // print

    }
}
