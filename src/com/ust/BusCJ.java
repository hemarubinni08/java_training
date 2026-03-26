package com.ust;

public class BusCJ extends HeavyVehicleCJ{
    @Override
    public int numberOfWheels() {
        return super.numberOfWheels() + 2;
    }
//    @Override
//    public int numberOfDoors() {
//        return super.numberOfDoors() + 2;
//    }
    @Override
    public int engineCc() {
        return super.engineCc() + 2650;
    }
    @Override
    public int numberOfGears() {
        return super.numberOfGears() + 2;
    }
    public String getBrand() {
        return "Force";
    }

    @Override
    public int insurancePeriod() {
        return super.insurancePeriod() + 7;
    }
}
