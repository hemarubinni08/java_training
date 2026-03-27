package com.ust;

public class BikeAbstractHarsh extends VehicleAbstractHarsh{
    @Override
    public int speed() {
        return 100;
    }

    @Override
    public String color() {
        return "Blue";
    }

    @Override
    public String brand() {
        return "Classic 350";
    }
}
