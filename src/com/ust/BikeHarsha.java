package com.ust;

public class BikeHarsha extends VehicleHarsha{
    public int numberOfWheels(){
        return 2;
    }
    public int engineCapacity(){
        return 200;
    }
    public String fuelType(){
        return "petrol";
    }
    public boolean canDoWheelie(){
        return true;
    }
}
