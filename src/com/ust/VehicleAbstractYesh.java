package com.ust;

public abstract class VehicleAbstractYesh {
    protected abstract int numberOfWheels();
    protected abstract int maxSpeedOfVehicle();
    protected abstract String colorOfVehicle();
    public boolean itHasAc(){
        return true;
    }
    public int noOfSeats(){
        return 2;
    }
}
