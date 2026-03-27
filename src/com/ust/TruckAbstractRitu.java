package com.ust;

public class TruckAbstractRitu extends VechicleAbstractRitu {
    @Override
    int noOfTyres() {
        return 4;
    }

    @Override
    String modelName() {
        return "Lorri";
    }

    @Override
    int mileage() {
        return 20;
    }

    int noOfPeople() {
        return 10;
    }
}
