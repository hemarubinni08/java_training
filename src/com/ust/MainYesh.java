package com.ust;

import java.util.*;

public class MainYesh {
    public static void main(String[] args) {
        VehicleYesh vehicleObject=new VehicleYesh();
        VehicleYesh fourWheelerObject=new FourWheelerYesh();
        System.out.println(fourWheelerObject.colorOfVehicle());
        System.out.println(vehicleObject.colorOfVehicle());
    }


}
