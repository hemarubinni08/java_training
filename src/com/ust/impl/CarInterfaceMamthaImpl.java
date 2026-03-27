package com.ust.impl;

import com.ust.VehicleInterfaceMamtha;

public class CarInterfaceMamthaImpl implements VehicleInterfaceMamtha {

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getFuelType() {
        return "Desile";
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Tata";
    }

    @Override
    public int numberOfSeats() {
        return 4;
    }
}
