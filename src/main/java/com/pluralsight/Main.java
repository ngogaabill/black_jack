package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter Your Name Player1:");
//        String playerName1 = scanner.nextLine();
//        System.out.println("Enter Your Name Player2:");
//        String playerName2 = scanner.nextLine();

        startGame();
    }

    private static void startGame() {
        Hand hand = new Hand();
        Deck deck = new Deck();
        //Develop a random card and deal the card
        System.out.println("Cards in a deck" + deck.getSize());
        Card card = new Card(deck.deal().getValue(), deck.deal().getSuit(), true);
        System.out.println(card.toString());
    }
}