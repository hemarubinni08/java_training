package com.ust;

import com.ust.impl.AllVechileInterfaceImpl;
import com.ust.impl.BikeHarshImpl;
import com.ust.impl.BusInterfaceImpl;
import com.ust.impl.CarInterfaceImpl;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        System.out.println("Bike has an ac:"+Bike.hasAc());

        System.out.println();

        CarHarsh Car = new CarHarsh();
        System.out.println("number of wheels in Car:" + Car.wheeles());
        System.out.println("Color of Car is:" + Car.color());
        System.out.println("Brand of Car is:" + Car.brand());
        System.out.println("Number of Gate is:"+Car.numberofgate());

        System.out.println();

        TruckHarsh Truck = new TruckHarsh();
        System.out.println("number of wheels in Truck:" + Truck.wheeles());
        System.out.println("Color of Truck is:" + Truck.color());
        System.out.println("Brand of Truck is:" + Truck.brand());

        VechileHarsh car=new CarHarsh();
        System.out.println("number of wheels in car:"+car.wheeles());

        System.out.println("**********************************************************");

        VehicleInterfaceHarsh a=new BikeHarshImpl();
        System.out.println("number of wheels in Bike:" + a.wheeles());
        System.out.println("Color of Bike is:" + a.color());
        System.out.println("Brand of Bike is:" + a.brand());

        System.out.println();

        BusInterfaceImpl b=new BusInterfaceImpl();
        System.out.println("number of wheels in Bike:" + b.wheeles());
        System.out.println("Color of Bike is:" + b.color());
        System.out.println("Brand of Bike is:" + b.brand());
        System.out.println("Has AC in Bike:" + b.hasAc());
        System.out.println("Speed of Bike is:" + b.speedMoreThan120());
        System.out.println("Number of door in  Bike is:" + b.numberOfDoor());

        System.out.println();

        VehicleInterfaceHarsh c=new CarInterfaceImpl();
        System.out.println("number of wheels in Bike:" + c.wheeles());
        System.out.println("Color of Bike is:" + c.color());
        System.out.println("Brand of Bike is:" + c.brand());

        CollectionHarsh ch=new CollectionHarsh();

        List<String> l1 = new ArrayList<>();
        l1.add("Rohit");
        l1.add("Harsh");
        l1.add("Keerthi");
        l1.add("Navya");
        l1.add("Deepak");
        l1.add("Gokul");

        List<String> l2 = new ArrayList<>();
        l2.add("Sreelekshmi");
        l2.add("Gokul");
        l2.add("Pranav");
        l2.add("Chris");

        HashMap<Integer,String>map1=new HashMap<>();
        map1.put(121,"harsh");
        map1.put(122,"Rohit");
        map1.put(123,"Gokul");
        map1.put(124,"Deepa");
        map1.put(125,"Navya");
        map1.put(126,"Keerti");

        HashMap<Integer,String>map2=new HashMap<>();
        map2.put(121,"harsh");
        map2.put(128,"Ritika");
        map2.put(129,"Choto");
        map2.put(130,"Kushal");
        map2.put(131,"Harhvardhan");
        map2.put(132,"Ankita");

//        ch.removingCommonFromTwoMap(map1,map2);
//        ch.removingBothDuplicateFromMap(map1,map2);
        ch.printNameOfHashmap(map1);
    }
}
