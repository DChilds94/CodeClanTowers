import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Hotel hotel;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(50, "Alpha", 500.00);
        hotel = new Hotel();
        guest = new Guest();
    }

    @Test
    public void GetRoomName(){
        assertEquals("Alpha", conferenceRoom.getName());
    }


    @Test
    public void GetPrice(){
        assertEquals(500.00, conferenceRoom.getPrice(), 0.01);
    }

    @Test
    public void GetCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }
    @Test
    public void canGetGuest(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom() {
        hotel.checkIn(guest);
        conferenceRoom.checkGuestIntoRoom(hotel);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutFromConferenceroom(){
        hotel.checkIn(guest);
        conferenceRoom.checkGuestIntoRoom(hotel);
        conferenceRoom.checkGuestOutFromRoom();
        assertEquals(0, conferenceRoom.guestCount());
    }
}
