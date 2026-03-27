package com.ust;

public abstract class VehicleAbstractHarsh {
    abstract public int speed();

    abstract public String color();

    abstract public String brand();

    public int numberOfDoor() {
        return 6;
    }

    public boolean hasAc() {
        return false;
    }
}
