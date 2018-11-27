package Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Brain Freezer!", "Latrice Letchington", "1A");
    }

    @Test
    public void candFlossStallhasName(){
        assertEquals("Brain Freezer!", iceCreamStall.getName());
    }

    @Test
    public void iceCreamStallHasOwner(){
        assertEquals("Latrice Letchington", iceCreamStall.getOwnerName());
    }

    @Test
    public void iceCreamStallHasParkingSpot(){
        assertEquals("1A", iceCreamStall.getParkingSpot());
    }
}
