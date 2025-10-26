package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Your Name Player1:");
        String playerName1 = scanner.nextLine();
        System.out.println("Enter Your Name Player2:");
        String playerName2 = scanner.nextLine();

        startGame(playerName1,playerName2);
    }

    private static void startGame(String player1,String player2) {

        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
       //shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

       //deal two cards for each player1
        Card card = deck.deal();
        p1.getHand().deal(card);
        p1.getHand().deal(card);
        p1.showHand();
        // deal two cards for each player2

        //Develop a random card and deal the card
        System.out.println("Cards in a deck" + deck.getSize());

        //System.out.println(p1.showHand());
        System.out.println("Do You want Hit or Stay");
        String choice = scanner.nextLine();

    }
}