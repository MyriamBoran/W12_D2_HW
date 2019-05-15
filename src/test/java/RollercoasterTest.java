import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Dragon");
    }

    @Test
    public void canGetName(){
        assertEquals("Dragon",rollercoaster.getName());
    }

    @Test
    public void canSetName(){
        rollercoaster.setName("Lizard");
        assertEquals("Lizard",rollercoaster.getName());
    }
}
