import Products.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Brass", "Gold", 20.00, 3);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(20.00, trumpet.getPrice(), 0.0);
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("ZZZZ", trumpet.play());
    }
}
