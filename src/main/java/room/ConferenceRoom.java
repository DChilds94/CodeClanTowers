package room;

public class ConferenceRoom extends Room {

    private String name;
    private double price;


    public ConferenceRoom(int capacity, String name, double price){
        super(capacity);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
