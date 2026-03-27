package com.ust.Impl;

import com.ust.VehicleAbstractShoaib;

public class BikeAbstractShoaib extends VehicleAbstractShoaib {
    public int numberOfWheels() {
        System.out.println("Bike wheels");
        return 2;
    }

    @Override
    public String vehicleBrand() {
        return "Hero";
    }

    public String brand() {
        return "Ducati";
    }


    public int kilometerDone() {
        return 70000;
    }
}
