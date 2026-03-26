package com.ust;

public class VehicleBusHemanth extends VehicleAbstractHemanth{
    @Override
    int noOfTyres() {
        return 6;
    }

    @Override
    String modelName() {
        return "Volvo";
    }

    @Override
    int mileage() {
        return 40;
    }
}
