package com.ust;

public class CarAbstractChaila extends VehicleAbstractChaila {
    @Override
    protected Integer getNumberOfSeats() {
        return 4;
    }
    @Override
    protected Integer getNumberOfWheels() {
        return 4;
    }
    public String getBrand(){
        return null;
    }
}
