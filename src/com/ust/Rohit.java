package com.ust;

import com.ust.impl.HeavyVehicleInterfaceImpl;
import com.ust.impl.RohitBikeImpl;
import com.ust.impl.RohitCarImpl;
import com.ust.impl.RohitTruckImpl;

class Rohit {
    public static void main(String[] args) {
        VehicleInterfaceRohit B = new RohitBikeImpl();
        System.out.println("This bike is a " + B.brand() + " with a top speed of " + B.speed() + "\nDoes it have doors: " + B.doors() + "\nDoes it have AC: " + B.hasAc() + "\nNo of seats: " + B.noOfSeats());

        VehicleInterfaceRohit C = new RohitCarImpl();
        System.out.println("A " + C.brand() + " car has " + C.noOfWheels() + " wheels \nDoes it have doors: " + C.doors() + "\nDoes it have AC: " + C.hasAc() + "\nNo of seats: " + C.noOfSeats());
        System.out.println("Color of car is " + C.color());

        HeavyVehicleInterfaceRohit T = new RohitTruckImpl();
        System.out.println(" can truck carry heavy load? " + T.carryHeavy());
        System.out.println("To drive truck do we need heavy licence? " + T.needHeavyLicense());

        VehicleAbstractRohit Train = new TrainAbstractRohit();
        System.out.println("Train");
        System.out.println("Fast: "+Train.fast()+"\nMileage: "+Train.mileage()+"\nSpeed: "+Train.speed());
    }
}
