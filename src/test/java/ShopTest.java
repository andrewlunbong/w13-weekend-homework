import Products.Guitar;
import Products.Piano;
import Products.Trumpet;
import ShopItems.DrumSticks;
import Store.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    Shop shop;


    @Before
    public void before(){
        guitar = new Guitar("Wood", "Red", 200.00, 6);
        piano = new Piano("Wood", "Black", 2000.00, 88);
        trumpet = new Trumpet("Brass", "Gold", 20.00, 3);
        shop = new Shop();
        shop.addItem(guitar);
        shop.addItem(piano);
        shop.addItem(trumpet);

    }

    @Test
    public void hasItemsInStock() {
        assertEquals(3, shop.countStock());
    }
    @Test
    public void canAddNewItem() {
        DrumSticks drumSticks = new DrumSticks("DrumSticks", 20.00, 50.00);
        shop.addItem(drumSticks); 
        assertEquals(4, shop.countStock());
    }

    @Test
    public void canRemoveItem() {
        shop.removeItem(guitar);
        assertEquals(2, shop.countStock());
    }
}




