package com.ust;

public abstract class AbstractVehicleLekhya {
    protected abstract String fuelUsed();

    protected abstract Integer getSpeedLimit();

    public Integer getRpm() {
        return 2000;
    }
}
