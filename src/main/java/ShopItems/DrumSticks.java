package ShopItems;

import Interfaces.ISell;

public class DrumSticks implements ISell{

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public DrumSticks(String description, double buyingPrice, double sellingPrice){
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public String play(){
        return "Bang Bang";
    }

    @Override
    public double markup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
