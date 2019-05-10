public class Account {
    private long account;
    private String type;
    private double balance;
    private float interestRate;

    public Account(long acct, String typ, double bal) {
        account = acct;
        type = typ;
        balance = bal;
        interestRate = 0.0f;
    }

    public void calcInterest() {
        balance -= (interestRate / 12) * balance;
    }

    public boolean withdraw(double amt) {
        if (balance - amt >= 0) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public double getBalance() {
        return Math.round(balance * 100.0) / 100.0;
    }

    public long getAccount() {
        return account;
    }

    public String getType() {
        return type;
    }

    public void setInterest(float i) {
        interestRate = i;
    }
}
