package com.ust;

public class Deepak {
    public static void main(String[] args) {
        BikeDeepak bike = new BikeDeepak();
        CarDeepak car = new CarDeepak();
        TruckDeepak truck = new TruckDeepak();
        BusDeepak bus = new BusDeepak();
        System.out.println("Bike\n" + "Name of the brand: " + bike.brand() + "\nNo of wheels: " + bike.wheels() + "\nNo of seats: " + bike.noofseats() + "\nHas AC: " + bike.hasAc() + "\nNo of Doors: " + bike.noOfDoors() + "\n");
        System.out.println("Car\n" + "Name of the brand: " + car.brand() + "\nNo of wheels: " + car.wheels() + "\nNo of seats: " + car.noofseats() + "\nHas AC: " + car.hasAc() + "\nNo of Doors: " + car.noOfDoors() + "\n");
        System.out.println("Truck\n" + "Name of the brand: " + truck.brand() + "\nNo of wheels: " + truck.wheels() + "\nNo of seats: " + truck.noofseats() + "\nHas AC:" + truck.hasAc() + "\nNo of Doors: " + truck.noOfDoors() + "\n");
        System.out.println("Bus\n" + "Name of the brand: " + bus.brand() + "\nNo of wheels: " + bus.wheels() + "\nNo of seats: " + bus.noofseats() + "\nHas AC:" + bus.hasAc() + "\nNo of Doors: " + bus.noOfDoors() + "\n");

    }
}