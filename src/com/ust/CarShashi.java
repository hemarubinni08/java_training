package com.ust;

public class CarShashi extends VehicleShashi {
    @Override
    public int getYearsOfInsurance() {
        return 2;
    }

    public String getDoorOpeningType() {
        return "Standard";
    }

    public boolean getAirConditioning() {
        return true;
    }
}
