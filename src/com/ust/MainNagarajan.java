package com.ust;

public class MainNagarajan {
    public static void main(String[] args) {

        CarNagarajan car = new CarNagarajan();
        car.brand = "BMW";
        car.speed = 150;
        car.door = 4;
        car.ac = true;

        BikeNagarajan bike = new BikeNagarajan();
        bike.brand = "DUCATI";
        bike.speed = 140;
        bike.helmet = true;

//        TruckNagarajan truck = new TruckNagarajan();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        truck.door = 2;
//        truck.ac = false;

        System.out.println("Car Information");
        System.out.println(car.start());
        System.out.println(car.carInfo());
        System.out.println(car.openCarDoor());
        System.out.println(car.stop());
        System.out.println();

//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.truckInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();

        System.out.println("Bike Information");
        System.out.println(bike.start());
        System.out.println(bike.bikeInfo());
        System.out.println(bike.ride());
        System.out.println(bike.stop());
        System.out.println();
    }
}
