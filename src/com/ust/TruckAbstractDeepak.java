package com.ust;

public class TruckAbstractDeepak extends VehicleAbstractDeepak{
    @Override
    int wheels() {
        return 6;
    }

    @Override
    int noofseats() {
        return 2;
    }

    @Override
    String brand() {
        return "Mahendra";
    }

    int noOfDoors()
    {
        return 2;
    }
}
