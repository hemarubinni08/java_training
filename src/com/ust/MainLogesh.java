package com.ust;

public class MainLogesh {
    public static void main(String[] args) {
        VehicleLogesh vehicle = new VehicleLogesh();
        System.out.println(vehicle.numberofWheels());
        System.out.println(vehicle.model());
        System.out.println(vehicle.price());
        System.out.println();

        System.out.print("CAR");
        CarLogesh car = new CarLogesh();
        System.out.println(car.door());
        System.out.println(car.launchYear());
        System.out.println(car.price());
        System.out.println(car.ac());
        System.out.println(car.loadBed());
        System.out.println(car.getFuel());
        System.out.println(car.numberOfSeat());
        System.out.println();

        System.out.println("BIKE");
        BikeLogesh bike = new BikeLogesh();
        System.out.println(bike.numberofWheels());
        System.out.println(bike.price());
        System.out.println(bike.gear());
        System.out.println(bike.model());
        System.out.println(bike.seat());
        System.out.println(bike.speed());
        System.out.println();

        System.out.println("LORRY");
        LorryLogesh lorry = new LorryLogesh();
        System.out.println(lorry.guranteeYears());
        System.out.println(lorry.numberofWheels());
        System.out.println(lorry.model());
        System.out.println(lorry.price());
        System.out.println(lorry.ac());
        System.out.println(lorry.loadBed());
        System.out.println(lorry.getFuel());
        System.out.println(lorry.numberOfSeat());
        System.out.println();

        System.out.println("CYCLE");
        CycleLogesh cycle = new CycleLogesh();
        System.out.println(cycle.fuel());
        System.out.println(cycle.numberofWheels());
        System.out.println(cycle.model());
        System.out.println(cycle.price());
        System.out.println();
    }
}