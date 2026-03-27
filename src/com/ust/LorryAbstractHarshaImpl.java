package com.ust;

public class LorryAbstractHarshaImpl extends HeavyVehiclesAbstractHarsha{
    @Override
    public int numberOfWheels() {
        return 8;
    }

    @Override
    public int engineCapacity() {
        return 9000;
    }

    @Override
    public String fuelType() {
        return "Disel";
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
    public boolean hasSunRoof() {
        return false;
    }
}
