package com.ust.impl;

import com.ust.HeavyVechicleAbstarctNavaneeth;
import com.ust.VechicleAbstarctNavaneeth;

public class CarAbstractNavaneeth extends HeavyVechicleAbstarctNavaneeth {


    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String brand() {
        return "Audi";
    }

    @Override
    public int engineCapacity() {
        return 1000;
    }

    @Override
    public boolean hasGears() {
        return true;
    }
}
