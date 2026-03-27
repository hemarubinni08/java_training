package com.ust;

public class CarAron extends HeavyVehicleAron {
    @Override
    public String getSound() {
        return "Vrroom";
    }

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public String getBrandName() {
        return "Volvo";
    }

    public String getDoorType() {
        return "Sideways";
    }

    public boolean hasSunRoof() {
        return true;
    }
}
