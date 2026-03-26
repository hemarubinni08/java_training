package com.ust;

public class TruckChandu extends HeavyVehicleChandu {
    @Override
    public String fuel() {
        return "Petrol";
    }

    @Override
    public int wheels() {
        return 12;
    }

    @Override
    public int engine() {
        return 2550;
    }

    @Override
    public int passenger() {
        return 3;
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
