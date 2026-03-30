package com.ust.impl;

import com.ust.HeavyVehicleLogesh;
import com.ust.VehicleAbstractLogesh;

public class LorryAbstractLogesh extends HeavyVehicleLogesh {
    public Integer getGuranteeYears() {
        return 10;
    }

    public Integer getNumberOfWheels() {
        return 6;
    }

    public String getModel() {
        return "Eicher";
    }

    public boolean getAc() {
        return false;
    }

    public boolean getLoadBed() {
        return true;
    }

    public int getNumberOfSeat() {
        return 2;
    }

    public String getFuel() {
        return "Diesel";
    }

    public Integer getPrice() {
        return 200000;
    }
}
