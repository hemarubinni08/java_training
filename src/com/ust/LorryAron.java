package com.ust;

public class LorryAron extends HeavyVehicleAron {
    @Override
    public String getSound() {
        return "Grrggrrr";
    }

    @Override
    public int getNoOfWheels() {
        return 6;
    }

    @Override
    public int getWarrantyInYears() {
        return 10;
    }

    @Override
    public int getNoOfDoors() {
        return 2;
    }

    @Override
    public String getBrandName() {
        return "Bharat Benz";
    }

    public boolean canCarryLoad() {
        return true;
    }
}
