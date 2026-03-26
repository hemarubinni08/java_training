package com.ust;

public class HeavyVehicles extends MainVehicleMamtha {
    public boolean isPublicTransport() {
        return false;
    }

    public boolean isAC() {
        return false;
    }

    public int numberOfDoors() {
        return 2;
    }

    public int numberOfSeats() {
        return 6;
    }

    public int weight() {
        return 7000;
    }
}
