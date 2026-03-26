package com.ust;

import com.ust.impl.BikeInterfaceMamthaImpl;
import com.ust.impl.BusInterfaceMamthaImpl;
import com.ust.impl.CarInterfaceMamthaImpl;
import com.ust.impl.TruckInterfaceMamthaImpl;

public class MainVehicleInterfaceMamtha {
    public static void main(String[] args){
        CarInterfaceMamthaImpl car=new CarInterfaceMamthaImpl();
        BusInterfaceMamthaImpl bus=new BusInterfaceMamthaImpl();
        TruckInterfaceMamthaImpl truck=new TruckInterfaceMamthaImpl();
        BikeInterfaceMamthaImpl bike=new BikeInterfaceMamthaImpl();

        System.out.println(car.numberOfWheels());
        System.out.println(car.getColor());
        System.out.println(car.getFuelType());
        System.out.println();
        System.out.println(bus.numberOfWheels());
        System.out.println(bus.getColor());
        System.out.println(bus.getFuelType());
        System.out.println();
        System.out.println(truck.numberOfWheels());
        System.out.println(truck.getColor());
        System.out.println(truck.getFuelType());
        System.out.println();
        System.out.println(bike.numberOfWheels());
        System.out.println(bike.getColor());
        System.out.println(bike.getFuelType());
        System.out.println();
    }
}
