import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck;
    private Player player;
    private Player player2;
    private ArrayList<Player> players;

    @Before
    public void before() {
        deck = new Deck();
        deck.populateDeck();
        player = new Player();
        player2 = new Player();
        players = new ArrayList<Player>();
        players.add(player);
        players.add(player2);
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

    @Test
    public void canDealCard() {
        deck.dealCard(players);
        assertEquals(50, deck.countCards());
        assertEquals(1, player.countHand());
        assertEquals(1, player2.countHand());
    }

}
