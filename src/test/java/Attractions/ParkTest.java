package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Turkey Run");
    }

    @Test
    public void parkHasAName(){
        assertEquals("Turkey Run", park.getName());

    }
}
