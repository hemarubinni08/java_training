package com.ust;

import com.ust.impl.BikeInterfaceNavyaImpl;
import com.ust.impl.BusInterfaceNavyaImpl;
import com.ust.impl.CarInterfaceNavyaImpl;
import com.ust.impl.TruckInterfaceNavyaImpl;

public class Main {
    public static void main(String[] args) {
        //CarNavya c = new CarNavya();
        // BikeNavya b = new BikeNavya();
        //BusNavya bn = new BusNavya();
        //TruckNavya t = new TruckNavya();

        // System.out.println("Bike:" + "\nNumber of seats: " + b.numbersOfSeats() + "\nNumber of wheels: " + b.wheels() + "\nBrand: " + b.brandOfVehicle() + "\nHASAC: " + b.hasAc() + "\nnumber of doors: " + b.numberOfDoors());

        //System.out.println("Bus:" + "\nNumber of seats: " + bn.numbersOfSeats() + "\nNumber of wheels: " + bn.wheels() + "\nBrand: " + bn.brandOfVehicle() + "\nhas ac:" + bn.hasAc() + "\nnumnber of doors:" + bn.numberOfDoors());

        //System.out.println("car:" + "\nNumber of seats: " + c.numbersOfSeats() + "\nNumber of wheels: " + c.wheels() + "\nBrand: " + c.brandOfVehicle() + "\nhas ac:" + c.hasAc() + "\nnumnber of doors:" + c.numberOfDoors());

        //System.out.println("truck:" + "\nNumber of seats: " + t.numbersOfSeats() + "\nNumber of wheels: " + t.wheels() + "\nBrand: " + t.brandOfVehicle() + "\nHASAC: " + t.hasAc() + "\nnumber of doors: " + t.numberOfDoors());

        //CarInterfaceNavyaImpl carImpl = new CarInterfaceNavyaImpl();
        //BusInterfaceNavyaImpl busImpl = new BusInterfaceNavyaImpl();
        //TruckInterfaceNavyaImpl truckImpl = new TruckInterfaceNavyaImpl();
        //BikeInterfaceNavyaImpl bikeImpl = new BikeInterfaceNavyaImpl();
        //System.out.println("truck:" + "\nNumber of seats: " + truckImpl.numbersOfSeats() + "\nNumber of wheels: " + truckImpl.wheels() + "\nBrand: " + truckImpl.brandOfVehicle() + "\nhasac:" + truckImpl.hasAc() + "\nnumber of passesgers:" + truckImpl.noOfPassengers());
        //System.out.println("Bus:" + "\nNumber of seats: " + busImpl.numbersOfSeats() + "\nNumber of wheels: " + busImpl.wheels() + "\nBrand: " + busImpl.brandOfVehicle() + "\nhasac:" + busImpl.hasAc() + "\nnumber of passesgers:" + busImpl.noOfPassengers());
        //System.out.println("car:" + "\nNumber of seats: " + carImpl.numbersOfSeats() + "\nNumber of wheels: " + carImpl.wheels() + "\nBrand: " + carImpl.brandOfVehicle() + "\nhasac:" + carImpl.hasAc() + "\nnumber of passesgers:" + carImpl.noOfPassengers());
        //System.out.println("Bike:" + "\nNumber of seats: " + bikeImpl.numbersOfSeats() + "\nNumber of wheels: " + bikeImpl.wheels() + "\nBrand: " + bikeImpl.brandOfVehicle());

        BusAbstractNavyaImpl busab = new BusAbstractNavyaImpl();
        BikeInterfaceNavyaImpl bikeInterfaceNavya = new BikeInterfaceNavyaImpl();
        System.out.println("bus:" + "\nNumber of seats: " + busab.numbersOfSeats() + "\nNumber of wheels: " + busab.wheels() + "\nBrand: " + busab.brandOfVehicle() + "\nhasac:" + busab.hasAc());
        System.out.println("bike:" + "\nNumber of seats: " + bikeInterfaceNavya.numbersOfSeats() + "\nNumber of wheels: " + bikeInterfaceNavya.wheels() + "\nBrand: " + bikeInterfaceNavya.brandOfVehicle());
    }

}

