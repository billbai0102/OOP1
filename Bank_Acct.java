public class Bank_Acct {
    public long acct_num;
    private double balance;
    private String type;
    private float interest_rate;

    /**
     * Class constructor.
     *
     * @param acct A long containing the account's number.
     * @param bal A double containing the account's balance.
     * @param ty A String containing the account's type.
     * @param interest A float containing the account's interest rate.
     */
    public Bank_Acct(long acct, double bal, String ty, float interest) {
        acct_num = acct;
        balance = bal;
        type = ty;
        interest_rate = interest;
    }

    /**
     * Gets the account's balance.
     *
     * @return A double containing the account's balance, rounded to the hundredth
     */
    public double getBalance() {
        return Math.round(balance * 100.0) / 100.0;
    }

    /**
     * Gets the account's type.
     *
     * @return A String containing the account's type.
     */
    public String getType() {
        return type;
    }

    /**
     * Adds a certain amount into the account's balance.
     *
     * @param amt A double containing how much should be added to the balance.
     */
    public void deposit(double amt) {
        balance += amt;
    }

    /**
     * Withdraws a certain amount from balance.
     *
     * @param amt A double containing the withdrawal amount.
     * @return A boolean that returns true if withdrawal is successful, and false if not.
     */
    public boolean withdrawal(double amt) {
        if (balance - amt >= 0) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }

    /**
     *Modifier method that adds
     */
    public void applyInterest() {
        balance -= (interest_rate/12)*balance;
    }

    public static void main(String[]args){
        Bank_Acct bank1 = new Bank_Acct(1234567,500.50,"chequing",0.05f);
        bank1.deposit(300.50);
        bank1.withdrawal(20.25);
        bank1.applyInterest();
        System.out.println(bank1.getBalance());
        System.out.println(bank1.getType());

        System.out.println();

        Bank_Acct bank2 = new Bank_Acct(33938414,10,"savings",0.05f);
        bank2.deposit(300.50);
        bank2.withdrawal(20.25);
        bank2.applyInterest();
        System.out.println(bank2.getBalance());
        System.out.println(bank2.getType());
    }
}
