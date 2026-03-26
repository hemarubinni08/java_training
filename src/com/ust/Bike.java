package com.ust;

public class Bike extends HeavyVehicleGokul {
    public int seatAvailable(){
        return 2;
    }
    public boolean hasAc(){
        return false;
    }
    public boolean  hasDoors(){
        return false;
    }
    public boolean isPublicTransport() {
        return false;
    }
}
