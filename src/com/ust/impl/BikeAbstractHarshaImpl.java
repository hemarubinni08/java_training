package com.ust.impl;

import com.ust.VehicalAbstractHarsha;

public class BikeAbstractHarshaImpl extends VehicalAbstractHarsha {

    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public int engineCapacity() {
        return 200;
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }

    public boolean canDoWheelie(){
        return true;
    }
}
