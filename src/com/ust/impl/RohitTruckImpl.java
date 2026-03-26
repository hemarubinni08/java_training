package com.ust.impl;

import com.ust.HeavyVehicleInterfaceRohit;
import com.ust.VehicleInterfaceRohit;

public class RohitTruckImpl implements VehicleInterfaceRohit, HeavyVehicleInterfaceRohit {
    public Boolean headLights() {
        return true;
    }

    public String brand() {
        return "Ashok Leyland";
    }

    public Boolean doors() {
        return true;
    }

    public Boolean hasAc() {
        return false;
    }

    public String noOfSeats() {
        return "Has 2 seats";
    }

    public String speed() {
        return "100 km/hr";
    }

    public int noOfWheels() {
        return 6;
    }

    public String color() {
        return "Brown";
    }

    public String heavy() {
        return " Heavy";
    }

    public Boolean carryHeavy() {
        return true;
    }

    public String needHeavyLicense() {
        return "Yes";
    }
}

