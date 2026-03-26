package com.ust.impl;

import com.ust.VehicleInterfaceMamtha;

public class TruckInterfaceMamthaImpl implements VehicleInterfaceMamtha {
    @Override
    public int numberOfWheels() {
        return 8;
    }

    @Override
    public String getColor() {
        return "Brown";
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
        return "Eicher";
    }

    @Override
    public int numberOfSeats() {
        return 2;
    }


}
