package com.ust.impl;

import com.ust.VehicleAbstractBew;

public class CarAbstractBew extends VehicleAbstractBew {

    public String colour() {
        return "Blue";
    }
    public Boolean isPublicTransport() {
        return false;
    }
    public int numberOfWheels(){
        return 4;
    }
    public String getBrand(){
        return "Toyota";
    }
}
