package com.ust.impl;

import com.ust.VehicleAbstractShashi;

public class TractorAbstractShashiImpl extends VehicleAbstractShashi {
    public String getFuelType() {
        return "Petrol";
    }

    public String getBrakeType() {
        return "Disc";
    }

    public int getNumberOfWheels() {
        return 4;
    }

    public String getBrandName() {
        return "Mahindra";
    }

    public String getModelName() {
        return "Yuvo";
    }

    public int getYearsOfInsurance() {
        return 10;
    }
}
