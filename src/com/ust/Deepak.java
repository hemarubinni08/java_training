package com.ust;

import com.ust.impl.BikeInterfaceDeepakImpl;
import com.ust.impl.BusInterfaceDeepakImpl;
import com.ust.impl.CarInterfaceDeepakImpl;
import com.ust.impl.TruckInterfaceDeepakImpl;

public class Deepak {
    public static void main(String[] args) {
//        BikeDeepak bike = new BikeDeepak();
//        CarDeepak car = new CarDeepak();
//        TruckDeepak truck = new TruckDeepak();
//        BusDeepak bus = new BusDeepak();
//        System.out.println("Bike\n" + "Name of the brand: " + bike.brand() + "\nNo of wheels: " + bike.wheels() + "\nNo of seats: " + bike.noofseats() + "\nHas AC: " + bike.hasAc() + "\nNo of Doors: " + bike.noOfDoors() + "\n");
//        System.out.println("Car\n" + "Name of the brand: " + car.brand() + "\nNo of wheels: " + car.wheels() + "\nNo of seats: " + car.noofseats() + "\nHas AC: " + car.hasAc() + "\nNo of Doors: " + car.noOfDoors() + "\n");
//        System.out.println("Truck\n" + "Name of the brand: " + truck.brand() + "\nNo of wheels: " + truck.wheels() + "\nNo of seats: " + truck.noofseats() + "\nHas AC:" + truck.hasAc() + "\nNo of Doors: " + truck.noOfDoors() + "\n");
//        System.out.println("Bus\n" + "Name of the brand: " + bus.brand() + "\nNo of wheels: " + bus.wheels() + "\nNo of seats: " + bus.noofseats() + "\nHas AC:" + bus.hasAc() + "\nNo of Doors: " + bus.noOfDoors() + "\n");
//        CarInterfaceDeepakImpl carImpl=new CarInterfaceDeepakImpl();
//        BikeInterfaceDeepakImpl bikeImpl=new BikeInterfaceDeepakImpl();
//        TruckInterfaceDeepakImpl truckImpl=new TruckInterfaceDeepakImpl();
//        BusInterfaceDeepakImpl busImpl=new BusInterfaceDeepakImpl();
//
//        System.out.println("Bike\n" + "Name of the brand: " + bikeImpl.brand() + "\nNo of wheels: " + bikeImpl.wheels() + "\nNo of seats: " + bikeImpl.noofseats()+"\n");
//        System.out.println("Car\n" + "Name of the brand: " + carImpl.brand() + "\nNo of wheels: " + carImpl.wheels() + "\nNo of seats: " + carImpl.noofseats() + "\nHas AC: " + carImpl.hasAc() + "\nNo of Doors: " + carImpl.noOfDoors() + "\n");
//        System.out.println("Truck\n" + "Name of the brand: " + truckImpl.brand() + "\nNo of wheels: " + truckImpl.wheels() + "\nNo of seats: " + truckImpl.noofseats() + "\nHas AC:" + truckImpl.hasAc() + "\nNo of Doors: " + truckImpl.noOfDoors() + "\n");
//        System.out.println("Bus\n" + "Name of the brand: " + busImpl.brand() + "\nNo of wheels: " + busImpl.wheels() + "\nNo of seats: " + busImpl.noofseats() + "\nHas AC:" + busImpl.hasAc() + "\nNo of Doors: " + busImpl.noOfDoors() + "\n");

        CarAbstractDeepak carabs=new CarAbstractDeepak();
        BikeAbstractDeepak bikeabs=new BikeAbstractDeepak();
        TruckAbstractDeepak truckabs=new TruckAbstractDeepak();
        BusAbstractDeepak busabs=new BusAbstractDeepak();

        System.out.println("Bike\n" + "Name of the brand: " + bikeabs.brand() + "\nNo of wheels: " + bikeabs.wheels() + "\nNo of seats: " + bikeabs.noofseats()+"\n");
        System.out.println("Car\n" + "Name of the brand: " + carabs.brand() + "\nNo of wheels: " + carabs.wheels() + "\nNo of seats: " + carabs.noofseats() + "\nHas AC: " + carabs.hasAc() + "\nNo of Doors: " + carabs.noOfDoors() + "\n");
        System.out.println("Truck\n" + "Name of the brand: " + truckabs.brand() + "\nNo of wheels: " + truckabs.wheels() + "\nNo of seats: " + truckabs.noofseats() + "\nHas AC:" + truckabs.hasAc() + "\nNo of Doors: " + truckabs.noOfDoors() + "\n");
        System.out.println("Bus\n" + "Name of the brand: " + busabs.brand() + "\nNo of wheels: " + busabs.wheels() + "\nNo of seats: " + busabs.noofseats() + "\nHas AC:" + busabs.hasAc() + "\nNo of Doors: " + busabs.noOfDoors() + "\n");
    }
}