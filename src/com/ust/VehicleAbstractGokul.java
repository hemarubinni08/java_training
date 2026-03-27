package com.ust;

abstract class VehicleAbstractGokul {
    abstract int numberOfWheels();
    abstract int maximumSpeed();
    abstract int  seatAvailable();
    boolean hasGears(){
        return true;
    }
}
