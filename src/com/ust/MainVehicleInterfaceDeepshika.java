package com.ust;

import com.ust.impl.BikeInterfaceDeepshika;
import com.ust.impl.BusInterfaceDeepshika;
import com.ust.impl.CarInterfaceDeepshika;
import com.ust.impl.TruckInterfaceDeepshika;

public class MainVehicleInterfaceDeepshika {
    public static void main(String[] args) {
        BikeInterfaceDeepshika bike = new BikeInterfaceDeepshika();
        TruckInterfaceDeepshika truck = new TruckInterfaceDeepshika();
        BusInterfaceDeepshika bus = new BusInterfaceDeepshika();
        CarInterfaceDeepshika car = new CarInterfaceDeepshika();
        System.out.println(car.noOfWheels());
        System.out.println(car.color());
        System.out.println();
        System.out.println(bike.noOfWheels());
        System.out.println(bike.color());
        System.out.println();
        System.out.println(truck.noOfWheels());
        System.out.println(truck.color());
        System.out.println();
        System.out.println(bus.noOfWheels());
        System.out.println(bus.color());
        System.out.println();
    }
}
