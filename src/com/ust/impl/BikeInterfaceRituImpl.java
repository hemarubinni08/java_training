package com.ust.impl;
import com.ust.VechicleInterfaceRitu;


public class BikeInterfaceRituImpl implements VechicleInterfaceRitu {

    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int mileage() {
        return 010;
    }

    @Override
    public String getBrand() {
        return "Honda";
    }
}
