package homeWork2.task1;

import java.util.Random;

public class Deck {

    final int deckLength = Rank.values().length * Suit.values().length;
    Card[] deck = new Card[deckLength];
    final Random random = new Random();

    public Deck() {
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Rank.values().length; j++) {

                deck[i] = new Card(Suit.values()[i], Rank.values()[j]);
            }
        }
    }

    public void deckShuffling() {
        for (int i = 0; i < deckLength; i++) {
            int card = i + (random.nextInt(deckLength - i));
            Card buff = deck[card];
            deck[card] = deck[i];
            deck[i] = buff;

        }
    }
    public void theShuffledDeckIsDisplayed(int cardsForPlayer, int players) {
        for (int i = 0; i < players; i++) {
            System.out.println("игрок " + (i + 1));
            for (int j = 0; j < cardsForPlayer; j++) {
                System.out.println(deck[i]);
            }
        }
    }
 }
