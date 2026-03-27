package com.ust;

public class CarAbstractChaila extends HeavyVehicleAbstractChaila {
    @Override
    public Integer getNumberOfSeats() {
        return 4;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
    public String getBrand(){
        return null;
    }
}
