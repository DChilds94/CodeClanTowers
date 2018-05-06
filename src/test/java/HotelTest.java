import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        conferenceRoom = new ConferenceRoom(50, "Alpha", 500.00);
        dinningRoom = new DinningRoom(200);


    }

    @Test
    public void canCheckGuestIn(){
        hotel.checkIn(guest);
        assertEquals(1, hotel.guestCount());
    }
    @Test
    public void canCheckGuestOut(){
        hotel.checkIn(guest);
        hotel.checkOut();
        assertEquals(0, hotel.guestCount());
    }
    @Test
    public void canGetGuest(){
        hotel.checkIn(guest);
        Guest result = hotel.removeGuest();
        assertNotNull(result);
    }
////    @Test
////    public void canCheckBedroomForGuests(){
////        hotel.checkIn(guest);
////        bedroom.checkGuestIntoBedroom(hotel);
////        bedroom.guestCount();
////        assertEquals(1, hotel.checkBedroomForGuests());
////    }

//    @Test
//    public void canCountGuestsInBedroom(){
//        assertEquals(1, hotel.totalGuestsInRoom());
//    }




}
