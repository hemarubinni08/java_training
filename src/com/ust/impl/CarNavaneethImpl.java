package com.ust.impl;

import com.ust.HeavyVechicleNavaneeth;
import com.ust.VechicleInterfaceNavaneeth;

public class CarNavaneethImpl implements VechicleInterfaceNavaneeth, HeavyVechicleNavaneeth {
    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String brand() {
        return "Audi";
    }

    @Override
    public int engineCapacity() {
        return 1000;
    }

    @Override
    public boolean hasAc() {
        return true;
    }

    @Override
    public boolean hasPublicTransport() {
        return false;
    }

    @Override
    public int doors() {
        return 4;
    }
}
