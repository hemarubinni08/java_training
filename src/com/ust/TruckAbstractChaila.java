package com.ust;

public class TruckAbstractChaila extends VehicleAbstractChaila{
    @Override
    protected Integer getNumberOfSeats() {
        return 3;
    }
    @Override
    protected Integer getNumberOfWheels() {
        return 6;
    }
}
