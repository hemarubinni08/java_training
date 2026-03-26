package com.ust.impl;

import com.ust.LargerVehicleInterface;
import com.ust.VehicleInterface;

public class CarLogeshImpl implements VehicleInterface, LargerVehicleInterface {

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getModel() {
        return "TATA";
    }

    @Override
    public Integer getPrice() {
        return 100000;
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
        return 4;
    }
}
