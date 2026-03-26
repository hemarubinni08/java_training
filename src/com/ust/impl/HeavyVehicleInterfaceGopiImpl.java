package com.ust.impl;

import com.ust.vehicleInterfaceGopi;

public class HeavyVehicleInterfaceGopiImpl implements vehicleInterfaceGopi {
    public Boolean gears() {
        return true;
    }

    public int price() {
        return 5000000;
    }

    @Override
    public int WheelsCount() {
        return 0;
    }

    @Override
    public String SeatColour() {
        return "";
    }

    @Override
    public int Price() {
        return 0;
    }

    @Override
    public String TyreName() {
        return "";
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
