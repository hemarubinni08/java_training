package com.ust.impl;

import com.ust.HeavyVehiclesAbstractHarsha;
import com.ust.VehicalAbstractHarsha;

public class CarAbstractHarshaImpl extends HeavyVehiclesAbstractHarsha {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public int engineCapacity() {
        return 1500;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }
}
