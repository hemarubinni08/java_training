package com.ust;

public class TruckAbstractChaila extends HeavyVehicleAbstractChaila{
    @Override
    public Integer getNumberOfSeats() {
        return 3;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public Integer getNumberOfWheels() {
        return 6;
    }
}
