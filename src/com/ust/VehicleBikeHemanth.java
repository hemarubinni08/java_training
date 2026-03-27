package com.ust;

public class VehicleBikeHemanth extends VehicleAbstractHemanth{
    @Override
    int noOfTyres() {
        return 2;
    }

    @Override
    String modelName() {
        return "Triumph";
    }

    @Override
    int mileage() {
        return 30;
    }
}
