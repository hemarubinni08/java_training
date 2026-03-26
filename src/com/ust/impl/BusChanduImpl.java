package com.ust.impl;

import com.ust.HeavyVehicleInterFaceChandu;
import com.ust.VehicleInterFaceChandu;

public class BusChanduImpl implements HeavyVehicleInterFaceChandu {
    @Override
    public String fuel() {
        return "petrol";
    }

    @Override
    public int wheels() {
        return 14;
    }

    @Override
    public int engine() {
        return 2550;
    }

    @Override
    public int passenger() {
        return 24;
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
