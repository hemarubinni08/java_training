package com.ust;

public class TruckCJ extends HeavyVehicleCJ {
    @Override
    public int numberOfWheels() {
        return super.numberOfWheels() + 4;
    }
    @Override
    public int insurancePeriod() {
        return super.insurancePeriod() + 10;
    }
    //    @Override
//    public int numberOfDoors() {
//        return super.numberOfDoors() + 2;
//    }
    @Override
    public int numberOfGears() {
        return super.numberOfGears() + 3;
    }
    @Override
    public int engineCc() {
        return super.engineCc() + 4650;
    }
    public String getBrand() {
        return "Ashok_Leyland";
    }
}
