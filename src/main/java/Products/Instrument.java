package Products;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String material;
    private String colour;
    private double price;

    public Instrument(String material, String colour, double price){
        this.material = material;
        this.colour = colour;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }
}
