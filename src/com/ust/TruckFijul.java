package com.ust;

public class TruckFijul extends HeavyVehicleFijul {
    @Override
    public String brandName() {
        return "Volvo";
    }

    @Override
    public int numberOfWheels() {
        return 8;
    }
}
