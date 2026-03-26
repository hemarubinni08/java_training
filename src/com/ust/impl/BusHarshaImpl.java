package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHarsha;
import com.ust.VehicleInterfaceHarsha;

public class BusHarshaImpl implements HeavyVehicleInterfaceHarsha {

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean isPublicTransport() {
        return true;
    }

    @Override
    public boolean hasSunRoof() {
        return false;
    }

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
}
