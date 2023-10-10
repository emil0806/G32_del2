package game;

import java.util.Scanner;

public class Output {

    private Scanner scanner = new java.util.Scanner(System.in);

    public void displayRules() {
        System.out.println("You need to get over 3000 in your balance to win the game");
        System.out.println("If you get the sum 10, you lose 80 in your balance, but get an extra turn");
        System.out.println("You start with a balance of 1000");

    }

    public void enterPlayerName(Player player) {
        System.out.println("Press ENTER to start the game");
        scanner.nextLine();

        System.out.print("Please enter player name: ");
        player.setPlayerName(scanner.nextLine());

    }

    public void showCoinflip(Player player) {
        System.out.println(player.getPlayerName() + " won the coinflip.");

    }

    public void playerRollDice(Player player) {
        System.out.println(player.getPlayerName() + ", press ENTER to roll dice");

    }

    public void sumDice(Cup cup) {
        System.out.println("The sum of the two dice: " + cup.getRollSum());

    }

    public void winnerGame(Player player) {
        System.out.println("Congratulations, " + player.getPlayerName() + " won the game!");

    }

    public void displayScoreboard(Player player) {
        System.out.println(player.getPlayerName() + ": " + player.getAccount());

    }

    public void displayFieldText() {

    }

}
