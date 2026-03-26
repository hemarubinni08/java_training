package com.ust;

public class BusAbstractChaila extends VehicleAbstractChaila{
    @Override
    protected Integer getNumberOfSeats() {
        return 20;
    }
    @Override
    protected Integer getNumberOfWheels() {
        return 4;
    }
}
