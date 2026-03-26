package com.ust.impl;

import com.ust.VehicleInterfaceLekhya;

public class BikeLekhyaImpl implements VehicleInterfaceLekhya {

    @Override
    public Integer getRpm() {
        return 2000;
    }

    @Override
    public String getFuelUsed() {
        return "Diesel";
    }

    @Override
    public Integer getSpeedLimit() {
        return 200;
    }
}
