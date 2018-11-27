package Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TabaccoStallTest {

    TabaccoStall tabaccoStall;

    @Before
    public void before(){
        tabaccoStall = new TabaccoStall("The Cuddle Up!", "Barry Tarhampton", "1A");
    }

    @Test
    public void candFlossStallhasName(){
        assertEquals("The Cuddle Up!", tabaccoStall.getName());
    }

    @Test
    public void tabaccoStallHasOwner(){
        assertEquals("Barry Tarhampton", tabaccoStall.getOwnerName());
    }

    @Test
    public void tabaccoStallHasParkingSpot(){
        assertEquals("1A", tabaccoStall.getParkingSpot());
    }
}
