package com.ust;

public class BusAbstractChaila extends HeavyVehicleAbstractChaila{
    @Override
    public Integer getNumberOfSeats() {
        return 20;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}
