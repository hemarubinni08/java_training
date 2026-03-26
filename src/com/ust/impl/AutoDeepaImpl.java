package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceDeepa;
import com.ust.VehicleInterfaceDeepa;

public class AutoDeepaImpl implements HeavyVehiclesInterfaceDeepa {

    public int numberOfWheels() {
        return 3;
    }


    public String vehicleColour() {
        return "Yellow";
    }


    public String vehicleBrand() {
        return "Bajaj";
    }

    @Override
    public int numberOfDoors() {
        return 2;
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
    public boolean hasSunroof() {
        return false;
    }

}
