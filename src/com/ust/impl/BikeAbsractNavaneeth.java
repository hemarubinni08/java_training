package com.ust.impl;

import com.ust.HeavyVechicleAbstarctNavaneeth;
import com.ust.VechicleAbstarctNavaneeth;

public class BikeAbsractNavaneeth extends HeavyVechicleAbstarctNavaneeth {

    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String brand() {
        return "Honda";
    }

    @Override
    public int engineCapacity() {
        return 200;
    }

    @Override
    public boolean hasGears() {
        return true;
    }
}
