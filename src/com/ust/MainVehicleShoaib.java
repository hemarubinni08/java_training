package com.ust;

public class MainVehicleShoaib {
    public static void main(String[] args) {
        ShoaibVehicle obj = new ShoaibVehicle();
        System.out.println(obj.kilometerDone());
        ShoaibCar carobj = new ShoaibCar();
        System.out.println(carobj.hasAirBag());
        System.out.println(carobj.kilometerDone());
        System.out.println(carobj.numberOfWheels());
        ShoaibScooty scootyobj = new ShoaibScooty();
        System.out.println(scootyobj.kilometerDone());
        System.out.println(scootyobj.vehicleBrand());
    }
}