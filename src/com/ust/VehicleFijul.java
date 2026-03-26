package com.ust;

public class VehicleFijul {
    public int numberOfWheels() {
        return 4;
    }

    public int getTopSpeed() {
        return 200;
    }

    public String brandName() {
        return "Mercedes";
    }

    public boolean isServiceDue() {
        if (totalKilometer() > 200000) {
            return true;
        }
        return false;
    }

    public int totalKilometer() {
        return 200000;
    }
}