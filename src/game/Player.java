package game;

public class Player {
    // Private attributes for a player
    private String name;
    private Account account = new Account();

    // Player contructor
    public Player(String name) {
        this.name = name;
    }

    // Set name of player
    public void setPlayerName(String name) {
        this.name = name;
    }

    // Get name of player
    public String getPlayerName() {
        return this.name;
    }

    // Set a player account
    public void setAccount(int amount) {
        this.account.setAmount(amount);

    }

    // Get amount in a players account
    public int getAccount() {
        return this.account.getAmount();
    }
}