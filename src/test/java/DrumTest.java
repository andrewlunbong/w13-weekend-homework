import Products.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Plastic", "White", 500.00, 4);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Plastic", drum.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("White", drum.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(500.00, drum.getPrice(), 0.0);
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(4, drum.getNumberOfDrums());
    }

    @Test
    public void canPlay(){
        assertEquals("Boom Boom", drum.play());
    }
}
