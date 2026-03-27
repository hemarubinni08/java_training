package com.ust;

public class TwoWheelerShashi extends VehicleShashi {
    @Override
    public int getNumberOfWheels() {
        return 2;
    }

    @Override
    public String getModelName() {
        return "Shine";
    }

    @Override
    public int getYearsOfInsurance() {
        return 2;
    }
    public int getNumberOfStokes(){
        return 4;
    }
}
