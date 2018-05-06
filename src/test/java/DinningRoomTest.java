import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.DinningRoom;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    DinningRoom dinningRoom;
    Hotel hotel;
    Guest guest;

    @Before
    public void before(){
        dinningRoom = new DinningRoom(200);
        hotel = new Hotel();
        guest = new Guest();
    }


    @Test
    public void GetCapacity(){
        assertEquals(200, dinningRoom.getCapacity());
    }
    @Test
    public void canGetGuest(){
        assertEquals(0, dinningRoom.guestCount());
    }

    @Test
    public void canCheckGuestIntoDinningRoom() {
        hotel.checkIn(guest);
        dinningRoom.checkGuestIntoRoom(hotel);
        assertEquals(1, dinningRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutFromDinningRoom(){
        hotel.checkIn(guest);
        dinningRoom.checkGuestIntoRoom(hotel);
        dinningRoom.checkGuestOutFromRoom();
        assertEquals(0,dinningRoom.guestCount());
    }
}
