import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int count = 5;
        int number = 200;
        int smallerNumber = 0;
        int biggerNumber = 100;
        int randomNumber = rand.nextInt((100) + 1);

        System.out.println("GUESS THE NUMBER");
        while (number != randomNumber && count > 0) {

            System.out.printf("""
            Insert a number between %d and %d
            """, smallerNumber, biggerNumber);

            count--;
            number = Integer.parseInt(scan.nextLine());

            if ( number < randomNumber) {
                if (number > smallerNumber){
                    smallerNumber = number;
                }
                System.out.printf("""
                        The number %d is smaller than the random number
                        You have %d tries left
                        
                        """, number, count);

            } else if ( number > randomNumber) {
                if ( number < biggerNumber) {
                    biggerNumber = number;
                }
                System.out.printf("""
                        The number %d is bigger than the random number
                        You have %d tries left
                        
                        """, number, count);
            } else {
                System.out.printf("That's the number %d, well done!, you waste %d tries", randomNumber, (5 - count));
            }
        }
    }
}