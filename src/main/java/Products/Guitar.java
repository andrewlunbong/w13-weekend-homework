package Products;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, double price, int numberOfStrings){
        super(material, colour, price);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    @Override
    public String play(){
        return "ding ding";
    }

    @Override
    public double markup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }

}
