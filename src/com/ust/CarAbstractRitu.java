package com.ust;

public class CarAbstractRitu extends VechicleAbstractRitu {
    @Override
    int noOfTyres() {
        return 4;
    }

    @Override
    String modelName() {
        return "Swift";
    }

    @Override
    int mileage() {
        return 30;
    }
}
