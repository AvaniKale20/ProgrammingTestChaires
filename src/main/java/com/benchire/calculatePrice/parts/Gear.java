package com.benchire.calculatePrice.parts;

public class Gear {
private String typeOfGear;
private double priceOfTwoGear=100.0;
    private double priceOfFourGear=250.0;

    public Gear(String typeOfGear) {
        this.typeOfGear=typeOfGear;
    }
    public double getPriceOfTwoGear() {
        return priceOfTwoGear;
    }

}
