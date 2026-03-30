package com.ust;

import com.ust.impl.ShoaibBikeInterfaceImpl;
import com.ust.impl.ShoaibCarInterfaceImpl;

public class MainVehicleShoaib {
    public static void main(String[] args) {
        /*ShoaibVehicle obj = new ShoaibVehicle();
        System.out.println(obj.kilometerDone());
        ShoaibCar carobj = new ShoaibCar();
        System.out.println(carobj.hasAirBag());
        System.out.println(carobj.kilometerDone());
        System.out.println(carobj.numberOfWheels());
        ShoaibScooty scootyobj = new ShoaibScooty();
        System.out.println(scootyobj.kilometerDone());
        System.out.println(scootyobj.vehicleBrand());*/
        ShoaibCarInterfaceImpl mycar=new ShoaibCarInterfaceImpl();
        System.out.println("---CarDetails---");
        System.out.println("Brand Name:"+" "+mycar.vehicleBrand());
        System.out.println("Total Wheels:"+" "+mycar.numberOfWheels());
        ShoaibBikeInterfaceImpl mybike=new ShoaibBikeInterfaceImpl();
        System.out.println("---BikeDetails---");
        System.out.println("Brand Name:"+" "+mybike.vehicleBrand());
        System.out.println("Total Wheels:"+" "+mybike.numberOfWheels());
        System.out.println("Total kilometers:"+" "+mybike.kilometerDone());
    }
}