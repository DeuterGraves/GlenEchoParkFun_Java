package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("The Grizzly", 137);
    }

    @Test
    public void rollerCoasterHasName(){
        assertEquals("The Grizzly", rollerCoaster.getName());
    }

    @Test
    public void rollerCoasterHasMinHeight(){
        assertEquals(137, rollerCoaster.getMinHeight());
    }
}
