package com.ust;

public class BikeCJ extends VehicleCJ {
    @Override
    public int numberOfWheels() {
        return super.numberOfWheels() - 2;
    }
    @Override
    public int engineCc() {
        return super.engineCc();
    }
    @Override
    public int insurancePeriod() {
        return 5;
    }
    @Override
    public int numberOfGears() {
        return super.numberOfGears() - 1;
    }
    public String getBrand() {
        return "Royal Enfield";
    }
}
