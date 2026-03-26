package com.ust.impl;

import com.ust.VehicleInterFaceChandu;

public class BikeChanduImpl implements VehicleInterFaceChandu {
    @Override
    public String fuel() {
        return "Petrol";
    }

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public int engine() {
        return 155;
    }

    @Override
    public int passenger() {
        return 2;
    }
}
