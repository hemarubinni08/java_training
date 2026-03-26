package com.ust.impl;

import com.ust.LargerVehicleInterface;
import com.ust.VehicleInterface;

public class BikeLogeshImpl implements VehicleInterface, LargerVehicleInterface {
    @Override
    public Integer getNumberOfWheels() {
        return 2;
    }

    @Override
    public String getModel() {
        return "Pulser";
    }

    @Override
    public Integer getPrice() {
        return 80000;
    }

    @Override
    public boolean getAc() {
        return false;
    }

    @Override
    public String getFuel() {
        return "Petrol";
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
