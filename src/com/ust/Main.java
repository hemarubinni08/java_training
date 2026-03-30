package com.ust;

import java.sql.SQLOutput;
import java.util.*;

import com.ust.impl.CollectionHemanth;
import com.ust.impl.FourWheelersHemanthImpl;
import com.ust.impl.TwoWheelersHemanthImpl;

public class Main {
    public static void main(String[] args) {
        //List<String> names = new ArrayList<>();
        //List<String> names1 = new ArrayList<>();
        /*Set<String> names = new HashSet<>();
        Set<String> names1 = new HashSet<>();
        names.add("Hemanth");
        names.add("Yesh");
        names.add("Ardra");
        names.add("Ritu");
        names.add("Anu");
        names.add("Akash");
        names1.add("Hemanth");
        names1.add("Yes");
        names1.add("Ardr");
        names1.add("Rit");
        names1.add("An");
        names1.add("Akas");
        CollectionHemanth getNames = new CollectionHemanth();
        System.out.print(getNames.setDuplicateElements(names, names1));



        /*FourWheelersHemanthImpl four = new FourWheelersHemanthImpl();
        System.out.println(four.typeOfVehicle());
        System.out.println(four.hasAc());
        VehicleInterfaceHemanth bike = new TwoWheelersHemanthImpl();
        bike.typeOfVehicle();
        bike.mileage();*/
        //VehicleBikeHemanth bike = new VehicleBikeHemanth();
        //System.out.println(bike.noOfTyres());
        /*ArithematicHemanth Arithematicoperation = new ArithematicHemanth();
        System.out.println(Arithematicoperation.addTwoNumbers(2,5));
        System.out.println(Arithematicoperation.addTwoNumbers(2, 5.1F));
        System.out.println(Arithematicoperation.multiplyTwoNumbers(3,5));*/


        Map<String, String> newMap = new HashMap<>();
        Map<String, String> newMap1 = new HashMap<>();
        newMap.put("1", "Hemanth");
        newMap.put("2", "Yesh");
        newMap.put("3", "Ardra");
        newMap.put("4", "Ritu");
        newMap.put("5", "Anu");
        newMap.put("6", "Akash");
        newMap1.put("7", "Hemant");
        newMap1.put("8", "Yes");
        newMap1.put("9", "Ardr");
        newMap1.put("10", "Ritu");
        newMap1.put("5", "Anu");
        newMap1.put("6", "Akash");
        CollectionHemanthMap printBatch = new CollectionHemanthMap();
        printBatch.removeDuplicateMap(newMap,newMap1);

    }
}
