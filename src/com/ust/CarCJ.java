package com.ust;

public class CarCJ extends HeavyVehicleCJ {
    @Override
    public int numberOfWheels() {
        return super.numberOfWheels();
    }
    @Override
    public int numberOfGears() {
        return super.numberOfGears();
    }
//    @Override
//    public int numberOfDoors() {
//        return s
    @Override
    public int insurancePeriod() {
        return super.insurancePeriod() + 8;
    }
    public String getBrand() {
        return "Toyota";
    }

}
