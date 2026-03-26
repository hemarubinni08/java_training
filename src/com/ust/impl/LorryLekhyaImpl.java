package com.ust.impl;

import com.ust.HeavyVehicleInterfaceLekhya;
import com.ust.VehicleInterfaceLekhya;

public class LorryLekhyaImpl implements VehicleInterfaceLekhya, HeavyVehicleInterfaceLekhya {

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
        return 300;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public int getDoor() {
        return 2;
    }
}
