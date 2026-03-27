package com.ust;

public class VehicleCarHemanth extends VehicleAbstractHemanth{
    @Override
    int noOfTyres() {
        return 4;
    }

    @Override
    String modelName() {
        return "TATA";
    }

    @Override
    int mileage() {
        return 15;
    }
}
