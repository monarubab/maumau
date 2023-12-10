package maumau;

import java.util.Arrays;

public class Card {

    public enum Suit {
        HEARTS("♥️"),
        SPADES("♠️"),
        CLUBS("♣️"),
        DIAMONDS("♦️");
        
        private String symbol;

        Suit(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    private Suit suit;
    private String value;
    public static final String[] LEGAL_VALUES = {"7", "8", "9", "10", "J", "Q", "K", "A"};

    public Card(Suit suit, String value) {
        if(!Arrays.asList(LEGAL_VALUES).contains(value) || suit == null){
            throw new IllegalArgumentException();
        }
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return value + suit.getSymbol();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Card)) {
            return false;
        }
        
        Card card = (Card) object;
        return suit == card.suit && value.equals(card.value);
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }
}
