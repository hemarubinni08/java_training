package com.ust.impl;

import com.ust.HeavyVehicleInterfaceCJ;
import com.ust.VehicleInterfaceCJ;

public class BusCJImpl implements HeavyVehicleInterfaceCJ {
    @Override
    public int numberOfWheels() {
        return 0;
    }
    @Override
    public int engineCc() {
        return 0;
    }
    @Override
    public int insurancePeriod() {
        return 0;
    }

    @Override
    public boolean haveAc() {
        return false;
    }

    @Override
    public int numberOfDoors() {
        return 0;
    }
    @Override
    public int numberOfGears() {
        return 0;
    }
}
