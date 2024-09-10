import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("Draw a triangle");

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many lines?");
        int numberOfLines = scanner.nextInt();

        for (int line = 1; line <= numberOfLines; line++) {

            String whiteSpaces = " ".repeat(numberOfLines - line);
            String asterisks = "*".repeat(2 * line - 1);

            System.out.println(whiteSpaces + asterisks);

        }
    }
}
