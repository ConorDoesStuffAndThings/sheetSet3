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
    public abstract void withdrawl(double amount);
    public abstract double calcTax();

    @Override
    public String toString() {
        return "Bank Account" + "\n\nName" + name + "\nAccount Number" + accnum;
    }
}
