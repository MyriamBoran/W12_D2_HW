import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(20,150,10);
    }

    @Test
    public void canGetAge(){
        assertEquals(20,visitor.getAge());
    }

    @Test
    public void canSetAge(){
        visitor.setAge(25);
        assertEquals(25,visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(150,visitor.getHeight());
    }

    @Test
    public void canSetHeight(){
        visitor.setHeight(120);
        assertEquals(120,visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(10,visitor.getMoney());
    }

    @Test
    public void canSetMoney(){
        visitor.setMoney(40);
        assertEquals(40,visitor.getMoney());
    }
}
