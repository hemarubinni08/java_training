package com.ust.impl;

import com.ust.HeavyVehicleInterfaceRohit;
import com.ust.VehicleInterfaceRohit;

public class RohitCarImpl implements VehicleInterfaceRohit, HeavyVehicleInterfaceRohit {
    public Boolean headLights() {
        return true;
    }

    public String brand() {
        return "Benz";
    }

    public Boolean doors() {
        return true;
    }

    public Boolean hasAc() {
        return true;
    }

    public String noOfSeats() {
        return "Has 4 seats";
    }

    public String speed() {
        return "300 km/hr";
    }

    public int noOfWheels() {
        return 4;
    }

    public String color() {
        return "Black";
    }

    public String heavy() {
        return "Not Heavy";
    }

    public Boolean carryHeavy() {
        return false;
    }


    public String needHeavyLicense() {
        return "no";
    }
}
