package com.ust.impl;

import com.ust.HeavyVehicleInterfaceRohit;
import com.ust.VehicleInterfaceRohit;

public class RohitBikeImpl implements VehicleInterfaceRohit, HeavyVehicleInterfaceRohit {
    public Boolean headLights() {
        return true;
    }

    public String brand() {
        return "BMW";
    }

    public Boolean doors() {
        return false;
    }

    public Boolean hasAc() {
        return false;
    }

    public String noOfSeats() {
        return "Has 2 seats";
    }

    public String speed() {
        return "300 km/hr";
    }

    public int noOfWheels() {
        return 2;
    }

    public String color() {
        return "Black";
    }

    public String heavy() {
        return "Not Heavy";
    }

    @Override
    public Boolean carryHeavy() {
        return false;
    }

    @Override
    public String needHeavyLicense() {
        return "no";
    }
}
