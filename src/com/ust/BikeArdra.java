package com.ust;

public class BikeArdra extends VehicleArdra {
    public int numberOfWheels() {
        return 2;
    }

    public String getSizeOfVehicle() {
        return "Small";
    }

    public int maximumPassengers() {
        return 2;
    }

    public boolean hasAC() {
        return false;
    }

    public boolean needsHelmet() {
        return true;
    }
}
