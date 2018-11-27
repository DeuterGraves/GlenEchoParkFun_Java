package Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Tooth Rot!", "Lætitia Sugarinham", "A1");
    }

    @Test
    public void candFlossStallhasName(){
        assertEquals("Tooth Rot!", candyFlossStall.getName());
    }

    @Test
    public void candyFlossStallHasOwner(){
        assertEquals("Lætitia Sugarinham", candyFlossStall.getOwnerName());
    }

    @Test
    public void candyFlossStallHasParkingSpot(){
        assertEquals("A1", candyFlossStall.getParkingSpot());
    }
}
