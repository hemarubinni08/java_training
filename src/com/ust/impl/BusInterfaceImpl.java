package com.ust.impl;

import com.ust.HeavyVechileInterfaceHarsh;
import com.ust.VehicleInterfaceHarsh;

public class BusInterfaceImpl implements VehicleInterfaceHarsh,HeavyVechileInterfaceHarsh {
    public int wheeles() {
        return 10;
    }

    public String color() {
        return "Blue";
    }

    public String brand() {
        return "BMW";
    }

    public int numberOfDoor() {
        return 0;
    }

    public boolean hasAc() {
        return false;
    }

    public boolean speedMoreThan120() {
        return false;
    }
}
