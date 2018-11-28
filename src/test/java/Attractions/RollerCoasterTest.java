package Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor shortVisitor;
    Visitor youngVisitor;
    Visitor shortYoungVisitor;
    Visitor justRightVisitor;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("The Grizzly", 11);
        shortVisitor = new Visitor("Shorty McShortington", 14, 143, 5000);
        youngVisitor = new Visitor("Baby McBabyFace", 10, 146, 5001);
        shortYoungVisitor = new Visitor("Absolutely NOT", 9, 110, 10000);
        justRightVisitor = new Visitor("Goldie Hon", 25, 150, 50);
    }


    @Test
    public void rollerCoasterHasName(){
        assertEquals("The Grizzly", rollerCoaster.getName());
    }

    @Test
    public void rollerCoasterHasMinHeight(){
        assertEquals(145, rollerCoaster.getMinHeight());
    }

    @Test
    public void rollerCoasterHasMinAge(){
        assertEquals(12,rollerCoaster.getMinAge());
    }

    @Test
    public void visitorTooShortForCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void visitorIsTooYoungForCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void visitorIsTooYoungAndTooShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(shortYoungVisitor));
    }

    @Test
    public void visitorIsJustRightForCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(justRightVisitor));
    }

    @Test
    public void rollerCoasterHasRating(){
        assertEquals(11, rollerCoaster.getRating());
    }
}
