package com.ust;

public class BikeAbstractRitu extends VechicleAbstractRitu {
    @Override
    int noOfTyres() {
        return 2;
    }

    @Override
    String modelName() {
        return "Honda";
    }

    @Override
    int mileage() {
        return 10;
    }
}
