package com.ust;

public class BikeBew extends VehicleBew {

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
