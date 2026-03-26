package com.ust;

import com.ust.impl.AutoDeepaImpl;
import com.ust.impl.BikeDeepaImpl;
import com.ust.impl.CarDeepaImpl;
import com.ust.impl.TruckDeepaImpl;

public class MainD {
    public static void main(String args[]) {
        CarDeepaImpl cd = new CarDeepaImpl();
        BikeDeepaImpl bd = new BikeDeepaImpl();
        AutoDeepaImpl ad = new AutoDeepaImpl();
        TruckDeepaImpl td = new TruckDeepaImpl();
        System.out.println("Car wheels: " + cd.numberOfWheels() + ", " +
                "Car Colour: " + cd.vehicleColour() + ", " +
                "Car Brand: " + cd.vehicleBrand() + ", " + "Car doors: " + cd.numberOfDoors() + ", " + "Have AC: " + cd.hasAc() + ", " + "Public Transport: " + cd.isPublicTransport() + ", " + "Have Sunroof: " + cd.hasSunroof());

        System.out.println("Bike wheels: " + bd.numberOfWheels() + ", " +
                "Bike Colour: " + bd.vehicleColour() + ", " +
                "Bike Brand: " + bd.vehicleBrand());

        System.out.println("Auto wheels: " + ad.numberOfWheels() + ", " +
                "Auto Colour: " + ad.vehicleColour() + ", " +
                "Auto Brand: " + ad.vehicleBrand() + ", " + "Auto doors: " + ad.numberOfDoors() + ", " + "Have AC: " + ad.hasAc() + ", " + "Public transport: " + ad.isPublicTransport() + ", " + "Have Sunroof: " + ad.hasSunroof());

        System.out.println("Truck wheels: " + td.numberOfWheels() + ", " +
                "Truck Colour: " + td.vehicleColour() + ", " +
                "Truck Brand: " + td.vehicleBrand() + ", " + "Truck doors: " + td.numberOfDoors() + ", " + "Have AC: " + td.hasAc() + ", " + "Public transport: " + td.isPublicTransport() + ", " + "Have Sunroof: " + td.hasSunroof());
    }

}
