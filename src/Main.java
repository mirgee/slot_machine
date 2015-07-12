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
        double balance = 0;
        double balanceStart = 0;
        String response = "";
        int round = 0;
        final double costPerRound = 10;

        Scanner keyboard = new Scanner(System.in);

        // Ask for balance to start with
        System.out.print("Enter the balance you want to start with (each round costs $" + costPerRound + "): ");
        balance = keyboard.nextDouble();
        balanceStart = balance;

        response = "Y";

        while (balance > costPerRound && (response == "Y" || response == "y")){
            System.out.println("Round " + (++round));
            System.out.print("Enter the amount of money you want to bet: ");

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
            balance += profit - costPerRound;
            System.out.println("Your current account balance is " + balance);

            if(balance > costPerRound) {
                // Ask user if he wants to continue
                System.out.print("Do you want to continue playing? (Y / N)");
                response = keyboard.next();
            } else {
                System.out.println("You don't have enough money left to continue. Better luck next time.");
                break;
            }
        }

        // Print the final amountWon
        System.out.println("You won $" + amountWon);
        System.out.println("Your final account balance is $" + balance);
        System.out.println("So your final profit is $" + (balance - balanceStart));
    }
}
