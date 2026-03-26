package com.ust.impl;

import com.ust.HeavyVehicleInterfaceKushal;
import com.ust.VehicleInterfaceKushal;

public class BusKushalImpl implements VehicleInterfaceKushal, HeavyVehicleInterfaceKushal {
    @Override
    public int getWheelsCounnt() {
        return 6;
    }

    @Override
    public String getColour() {
        return "White";
    }

    @Override
    public boolean hasAC() {
        return true;
    }

    @Override
    public int getDoorsCount() {
        return 3;
    }

    @Override
    public boolean hasExtraTrye() {
        return true;
    }

    @Override
    public boolean isPublicTransport() {
        return true;
    }

    @Override
    public String getBrand() {
        return "Volvo";
    }

    @Override
    public String getVehicleType() {
        return "HMV";
    }
}
