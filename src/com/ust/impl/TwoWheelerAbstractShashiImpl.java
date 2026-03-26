package com.ust.impl;

import com.ust.VehicleAbstractShashi;

public class TwoWheelerAbstractShashiImpl extends VehicleAbstractShashi {
    protected String getBrandName() {
        return "Honda";
    }

    protected String getFuelType() {
        return "Petrol";
    }

    protected String getBrakeType() {
        return "Disc";
    }

    protected int getNumberOfWheels() {
        return 2;
    }

    protected String getModelName() {
        return "Shine";
    }


    protected int getYearsOfInsurance() {
        return 2;
    }

    protected int getNumberOfStokes() {
        return 4;
    }
}
