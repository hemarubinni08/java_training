package com.ust.impl;

import com.ust.LargerVehicleInterface;
import com.ust.VehicleInterface;

public class CycleLogeshImpl implements VehicleInterface, LargerVehicleInterface {
    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }

    @Override
    public String getModel() {
        return "Herculus";
    }

    @Override
    public Integer getPrice() {
        return 5000;
    }

    @Override
    public boolean getAc() {
        return false;
    }

    @Override
    public String getFuel() {
        return "no need";
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
