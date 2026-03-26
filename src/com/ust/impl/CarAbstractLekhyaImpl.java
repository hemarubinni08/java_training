package com.ust.impl;

import com.ust.AbstractVehicleLekhya;

public class CarAbstractLekhyaImpl extends AbstractVehicleLekhya {
    @Override
    public String fuelUsed() {
        return "Diesel";
    }

    @Override
    public Integer getSpeedLimit() {
        return 200;
    }
}
