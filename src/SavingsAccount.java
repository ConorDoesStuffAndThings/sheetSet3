public class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount(String name, int accnum, double balance){
        super(name,accnum);
        setBalance(balance);
    }
    //to String
    //super.toString();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return super.toString() + " bal " + getBalance();
    }
}
