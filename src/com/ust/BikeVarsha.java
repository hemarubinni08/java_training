package com.ust;

public class BikeVarsha extends HeavyVehicleVarsha {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public int numberOfLights() {
        return 2;
    }

    @Override
    public int capacityOfFuel() {
        return 100;
    }

    @Override
    public boolean publicTransportation() {
        return false;
    }

    @Override
    public int numberOfDoors() {
        return 0;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean sunRoof() {
        return false;
    }

}
