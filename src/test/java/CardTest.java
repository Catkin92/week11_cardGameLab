import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void hasSuitType() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void hasRankType() {
        assertEquals(RankType.ACE, card.getRank());
    }
}
