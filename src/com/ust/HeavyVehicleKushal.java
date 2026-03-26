package com.ust;

public class HeavyVehicleKushal extends VehicleKushal {
    public boolean hasAC() {
        return true;
    }

    public int getDoorsCount() {
        return 4;
    }

    public boolean hasExtraTrye() {
        return true;
    }

    public boolean isPublicTransport() {
        return true;
    }

    public String getVehicleType() {
        return "HMV";
    }
}
