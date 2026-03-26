package com.ust.impl;

import com.ust.HeavyVehicleInterfaceKushal;
import com.ust.VehicleInterfaceKushal;

public class CarKushalImpl implements VehicleInterfaceKushal, HeavyVehicleInterfaceKushal {
    @Override
    public int getWheelsCounnt() {
        return 4;
    }

    @Override
    public String getColour() {
        return "Grey";
    }

    @Override
    public boolean hasAC() {
        return true;
    }

    @Override
    public int getDoorsCount() {
        return 5;
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
        return "BMW";
    }

    @Override
    public String getVehicleType() {
        return "LMV";
    }
}
