package com.ust.impl;

import com.ust.HeavyVehicleInterfaceLekhya;
import com.ust.VehicleInterfaceLekhya;

public class CarLekhyaImpl implements VehicleInterfaceLekhya, HeavyVehicleInterfaceLekhya {
    @Override
    public Integer getRpm() {
        return 2000;
    }

    @Override
    public String getFuelUsed() {
        return "Petrol";
    }

    @Override
    public Integer getSpeedLimit() {
        return 150;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public int getDoor() {
        return 4;
    }
}
