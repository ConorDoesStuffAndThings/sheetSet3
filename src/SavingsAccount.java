public class SavingsAccount extends BankAccount {
    private double balance=0;

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

    public void lodge(double amount) {

    }

    public void withdraw(double amount) {

    }

    public double calcTax() {
        return 0;
    }

    public String toString(){
        return super.toString() + "\nbal: " + getBalance();
    }
}
