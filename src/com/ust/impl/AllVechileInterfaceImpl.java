package com.ust.impl;

import com.ust.HeavyVechileInterfaceHarsh;

public class AllVechileInterfaceImpl implements HeavyVechileInterfaceHarsh {
    @Override
    public int numberOfDoor() {
        return 2;
    }

    @Override
    public boolean hasAc() {
        return false;
    }

    @Override
    public boolean speedMoreThan120() {
        return false;
    }
}
