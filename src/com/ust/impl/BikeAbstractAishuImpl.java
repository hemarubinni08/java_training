package com.ust.impl;

import com.ust.VehicleAbstractAishu;

public class BikeAbstractAishuImpl extends VehicleAbstractAishu {

    @Override
    public int wheels() {
        return 2;
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public String brand() {
        return "bullet";
    }
}
