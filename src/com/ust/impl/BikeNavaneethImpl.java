package com.ust.impl;

import com.ust.HeavyVechicleNavaneeth;
import com.ust.VechicleInterfaceNavaneeth;

public class BikeNavaneethImpl implements VechicleInterfaceNavaneeth, HeavyVechicleNavaneeth {
    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String brand() {
        return "Honda";
    }

    @Override
    public int engineCapacity() {
        return 200;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean hasPublicTransport() {
        return false;
    }

    @Override
    public int doors() {
        return 0;
    }
}
