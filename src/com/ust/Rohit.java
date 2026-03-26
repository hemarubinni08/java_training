package com.ust;

class Rohit {
    public static void main(String[] args) {
        BikeRohit B = new BikeRohit();
        System.out.println("This bike is a " + B.brand() + " with a top speed of " + B.speed() + "\nDoes it have doors: " + B.doors() + "\nDoes it have AC: " + B.hasAc() + "\nNo of people that can be seated:" + B.noOfSeats());

        CarRohit C = new CarRohit();
        System.out.println("A " + C.brand() + " car has " + C.noOfWheels() + " wheels" + "" + "\nDoes it have doors: " + C.doors() + "" + "\nDoes it have AC: " + C.hasAc() + "\nNo of people that can be seated:" + C.noOfSeats());
        System.out.println("Color of car is " + C.color());

        TruckRohit T = new TruckRohit();
        System.out.println("Truck has " + T.noOfWheels() + " wheels.");
        System.out.println("Color of truck is " + T.color());
        System.out.println("Truck is a " + T.heavy() + " which is " + T.color() + " in color" + "" + "\nDoes it have doors: " + T.doors() + "" + "\nDoes it have AC: " + T.hasAc() + "\nNo of people that can be seated:" + T.noOfSeats());
    }
}
