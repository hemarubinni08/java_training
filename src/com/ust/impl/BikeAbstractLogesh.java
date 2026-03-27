package com.ust.impl;

import com.ust.VehicleAbstractLogesh;

public class BikeAbstractLogesh extends VehicleAbstractLogesh {
    public Integer numberofWheels() {
        return 2;
    }

    public Integer getGear() {
        return 4;
    }

    @Override
    public Integer getNumberOfWheels() {
        return 0;
    }

    public String getModel() {
        return "Pulser";
    }

    public int getSeat() {
        return 2;
    }

    public Integer getPrice() {
        return 70000;
    }

    public Integer getSpeed() {
        return 80;
    }
}
