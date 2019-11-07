public class ComputerDriver {
    public static void main(String[] args) {
        String id, make, type;
        int size;
        boolean touchScreen;

        Laptop lt = new Laptop(id, make, type, size, touchScreen);
        lt.makeLaptop();

    }
}
