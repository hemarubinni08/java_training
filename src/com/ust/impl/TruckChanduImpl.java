package com.ust.impl;

import com.ust.HeavyVehicleInterFaceChandu;
import com.ust.VehicleInterFaceChandu;

public class TruckChanduImpl implements HeavyVehicleInterFaceChandu {
    @Override
    public String fuel() {
        return "diesel";
    }

    @Override
    public int wheels() {
        return 12;
    }

    @Override
    public int engine() {
        return 3577;
    }

    @Override
    public int passenger() {
        return 5;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean hasSunroof() {
        return false;
    }

    @Override
    public boolean hasDriverCabin() {
        return false;
    }
}
