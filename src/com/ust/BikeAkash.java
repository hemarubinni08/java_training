package com.ust;

public class BikeAkash extends VehicleAkash {
    public static int numberOfWheels(String vehicleType) {
        return 2;
    }

    public static double applicableTax() {
        return 12.00;
    }

    public static int seatingCapacity() {
        return 2;
    }

    public static double powerGenerated() {
        return 350;
    }
}
