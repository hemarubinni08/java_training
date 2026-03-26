package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHema;
import com.ust.vehicleInterfaceHema;

public class CarHemaImpl implements vehicleInterfaceHema, HeavyVehicleInterfaceHema {

    public String color() {
        return "violet";
    }

    @Override
    public boolean hasAirBrakes() {
        return false;
    }

    public String gearSystem() {
        return "Automatic";
    }

    @Override
    public int loadCapacity() {
        return 5000;
    }

    public boolean hasAc() {
        return true;
    }

    @Override
    public String getBrand() {
        return "Innova Crysta";
    }

    @Override
    public int getWheelsCount() {
        return 4;
    }

    @Override
    public String getFuelType() {
        return "Diesel or Petrol ";
    }

    @Override
    public int doorsCount() {
        return 4;
    }
}

