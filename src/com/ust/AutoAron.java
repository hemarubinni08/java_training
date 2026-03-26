package com.ust;

public class AutoAron extends HeavyVehicleAron {
    @Override
    public String getSound() {
        return "Ksssrrrr";
    }

    @Override
    public int getNoOfWheels() {
        return 3;
    }

    @Override
    public int getWarrantyInYears() {
        return 3;
    }

    @Override
    public int getNoOfDoors() {
        return 1;
    }

    @Override
    public String getBrandName() {
        return "Ashok Leyland";
    }
}
