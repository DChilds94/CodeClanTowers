package room;

public enum BedroomType {

    SINGLE(1, 50.00, "single"),
    DOUBLE(2, 90.00, "double"),
    TWIN(2, 80.00, "twin"),
    THREE(3, 140.00, "three"),
    FOUR(4, 180.00, "four" ),
    FAMILY(6, 230.00, "family"),
    HONEYMOON(2, 200.00, "honeymoon");

    private int capacity;
    private double price;
    private String roomType;

    BedroomType(int capacity, double price, String roomType){
        this.capacity = capacity;
        this.price = price;
        this.roomType = roomType;

    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public String getroomType() {
        return roomType;
    }
}
