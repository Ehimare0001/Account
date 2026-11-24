public class Account {

    private int balance;
    private int pin;

    public Account(int pin) {
        this.pin = pin;
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    public void withdraw(int amount, int enteredPin) {
        if (enteredPin == pin) {
            withdraw(amount);
        }
    }
}

