package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BumperCarsTest {

    BumperCars bumperCars;

    @Before
    public void before(){
        bumperCars = new BumperCars("The Skooter", 5);
    }

    @Test
    public void bumperCarsHasName(){
        assertEquals("The Skooter", bumperCars.getName());
    }

    @Test
    public void bumperCarHasRating(){
        assertEquals(5, bumperCars.getRating());
    }
}
