package hotel;

import guest.Guest;
import room.Bedroom;
import room.ConferenceRoom;
import room.DinningRoom;

import java.util.ArrayList;

public class Hotel {

    Hotel hotel;
    private ArrayList<Guest> guest;
    private ArrayList<Bedroom> bedroom;
    private ArrayList<ConferenceRoom> conferenceRoom;
    private ArrayList<DinningRoom> dinningRoom;


    public Hotel(){
        this.guest = new ArrayList<>();
        this.bedroom = new ArrayList<>();
        this.conferenceRoom = new ArrayList<>();
        this.dinningRoom = new ArrayList<>();
    }

    public int guestCount(){
        return this.guest.size();
    }
    public void checkIn(Guest guest){
        this.guest.add(guest);
    }

}
