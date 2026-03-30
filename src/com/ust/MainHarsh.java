package com.ust;

import com.ust.impl.AllVechileInterfaceImpl;
import com.ust.impl.BikeHarshImpl;
import com.ust.impl.BusInterfaceImpl;
import com.ust.impl.CarInterfaceImpl;

import java.util.*;

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
        System.out.println("Bike has an ac:" + Bike.hasAc());

        System.out.println();

        CarHarsh Car = new CarHarsh();
        System.out.println("number of wheels in Car:" + Car.wheeles());
        System.out.println("Color of Car is:" + Car.color());
        System.out.println("Brand of Car is:" + Car.brand());
        System.out.println("Number of Gate is:" + Car.numberofgate());

        System.out.println();

        TruckHarsh Truck = new TruckHarsh();
        System.out.println("number of wheels in Truck:" + Truck.wheeles());
        System.out.println("Color of Truck is:" + Truck.color());
        System.out.println("Brand of Truck is:" + Truck.brand());

        VechileHarsh car = new CarHarsh();
        System.out.println("number of wheels in car:" + car.wheeles());

        System.out.println("***********************Interface***********************************");

        VehicleInterfaceHarsh a = new BikeHarshImpl();
        System.out.println("number of wheels in Bike:" + a.wheeles());
        System.out.println("Color of Bike is:" + a.color());
        System.out.println("Brand of Bike is:" + a.brand());

        System.out.println();

        BusInterfaceImpl b = new BusInterfaceImpl();
        System.out.println("number of wheels in Bike:" + b.wheeles());
        System.out.println("Color of Bike is:" + b.color());
        System.out.println("Brand of Bike is:" + b.brand());
        System.out.println("Has AC in Bike:" + b.hasAc());
        System.out.println("Speed of Bike is:" + b.speedMoreThan120());
        System.out.println("Number of door in  Bike is:" + b.numberOfDoor());

        System.out.println();

        VehicleInterfaceHarsh c = new CarInterfaceImpl();
        System.out.println("number of wheels in Bike:" + c.wheeles());
        System.out.println("Color of Bike is:" + c.color());
        System.out.println("Brand of Bike is:" + c.brand());

        System.out.println("***********CollectionsWork*********************");

        ArrayList<String> name = new ArrayList<>();
        name.add("Harsh");
        name.add("Rohit");
        name.add("Gokul");
        name.add("Deepak");
        name.add("Navya");
        name.add("Keerti");

        ArrayList<String> names = new ArrayList<>();
        names.add("Harsh");
        names.add("Deppa");
        names.add("HarshVardhan");
        names.add("Choto");
        names.add("Ritika");
        names.add("Kusal");

        CollectionOperations har = new CollectionOperations();
//        har.printValues(name);
//        har.printname(name);
//        har.removingDuplicate(name,names);
//        har.removeDuplicatee(name,names);
      har.printNamesExcludingRohit(name);
       // har.removeDuplicatesUsingCombinedList(name, names);

        System.out.println("****HASHSET****************************");

        HashSet<String> FirstHashset = new HashSet<>();
        FirstHashset.add("Harsh");
        FirstHashset.add("Deppa");
        FirstHashset.add("HarshVardhan");
        FirstHashset.add("Choto");
        FirstHashset.add("Ritika");
        FirstHashset.add("Kusal");

        HashSet<String> SecondHashset = new HashSet<>();
        SecondHashset.add("Harsh");
        SecondHashset.add("Rohit");
        SecondHashset.add("Gokul");
        SecondHashset.add("Deepak");
        SecondHashset.add("Navya");
        SecondHashset.add("Keerti");
        HashSetOperations hs = new HashSetOperations();
        hs.printElements(FirstHashset);
        hs.combineHashSetValues(FirstHashset, SecondHashset);

        HashMap<Integer, String> firstHashMap = new HashMap<>();
        firstHashMap.put(308352, "Harsh");
        firstHashMap.put(308346, "gokul");
        firstHashMap.put(308237, "rohit");
        firstHashMap.put(308342, "navya");
        firstHashMap.put(308344, "keerti");
        MapOperations map = new MapOperations();
       // map.printingHashMapValues(firstHashMap);
        map.printRemainingNameAndId(firstHashMap);
    }
}
