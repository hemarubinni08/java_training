package com.ust;

public class TruckNavaneeth extends HeavyVechilesNavaneeth{

    @Override
    public int numberOfWheels() {
        return 6;
    }

    @Override
    public String brand() {
        return "Ashok";
    }

    @Override
    public int engineCapacity() {
        return 3000;
    }
    @Override
    public boolean hasAc(){
        return false;
    }
    @Override
    public boolean hasPublicTransport(){
        return false;
    }
    @Override
    public int doors() {
        return 2;
    }
}
