package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHema;
import com.ust.vehicleInterfaceHema;

public class TruckHemaImpl implements vehicleInterfaceHema, HeavyVehicleInterfaceHema {
    @Override
    public String getBrand() {
        return "Ashok Layland";
    }

    @Override
    public int getWheelsCount() {
        return 6;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int doorsCount() {
        return 2;
    }

    @Override
    public boolean hasAirBrakes() {
        return true;
    }

    @Override
    public String gearSystem() {
        return "manual Transmission";
    }

    @Override
    public int loadCapacity() {
        return 200000;
    }

}
