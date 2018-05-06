package room;

public class Bedroom extends Room {

    private BedroomType roomType;
    private double price;
    private int roomNumber;


    public Bedroom(int roomNumber, BedroomType roomType) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.price = roomType.getPrice();
        this.roomType = roomType;

    }

    public BedroomType getType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

//    public void checkGuestIntoRoom(Hotel hotel) {
//        Guest guest;
//        guest = hotel.removeGuest();
//        guestArrayList.add(guest);
//    }

    public void checkGuestOutFromRoom(){
        this.guestArrayList.clear();
    }



}





