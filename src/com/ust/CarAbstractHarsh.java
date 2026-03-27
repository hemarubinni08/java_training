package com.ust;

public class CarAbstractHarsh extends VehicleAbstractHarsh{
    @Override
    public int speed() {
        return 120;
    }

    @Override
    public String color() {
        return "Red";
    }

    @Override
    public String brand() {
        return "BMW";
    }
    public int numberOfDoor(){
        return 2;
    }
}
