package Products;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Piano extends Instrument  {
    private int numberOfKeyboard;

    public Piano(String material, String colour, double price, int numberOfKeyboard){
        super(material, colour, price);
        this.numberOfKeyboard = numberOfKeyboard;
    }

    public int getNumberOfKeyboard() {
        return numberOfKeyboard;
    }

    @Override
    public String play(){
        return "ddddddd";
    }

    @Override
    public double markup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }


}

