/*
 * 11/AUG/2026
 * Dealer
 * This portion houses all of the code
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
        if(startgame.equals(startgamea)) // Game will run off of this loop and the code will proceed in here.
        {
            System.out.println("\nGreat, let's begin!\n");

            Random generator = new Random();
            int randomCard = generator.nextInt(card.length); // This is what generates the random card numbers from the Array!
            int randomCard2 = generator.nextInt(card.length); // Another has been created due to my limited knowledge with Arrays.
            int randomCard3 = generator.nextInt(card.length);
            int randomCard4 = generator.nextInt(card.length);
            int randomCard5 = generator.nextInt(card.length);

            System.out.println(randomCard + " is your card.\n");
            System.out.println("\nWould you like to test your luck and hit or stand with this final number?\nPlease type 'Hit', if so, if not, please type 'Stand'\n");

            String nextcard = "Hit";
            String nextcarda = scanner.nextLine();
            if(nextcard.equals(nextcarda)) // tests the case for the word 'Hit', if not it'll default to else.
            {
                System.out.println("\n" + randomCard2);
            }
            else
            {
                System.out.println("You have chosen to stand.");
            }

            System.out.println("\nWould you like to test your luck and hit or stand with this final number?\nPlease type 'Hit', if so, if not, please type 'Stand'\n");

            int x = 0;
            while(x != 0)
            {
                if(nextcard.equals(nextcarda)) // tests the case for the word 'Hit', if not it'll default to else.
                {
                    System.out.println("\n" + randomCard3);

                        if(nextcard.equals(nextcarda)) // tests the case for the word 'Hit', if not it'll default to else.
                        {
                        System.out.println("\n" + randomCard4);
                        }
                        else
                        {
                            System.out.println("You have chosen to stand.");
                        }
                }
                    else
                {
                    System.out.println("You have chosen to stand.");
                }
            }
        }
        else if(startgame.equals(endgame))
        {
            System.out.println("Goodbye!");
        }
        else
        {
            System.out.println("You've made an error by typing an option not on the list or improper capitalization. Please rerun the program.");
        }
       // System.out.println;

    }
}
