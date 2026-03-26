package com.ust;

public class HeavyVehicleHemanth extends VehicleHemanth{
    public static boolean hasAc (){
        return true;
    }
    public static boolean canAutoDrive(){
        return true;
    }
    public String typeOfVehicle(){
        return "Heavy Vehicle";
    }
    public int noOfDoors(){
        return 2;
    }
}
