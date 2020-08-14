package com.benchire.calculatePrice;

import java.util.Objects;
import java.util.function.Predicate;

public class Date {
    private String month;
    private int year;

    public Date(String month, int year) {
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

}
