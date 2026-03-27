package com.ust.impl;

import com.ust.HeavyVehicleAbstractChandu;
import com.ust.VehicleAbstarctChandu;

public class TruckAbstractChandu extends HeavyVehicleAbstractChandu {
    @Override
    public String fuel() {
        return "";
    }

    @Override
    public int wheels() {
        return 0;
    }

    @Override
    public int engine() {
        return 0;
    }

    @Override
    public int passenger() {
        return 0;
    }
}
