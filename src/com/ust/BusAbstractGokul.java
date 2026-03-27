package com.ust;

public class BusAbstractGokul extends VehicleAbstractGokul{
    public int numberOfWheels() {
        return 4;
    }

    public int maximumSpeed() {
        return 120;
    }

    public int seatAvailable() {
        return 30;
    }
}
