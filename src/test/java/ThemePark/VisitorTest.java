package ThemePark;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Helen Abernathy", 13, 147, 25);
    }

    @Test
    public void visitorHasName(){
        assertEquals("Helen Abernathy", visitor.getName());
    }

    @Test
    public void visitorHasAge(){
        assertEquals(13, visitor.getAge());
    }

    @Test
    public void visitorHasHeight(){
        assertEquals(147, visitor.getHeight());
    }

    @Test
    public void visitorHasMoney(){
        assertEquals(25, visitor.getWallet());
    }
}
