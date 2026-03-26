package com.ust.Impl;

import com.ust.HeavyVehiclesImpl;
import com.ust.VehicleInterfaceSrujan;

public class LorrySrujanImpl implements VehicleInterfaceSrujan, HeavyVehiclesImpl {

    @Override
    public int numberOfWheels() {
        return 18;
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public int costOfVehicle() {
        return 2000000;
    }

    @Override
    public int backupTires() {
        return 4;
    }

    @Override
    public String airConditioning() {
        return "Not Available";
    }

    @Override
    public boolean publicTransport() {
        return false;
    }

    @Override
    public int numberOfDoors() {
        return 2;
    }
}
