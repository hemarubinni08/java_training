package com.ust;

public class BusAbstractDeepak extends VehicleAbstractDeepak{
    @Override
    int wheels() {
        return 8;
    }

    @Override
    int noofseats() {
        return 40;
    }

    @Override
    String brand() {
        return "Volvo";
    }
    int noOfDoors()
    {
        return 2;
    }
}
