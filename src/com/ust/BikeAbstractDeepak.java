package com.ust;

public class BikeAbstractDeepak extends VehicleAbstractDeepak{
    @Override
    int wheels() {
        return 2;
    }

    @Override
    int noofseats() {
        return 2;
    }

    @Override
    String brand() {
        return "Yamaha";
    }
    boolean hasAc()
    {
        return false;
    }
    int noOfDoors()
    {
        return 0;
    }
}
