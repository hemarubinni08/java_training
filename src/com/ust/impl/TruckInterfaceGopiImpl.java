package com.ust.impl;

import com.ust.vehicleInterfaceGopi;

public class TruckInterfaceGopiImpl implements vehicleInterfaceGopi {
    void price() {
        System.out.println(10000);
    }

    void name() {
        System.out.println("honda");
    }

    void mileage() {
        System.out.println(67);
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
