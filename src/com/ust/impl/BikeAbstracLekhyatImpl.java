package com.ust.impl;

import com.ust.AbstractVehicleLekhya;

public class BikeAbstracLekhyatImpl extends AbstractVehicleLekhya {
    @Override
    public String fuelUsed() {
        return "Petrol";
    }

    @Override
    public Integer getSpeedLimit() {
        return 250;
    }

    public String brandName() {
        return "Royal Enfield";
    }
}
