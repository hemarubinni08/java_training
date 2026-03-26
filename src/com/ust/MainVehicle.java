package com.ust;

public class MainVehicle {
    public static void main(String args[]) {
        CarDeepa cd = new CarDeepa();
        BikeDeepa bd = new BikeDeepa();
        AutoDeepa ad = new AutoDeepa();
        TruckDeepa td = new TruckDeepa();
        System.out.println("Car wheels: " + cd.numberOfWheels() + ", " +
                "Car Colour: " + cd.vehicleColour() + ", " +
                "Car Brand: " + cd.vehicleBrand() + ", " + "Car doors: " + cd.numberOfDoors() + ", " + "Car have AC(true/false): " + cd.hasAc() + ", " + "Car have Sunroof(true/false): " + cd.hasSunroof());

        System.out.println("Bike wheels: " + bd.numberOfWheels() + ", " +
                "Bike Colour: " + bd.vehicleColour() + ", " +
                "Bike Brand: " + bd.vehicleBrand());

        System.out.println("Auto wheels: " + ad.numberOfWheels() + ", " +
                "Auto Colour: " + ad.vehicleColour() + ", " +
                "Auto Brand: " + ad.vehicleBrand() + ", " + "Auto doors: " + ad.numberOfDoors() + ", " + "Auto have AC(true/false): " + ad.hasAc() + ", " + "Public transport: " + ad.isPublicTransport());

        System.out.println("Truck wheels: " + td.numberOfWheels() + ", " +
                "Truck Colour: " + td.vehicleColour() + ", " +
                "Truck Brand: " + td.vehicleBrand() + ", " + "Truck doors: " + td.numberOfDoors());
    }
}
