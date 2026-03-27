package com.ust.impl;

public class CarAbstractAronImpl extends HeavyVehicleAbstractClassImpl {
    public String getSound() {
        return "Vrroom";
    }

    public int getNoOfWheels() {
        return 4;
    }

    public String getBrandName() {
        return "Volvo";
    }

    public int getNoOfDoors() {
        return 4;
    }

    public String getDoorType() {
        return "Sideways";
    }
}
