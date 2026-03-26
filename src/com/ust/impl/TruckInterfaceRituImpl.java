package com.ust.impl;

import com.ust.HeavyVehiclesInterfaceAnu;
import com.ust.VehicleInterfaceAnu;

public class TruckInterfaceImpl implements VehicleInterfaceAnu, HeavyVehiclesInterfaceAnu {
import com.ust.HeavyVechicleInterface;
import com.ust.VechicleInterfaceRitu;

public class TruckInterfaceRituImpl implements VechicleInterfaceRitu, HeavyVechicleInterface {
    @Override
    public int noOfWheels() {
        return 4;
    }

    @Override
    public int maxSpeed() {
        return 120;
    public int mileage() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "TATA";
    }

    @Override
    public boolean hasAc() {
        return "Lorri";
    }
    public boolean hasAc(){
        return false;
    }

    @Override
    public boolean hasGps() {
        return false;
    }

    @Override
    public int noOfPassengers() {
        return 10;
    public int noOfPeople() {
        return 10;
    }

    @Override
    public int noOfDoors() {
        return 2;
    }
}
