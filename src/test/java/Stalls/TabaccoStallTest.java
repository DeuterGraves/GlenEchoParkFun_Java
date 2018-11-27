package Stalls;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TabaccoStallTest {

    TabaccoStall tabaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tabaccoStall = new TabaccoStall("The Cuddle Up!", "Barry Tarhampton", "1A");
        visitor1 = new Visitor("Della Pandalan", 20, 120, 15);
        visitor2 = new Visitor("Robert Bingston", 16, 167, 25);
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

    @Test
    public void tabaccoStallHasMinAge(){
        assertEquals(18, tabaccoStall.getMinAge());
    }

    @Test
    public void tabaccoStallRejectsUnder18s(){
        assertEquals(false, tabaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void tabaccoStallAllowsOver18s(){
        assertEquals(true, tabaccoStall.isAllowedTo(visitor1));
    }
}
