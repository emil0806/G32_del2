package game;

public class Account {
    // Creating attribute
    private int amount;

    // Account constructor
    public Account() {
        this.amount = 1000;
    }

    // Set amount in account
    public void setAmount(int value) {
        if (value <= 0) {
            withdrawMoney(value);
        } else {
            depositMoney(value);
        }

    }

    // Get amount in account
    public int getAmount() {
        return this.amount;
    }

    // Withdraw money from account
    public boolean withdrawMoney(int amount) {
        if (this.amount + amount <= 0) {
            this.amount = 0;
        } else {
            this.amount += amount;
        }
        return true;
    }

    // Deposit money from account
    public boolean depositMoney(int amount) {
        this.amount += amount;
        return true;
    }
}
