package com.ust.impl;

import com.ust.VehicleAbstractHema;

public class BusAbstractHema extends VehicleAbstractHema {

    @Override
    protected String getBrand() {
        return "KMS";
    }

    @Override
    protected int getWheelsCount() {
        return 6;
    }

    @Override
    public String getFuelType() {
        return "Diesel or Petrol";
    }

    public int rate() {
        return 20000;
    }
}
