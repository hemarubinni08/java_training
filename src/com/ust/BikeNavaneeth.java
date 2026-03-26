package com.ust;

public class BikeNavaneeth extends VechicleNavaneeth {

    @Override
    public int numberOfWheels() {
        return 2;
    }

    @Override
    public String brand() {
        return "Honda";
    }

    @Override
    public int engineCapacity() {
        return 500;
    }

    public int stand(){
        return 1;
    }

}
