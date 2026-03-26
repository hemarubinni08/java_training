package com.ust;

class Rohit {
    public static void main(String[] args) {
        BikeRohit B = new BikeRohit();
        System.out.println("This bike is a " + B.Brand() + " with a top speed of " + B.Speed() + "\nDoes it have doors: " + B.Doors() + "\nDoes it have AC: " + B.hasAc() + "\nNo of people that can be seated:" + B.noOfSeats());

        CarRohit C = new CarRohit();
        System.out.println("A " + C.Brand() + " car has " + C.noOfWheels() + " wheels" + "" + "\nDoes it have doors: " + C.Doors() + "" + "\nDoes it have AC: " + C.hasAc() + "\nNo of people that can be seated:" + C.noOfSeats());
        System.out.println("Color of car is " + C.Color());

        TruckRohit T = new TruckRohit();
        System.out.println("Truck has " + T.noOfWheels() + " wheels.");
        System.out.println("Color of truck is " + T.Color());
        System.out.println("Truck is a " + T.Heavy() + " which is " + T.Color() + " in color" + "" + "\nDoes it have doors: " + T.Doors() + "" + "\nDoes it have AC: " + T.hasAc() + "\nNo of people that can be seated:" + T.noOfSeats());
    }
}
