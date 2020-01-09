import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        card = new Card(SuitType.CLUBS, RankType.QUEEN);
    }

    @Test
    public void deckStartsEmpty() {
        deck = new Deck();
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canPopulateDeck() {
        assertEquals(52, deck.countCards());
    }

    @Test
    public void deckStartsUnshuffled() {
        Card card = deck.findCard(0);
        Card card2 = deck.findCard(25);
        assertEquals(SuitType.HEARTS, card.getSuit());
        assertEquals(RankType.TWO, card.getRank());
        assertEquals(SuitType.DIAMONDS, card2.getSuit());
        assertEquals(RankType.ACE, card2.getRank());
    }

    @Test
    public void canShuffleDeck() {
        Card card = deck.findCard(0);
        Card card3 = deck.findCard(25);
        deck.shuffle();
        Card card2 = deck.findCard(0);
        Card card4 = deck.findCard(25);
        assertNotSame(card, card2);
        assertNotSame(card3, card4);

    }

}
