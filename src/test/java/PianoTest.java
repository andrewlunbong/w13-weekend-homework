import Products.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Wood", "Black", 2000.00, 88);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(2000.00, piano.getPrice(), 0.0);
    }

    @Test
    public void hasNumberOfKeyboard(){
        assertEquals(88, piano.getNumberOfKeyboard());
    }

    @Test
    public void canPlay(){
        assertEquals("ddddddd", piano.play());
    }
}
