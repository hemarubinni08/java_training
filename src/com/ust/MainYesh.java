package com.ust;

import java.util.*;

public class MainYesh {
    public static void main(String[] args) {
        VehicleYesh vehicleObject = new VehicleYesh();
        HeavyVehiclesYesh fourWheelerObject = new FourWheelerYesh();
        System.out.println(fourWheelerObject.colorOfVehicle());
        System.out.println(vehicleObject.colorOfVehicle());
        SixWheelerYesh sixWheelObject = new SixWheelerYesh();
        System.out.println(sixWheelObject.numberOfWheels());
        //FourWheelerYesh fourWheelObject=new FourWheelerYesh();
        //System.out.println(fourWheelObject.noOfDoors());
        System.out.println(fourWheelerObject.noOfDoors());
    }


}
