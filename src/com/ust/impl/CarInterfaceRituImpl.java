package com.ust.impl;

import com.ust.VechicleInterfaceRitu;
import com.ust.VechicleInterfaceRitu;

public class CarInterfaceRituImpl implements VechicleInterfaceRitu {


    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int mileage() {
        return 20;
    }

    @Override
    public String getBrand() {
        return "Swift";
    }
}
