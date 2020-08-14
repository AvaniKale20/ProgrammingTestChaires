package com.benchire.calculatePrice;

import com.benchire.calculatePrice.parts.CycleParts;
import com.benchire.calculatePrice.parts.Gear;
import com.benchire.calculatePrice.parts.Tyre;

import java.util.Arrays;

public class PriceModule {
    private CycleParts cycleParts;
    private Date date;

    public PriceModule(CycleParts cycleParts, Date date) {
        this.cycleParts = cycleParts;
        this.date = date;
    }

    public void calculatePrice(Tyre tyre, Gear gear) {

        String[] months = {"jan", "feb", "march", "april", "may", "june", "july", "aug", "sep", "oct", "nov"};
        if (Arrays.stream(months).anyMatch(s -> date.getMonth().equals("dec")) && (date.getYear() == 2016)) {
            total(tyre,gear);
            System.out.println("Tyre if u want to buy before dec :" + 230);
        } else {
            total(tyre,gear);
            System.out.println("Tyre if u want to buy after dec:" + 200);
        }

    }

    private void total(Tyre tyre,Gear gear) {

        System.out.println("tyre prise :" +tyre.getPrceWith() +"type of gear"+gear.getPriceOfTwoGear());
        double total=(tyre.getPrceWith()+gear.getPriceOfTwoGear());
        System.out.println("total:" +total);
    }
}
