package com.ust;

import com.ust.impl.HeavyVehicleInterfaceYeshImpl;
import com.ust.impl.VehicleBusYeshImpl;
import com.ust.impl.VehicleCarYeshImpl;
import com.ust.impl.VehicleInterfaceYeshImpl;

import java.util.*;

public class MainYesh {
    public static void main(String[] args) {
        /*VehicleYesh vehicleObject = new VehicleYesh();
        HeavyVehiclesYesh fourWheelerObject = new FourWheelerYesh();
        System.out.println(fourWheelerObject.colorOfVehicle());
        System.out.println(vehicleObject.colorOfVehicle());
        SixWheelerYesh sixWheelObject = new SixWheelerYesh();
        System.out.println(sixWheelObject.numberOfWheels());*/
        //FourWheelerYesh fourWheelObject=new FourWheelerYesh();
        //System.out.println(fourWheelObject.noOfDoors());
        //System.out.println(fourWheelerObject.noOfDoors());
        VehicleInterfaceYesh interfaceObj=new VehicleInterfaceYeshImpl();
        HeavyVehicleInterfaceYeshImpl heavyVehicleInterfaceYeshObj=new HeavyVehicleInterfaceYeshImpl();
        System.out.println(interfaceObj.numberOfwheels());
        System.out.println(interfaceObj.colorOfVehicle());
        System.out.println(heavyVehicleInterfaceYeshObj.maxSpeedOfVehicle());
        VehicleBusYeshImpl busObject=new VehicleBusYeshImpl();
        System.out.println(busObject.noOfSeats());
        VehicleCarYeshImpl carObject=new VehicleCarYeshImpl();
        System.out.println(carObject.itHasAc());
    }


}
