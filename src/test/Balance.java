package test;

import game.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Balance {
    private Player player1 = new Player("Player 1");
    private Player player2 = new Player("Player 2");

    @Test
    public void startBalance() {
        assertEquals(player1.getAccount(), 1000);
        assertEquals(player2.getAccount(), 1000);
    }

    @Test
    public void depositMoney() {
        player1.setAccount(100);
        player2.setAccount(5000);

        assertEquals(player1.getAccount(), 1100);
        assertEquals(player2.getAccount(), 6000);
    }

    @Test
    public void withdrawMoney() {
        player1.setAccount(-200);
        player2.setAccount(-999);

        assertEquals(player1.getAccount(), 800);
        assertEquals(player2.getAccount(), 1);
    }

    @Test
    public void noChangeInAccount() {
        player1.setAccount(0);
        player2.setAccount(-0);

        assertEquals(player1.getAccount(), 1000);
        assertEquals(player2.getAccount(), 1000);
    }

    @Test
    public void negativeBalance() {
        player1.setAccount(-1000);
        player2.setAccount(-1001);

        assertEquals(player1.getAccount(), 0);
        assertEquals(player2.getAccount(), 0);

        player1.setAccount(10);
        player2.setAccount(1000);

        assertEquals(player1.getAccount(), 10);
        assertEquals(player2.getAccount(), 1000);

        player1.setAccount(-100);
        player2.setAccount(-10000);

        assertEquals(player1.getAccount(), 0);
        assertEquals(player2.getAccount(), 0);
    }
}
