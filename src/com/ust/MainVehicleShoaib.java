package com.ust;

import com.ust.Impl.*;

import java.util.ArrayList;

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
        System.out.println(scootyobj.vehicleBrand());
        ShoaibCarInterfaceImpl mycar=new ShoaibCarInterfaceImpl();
        System.out.println("---CarDetails---");
        System.out.println("Brand Name:"+" "+mycar.vehicleBrand());
        System.out.println("Total Wheels:"+" "+mycar.numberOfWheels());
        ShoaibBikeInterfaceImpl mybike=new ShoaibBikeInterfaceImpl();
        System.out.println("---BikeDetails---");
        System.out.println("Brand Name:"+" "+mybike.vehicleBrand());
        System.out.println("Total Wheels:"+" "+mybike.numberOfWheels());
        System.out.println("Total kilometers:"+" "+mybike.kilometerDone());
        VehicleAbstractShoaib car=new CarAbstractShoaib();
        System.out.println(car.vehicleBrand());
        VehicleAbstractShoaib bike=new BikeAbstractShoaib();
        System.out.println(bike.vehicleBrand());
        VehicleAbstractShoaib scooty=new ScootyAbstractShoaib();
        System.out.println(scooty.vehicleBrand());
        ShoaibArithmetic obj=new ShoaibArithmetic();
        System.out.println(obj.addition(9,9,9));*/
        CollectionsShoaib obj=new CollectionsShoaib();

       /* ArrayList<String> myNames=new ArrayList<>();
        myNames.add("Shoaib");
        myNames.add("Srujan");
        myNames.add("Kushal");
        myNames.add("Hema");
        myNames.add("Fijul");
        myNames.add("Gopi");

        obj.printName2(myNames);*/
        ArrayList<String>names1=new ArrayList<>();
        names1.add("Shoaib");
        names1.add("Srujan");
        names1.add("Kushal");
        names1.add("Hema");
        names1.add("Fijul");
        names1.add("Gopi");
        ArrayList<String>names2=new ArrayList<>();
        names2.add("Shoaib");
        names2.add("a");
        names2.add("b");
        names2.add("c");
        names2.add("d");
        names2.add("e");
        CollectionsShoaib obj1=new CollectionsShoaib();
        obj1.printName3(names1,names2);



    }
}