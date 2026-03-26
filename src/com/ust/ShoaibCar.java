package com.ust;

public class ShoaibCar extends HeavyVehicleShoaib {

    public boolean hasAirBag() {
        return true;
    }

    @Override
    public int kilometerDone() {
        return 40000;
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }
}