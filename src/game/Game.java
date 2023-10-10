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
        cup.setRollSum();

        // Printing value of each die and the sum
        System.out.println("The sum of the two dice: " + cup.getRollSum());

        /*
         * Checking the sum and comparing
         * Then calling the correct method to continue the game.
         */
        if (cup.getRollSum() == 2) {
            doubleOnes(player);
        } else if (cup.getDie1() == cup.getDie2()) {
            extraTurn(player, cup);
        } else {
            player.setScore(cup.getRollSum());
        }

        // Display scoreboard
        displayScoreboard();

        // Store roll sum in last roll
        player.setLastRoll(cup.getRollSum());

        // Updating number of turns
        turnCount++;

        // Checking if there is a winner
        if (cup.getDie1() == cup.getDie2()) {
            if (player.getScore() >= 40) {
                System.out.println("Congratz, " + player.getPlayerName() + " won the game!");
                System.exit(0);
            }
        }
    }

    public void extraTurn(Player player, Cup cup) {

    }

}
