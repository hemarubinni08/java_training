package com.ust;

public class CarShashi extends VehicleShashi {
    @Override
    public int yearsOfInsurance() {
        return 2;
    }

    public String doorOpeningType() {
        return "Standard";
    }

    public boolean airConditioning() {
        return true;
    }
}
