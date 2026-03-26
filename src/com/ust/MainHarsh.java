package com.ust;

import java.sql.SQLOutput;

public class MainHarsh {
    public static void main(String args[]) {
        VechileHarsh vechile = new VechileHarsh();
        System.out.println("number of wheels are:" + vechile.wheeles());
        System.out.println("Color of vechile is:" + vechile.color());
        System.out.println("Brand of vechile are:" + vechile.brand());

        System.out.println();

        AeroplaneHarsh Aeroplane = new AeroplaneHarsh();
        System.out.println("number of wheels of Aeroplane:" + Aeroplane.wheeles());
        System.out.println("Color of Aeroplane is:" + Aeroplane.color());
        System.out.println("Brand of Aeroplane are:" + Aeroplane.brand());

        System.out.println();

        BikeHarsh Bike = new BikeHarsh();
        System.out.println("number of wheels in Bike:" + Bike.wheeles());
        System.out.println("Color of Bike is:" + Bike.color());
        System.out.println("Brand of Bike is:" + Bike.brand());
        System.out.println("Bike has an ac:"+Bike.hasAc());

        System.out.println();

        CarHarsh Car = new CarHarsh();
        System.out.println("number of wheels in Car:" + Car.wheeles());
        System.out.println("Color of Car is:" + Car.color());
        System.out.println("Brand of Car is:" + Car.brand());
        System.out.println("Number of Gate is:"+Car.numberofgate());

        System.out.println();

        TruckHarsh Truck = new TruckHarsh();
        System.out.println("number of wheels in Truck:" + Truck.wheeles());
        System.out.println("Color of Truck is:" + Truck.color());
        System.out.println("Brand of Truck is:" + Truck.brand());

        VechileHarsh car=new CarHarsh();
        System.out.println("number of wheels in car:"+car.wheeles());
    }
}
