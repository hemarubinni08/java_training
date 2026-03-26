package com.ust;

public class MainKeerthi {
    public static void main(String[] args) {
        Vehicle scooty = new ScootyKv();
        Vehicle bike = new BikeKv();
        CarKv car=new CarKv();
        Vehicle truck = new TruckKv();
        System.out.println("no of wheels:" + scooty.noOfWheels());
        System.out.println("Max speed:" + car.maxSpeed());
        System.out.println("Brand name:" + bike.getBrand());
        System.out.println("Car has AC:" + car.hasAc());
        System.out.println("No of passengers:" + car.noOfPassengers());
    }
}