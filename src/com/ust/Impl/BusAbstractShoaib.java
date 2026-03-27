package com.ust.Impl;

import com.ust.HeavyVehicleShoaib;
import com.ust.VehicleAbstractShoaib;

public class BusAbstractShoaib extends HeavyVehicleShoaib {
    @Override
    public int kilometerDone() {
        return 55045;
    }

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String vehicleBrand() {
        return "TATA";
    }

    public boolean hasAc() {
        return true;
    }


}
