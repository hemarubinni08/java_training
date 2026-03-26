package com.ust.impl;

import com.ust.VehicleInterfaceAish;

public class CarInterfaceImpl implements VehicleInterfaceAish {

    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public String brand() {
        return "honda";
    }
    public int fetchDoors(){
        return 2;
    }
    public boolean hasAc(){
        return true;
    }
}
