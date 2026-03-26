package com.ust.Impl;

import com.ust.HeavyVehiclesImpl;
import com.ust.VehicleInterfaceSrujan;

public class CarSrujanImpl implements VehicleInterfaceSrujan, HeavyVehiclesImpl {
    @Override
    public int numberOfWheels() {

        return 4;
    }

    @Override
    public String fuelType() {
        return "diesel";
    }

    @Override
    public int costOfVehicle() {

        return 1000000;
    }

    @Override
    public int backupTires() {
        return 1;
    }

    @Override
    public String airConditioning() {
        return "Available";
    }

    @Override
    public boolean publicTransport() {
        return false;
    }

    @Override
    public int numberOfDoors() {
        return 4;
    }
}
