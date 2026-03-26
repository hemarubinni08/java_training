package com.ust;

import com.ust.impl.*;

public class MainChandu {
    public static void main(String[] args) {

        BikeAbstractChandu bc = new BikeAbstractChandu();
        CarAbstractChandu cc = new CarAbstractChandu();
        TruckAbstractChandu tc = new TruckAbstractChandu();
        BusAbstractChandu bbc = new BusAbstractChandu();


        System.out.println("Bike: " + bc.fuel() + ", " + bc.engine() + "cc, " + bc.wheels() + " wheels, " + bc.passenger() + " Passengers");
        System.out.println("Truck: " + tc.fuel() + ", " + tc.engine() + "cc, " + tc.wheels() + " wheels, " + tc.passenger() + " Passengers, truck has AC: " + tc.hasAc() + ", truck has sunroof: " + tc.hasSunroof() + ", truck has driver cabin: " + tc.hasDriverCabin());
        System.out.println("Car: " + cc.fuel() + ", " + cc.engine() + "cc, " + cc.wheels() + " wheels, " + cc.passenger() + " Passengers");
        System.out.println("Bus: " + bbc.fuel() + ", " + bbc.engine() + "cc, " + bbc.wheels() + " wheels, " + bbc.passenger() + " Passengers, bus has AC: " + bbc.hasAc() + ", bus has sunroof: " + bbc.hasSunroof() + ", bus has driver cabin: " + bbc.hasDriverCabin());
    }

}
