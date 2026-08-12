/*
 * 11/AUG/2026
 * Dealer
 * This portion houses all of the code
 */

// Notes:

/*
 * Add 'Dealer Total' to show the user the dealer's final number at the end
 * Compare both totals to award victory to user or dealer.
 * Add double opportunity.
 * Fix game start not allowing 'Yes' after failing first auth.
 * Find a way to have Ace resemeble either 1 or 11 depending on the user's total.
 * Integrate a UI.
 * Integrate a betting/currency system.
 * Add dealer AI.
 */

 import java.util.Random;
 //import java.util.*;
 import java.util.Scanner;

 public class dealer

{
   public static void main(String[] args)
    {
        //dealer Tony = new dealer();
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
                int playerTotal = 0;

            System.out.println("\nGreat, let's begin!\n");

            Random generator = new Random();
            int Card = generator.nextInt(card.length);
            String x = card[Card];
            playerTotal += getCardValue(x);

                    System.out.println("\n" + x + " is your card.\n");
                    System.out.println("Your total is: " + playerTotal);

            String choice = "";
            while (!choice.equalsIgnoreCase("Stand"))
            {

             System.out.println("\nWould you like to test your luck and hit or stand with this final number?\nPlease type 'Hit', if so, if not, please type 'Stand'\n");
              choice = scanner.nextLine();



                if(choice.equalsIgnoreCase("Hit"))
                {
                     int nextCard = generator.nextInt(card.length);
                     String newCard = card[nextCard];
                    playerTotal += getCardValue(newCard);
                    
                    System.out.println("\n" + newCard + " is your card.\n");
                    System.out.println("Your total is: " + playerTotal);

                    if(playerTotal > 21)
                    {
                        System.out.println("Bust! You have exceeded 21. Game over.");
                        break;
                    }

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

        scanner.close();
    }

    public static int getCardValue(String cardName)
    {
        switch (cardName)
        {
            case "Ace":
                return 11;
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                return Integer.parseInt(cardName);
        }
    }
}

