package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHarsha;
import com.ust.VehicleInterfaceHarsha;

public class CarHarshaImpl implements HeavyVehicleInterfaceHarsha {
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
        return true;
    }

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
}
