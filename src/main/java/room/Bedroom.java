package room;

import guest.Guest;
import hotel.Hotel;

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

    public void checkGuestIntoBedroom(Hotel hotel) {
        Guest guest = hotel.removeGuest();
        guestArrayList.add(guest);
    }

//    public Guest checkGuestOutFromBedroom(){
//        return this.guestArrayList.remove(0);
//    }



}





