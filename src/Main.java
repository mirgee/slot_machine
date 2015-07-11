import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* I will add some stupid multiline comment here on purpuose, just to try out
   git diff features and stuff.
 */

public class Main {

    public static void main(String[] args) {

        double currBet = 0;
        double amountWon = 0;
        double profit = 0;
        String response = "";

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter the amount of money you want to insert into the slot machine: ");

            currBet = keyboard.nextDouble();

            List<Reel.ReelType> reels = new ArrayList<Reel.ReelType>(Reel.NUMOFREELS);

            // Generate randomReels
            for(int i = 0; i < Reel.NUMOFREELS; i++) {
                reels.add(Reel.generateRandomReel());
            }

            for(Reel.ReelType r : reels) {
                System.out.print(r.toString() + " ");
            }
            System.out.println();

            // Determine the profit and add it to amountWon
            profit = Reel.calculateProfitPercentage(reels) * currBet;
            System.out.println("Your profit is $" + profit);
            amountWon += profit;
            System.out.println("So far, you have won $" + amountWon);

            // Ask user if he wants to continue
            System.out.print("Do you want to continue playing? (Y / N)");
            response = keyboard.next();
        } while (response.equals("Y") || response.equals("y"));

        // Print the final amountWon
        System.out.println("You won " + amountWon);
    }
}
