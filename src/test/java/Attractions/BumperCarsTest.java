package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BumperCarsTest {

    BumperCars bumperCars;

    @Before
    public void before(){
        bumperCars = new BumperCars("The Skooter");
    }

    @Test
    public void bumperCarsHasName(){
        assertEquals("The Skooter", bumperCars.getName());
    }
}
