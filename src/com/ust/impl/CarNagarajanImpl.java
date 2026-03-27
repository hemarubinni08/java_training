package com.ust.impl;

import com.ust.VehicleInterfaceNagarajan;

public class CarNagarajanImpl implements VehicleInterfaceNagarajan {
    public String brand;
    public int speed;

    @Override
    public String start() {
        return brand + " is  Starting";
    }

    @Override
    public String stop() {
        return brand + " is stopped";
    }

    @Override
    public String displayInfo() {
        return "Brand : " + brand + ", Speed : " + speed;
    }

    public String openCarDoor() {
        return "Car door is opened";
    }
}
