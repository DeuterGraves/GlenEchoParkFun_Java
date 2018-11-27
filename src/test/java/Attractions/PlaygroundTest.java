package Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Spanish Ballroom Playground", 10);
    }

    @Test
    public void playgroundHasMaxAge(){
        assertEquals(10, playground.getMaxAge());
    }

    @Test
    public void playgroundHasName(){
        assertEquals("Spanish Ballroom Playground", playground.getName());
    }
}
