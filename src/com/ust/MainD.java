package com.ust;

import com.ust.impl.*;

public class MainD {
    public static void main(String args[]) {
        CarAbstractDeepa cd = new CarAbstractDeepa();
        BikeAbstractDeepa bd = new BikeAbstractDeepa();
        AutoAbstractDeepa ad = new AutoAbstractDeepa();
        TruckAbstractDeepa td = new TruckAbstractDeepa();
        System.out.println("Car wheels: " + cd.numberOfWheels() + ", " +
                "Car Colour: " + cd.vehicleColour() + ", " +
                "Car Brand: " + cd.vehicleBrand() + ", " + "Have AC: " + cd.hasAc() + ", " + "Public Transport: " + cd.isPublicTransport() + ", " +
                "Have Sunroof: " + cd.hasSunroof() + ", " + "Have Gears: " + cd.hasGears() + ", " + "Have Engine: " + cd.hasEngine());

        System.out.println("Bike wheels: " + bd.numberOfWheels() + ", " +
                "Bike Colour: " + bd.vehicleColour() + ", " +
                "Bike Brand: " + bd.vehicleBrand() + ", " + "Have Gears: " + bd.hasGears() + ", " + "Have Engine: " + bd.hasEngine());

        System.out.println("Auto wheels: " + ad.numberOfWheels() + ", " +
                "Auto Colour: " + ad.vehicleColour() + ", " +
                "Auto Brand: " + ad.vehicleBrand() + ", " + "Have AC: " + ad.hasAc() + ", " + "Public transport: " + ad.isPublicTransport() + ", " + "Have Sunroof: " + ad.hasSunroof() + ", " + "Have Gears: " + ad.hasGears() + ", " + "Have Engine: " + ad.hasEngine());

        System.out.println("Truck wheels: " + td.numberOfWheels() + ", " +
                "Truck Colour: " + td.vehicleColour() + ", " +
                "Truck Brand: " + td.vehicleBrand() + ", " + "Have AC: " + td.hasAc() + ", " + "Public transport: " + td.isPublicTransport() + ", " + "Have Sunroof: " + td.hasSunroof() + ", " + "Have Gears: " + td.hasGears() + ", " + "Have Engine: " + td.hasEngine());
    }

}
