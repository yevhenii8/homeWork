package homeWork2.task1;

import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Deck deck = new Deck();

        int players;
        final int cardsForPlayer = 5;
        int deckLength = deck.deckLength;

        final Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= deckLength) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
        deck.deckShuffling();
        deck.theShuffledDeckIsDisplayed(cardsForPlayer, players);
    }
}
