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

    //
   public void setAccount(int amount) {
       account.setAmount(int amount);

   }

    //
   public int getAccount() {
       return this.account.getAmount();
   }
