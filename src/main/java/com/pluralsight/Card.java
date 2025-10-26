package com.pluralsight;

public class Card {
    private String value;
    private String suit;
    private boolean isFaceUp;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
        this.isFaceUp = false;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }
    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public void flip() {
        isFaceUp = true;
    }

    public int getPointValue() {
        if (!isFaceUp) {
            return 0;
        }
        switch (value) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10", "J", "Q", "K":
                return 10;
            case "A":
                return 11;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
