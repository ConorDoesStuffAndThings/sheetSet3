import javax.swing.*;

public class Laptop extends Computer{
    private boolean touchScreen;

    public Laptop(String id, String make, String type, int size, boolean touchScreen) {
        super(id, make, type, size);
        setTouchScreen(touchScreen);
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public void setID(String id) {

    }

    public Laptop makeLaptop(){
        make = JOptionPane.showInputDialog("Please enter laptop make");
        String type = JOptionPane.showInputDialog("Please enter laptop memory type");
        int size = Integer.parseInt(JOptionPane.showInputDialog("Please enter laptop memory size"));
        id = JOptionPane.showInputDialog("Please enter laptop id");
        int isTouchScreen = JOptionPane.showConfirmDialog(null, "Does your laptop have touchscreen? ");
        if(isTouchScreen == 0)
            touchScreen = true;
        else
            touchScreen=false;

        Laptop laptop = new Laptop(id, make, type, size, touchScreen);

        return laptop;


    }


    public String toString() {
        return super.toString() + "\ntouchScreen: " + touchScreen;
    }
}
