package game;

import java.util.Scanner;

public class Game {
    private Player player1 = new Player("");
    private Player player2 = new Player("");
    private Board board = new Board();
    private Cup cup = new Cup();
    private Output output = new Output();

    private int turnCount = 0;

    private Scanner scanner = new java.util.Scanner(System.in);

    public void startGame() {

        output.displayRules();

        output.enterPlayerName(player1);

        output.enterPlayerName(player2);

        int coinFlip = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
        if (coinFlip == 1) {
            output.showCoinflip(player1);
            playGame(player1, player2);
        } else {
            output.showCoinflip(player2);
            playGame(player2, player1);
        }
    }

    public void playGame(Player player1, Player player2) {
        while ((player1.getAccount() < 3000 || player2.getAccount() < 3000)) {
            if (turnCount % 2 == 0 && (player1.getAccount() >= 3000 || player2.getAccount() >= 3000)) {
                break;
            } else if (turnCount % 2 == 0) {
                output.playerRollDice(player1);
                scanner.nextLine();
                playerTurn(player1, cup);
            } else {
                output.playerRollDice(player2);
                scanner.nextLine();
                playerTurn(player2, cup);
            }
        }
    }

    public void playerTurn(Player player, Cup cup) {
        cup.setRollSum();

        // Printing value of each die and the sum
        output.sumDice(cup);

        if (cup.getRollSum() == 10) {
            extraTurn(player, cup);
        } else {
            Field field = board.getField(cup.getRollSum() - 2);
            output.displayFieldText(field.getDescription());
            player.setAccount(field.getValue());
        }

        output.displayScoreboard(player1, player2);

        // Updating number of turns
        turnCount++;

        if (turnCount % 2 == 0) {
            if (player1.getAccount() >= 3000) {
                output.winnerGame(player1);
            } else if (player2.getAccount() >= 3000) {
                output.winnerGame(player2);
            }
        }

    }

    public void extraTurn(Player player, Cup cup) {
        Field field = board.getField(cup.getRollSum() - 2);
        player.setAccount(field.getValue());
        // Substracts one from turncount, so player gets to roll again
        turnCount -= 1;
    }

}
