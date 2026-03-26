package com.ust;

public class BusChandu extends HeavyVehicleChandu {
    @Override
    public String fuel() {
        return "diesel";
    }

    @Override
    public int wheels() {
        return 16;
    }

    @Override
    public int engine() {
        return 2760;
    }

    @Override
    public int passenger() {
        return 24;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean hasSunroof() {
        return false;
    }

    @Override
    public boolean hasDriverCabin() {
        return true;
    }
}
