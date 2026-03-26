package com.ust.impl;

import com.ust.AbstractVehicleLekhya;

public class LorryAbstractLekhyaImpl extends AbstractVehicleLekhya {
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
}
