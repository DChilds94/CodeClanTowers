package room;

import guest.Guest;

import java.util.ArrayList;


public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity){
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount(){
        return this.guest.size();
    }


}
