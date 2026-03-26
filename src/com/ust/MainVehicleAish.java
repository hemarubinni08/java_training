package com.ust;

public class MainVehicleAish {
    public static void main(String[] args) {
        Vehicle vehicl = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();
        Bus bu = new Bus();
        System.out.println(vehicl.color());
        System.out.println(vehicl.brand());
        System.out.println(vehicl.wheels());
        System.out.println(c.fetchDoors());
        System.out.println(bu.fetchDoors());
    }
}
