package com.ust;

public class BusNavaneeth extends HeavyVechilesNavaneeth {

    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public String brand() {
        return "Tata";
    }

    @Override
    public int engineCapacity() {
        return 2500;
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
