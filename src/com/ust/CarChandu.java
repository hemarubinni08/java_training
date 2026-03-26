package com.ust;

public class CarChandu extends VehicleChandu {
    @Override
    public String fuel() {
        return "diesel";
    }

    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public int engine() {
        return 1370;
    }

    @Override
    public int passenger() {
        return 4;
    }
}
