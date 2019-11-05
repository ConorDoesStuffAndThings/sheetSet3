import javax.swing.*;

public class SavingsAccountDriver {
    public static void main(String[] args) {
        String name;
        int accnum;
        //Setting default balance to 100
        double balance=100;

        name = JOptionPane.showInputDialog("Please enter name");
        accnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter your account number"));

        SavingsAccount user= new SavingsAccount(name, accnum, balance);
        SavingsAccount[] accountArray = new SavingsAccount[3];

        for(int i=0; i <=2; i++){
            accountArray[i]=user;
        }

        JOptionPane.showMessageDialog(null, user);
    }
}
