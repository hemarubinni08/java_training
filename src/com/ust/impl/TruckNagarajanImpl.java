package com.ust.impl;

import com.ust.VehicleInterfaceNagarajan;

public class TruckNagarajanImpl implements VehicleInterfaceNagarajan {
    public String brand;
    public int speed;
    public int load;

    public String start() {
        return brand + " is  Starting";
    }

    public String stop() {
        return brand + " is stopped";
    }

    public String displayInfo() {
        return "Brand : " + brand + ", Speed : " + speed + ", Load : " + load;
    }

    public String loadingInfo() {
        return "Truck is loading goods";
    }
}
