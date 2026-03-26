package com.ust;

import com.ust.impl.BikeCjImpl;
import com.ust.impl.BusCJImpl;
import com.ust.impl.TruckCJImpl;

public abstract class MainChris {
    public static void main(String[] args) {
        BusAbstractCJImpl bus = new BusAbstractCJImpl();
        TruckAbstractCJImpl truck = new TruckAbstractCJImpl();

        System.out.println("Truck Information");
//        System.out.println("The Brand is " + truck.getBrand());
        System.out.println("The Insurance Period is " + truck.insurancePeriod() + " Years");
//        System.out.println("NUmber of Doors: " + truck.numberOfDoors(truck.door));
        System.out.println("Number of Gears: " + truck.numberOfGears());
        System.out.println("Number of Wheels: " + truck.numberOfWheels());
        System.out.println("Engine Power: " + truck.engineCc() + " cc");
//        System.out.println("Air Conditioning: " + truck.haveAc(truck.ac));
        System.out.println("\n");


        System.out.println("Bus Information");
//        System.out.println("The Brand is " + bike.getBrand());
        System.out.println("The Insurance Period is " + bus.insurancePeriod() + " Years");
        System.out.println("Number of Gears: " + bus.numberOfGears());
        System.out.println("Number of Wheels: " + bus.numberOfWheels());
        System.out.println("Engine Power: " + bus.engineCc() + " cc");
    }

}
