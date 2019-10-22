public class House{

    private String address;
    private String type;
    private double price;
    private Person owner;

    public House(){
        address="No Address Specified";
        type="No Type Specified";
        price=0.0;
        owner=null;

    }

    public House(String address, String type, double price, Person owner){
    setAddress(address);
    setType(type);
    setPrice(price);
    setOwner(owner);
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){

        if(price<=0){
            price=0;
        }
        this.price = price;
    }

    public Person getOwner(){
        return owner;
    }
    public void setOwner(Person owner){
        this.owner = owner;
    }

    public String toString(){
        return "The address is " + getAddress() + "\nThe type of house is " + getType() +
                "\nThe price of the house is " + getPrice() + "\nThe name of the owner is " + getOwner();
    }


}

class Person{
    private String name;

    public Person (String name){
        setName(name);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
      return getName();
    }
}
