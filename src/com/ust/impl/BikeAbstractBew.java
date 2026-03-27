package com.ust.impl;

import com.ust.VehicleAbstractBew;

public class BikeAbstractBew extends VehicleAbstractBew {

    public int numberOfWheels() {
        return 2;
    }

    public String colour() {
        return "bike";
    }

    public String getBrand() {
        return "Honda";
    }

    public Boolean useHelmet() {
        return true;
    }

    public int getEngineCc() {
        return 300;
    }
}
