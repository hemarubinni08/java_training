package com.ust;

public class CarNavaneeth extends HeavyVechilesNavaneeth{

    @Override
    public int numberOfWheels() {
        return 4;
    }

    @Override
    public String brand() {
        return "Tata";
    }

    @Override
    public int engineCapacity() {
        return 2000;
    }
    @Override
    public boolean hasAc(){
        return true;
    }
    @Override
    public boolean hasPublicTransport(){
        return false;
    }
    @Override
    public int doors() {
        return 4;
    }
}
