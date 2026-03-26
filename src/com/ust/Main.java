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

        CarInterfaceNavyaImpl cr = new CarInterfaceNavyaImpl();
        BusInterfaceNavyaImpl bs = new BusInterfaceNavyaImpl();
        TruckInterfaceNavyaImpl tr = new TruckInterfaceNavyaImpl();
        BikeInterfaceNavyaImpl bk = new BikeInterfaceNavyaImpl();
        System.out.println("truck:" + "\nNumber of seats: " + tr.numbersOfSeats() + "\nNumber of wheels: " + tr.wheels() + "\nBrand: " + tr.brandOfVehicle()+"\nhasac:"+tr.hasAc()+"\nnumber of passesgers:"+tr.noOfPassengers());
        System.out.println("Bus:" + "\nNumber of seats: " + bs.numbersOfSeats() + "\nNumber of wheels: " + bs.wheels() + "\nBrand: " + bs.brandOfVehicle()+"\nhasac:"+bs.hasAc()+"\nnumber of passesgers:"+bs.noOfPassengers());
        System.out.println("car:" + "\nNumber of seats: " + cr.numbersOfSeats() + "\nNumber of wheels: " + cr.wheels() + "\nBrand: " + cr.brandOfVehicle()+"\nhasac:"+cr.hasAc()+"\nnumber of passesgers:"+cr.noOfPassengers());
        System.out.println("Bike:" + "\nNumber of seats: " + bk.numbersOfSeats() + "\nNumber of wheels: " + bk.wheels() + "\nBrand: " + bk.brandOfVehicle());

    }
}

