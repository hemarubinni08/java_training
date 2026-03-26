package com.ust.impl;

import com.ust.VehicleInterfaceAnu;

public class BikeInterfaceImpl implements VehicleInterfaceAnu {
import com.ust.VechicleInterfaceRitu;

public class BikeInterfaceImpl implements VechicleInterfaceRitu {
    @Override
    public int noOfWheels() {
        return 2;
    }

    @Override
    public int maxSpeed() {
        return 90;
    public int mileage() {
        return 20;
    }

    @Override
    public String getBrand() {
        return "KTM";
        return "Honda";
    }
}
