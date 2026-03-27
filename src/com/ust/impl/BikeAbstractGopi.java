package com.ust.impl;

import com.ust.VehicleAbstractGopi;

public abstract class BikeAbstractGopi extends VehicleAbstractGopi {
    public int wheelsCount(){
        return 2;

    }
    public boolean gears(){
        return false;
    }
    public String tyreName(){
        return "TVS";
    }
}
