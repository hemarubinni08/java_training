package com.ust;

import com.ust.impl.*;

import java.util.*;

import static com.ust.ReverseString.reverseString;
import static com.ust.WhileFijul.printCharacters;

public class MainFijul {
    public static void main(String[] args) {
        System.out.println(reverseString("fijul"));
        printCharacters("hfgdyais");
        BankDetails object = new BankDetails();
        System.out.println(object.addBalance(2000, 3000, 4000));
        System.out.println(object.minusBalance(4000, 2000));
        CarFijul car = new CarFijul();
        VehicleFijul bike = new BikeFijul();
        VehicleFijul vehicle = new VehicleFijul();
        BusFijul bus = new BusFijul();
        TruckFijul truck = new TruckFijul();
        System.out.println(car.isServiceDue());
        System.out.println(bike.numberOfWheels());
        System.out.println(vehicle.brandName());
        System.out.println(bus.brandName());
        System.out.println(truck.isServiceDue());
        CarInterfaceFijulImpl carimpl = new CarInterfaceFijulImpl();
        TruckInterfaceFijulImpl truckimpl = new TruckInterfaceFijulImpl();
        BusInterfaceFijulImpl busimpl = new BusInterfaceFijulImpl();
        BikeInterfaceFijulImpl bikeimpl = new BikeInterfaceFijulImpl();
        System.out.println(carimpl.getTopSpeed());
        System.out.println(truckimpl.isServiceDue());
        System.out.println(busimpl.brandName());
        System.out.println(bikeimpl.totalKilometer());
        VehicleAbstractFijul carabstract = new CarAbstractFijulImpl();
        VehicleAbstractFijul bikeabtract = new BikeAbstractFijulimpl();
        System.out.println(bikeabtract.brandName());
        System.out.println(carabstract.getTopSpeed());

        List<String> newlist = new ArrayList<>();
        newlist.add("fijul");
        newlist.add("shoaib");
        newlist.add("srujan");
        newlist.add("hema");
        newlist.add("kushal");
        newlist.add("gopi");

        List<String> newlist1 = new ArrayList<>();
        newlist1.add("bewin");
        newlist1.add("aiswarya");
        newlist1.add("chris");
        newlist1.add("raja");
        newlist1.add("harsh");
        newlist1.add("gopi");

        HashSet<String> newset = new HashSet<>();
        newset.add("fijul");
        newset.add("shoaib");
        newset.add("srujan");
        newset.add("hema");
        newset.add("kushal");
        newset.add("gopi");

        HashSet<String> newset1 = new HashSet<>();
        newset1.add("bewin");
        newset1.add("aiswarya");
        newset1.add("chris");
        newset1.add("raja");
        newset1.add("kushal");
        newset1.add("gopi");

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(308351, "Fijul");
        newMap.put(308348, "Srujan");
        newMap.put(308232, "Shoaib");
        newMap.put(308250, "Hema");
        newMap.put(308323, "Kushal");
        newMap.put(308340, "Gopi");

        Map<Integer, String> newMap1 = new HashMap<>();
        newMap1.put(308351, "Fijul");
        newMap1.put(308347, "Bewin");
        newMap1.put(308231, "Aiswarya");
        newMap1.put(308254, "Chris");
        newMap1.put(308328, "Harsh");
        newMap1.put(308340, "Gopi");

        int id = 308323;

        CollectionFijul coll = new CollectionFijul();
        coll.doIteration(newlist);
        coll.filterWithFor(newlist);
        coll.twoListIteration(newlist, newlist1);
        coll.twoListIterationMergeFirst(newlist, newlist1);
        coll.usingHashSet(newset, newset1);
        coll.usingHashmap(newMap);
        coll.filterInMap(newMap, id);
        coll.duplicateKeyRemoveInMap(newMap, newMap1);
    }
}