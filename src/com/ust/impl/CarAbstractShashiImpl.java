package com.ust.impl;

import com.ust.VehicleAbstractShashi;

public class CarAbstractShashiImpl extends VehicleAbstractShashi {
    public int getNumberOfWheels() {
        return 4;
    }

    public String getBrandName() {
        return "Honda";
    }

    public String getModelName() {
        return "City";
    }

    public String getFuelType() {
        return "Petrol";
    }

    public String getBrakeType() {
        return "Disc";
    }

    public int getYearsOfInsurance() {
        return 2;
    }

    public String getDoorOpeningType() {
        return "Standard";
    }

    public boolean getAirConditioning() {
        return true;
    }
}
