package com.ust.impl;

import com.ust.VehicleInterfaceMamtha;

public class BikeInterfaceMamthaImpl implements VehicleInterfaceMamtha {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    public boolean isPublicTransport() {
        return false;
    }

    @Override
    public String getBrand() {
        return "KTM";
    }

    @Override
    public int numberOfSeats() {
        return 1;
    }
}
