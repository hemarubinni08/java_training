package com.ust.impl;

import com.ust.VehicleAbstractAron;

public class BikeAbstractAronImpl extends VehicleAbstractAron {
    public String getSound() {
        return "Drrrr";
    }

    public int getWarrantyInYears() {
        return 4;
    }

    public String getBrandName() {
        return "Bajaj";
    }

    public int getNoOfWheels() {
        return 0;
    }

    public String getBikeType() {
        return "Caferacer";
    }
}
