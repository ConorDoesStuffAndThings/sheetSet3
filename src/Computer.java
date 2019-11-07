public class Computer extends Memory implements IDable {
    String id, make;
    Memory memory;

    public Computer(String id, String make, String type, int size){
        super(type, size);
        setId(id);
        setMake(make);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String toString() {
        return super.toString() + "\nID:" + id + "\nMake: " + make + "\nMemory: " + memory.toString();
    }
}
