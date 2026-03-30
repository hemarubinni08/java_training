package com.ust.impl;

import com.ust.HeavyVehicleInterfaceRohit;
import com.ust.VehicleInterfaceRohit;

public class HeavyVehicleInterfaceImpl implements HeavyVehicleInterfaceRohit {
    public Boolean carryHeavy() {
        return true;
    }

    public String needHeavyLicense() {
        return "Yes";
    }

    }
