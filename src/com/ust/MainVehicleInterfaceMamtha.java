package com.ust;

import com.ust.impl.BikeInterfaceMamthaImpl;
import com.ust.impl.BusInterfaceMamthaImpl;
import com.ust.impl.CarInterfaceMamthaImpl;
import com.ust.impl.TruckInterfaceMamthaImpl;

public class MainVehicleInterfaceMamtha {
    public static void main(String[] args){
        CarInterfaceMamthaImpl car=new CarInterfaceMamthaImpl();
        BusInterfaceMamthaImpl bus=new BusInterfaceMamthaImpl();
        TruckInterfaceMamthaImpl Truck=new TruckInterfaceMamthaImpl();
        BikeInterfaceMamthaImpl Bike=new BikeInterfaceMamthaImpl();

        System.out.println(car.numberOfWheels());
        System.out.println(car.getColor());
        System.out.println(car.getFuelType());
        System.out.println();
        System.out.println(bus.numberOfWheels());
        System.out.println(bus.getColor());
        System.out.println(bus.getFuelType());
        System.out.println();
        System.out.println(Truck.numberOfWheels());
        System.out.println(Truck.getColor());
        System.out.println(Truck.getFuelType());
        System.out.println();
        System.out.println(Bike.numberOfWheels());
        System.out.println(Bike.getColor());
        System.out.println(Bike.getFuelType());
        System.out.println();
    }
}
