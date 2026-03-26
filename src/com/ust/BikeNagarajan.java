package com.ust;

public class BikeNagarajan extends VehicleNagarajan {

    boolean helmet;

    String bikeInfo() {
        return displayInfo() + ", Helmet " + helmet;
    }

    String ride() {
        return "Bike is ridining";
    }
}
