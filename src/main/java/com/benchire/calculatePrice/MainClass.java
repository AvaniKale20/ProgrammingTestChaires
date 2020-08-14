package com.benchire.calculatePrice;

import com.benchire.calculatePrice.parts.CycleParts;
import com.benchire.calculatePrice.parts.Frame;
import com.benchire.calculatePrice.parts.Gear;
import com.benchire.calculatePrice.parts.Tyre;

public class MainClass {
    public static void main(String[] args)
    {
        CycleParts cycleParts=new CycleParts(new Tyre(),new Gear(),new Frame(),2,1);
        Date date=new Date("jan",2016);
        PriceModule priceModule=new PriceModule(cycleParts,date);
        priceModule.calculatePrice();
    }
}
