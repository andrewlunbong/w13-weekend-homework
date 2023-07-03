import ShopItems.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("DrumStricks", 20.00, 50.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Guitar Strings", drumSticks.getDescription());
    }

    @Test
    public void hasBuyingPrice(){
            assertEquals(20.00, drumSticks.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(50.00, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
            assertEquals(30.00, drumSticks.markup(drumSticks.getBuyingPrice(), drumSticks.getSellingPrice()), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("Bang Bang", drumSticks.play());
    }
}
