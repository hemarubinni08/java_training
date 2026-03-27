package com.ust;

public class BikeChaila extends VehicleChaila {
    @Override
    public int getNumberOfSeats() {
        return 2;
    }
    @Override
    public int getNumberOfWheels() {
        return 2;
    }
    @Override
    public String getBrand() {
        return "Honda";
    }
    public boolean hasKicker(){
        return true;
    }
}
