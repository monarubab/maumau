package maumau;

import java.util.ArrayList;
import java.util.List;

public class Maumau {
    public static List<Card> makeDeck(){
        List<Card> deck = new ArrayList<Card>();
        for (Card.Suit suit : Card.Suit.values()){
            for (String value : Card.LEGAL_VALUES){
                deck.add(new Card(suit, value));
            }
        }

        return deck;
    }
    
    public static void main (String[] args) {

        List<Card> deck = makeDeck();

        for (Card card : deck){
            System.out.println(card.toString());
        }
    }
}
