package com.ust.impl;

import com.ust.VechicleInterfaceRitu;

public class CarInterfaceImpl implements VechicleInterfaceRitu {

    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int mileage() {
        return 25;
    }

    @Override
    public String getBrand() {
        return "BMW";
    }
    public int noOfDoors(){
        return 4;
    }
}
