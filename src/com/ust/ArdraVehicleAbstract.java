package com.ust;

public abstract class ArdraVehicleAbstract {
    abstract int numberOfWheels();
    abstract String sizeOfVehicle();
    abstract int numberOfPassengers();
    public boolean hasGears(){
        return true;
    }
    public boolean hasEngines(){
        return true;
    }
}
