package com.ust;

public class Main {
    public static void main(String[] args) {
        CarNavya c = new CarNavya();
        BikeNavya b = new BikeNavya();
        BusNavya bn = new BusNavya();
        TruckNavya t = new TruckNavya();

        System.out.println("Bike:" + "\nNumber of seats: " + b.numbersOfSeats() + "\nNumber of wheels: " + b.wheels() + "\nBrand: " + b.brandOfVehicle() + "\nHASAC: " + b.hasAc() + "\nnumber of doors: " + b.numberOfDoors());

        System.out.println("Bus:" + "\nNumber of seats: " + bn.numbersOfSeats() + "\nNumber of wheels: " + bn.wheels() + "\nBrand: " + bn.brandOfVehicle()+"\nhas ac:" + bn.hasAc()+ "\nnumnber of doors:"+bn.numberOfDoors());

        System.out.println("car:" + "\nNumber of seats: " + c.numbersOfSeats() + "\nNumber of wheels: " + c.wheels() + "\nBrand: " + c.brandOfVehicle() + "\nhas ac:" + c.hasAc()+ "\nnumnber of doors:"+c.numberOfDoors());

        System.out.println("truck:" + "\nNumber of seats: " + t.numbersOfSeats() + "\nNumber of wheels: " + t.wheels() + "\nBrand: " + t.brandOfVehicle()+"\nHASAC: " + t.hasAc() + "\nnumber of doors: " + t.numberOfDoors());

    }
}
