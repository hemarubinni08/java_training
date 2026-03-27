package com.ust;

public abstract class VehicleAbstractNagarajan {
    protected String brand;
    protected int speed;

    protected String start() {
        return brand + " is  Starting";
    }

    protected String stop() {
        return brand + " is stopped";
    }

    protected String displayInfo() {
        return "Brand : " + brand + ", Speed : " + speed;
    }
}
