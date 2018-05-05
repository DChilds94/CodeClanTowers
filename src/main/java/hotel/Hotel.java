package hotel;

import guest.Guest;
import room.Bedroom;

import java.util.ArrayList;

public class Hotel {

    Hotel hotel;
    private ArrayList<Guest> guestForRoom;
    private ArrayList<Bedroom> bedroom;
//    private ArrayList<ConferenceRoom> conferenceRoom;
//    private ArrayList<DinningRoom> dinningRoom;


    public Hotel(){
        this.guestForRoom = new ArrayList<>();
        this.bedroom = new ArrayList<>();
//        this.conferenceRoom = new ArrayList<>();
//        this.dinningRoom = new ArrayList<>();
    }

    public int guestCount(){
        return this.guestForRoom.size();
    }
    public void checkIn(Guest guest){
        this.guestForRoom.add(guest);
    }

    public void checkOut(){
        this.guestForRoom.remove(0);
    }

    public Guest removeGuest(){
       return  this.guestForRoom.remove(0);
    }

}
