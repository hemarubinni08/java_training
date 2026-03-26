package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceDeepa;
import com.ust.VehicleInterfaceDeepa;

public class CarDeepaImpl implements HeavyVehiclesInterfaceDeepa {

    public int numberOfWheels() {
        return 4;
    }


    public String vehicleColour() {
        return "Red";
    }


    public String vehicleBrand() {
        return "Ford";
    }

    @Override
    public int numberOfDoors() {
        return 4;
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
    public boolean hasSunroof() {
        return true;
    }
}
