package com.ust;

public class TrainAbstractRohit extends VehicleAbstractRohit{

    @Override
    public String fast() {
        return "Very fast";
    }

    @Override
    public String mileage() {
        return "6l/km";
    }

    @Override
    public int speed() {
        return 300;
    }
}
