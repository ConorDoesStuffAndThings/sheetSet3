public class Memory extends Computer {
    String type;
    int size;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setID(String id) {

    }

    public String toString() {
        return "\nType: " + type + "\nSize: " + size;
    }


}
