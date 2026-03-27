package com.ust.impl;

import com.ust.VehicleAbstractAishu;

public class CarAbstractAishuImpl extends VehicleAbstractAishu {

    @Override
    protected int wheels() {
        return 4;
    }

    @Override
    protected String color() {
        return "red";
    }

    @Override
    protected String brand() {
        return "honda";
    }
}
