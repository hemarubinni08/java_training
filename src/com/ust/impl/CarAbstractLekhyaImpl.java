package com.ust.impl;

import com.ust.AbstractVehicleLekhya;
import com.ust.HeavyVehicleAbstractLekhya;

public class CarAbstractLekhyaImpl extends HeavyVehicleAbstractLekhya {
    @Override
    public String fuelUsed() {
        return "Diesel";
    }

    @Override
    public Integer getSpeedLimit() {
        return 200;
    }

    @Override
    public boolean hasAc() {
        return true;
    }
}
