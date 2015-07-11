import java.util.List;
import java.util.Scanner;


/* I will add some stupid multiline comment here on purpuose, just to try out
   git diff features and stuff.
 */

// Main class of the project - stupid comment, delete on next commit
public class Main {

    private enum Reel { CHERRIES, ORANGES, PLUMS, BELLS, MELONS, BARS }

    private static final int numOfReels = 3;

    public static void main(String[] args) {

        double currBet;
        String response;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter the amount of money you want to insert into the slot machine: ");

            currBet = keyboard.nextDouble();

            // Generate randomReels

            // Print result

            // Determine the profit and add it to amountWon

            // Ask user if he wants to continue
            System.out.print("Do you want to continue playing? (Y / N)");
            response = keyboard.next();
        } while (response.equals("Y") || response.equals("y"));

        // Print the final amountWon
    }
}
