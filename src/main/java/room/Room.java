package room;

import guest.Guest;
import hotel.Hotel;

import java.util.ArrayList;


public abstract class Room {

    int capacity;
    ArrayList<Guest> guestArrayList;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestArrayList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount(){
        return this.guestArrayList.size();
    }

    public void checkGuestIntoRoom(Hotel hotel) {
        if (guestCount() < getCapacity()) {
            Guest guest = hotel.removeGuest();
            guestArrayList.add(guest);
        }

    }
    public void checkGuestOutFromRoom(){
        this.guestArrayList.clear();
    }
}
