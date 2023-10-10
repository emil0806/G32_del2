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

    public void showCoinflip() {

    }

    public void playerStarts() {

    }

    public void sumDice() {

    }

    public void winnerGame() {

    }

    public void displayScoreboard() {

    }

}
