import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void populateDeck() {

        for (SuitType suit : SuitType.values()) {

            for (RankType rank : RankType.values()) {

                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public boolean linearSearch(Card searchCard) {
        for (Card card : this.cards) {
            if(card == searchCard) {
                return true;
            }
        }
        return false;
    }

    public Card findCard(int index) {
        return this.cards.get(index);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
}
