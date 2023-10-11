package game;

import java.util.Scanner;

public class Game {
    // Creating players, board, cup and outputs
    private Player player1 = new Player("Player 1");
    private Player player2 = new Player("Player 2");
    private Board board = new Board();
    private Cup cup = new Cup();
    private Output output = new Output();
    // Keeping track of turns
    private int turnCount = 0;
    // Create scanner
    private Scanner scanner = new java.util.Scanner(System.in);

    public void startGame() {
        // Display rules
        output.displayRules();
        scanner.nextLine();
        // Get name of players
        output.enterPlayerName(player1.getPlayerName());
        player1.setPlayerName(scanner.nextLine());

        output.enterPlayerName(player2.getPlayerName());
        player2.setPlayerName(scanner.nextLine());
        // Perform coinflip to decide who starts
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
        // Control game start and end
        while ((player1.getAccount() < 3000 || player2.getAccount() < 3000)) {
            if (turnCount % 2 == 0 && (player1.getAccount() >= 3000 || player2.getAccount() >= 3000)) {
                scanner.close();
                break;
            } else if (turnCount % 2 == 0) {
                // Prompt player to roll dice
                output.playerRollDice(player1.getPlayerName());
                scanner.nextLine();
                // Turn of player 1
                playerTurn(player1, cup);
            } else {
                // Prompt player to roll dice
                output.playerRollDice(player2.getPlayerName());
                scanner.nextLine();
                // Turn of player 2
                playerTurn(player2, cup);
            }
        }
    }

    public void playerTurn(Player player, Cup cup) {
        // Rolling the dice
        cup.setRollSum();

        // Printing the sum of the dice
        output.sumDice(cup.getRollSum());

        // Giving extra turn if sum = 10
        if (cup.getRollSum() == 10) {
            extraTurn(player, cup);
        } else {
            // Displaying field description
            Field field = board.getField(cup.getRollSum() - 2);
            output.displayFieldText(field.getDescription());
            // Update player account
            player.setAccount(field.getValue());
        }
        // Showing scoreboard
        output.displayScoreboard(player1.getPlayerName(), player1.getAccount());
        output.displayScoreboard(player2.getPlayerName(), player2.getAccount());

        // Updating number of turns
        turnCount++;
        // Print winner of game
        if (turnCount % 2 == 0) {
            if (player1.getAccount() >= 3000) {
                output.winnerGame(player1.getPlayerName());
            } else if (player2.getAccount() >= 3000) {
                output.winnerGame(player2.getPlayerName());
            }
        }

    }

    // Control extra turn
    public void extraTurn(Player player, Cup cup) {
        Field field = board.getField(cup.getRollSum() - 2);
        output.displayFieldText(field.getDescription());
        player.setAccount(field.getValue());
        // Substracts one from turncount, so player gets to roll again
        turnCount -= 1;
    }

}
