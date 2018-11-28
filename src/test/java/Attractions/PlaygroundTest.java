package Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Spanish Ballroom Playground", 4);
        visitor1 = new Visitor("Della Pandalan", 10, 120, 15);
        visitor2 = new Visitor("Robert Bingston", 16, 167, 25);
    }

    @Test
    public void playgroundHasMaxAge(){
        assertEquals(15, playground.getMaxAge());
    }

    @Test
    public void playgroundHasName(){
        assertEquals("Spanish Ballroom Playground", playground.getName());
    }

    @Test
    public void visitor1IsAllowedInPlayGround(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void visitor1IsNOTAllowedInPlayGround(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }

    @Test
    public void playgroundHasRating(){
        assertEquals(4, playground.getRating());
    }
}
