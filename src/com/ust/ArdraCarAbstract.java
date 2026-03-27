package com.ust;

public class ArdraCarAbstract extends ArdraVehicleAbstract{
    @Override
    int numberOfWheels() {
        return 4;
    }

    @Override
    String sizeOfVehicle() {
        return "Medium";
    }

    @Override
    int numberOfPassengers() {
        return 5;
    }
}
