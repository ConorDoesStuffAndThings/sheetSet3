public abstract class BankAccount implements Transactable, Taxable {

    protected String name;
    protected int accnum;

    public BankAccount(){
    name = "No name specified";
    accnum = 0;
    }

    public BankAccount(String name, int accnum){
        setName(name);
        setAccnum(accnum);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAccnum(){
        return accnum;
    }
    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public abstract void lodge(double amount);
    public abstract void withdraw(double amount);
    public abstract double calcTax();

    public String toString() {
        return "Bank Account" + "\n\nName: " + name + "\nAccount Number: " + accnum;
    }

    public double lodge(int amount){
        return amount+=amount;
    }
    public double withdraw(int amount){
        return amount-=amount;
    }
}
