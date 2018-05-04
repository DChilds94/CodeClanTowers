import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.BedroomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, BedroomType.SINGLE);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals(BedroomType.SINGLE, bedroom.getType());
    }

    @Test
    public void getPrice(){
        assertEquals(50.00, bedroom.getPrice(), 0.01);
    }
}
