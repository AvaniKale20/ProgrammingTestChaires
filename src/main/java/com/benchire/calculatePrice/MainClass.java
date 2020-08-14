package com.benchire.calculatePrice;

import com.benchire.calculatePrice.parts.CycleParts;
import com.benchire.calculatePrice.parts.Gear;
import com.benchire.calculatePrice.parts.Tyre;

public class MainClass {
    public static void main(String[] args)
    {
        Tyre tyre=new Tyre("WithTube");
        Gear gear=new Gear("2Gear");

        CycleParts cycleParts=new CycleParts(tyre,gear,"frame",2,1);
        Date date=new Date("dec",2016);
        PriceModule priceModule=new PriceModule(cycleParts,date);
        priceModule.calculatePrice(tyre,gear);



    }
}
