package com.ust;

public class TruckAbstractCJImpl extends VehicleAbstractCJ{
    @Override
    protected int numberOfWheels() {
        return 10;
    }
    @Override
    protected int engineCc() {
        return 6000;
    }
    @Override
    protected int insurancePeriod() {
        return 8;
    }
    @Override
    public int numberOfDoors() {
        return 2;
    }
    @Override
    protected int numberOfGears() {
        return 8;
    }
}
