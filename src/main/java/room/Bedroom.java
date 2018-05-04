package room;

public class Bedroom extends Room {

    private BedroomType type;
    private double price;
    private int roomNumber;


    public Bedroom(int roomNumber, BedroomType roomTypePassedIn){
        super(roomTypePassedIn.getCapacity());
        this.roomNumber = roomNumber;
        this.price = type.getPrice();
        this.type = roomTypePassedIn;
    }

    public BedroomType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


}
