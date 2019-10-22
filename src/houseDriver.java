import javax.swing.*;

public class houseDriver {

    public static void main(String[] args) {

    String address, type, owner;
    Person ownerAsPerson;
    double price;

        owner=(JOptionPane.showInputDialog("Please enter the owner name"));
        type=JOptionPane.showInputDialog("Please enter the type of house");
        address=JOptionPane.showInputDialog("Please enter the address of the house");
        price=Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the house"));

        House home = new House(address, type, price, new Person(owner));

        JOptionPane.showMessageDialog(null, home);
    }
}
