/*
 * 11/AUG/2026
 * Dealer
 * This portion houses all of the code
 */

// Notes:

/*
 * Add 'Total' during hit count.
 * Add 'Total' to the end of the game to show the user their final number.
 * Add 'Dealer Total' to show the user the dealer's final number at the end
 * Compare both totals to award victory to user or dealer.
 * Add bust opportunity.
 * Add double opportunity.
 * Fix game start not allowing 'Yes' after failing first auth.
 */

 import java.util.Random;
 import java.util.*;
 import java.util.Scanner;

 public class dealer

{
   public static void main(String[] args)
    {
        dealer Tony = new dealer();
        Scanner scanner = new Scanner(System.in);

        String[] card = new String[14]; // The list for the cards to be dealt in an Array.

        card[0] = "Ace";
        card[1] = "1";
        card[2] = "2";
        card[3] = "3";
        card[4] = "4";
        card[5] = "5";
        card[6] = "6";
        card[7] = "7";
        card[8] = "8";
        card[9] = "9";
        card[10] = "10";
        card[11] = "Jack";
        card[12] = "Queen";
        card[13] = "King";

        // int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        // System.out.println(Arrays.toString(card));
        // Here I turned the Array into a toString to see the functionality of my code.
        // This enabled me to make sure everything printed how I preferred.


        String startgame = "Yes";
        String endgame = "No";

        System.out.println("Welcome to Blackjack! Would you like to play?\nIf so, please type 'Yes', if not, please type 'No'.\n");
        String startgamea = scanner.nextLine();
        if(startgame.equalsIgnoreCase(startgamea)) // Game will run off of this loop and the code will proceed in here.
        {

            System.out.println("\nGreat, let's begin!\n");

            Random generator = new Random();
            int randomCard = generator.nextInt(card.length);

            System.out.println(card[randomCard] + " is your card.\n");

            String choice = "";
            while (!choice.equalsIgnoreCase("Stand"))
            {

             System.out.println("\nWould you like to test your luck and hit or stand with this final number?\nPlease type 'Hit', if so, if not, please type 'Stand'\n");
              choice = scanner.nextLine();

                if(choice.equalsIgnoreCase("Hit"))
                {
                    int nextCard = generator.nextInt(card.length);
                    System.out.println("\n" + card[nextCard] + " is your card.\n");
                }
            
                else if(choice.equalsIgnoreCase("Stand"))
                {
                    System.out.println("You have chosen to stand.");
                }
            
                else
                {
                  System.out.println("Invalid input. Please type 'Hit' or 'Stand'.");
                }

            }
        }

        else if(endgame.equalsIgnoreCase(startgamea)) // If the user types "No" the game will end.
        {
            System.out.println("Thank you for playing, please come back soon!");
        }
            
        else
        {
            System.out.println("You've made an error by typing an option not on the list. Please type 'Yes' or 'No'.");
        }
    }
}

