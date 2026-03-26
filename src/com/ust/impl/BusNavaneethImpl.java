package com.ust.impl;

import com.ust.HeavyVechicleNavaneeth;
import com.ust.VechicleInterfaceNavaneeth;

public class BusNavaneethImpl implements VechicleInterfaceNavaneeth, HeavyVechicleNavaneeth {
    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public String brand() {
        return "RTC";
    }

    @Override
    public int engineCapacity() {
        return 2000;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean hasPublicTransport() {
        return true;
    }

    @Override
    public int doors() {
        return 3;
    }
}
