package com.ust;

public abstract class VehicleAbstarctChandu {
    protected abstract String fuel();

    protected abstract int wheels();

    protected abstract int engine();

    protected abstract int passenger();

    public boolean hasAc() {
        return true;
    }

    public boolean hasSunroof() {
        return false;
    }

    public boolean hasDriverCabin() {
        return true;
    }
}
