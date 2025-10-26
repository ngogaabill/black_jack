package com.pluralsight;

public class Player {
    private String playerName;
    private Hand hand;

    public Player(String playerName) {
        this.playerName = playerName;
        this.hand = new Hand();

    }

    public String getPlayerName() {
        return playerName;
    }
    public Hand getHand() {
        return hand;
    }
    public void showHand(){
        System.out.println("Player"+playerName+"'s hand:");
        hand.displayHand();
        System.out.println("Total value:"+hand.getValue());
    }

}
