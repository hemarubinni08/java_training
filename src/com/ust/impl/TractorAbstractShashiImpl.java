package com.ust.impl;

import com.ust.HeavyVehicleAbstractShashi;

public class TractorAbstractShashiImpl extends HeavyVehicleAbstractShashi {
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
