package com.ust;

import com.ust.impl.HeavyVehicleInterfaceKv;

public class CarInterfaceKvImpl implements VehicleInterfaceKv, HeavyVehicleInterfaceKv {

    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int maxSpeed() {
        return 200;
    }

    @Override
    public String getBrand() {
        return "Activa";
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int noOfPassengers() {
        return 4;
    }
}

