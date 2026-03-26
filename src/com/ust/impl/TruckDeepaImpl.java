package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceDeepa;
import com.ust.VehicleInterfaceDeepa;

public class TruckDeepaImpl implements HeavyVehiclesInterfaceDeepa {
    public int numberOfWheels() {
        return 4;
    }

    public String vehicleColour() {
        return "Black";
    }

    public String vehicleBrand() {
        return "Mahindra";
    }

    public int numberOfDoors() {
        return 2;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public boolean hasSunroof() {
        return false;
    }

}
