import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.*;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Room room;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    DinningRoom dinningRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest();
        bedroom = new Bedroom(4, BedroomType.FOUR);
        conferenceRoom = new ConferenceRoom();
        dinningRoom = new DinningRoom();
    }

    @Test
    public void canCheckGuestIn(){
        hotel.checkIn(guest);
        assertEquals(1, hotel.guestCount());
    }

}
