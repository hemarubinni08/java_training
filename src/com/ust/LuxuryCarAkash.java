package com.ust;

public class LuxuryCarAkash extends VehicleAkash {
    public static int numberOfWheels(String vehicleType) {
        return 4;
    }

    public static double applicableTax() {
        return 30.00;
    }

    public static int seatingCapacity() {
        return 4;
    }

    public static double powerGenerated() {
        return 2400;
    }

    public static void nameOfVehicle() {
        System.out.println("This is a luxury car");
    }

    public static int numberOfDoors() {
        return 4;
    }
}
