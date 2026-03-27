package com.ust;

public abstract class VehicleAbstractAishu {
    protected abstract int wheels();
    protected abstract String color();
    protected abstract String brand();
    public boolean hasEngine(){
        return true;
    }
    public boolean hasGears(){
        return true;
    }
}
