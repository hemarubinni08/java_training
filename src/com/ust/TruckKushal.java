package com.ust;

public class TruckKushal extends HeavyVehicleKushal {
    public int getWheelsCount() {
        return 10;
    }

    public int getDoorsCount() {
        return 2;
    }

    public String getVehicleCapacity() {
        return "100 Tons";
    }

    @Override
    public boolean hasAC() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }
}
