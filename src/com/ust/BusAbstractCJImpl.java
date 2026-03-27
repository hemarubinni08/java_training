package com.ust;

public class BusAbstractCJImpl extends VehicleAbstractCJ{
    @Override
    protected int numberOfWheels() {
        return 6;
    }
    @Override
    public int engineCc() {
        return 4000;
    }
    @Override
    public int insurancePeriod() {
        return 10;
    }
    @Override
    protected int numberOfDoors() {
        return 2;
    }
    @Override
    public int numberOfGears() {
        return 6;
    }
}
