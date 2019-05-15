import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void before(){
        iceCream = new IceCream("Rocky","Lala","hh");

    }

    @Test
    public void canGetName(){
        assertEquals("Rocky",iceCream.getName());
    }

    @Test
    public void canSetName(){
        iceCream.setName("Choco");
        assertEquals("Choco",iceCream.getName());
    }

    @Test
    public void canGetownerName(){
        assertEquals("Lala",iceCream.getOwnerName());
    }

    @Test
    public void canSetownerName(){
        iceCream.setOwnerName("oo");
        assertEquals("oo",iceCream.getOwnerName());
    }

    @Test
    public void canGetparkingSpot(){
        assertEquals("hh",iceCream.getParkingSpot());
    }

    @Test
    public void canSetparkingSpot(){
        iceCream.setParkingSpot("aa");
        assertEquals("aa",iceCream.getParkingSpot());
    }

}
