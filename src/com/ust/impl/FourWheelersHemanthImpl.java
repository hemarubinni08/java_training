package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHemanth;
import com.ust.VehicleInterfaceHemanth;

public class FourWheelersHemanthImpl implements VehicleInterfaceHemanth, HeavyVehicleInterfaceHemanth {
    @Override
    public String typeOfVehicle() {
        return "Cars Hii";
    }

    @Override
    public String modelName() {
        return "Suzuki";
    }

    @Override
    public int mileage() {
        return 18;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public int noOfDoors() {
        return 4;
    }

}
