package com.ust;

public class MainLogesh {
    public static void main(String[] args) {
        VehicleLogesh vehicle = new VehicleLogesh();
        System.out.println(vehicle.getNumberOfWheels());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getPrice());
        System.out.println();

        System.out.print("CAR");
        CarLogesh car = new CarLogesh();
        System.out.println(car.getDoor());
        System.out.println(car.getLaunchYear());
        System.out.println(car.getPrice());
        System.out.println(car.getAc());
        System.out.println(car.getLoadBed());
        System.out.println(car.getFuel());
        System.out.println(car.getNumberOfSeat());
        System.out.println();

        System.out.println("BIKE");
        BikeLogesh bike = new BikeLogesh();
        System.out.println(bike.numberofWheels());
        System.out.println(bike.getPrice());
        System.out.println(bike.getGear());
        System.out.println(bike.getModel());
        System.out.println(bike.getSeat());
        System.out.println(bike.getSpeed());
        System.out.println();

        System.out.println("LORRY");
        LorryLogesh lorry = new LorryLogesh();
        System.out.println(lorry.getGuranteeYears());
        System.out.println(lorry.getNumberOfSeat());
        System.out.println(lorry.getModel());
        System.out.println(lorry.getPrice());
        System.out.println(lorry.getAc());
        System.out.println(lorry.getLoadBed());
        System.out.println(lorry.getFuel());
        System.out.println(lorry.getNumberOfSeat());
        System.out.println();

        System.out.println("CYCLE");
        CycleLogesh cycle = new CycleLogesh();
        System.out.println(cycle.getFuel());
        System.out.println(cycle.getNumberOfWheels());
        System.out.println(cycle.getModel());
        System.out.println(cycle.getPrice());
        System.out.println();
    }
}