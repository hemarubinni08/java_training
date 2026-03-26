package com.ust.impl;

import com.ust.VehicleInterfaceShoaib;

public class ShoaibScootyInterfaceImpl implements VehicleInterfaceShoaib {
    public int numberOfWheels() {
        System.out.println("Scooty wheels");
        return 2;
    }

    @Override
    public String vehicleBrand() {
        return "Maaruti Suzuki";
    }

    @Override
    public int kilometerDone() {
        return 55000;
    }
}
