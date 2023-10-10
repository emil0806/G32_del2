package game;

import java.util.Scanner;

public class Game {
    private Player player1 = new Player("");
    private Player player2 = new Player("");
    private Cup cup = new Cup();

    private int turnCount = 0;

    private Scanner scanner = new java.util.Scanner(System.in);

    public void startGame() {
        int coinFlip = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
        if (coinFlip == 1) {
            System.out.println(player1.getPlayerName() + " won the coin flip.");
            playGame(player1, player2);
        } else {
            System.out.println(player2.getPlayerName() + " won the coin flip.");
            playGame(player2, player1);
        }
    }

    public void playGame(Player player1, Player player2) {
        while ((player1.getAccount() < 3000 || player2.getAccount() < 3000)) {
            if (turnCount % 2 == 0) {
                System.out.println(player1.getPlayerName() + ", press ENTER to roll dice");
                scanner.nextLine();
                playerTurn(player1, cup);
            } else {
                System.out.println(player2.getPlayerName() + ", press ENTER to roll dice");
                scanner.nextLine();
                playerTurn(player2, cup);
            }
        }
    }

    public void playerTurn(Player player, Cup cup) {

    }

    public void extraTurn(Player player, Cup cup) {

    }

}
