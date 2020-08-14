package com.benchire.calculatePrice;

import com.benchire.calculatePrice.parts.CycleParts;

import java.util.Arrays;

public class PriceModule {
    private CycleParts cycleParts;
    private Date date;

    public PriceModule(CycleParts cycleParts, Date date) {
        this.cycleParts = cycleParts;
        this.date = date;
    }

    public void calculatePrice()
    {
        String[] months={"jan","feb","march","april","may","june","july","aug","sep","oct","nov"};
        if(Arrays.stream(months).anyMatch(s -> date.getMonth().equals("dec")))
        {
            System.out.println(200);
        }
        else{
        System.out.println(230);}

    }
}
