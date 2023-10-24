package game;

public class Output {

    //Game rules
    public void displayRules() {
        System.out.println("Welcome to the best dice in the world!");
        System.out.println("");
        System.out.println("You need to get over 3000 in your balance to win the game");
        System.out.println("If you get the sum 10, you lose 80 in your balance, but get an extra turn");
        System.out.println("You start with a balance of 1000");
        System.out.println("");
        System.out.println("Press ENTER to start the game");
    }

    //Player names
    public void enterPlayerName(String playerName) {
        System.out.print("Please enter " + playerName + " name: ");
    }

    //Determines which player starts
    public void showCoinflip(String playerName) {
        System.out.println(playerName + " won the coinflip.");

    }

    //Prompts player to roll dice
    public void playerRollDice(String playerName) {
        System.out.println(playerName + ", press ENTER to roll dice");

    }

    //Display total sum of dice
    public void sumDice(int sum) {
        System.out.println("The sum of the two dice: " + sum);

    }

    //Congratz message when a player wins the game
    public void winnerGame(String playerName) {
        System.out.println("Congratulations, " + playerName + " won the game!");

    }

    //Display score for player
    public void displayScoreboard(String playerName, int amount) {
        System.out.println(playerName + ": " + amount);

    }

    //Print field text for additional engagement
    public void displayFieldText(String fieldText) {
        System.out.println(fieldText);

    }

}
