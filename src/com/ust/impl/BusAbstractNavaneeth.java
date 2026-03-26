package com.ust.impl;

import com.ust.HeavyVechicleAbstarctNavaneeth;
import com.ust.VechicleAbstarctNavaneeth;

public class BusAbstractNavaneeth extends HeavyVechicleAbstarctNavaneeth {
    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public String brand() {
        return "Volvo";
    }

    @Override
    public int engineCapacity() {
        return 2000;
    }

    @Override
    public boolean hasGears() {
        return true;
    }
}
