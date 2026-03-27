package com.ust;

import com.ust.impl.*;

public class MainNagarajan {
    public static void main(String[] args) {

//        CarNagarajan car = new CarNagarajan();
//        car.brand = "BMW";
//        car.speed = 150;
//        car.door = 4;
//        car.ac = true;
//
//        BikeNagarajan bike = new BikeNagarajan();
//        bike.brand = "DUCATI";
//        bike.speed = 140;
//        bike.helmet = true;
//
//        TruckNagarajan truck = new TruckNagarajan();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        truck.door = 2;
//        truck.ac = false;
//
//        System.out.println("Car Information");
//        System.out.println(car.start());
//        System.out.println(car.carInfo());
//        System.out.println(car.openCarDoor());
//        System.out.println(car.stop());
//        System.out.println();
//
//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.truckInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();
//
//        System.out.println("Bike Information");
//        System.out.println(bike.start());
//        System.out.println(bike.bikeInfo());
//        System.out.println(bike.ride());
//        System.out.println(bike.stop());
//        System.out.println();

//        CarNagarajanImpl carI = new CarNagarajanImpl();
//        carI.brand = "BMW";
//        carI.speed = 160;
//
//        BikeNagarajanImpl bikeI = new BikeNagarajanImpl();
//        bikeI.brand = "DUCATI";
//        bikeI.speed = 140;
//        bikeI.helmet = true;
//
//        TruckNagarajanImpl truck = new TruckNagarajanImpl();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        TruckNagarajan truck = new TruckNagarajan();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        truck.door = 2;
//        truck.ac = false;

//        System.out.println("Car Information");
//        System.out.println(carI.start());
//        System.out.println(carI.displayInfo());
//        System.out.println(carI.openCarDoor());
//        System.out.println(carI.stop());
//        System.out.println();
//
//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.displayInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();
//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.truckInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();

//        System.out.println("Bike Information");
//        System.out.println(bikeI.start());
//        System.out.println(bikeI.displayInfo());
//        System.out.println(bikeI.ride());
//        System.out.println(bikeI.stop());
//        System.out.println();

        CarAbstractNagarajanImpl carA = new CarAbstractNagarajanImpl();
        carA.brand = "BMW";
        carA.speed = 160;

        BikeAbstractNagarajanImpl bikeA = new BikeAbstractNagarajanImpl();
        bikeA.brand = "DUCATI";
        bikeA.speed = 140;

        TruckAbstractNagarajanImpl truckA = new TruckAbstractNagarajanImpl();
        truckA.brand = "VOLVO";
        truckA.speed = 80;

        System.out.println("Car Information");
        System.out.println(carA.start());
        System.out.println(carA.displayInfo());
        System.out.println(carA.openCarDoor());
        System.out.println(carA.stop());
        System.out.println();

        System.out.println("Truck Information");
        System.out.println(truckA.start());
        System.out.println(truckA.displayInfo());
        System.out.println(truckA.loadingInfo());
        System.out.println(truckA.stop());
        System.out.println();

        System.out.println("Bike Information");
        System.out.println(bikeA.start());
        System.out.println(bikeA.displayInfo());
        System.out.println(bikeA.ride());
        System.out.println(bikeA.stop());
        System.out.println();

    }


}

/*
    carI.door = 4;
    car.ac = true;
*/
