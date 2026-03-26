package com.ust.impl;

import com.ust.HeavyVehiclesAbstractHarsha;
import com.ust.VehicalAbstractHarsha;

public class BusAbstractHarshaImpl extends HeavyVehiclesAbstractHarsha {
    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public int engineCapacity() {
        return 7000;
    }

    @Override
    public String fuelType() {
        return "Disel";
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return true;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }
}
