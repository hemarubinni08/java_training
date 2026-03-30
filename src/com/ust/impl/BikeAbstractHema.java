package com.ust.impl;

import com.ust.VehicleAbstractHema;

public class BikeAbstractHema extends VehicleAbstractHema {

    @Override
    public String getBrand() {
        return "V3";
    }

    @Override
    public int getWheelsCount() {
        return 2;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    protected int doorsCount() {
        return 0;
    }
}
