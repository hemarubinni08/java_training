package com.ust.Impl;

import com.ust.VehicleAbstractShoaib;

public class ScootyAbstractShoaib extends VehicleAbstractShoaib {
    public int numberOfWheels() {
        System.out.println("Scooty wheels");
        return 2;
    }


    public String vehicleBrand() {
        return "Maaruti Suzuki";
    }


    public int kilometerDone() {
        return 55000;
    }
}
