package com.ust;

public abstract class VechicleAbstractRitu {
    abstract int noOfTyres();

    abstract String modelName();

    abstract int mileage();

    public boolean hasGears() {
        return true;
    }
}
