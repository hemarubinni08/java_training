package com.ust.impl;

import com.ust.vehicleInterfaceHema;

public class BikeHemaImpl implements vehicleInterfaceHema {

    @Override
    public String getBrand() {
        return " ";
    }

    public int getWheelsCount() {
        return 2;
    }

    public String getFuelType() {
        return "Petrol";
    }

    public int doorsCount() {
        return 0;
    }

}
