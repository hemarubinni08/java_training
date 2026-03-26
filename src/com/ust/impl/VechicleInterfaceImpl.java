package com.ust.impl;

import com.ust.VechicleInterfaceRitu;

public class VechicleInterfaceImpl implements VechicleInterfaceRitu {
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
}