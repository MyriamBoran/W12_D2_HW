import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Wow");
    }

    @Test
    public void canGetName(){
        assertEquals("Wow",dodgems.getName());
    }

    @Test
    public void canSetName(){
        dodgems.setName("oo");
        assertEquals("oo",dodgems.getName());
    }
}
