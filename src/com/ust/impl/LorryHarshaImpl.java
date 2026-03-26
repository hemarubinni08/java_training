package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHarsha;
import com.ust.VehicleInterfaceHarsha;

public class LorryHarshaImpl implements HeavyVehicleInterfaceHarsha {

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }

    @Override
    public int numberOfWheels() {
        return 8;
    }

    @Override
    public int engineCapacity() {
        return 9000;
    }

    @Override
    public String fuelType() {
        return "Disel";
    }
}
