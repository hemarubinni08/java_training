package com.ust.impl;

import com.ust.VehicleInterFaceChandu;

public class CarChanduImpl implements VehicleInterFaceChandu {
    @Override
    public String fuel() {
        return "petrol/diesel";
    }

    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public int engine() {
        return 1569;
    }

    @Override
    public int passenger() {
        return 5;
    }
}
