package com.ust.impl;

import com.ust.vehicleInterfaceGopi;

public class BikeInterfaceGopiImpl implements vehicleInterfaceGopi {
    public int WheelsCount() {
        return 2;
    }

    @Override
    public String SeatColour() {
        return "Black";
    }

    @Override
    public int Price() {
        return 0;
    }

    public Boolean gears() {
        return false;
    }

    public String TyreName() {
        return "TVS";
    }

    @Override
    public int Mileage() {
        return 0;
    }

    @Override
    public boolean Gears() {
        return false;
    }
}
