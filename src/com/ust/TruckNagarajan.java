package com.ust;

public class TruckNagarajan extends HeavyVehicleNagarajan {
    int load;

    String truckInfo() {
        return displayInfo() + ", AC : " + ac + ", Load : " + load;
    }

    String loadingInfo() {
        return "Truck is loading goods";
    }
}
