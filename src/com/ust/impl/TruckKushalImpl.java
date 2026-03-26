package com.ust.impl;

import com.ust.HeavyVehicleInterfaceKushal;
import com.ust.VehicleInterfaceKushal;

public class TruckKushalImpl implements VehicleInterfaceKushal, HeavyVehicleInterfaceKushal {

    @Override
    public int getWheelsCounnt() {
        return 14;
    }

    @Override
    public String getColour() {
        return "Brown";
    }

    @Override
    public boolean hasAC() {
        return false;
    }

    @Override
    public int getDoorsCount() {
        return 2;
    }

    @Override
    public boolean hasExtraTrye() {
        return true;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Bharath Benz";
    }

    @Override
    public String getVehicleType() {
        return "HMV";
    }
}
