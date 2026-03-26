package com.ust;

public class CarVarsha extends HeavyVehicleVarsha {
    @Override
    public int numberOfWheels() {
        return 3;
    }

    @Override
    public int numberOfLights() {
        return 3;
    }

    @Override
    public int capacityOfFuel() {
        return 300;
    }

    @Override
    public boolean publicTransportation() {
        return true;
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
    public boolean sunRoof() {
        return true;
    }
}

