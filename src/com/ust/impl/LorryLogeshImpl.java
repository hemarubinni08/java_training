package com.ust.impl;

import com.ust.LargerVehicleInterface;
import com.ust.VehicleInterface;

public class LorryLogeshImpl implements VehicleInterface, LargerVehicleInterface {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getModel() {
        return "Eicher";
    }

    @Override
    public Integer getPrice() {
        return 200000;
    }

    @Override
    public boolean getAc() {
        return false;
    }

    @Override
    public String getFuel() {
        return "Diesel";
    }

    @Override
    public boolean getLoadBed() {
        return false;
    }

    @Override
    public int getNumberOfSeat() {
        return 2;
    }
}
