package game;

public class Account {

    private int amount;

    public Account() {
    }

    public void setAmount(int value) {
        if (value <= 0) {
            withdrawMoney(value);
        } else {
            depositMoney(value);
        }

    }

    public int getAmount() {
        return this.amount;
    }

    public boolean withdrawMoney(int amount) {
        if (this.amount - amount <= 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
        return true;
    }

    public boolean depositMoney(int amount) {
        this.amount += amount;
        return true;
    }
}
