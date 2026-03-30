package com.ust;

import com.ust.impl.BikeInterfaceGokulImpl;
import com.ust.impl.BusInterfaceGokulImpl;
import com.ust.impl.CarInterfaceGokulImpl;
import com.ust.impl.TruckInterfaceGokulImpl;

public class Gokul {
    public static void main(String[] args) {
        //   Car car = new Car();
        //  Bike bike = new Bike();
        // Bus bus = new Bus();
        // Truck truck = new Truck();
        CarInterfaceGokulImpl ca = new CarInterfaceGokulImpl();
        BikeInterfaceGokulImpl bi = new BikeInterfaceGokulImpl();
        BusInterfaceGokulImpl bu = new BusInterfaceGokulImpl();
        TruckInterfaceGokulImpl tr = new TruckInterfaceGokulImpl();
        System.out.println("Car Wheels:" + ca.numberOfWheels());
        System.out.println("Car Speed:" + ca.maximumSpeed());
        System.out.println("Car seats: " + ca.seatAvailable());
        System.out.println("Car has AC:" + ca.hasAc());
        System.out.println("Car has Doors:" + ca.hasDoors());
        System.out.println("Car is Public Transport:" + ca.isPublicTransport());
        System.out.println("Bike Wheels:" + bi.numberOfWheels());
        System.out.println("Bike Speed:" + bi.maximumSpeed());
        System.out.println("Bike seats: " + bi.seatAvailable());
        System.out.println("Bike has AC:" + bi.hasAc());
        System.out.println("Bike has Doors:" + bi.hasDoors());
        System.out.println("Bike is Public Transport:" + bi.isPublicTransport());
        System.out.println("Bus Wheels:" + bu.numberOfWheels());
        System.out.println("Bus Speed:" + bu.maximumSpeed());
        System.out.println("Bus seats: " + bu.seatAvailable());
        System.out.println("Bus has AC:" + bu.hasAc());
        System.out.println("Bus has Doors:" + bu.hasDoors());
        System.out.println("Bus is Public Transport:" + bu.isPublicTransport());
        System.out.println("Truck Wheels:" + tr.numberOfWheels());
        System.out.println("Truck Speed:" + tr.maximumSpeed());
        System.out.println("Truck seats:" + tr.seatAvailable());
        System.out.println("Truck has AC:" + tr.hasAc());
        System.out.println("Truck has Doors:" + tr.hasDoors());
        System.out.println("Truck is Public Transport:" + tr.isPublicTransport());


        // System.out.println("Car Wheels:" + car.numberOfWheels());
        //  System.out.println("Car Speed:" + car.maximumSpeed());
        //  System.out.println("Car seats: " + car.seatAvailable());
        //  System.out.println("Car has AC:" +car.hasAc());
        // System.out.println("Car has Doors:"+car.hasDoors());
        // System.out.println("Car is Public Transport:"+car.isPublicTransport());
        // System.out.println("Bike Wheels:" + bike.numberOfWheels());
        //  System.out.println("Bike Speed:" + bike.maximumSpeed());
        //   System.out.println("Bike seats: " + bike.seatAvailable());
        //  System.out.println("Bike has AC:" +bike.hasAc());
        //  System.out.println("Bike has Doors:"+bike.hasDoors());
        //  System.out.println("Bike is Public Transport:"+bike.isPublicTransport());
        //System.out.println("Bus Wheels:" + bus.numberOfWheels());
        //System.out.println("Bus Speed:" + bus.maximumSpeed());
        //System.out.println("Bus seats: " + bus.seatAvailable());
        // System.out.println("Bus has AC:" +bus.hasAc());
        // System.out.println("Bus has Doors:"+bus.hasDoors());
        //System.out.println("Bus is Public Transport:"+bus.isPublicTransport());
        //System.out.println("Truck Wheels:" + truck.numberOfWheels());
        //System.out.println("Truck Speed:" + truck.maximumSpeed());
        //System.out.println("Truck seats: " + truck.seatAvailable());
        //System.out.println("Truck has AC:" +truck.hasAc());
        //System.out.println("Truck has Doors:"+truck.hasDoors());
        //System.out.println("Truck is Public Transport:"+truck.isPublicTransport());


    }
}




