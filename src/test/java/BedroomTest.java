import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.BedroomType;

import static org.junit.Assert.assertEquals;
import static room.BedroomType.SINGLE;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Hotel hotel;

    @Before
    public void before(){
        bedroom = new Bedroom(1, BedroomType.SINGLE);
        guest = new Guest();
        hotel = new Hotel();
        bedroom.checkGuestIntoBedroom(hotel);
    }

    @Test
    public void GetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void GetRoomType(){
        assertEquals(SINGLE, bedroom.getType());
    }

    @Test
    public void GetPrice(){
        assertEquals(50.00, bedroom.getPrice(), 0.01);
    }

    @Test
    public void GetCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }
    @Test
    public void canGetGuest(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel.checkIn(guest);
        bedroom.checkGuestIntoBedroom(hotel);
        assertEquals(1, bedroom.guestCount());
    }

//    @Test
//    public void canCheckGuestOutFromBedroom(){
//
//        bedroom.checkGuestOutFromBedroom();
//        assertEquals(0, bedroom.guestCount());
//    }
}
