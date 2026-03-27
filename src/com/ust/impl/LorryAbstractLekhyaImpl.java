package com.ust.impl;

import com.ust.AbstractVehicleLekhya;
import com.ust.HeavyVehicleAbstractLekhya;

public class LorryAbstractLekhyaImpl extends HeavyVehicleAbstractLekhya {
    @Override
    public String fuelUsed() {
        return "Petrol";
    }

    @Override
    public Integer getSpeedLimit() {
        return 200;
    }

    public String registrationNumber() {
        return "KL20H83732";
    }

    @Override
    protected boolean hasAc() {
        return false;
    }
}
