package com.ust;

import com.ust.Impl.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
        CollectionsShoaib obj1 = new CollectionsShoaib();
        List<String> names1 = new ArrayList<>();
        names1.add("Shoaib");
        names1.add("Srujan");
        names1.add("Kushal");
        names1.add("Hema");
        names1.add("Fijul");
        names1.add("Gopi");

        List<String> names2 = new ArrayList<>();
        names2.add("Shoaib");
        names2.add("a");
        names2.add("b");
        names2.add("c");
        names2.add("d");
        names2.add("e");

        HashSet<String> set1 = new HashSet<>();
        set1.add("Kushal");
        set1.add("Shoaib");
        set1.add("Fijul");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Kushal");
        set2.add("Shoaib2");
        set2.add("Fijul2");

        System.out.println("=== Method: printNameUsingStream ===");
        obj1.printNameUsingStream(names1);

        System.out.println("\n=== Method: printNameExcludingAny (For Loop) ===");
        obj1.printNameExcludingAny(names1);

        System.out.println("\n=== Method: printNameExcludingAnyUsingStream ===");
        obj1.printNameExcludingAnyUsingStream(names1);


        System.out.println("\n=== Method: removeCommonElement (For Loop) ===");
        obj1.removeCommonElement(names1, names2);

        System.out.println("\n=== Method: removeCommonElementsUsingStreamForList ===");
        obj1.removeCommonElementsUsingStreamForList(names1, names2);

        System.out.println("\n=== Method: mergedLists (Stream Concat) ===");
        obj1.mergedLists(names1, names2);


        System.out.println("\n=== Method: hashMethodPrintNames ===");
        obj1.hashMethodPrintNames(set1, set2);

        System.out.println("\n=== Method: removeCommonElementUsingForLoopForSet ===");
        obj1.removeCommonElementUsingForLoopForSet(set1, set2);

        System.out.println("\n=== Method: removeCommonElementsUsingStreamForSet ===");
        obj1.removeCommonElementsUsingStreamForSet(set1, set2);

        HashMap<Integer,String>map=new HashMap<>();
        map.put(308232,"Shoaib");
        map.put(308351,"Fijul");
        map.put(308348,"Srujan");
        map.put(308250,"Hema");
        map.put(308323,"Kushal");
        map.put(308340,"Gopi");
        obj1.printingNamesViaHashMap(map);
        //obj1.printingNameExcludingMy(map);
        //obj1.checkAndPrint(map,308351);
        obj1.checkAndPrintUsingStream(map,308232);

    }
}