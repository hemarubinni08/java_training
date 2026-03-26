package com.ust.Impl;

import com.ust.VehicleInterfaceShoaib;

public class ShoaibBikeInterfaceImpl implements VehicleInterfaceShoaib {
    public int numberOfWheels() {
        System.out.println("Bike wheels");
        return 2;
    }



    public String vehicleBrand() {
        return "Ducati";
    }

    @Override
    public int kilometerDone() {
        return 70000;
    }
}
