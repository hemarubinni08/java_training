package com.ust;

public class BikeAbstractChaila extends VehicleAbstractChaila{
    @Override
    protected Integer getNumberOfSeats() {
        return 2;
    }
    @Override
    protected Integer getNumberOfWheels() {
        return 2;
    }
}
