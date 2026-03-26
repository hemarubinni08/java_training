package com.ust;

public class TruckAkash extends HeavyVehicleAkash {
    public int numberOfWheels() {
        return 10;
    }

    public double applicableTax() {
        return 25.00;
    }

    public int seatingCapacity() {
        return 3;
    }

    public double powerGenerated() {
        return 2500;
    }

    public int numberOfDoors() {
        return 2;
    }

    public boolean isCommercial() {
        return true;
    }

    public boolean isMultiAxle() {
        return true;
    }
}
