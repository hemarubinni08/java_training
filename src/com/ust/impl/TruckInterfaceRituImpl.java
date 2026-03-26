package com.ust.impl;

import com.ust.HeavyVechicleInterface;
import com.ust.VechicleInterfaceRitu;

public class TruckInterfaceRituImpl implements VechicleInterfaceRitu, HeavyVechicleInterface {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int mileage() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Lorri";
    }
    public boolean hasAc(){
        return false;
    }

    @Override
    public int noOfPeople() {
        return 10;
    }

    @Override
    public int noOfDoors() {
        return 2;
    }
}
