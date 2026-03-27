package com.ust.impl;

import com.ust.VehicleInterfaceAish;

public class BusInterfaceImpl implements VehicleInterfaceAish {
    @Override
    public int wheels() {
        return 6;
    }

    @Override
    public String color() {
        return "blue";
    }

    @Override
    public String brand() {
        return "KSRTC";
    }
    public int doors() {
        return 2;
    }
    public boolean hasAc(){
        return true;
    }
}
