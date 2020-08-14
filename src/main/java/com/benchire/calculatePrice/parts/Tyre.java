package com.benchire.calculatePrice.parts;

public class Tyre {
    private String typeOfTyre;
    private double prceWith=200.0;
    private double prceWithout=200.0;



    public Tyre(String typeOfTyre) {
        this.typeOfTyre=typeOfTyre;
    }


    public double getPrceWith() {
        return prceWith;
    }

}
