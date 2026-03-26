package com.ust.impl;

import com.ust.VechicleInterfaceRitu;
import com.ust.HeavyVechicleInterfaceRitu;


public class TruckInterfaceRituImpl implements VechicleInterfaceRitu,HeavyVechicleInterfaceRitu  {

    @Override
    public int noOfWheels() {
        return 0;
    }

    @Override
    public int mileage() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "";
    }

    @Override
    public int noOfPeople() {
        return 0;
    }

    @Override
    public int noOfDoors() {
        return 0;
    }
}
