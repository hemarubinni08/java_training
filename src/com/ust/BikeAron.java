package com.ust;

public class BikeAron extends VehicleAron {
    @Override
    public String getSound() {
        return "Drrrr";
    }

    @Override
    public int getWarrantyInYears() {
        return 4;
    }

    @Override
    public String getBrandName() {
        return "Bajaj";
    }

    public String getBikeType() {
        return "Caferacer";
    }
}
