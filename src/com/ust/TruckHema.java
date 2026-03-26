package com.ust;

public class TruckHema extends HeavyVehicleHema {
    public String getBrand() {
        return "Ashok Layland";
    }

    public int getWheelsCount() {
        return 6;
    }

    public int doorsCount() {
        return 6;
    }

    public int loadCapacity() {
        return 30000;
    }
}
