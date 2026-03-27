package com.ust;

public class VehicleNagarajan {
    String brand;
    int speed;

    String start() {
        return brand + " is  Starting";
    }

    String stop() {
        return brand + " is stopped";
    }

    String displayInfo() {
        return "Brand : " + brand + ", Speed : " + speed;
    }


}
