package com.ust;

import com.ust.impl.BikeInterfaceArdraImpl;
import com.ust.impl.HeavyVehiclesInterfaceArdraImpl;

public class VehicleInterfaceArdraMain {
    public static void main(String[] args) {
        VehicleInterfaceArdra bikeObject1 = new BikeInterfaceArdraImpl();
        System.out.println(bikeObject1.maximumPassengers());
        BikeInterfaceArdraImpl bikeObject2 = new BikeInterfaceArdraImpl();
        System.out.println(bikeObject2.maximumPassengers());
    }
}
