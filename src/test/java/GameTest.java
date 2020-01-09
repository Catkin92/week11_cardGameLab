import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void startsWithNoPlayers() {
        assertEquals(0, game.countPlayers());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.countPlayers());
    }

    @Test
    public void gameReturnsWinner() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(player1, game.playGame());
    }
}
