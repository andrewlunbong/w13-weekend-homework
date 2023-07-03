package Products;

public class Drum extends Instrument{

    private int numberOfDrums;

    public Drum(String material, String colour, double price, int numberOfDrums){
        super(material, colour, price);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }
    @Override
    public String play(){
        return "Boom Boom";
    }

    @Override
    public double markup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
