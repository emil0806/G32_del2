package game;

import java.util.Scanner;

public class Game {
    private Player player1 = new Player("Player 1");
    private Player player2 = new Player("Player 2");
    private Board board = new Board();
    private Cup cup = new Cup();
    private Output output = new Output();

    private int turnCount = 0;

    private Scanner scanner = new java.util.Scanner(System.in);

    public void startGame() {

        output.displayRules();
        scanner.nextLine();

        output.enterPlayerName(player1.getPlayerName());
        player1.setPlayerName(scanner.nextLine());

        output.enterPlayerName(player2.getPlayerName());
        player2.setPlayerName(scanner.nextLine());

        int coinFlip = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
        if (coinFlip == 1) {
            output.showCoinflip(player1.getPlayerName());
            playGame(player1, player2);
        } else {
            output.showCoinflip(player2.getPlayerName());
            playGame(player2, player1);
        }
    }

    public void playGame(Player player1, Player player2) {
        while ((player1.getAccount() < 3000 || player2.getAccount() < 3000)) {
            if (turnCount % 2 == 0 && (player1.getAccount() >= 3000 || player2.getAccount() >= 3000)) {
                break;
            } else if (turnCount % 2 == 0) {
                output.playerRollDice(player1.getPlayerName());
                scanner.nextLine();
                playerTurn(player1, cup);
            } else {
                output.playerRollDice(player2.getPlayerName());
                scanner.nextLine();
                playerTurn(player2, cup);
            }
        }
    }

    public void playerTurn(Player player, Cup cup) {
        cup.setRollSum();

        // Printing value of each die and the sum
        output.sumDice(cup.getRollSum());

        if (cup.getRollSum() == 10) {
            extraTurn(player, cup);
        } else {
            Field field = board.getField(cup.getRollSum() - 2);
            output.displayFieldText(field.getDescription());
            player.setAccount(field.getValue());
        }

        output.displayScoreboard(player1.getPlayerName(), player1.getAccount());
        output.displayScoreboard(player2.getPlayerName(), player2.getAccount());

        // Updating number of turns
        turnCount++;

        if (turnCount % 2 == 0) {
            if (player1.getAccount() >= 3000) {
                output.winnerGame(player1.getPlayerName());
            } else if (player2.getAccount() >= 3000) {
                output.winnerGame(player2.getPlayerName());
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
