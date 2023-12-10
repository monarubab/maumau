package maumau;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class MaumauTest {

    @Test
    public void deckSize32(){
        List<Card> deck = Maumau.makeDeck();

        Assert.assertEquals(32, deck.size());
    }

     @Test
    public void deckHasUniqueCards(){
        List<Card> deck = Maumau.makeDeck();
        Set<Card> uniqueCards = new HashSet<>(deck);

        Assert.assertEquals(32, uniqueCards.size());
    }

    @Test
    public void eachSuitAppears8Times() {
        List<Card> deck = Maumau.makeDeck();

        for (Card.Suit suit : Card.Suit.values()) {
            int count = 0;
            for (Card card : deck) {
                if (card.getSuit() == suit) {
                    count++;
                }
            }
            Assert.assertEquals(8, count);
        }
    }

    @Test
    public void eachValueAppear4Times() {
        List<Card> deck = Maumau.makeDeck();
 
        for (String value : Card.LEGAL_VALUES) {
            int count = 0;
            for (Card card : deck) {
                if (card.getValue() == value) {
                    count++;
                }
            }
            Assert.assertEquals(4, count);
        }
    }
    
}
