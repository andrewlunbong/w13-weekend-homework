package Products;

import Interfaces.IPlay;

public class Trumpet extends Instrument {
    private int numberOfValves;

    public Trumpet(String material, String colour, double price, int numberOfValves){
        super(material, colour, price);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
    @Override
    public String play(){
        return "ZZZZ";
    }
    @Override
    public double markup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
