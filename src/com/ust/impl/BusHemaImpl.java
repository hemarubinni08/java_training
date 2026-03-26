package com.ust.impl;

import com.ust.HeavyVehicleInterfaceHema;
import com.ust.vehicleInterfaceHema;

public class BusHemaImpl implements vehicleInterfaceHema, HeavyVehicleInterfaceHema {

    @Override
    public boolean hasAirBrakes() {
        return true;
    }

    @Override
    public String gearSystem() {
        return "manual Transimission";
    }

    @Override
    public int loadCapacity() {
        return 40000;
    }

    @Override
    public String getBrand() {
        return "ASM";
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
        return 3;
    }

}
