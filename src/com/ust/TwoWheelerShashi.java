package com.ust;

public class TwoWheelerShashi extends VehicleShashi {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String modelName() {
        return "Shine";
    }

    @Override
    public int yearsOfInsurance() {
        return 2;
    }
    public int numberOfStokes(){
        return 4;
    }
}
