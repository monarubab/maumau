package maumau;

import org.junit.Assert;

import org.junit.Test;

public class CardTest {

    @Test
    public void createsCard() {
        Card card = new Card(Card.Suit.HEARTS, "7");
        Assert.assertEquals(Card.Suit.HEARTS, card.getSuit());   
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardConstructorWithIllegalValueThrowsIllegalArgumentException() {
        new Card(Card.Suit.HEARTS, "11");
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardConstructorWithNullSuitThrowsIllegalArgumentException() {
        new Card(null, "7");
    }

    @Test
    public void cardsWithSameSuitAndValueAreEqual() {      
        Card card1 = new Card(Card.Suit.HEARTS, new String("7"));
        Card card2 = new Card(Card.Suit.HEARTS, "7");

        Assert.assertTrue(card1.equals(card2));
    }

    @Test
    public void cardsWithSameSuitsDifferentValuesNotEqual() {
        Card card1 = new Card(Card.Suit.HEARTS, "7");
        Card card2 = new Card(Card.Suit.HEARTS, "9");

        Assert.assertFalse(card1.equals(card2));       
    }

    @Test
    public void cardsWithDifferentSuitsSameValuesNotEqual() {
        Card card1 = new Card(Card.Suit.HEARTS, "7");
        Card card2 = new Card(Card.Suit.CLUBS, "7");

        Assert.assertFalse(card1.equals(card2));
    }

    @Test
    public void cardWithNonCardObject(){
        Card card = new Card(Card.Suit.HEARTS, "7");
        String str = new String();
        
        Assert.assertFalse(card.equals(str));
    }

    @Test
    public void cardWithNull(){
        Card card = new Card(Card.Suit.HEARTS, "7");

        Assert.assertFalse(card.equals(null));
    }

    @Test
    public void toStringReturnCorrectString(){
        Card card = new Card(Card.Suit.HEARTS, "7");
        String expected = "HEARTS7";
        
        Assert.assertEquals(expected, card.toString());
    }

    @Test
    public void getSuit(){
         Card card = new Card(Card.Suit.HEARTS, "7");
         
         Assert.assertEquals(Card.Suit.HEARTS, card.getSuit());
    }
}
