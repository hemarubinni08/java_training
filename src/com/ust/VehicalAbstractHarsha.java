package com.ust;

public abstract class VehicalAbstractHarsha {
    public abstract int numberOfWheels();
    public abstract int engineCapacity();
    public abstract String fuelType();

    public boolean hasEngine(){
        return true;
    }

    public boolean hasGear(){
        return  true;
    }
}
