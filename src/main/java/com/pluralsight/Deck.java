package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};
// these loops create all the cards in the deck
// and add them to the ArrayList
        for (String suit : suits) {
            for (String value : values) {
                Card card = new Card(value, suit,false);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        Random random = new Random();
        if (cards.isEmpty()) {
            return null;
        }
        int randomIndex = random.nextInt(cards.size());
        return cards.remove(randomIndex);
    }

    public int getSize() {
        return cards.size();
    }
}


