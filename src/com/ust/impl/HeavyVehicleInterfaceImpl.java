package com.ust.impl;

import com.ust.HeavyVehicleInterfaceRohit;

public class HeavyVehicleInterfaceImpl implements HeavyVehicleInterfaceRohit {
    public Boolean carryHeavy() {
        return true;
    }

    public String needHeavyLicense() {
        return "Yes";
    }
}
