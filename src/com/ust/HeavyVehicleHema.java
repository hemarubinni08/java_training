package com.ust;

public class HeavyVehicleHema extends VehiclesHema {
    public boolean hasAirBrakes() {
        return true;
    }

    public String gearSystem() {
        return "Manual Transmission";
    }

    public int loadCapacity() {
        return 20000;
    }
}
