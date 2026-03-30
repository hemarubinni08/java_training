package com.ust;

import com.ust.impl.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainNagarajan {
    public static void main(String[] args) {
        //CarNagarajan car = new CarNagarajan();
//        car.brand = "BMW";
//        car.speed = 150;
//        car.door = 4;
//        car.ac = true;
//
//        BikeNagarajan bike = new BikeNagarajan();
//        bike.brand = "DUCATI";
//        bike.speed = 140;
//        bike.helmet = true;
//
//        TruckNagarajan truck = new TruckNagarajan();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        truck.door = 2;
//        truck.ac = false;
//
//        System.out.println("Car Information");
//        System.out.println(car.start());
//        System.out.println(car.carInfo());
//        System.out.println(car.openCarDoor());
//        System.out.println(car.stop());
//        System.out.println();
//
//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.truckInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();
//
//        System.out.println("Bike Information");
//        System.out.println(bike.start());
//        System.out.println(bike.bikeInfo());
//        System.out.println(bike.ride());
//        System.out.println(bike.stop());
//        System.out.println();
//
//        CarNagarajanImpl carI = new CarNagarajanImpl();
//        carI.brand = "BMW";
//        carI.speed = 160;
//
//        BikeNagarajanImpl bikeI = new BikeNagarajanImpl();
//        bikeI.brand = "DUCATI";
//        bikeI.speed = 140;
//        bikeI.helmet = true;
//
//        TruckNagarajanImpl truck = new TruckNagarajanImpl();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        TruckNagarajan truck = new TruckNagarajan();
//        truck.brand = "VOLVO";
//        truck.speed = 80;
//        truck.load = 800;
//        truck.door = 2;
//        truck.ac = false;
//
//        System.out.println("Car Information");
//        System.out.println(carI.start());
//        System.out.println(carI.displayInfo());
//        System.out.println(carI.openCarDoor());
//        System.out.println(carI.stop());
//        System.out.println();
//
//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.displayInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();
//        System.out.println("Truck Information");
//        System.out.println(truck.start());
//        System.out.println(truck.truckInfo());
//        System.out.println(truck.loadingInfo());
//        System.out.println(truck.stop());
//        System.out.println();
//
//        System.out.println("Bike Information");
//        System.out.println(bikeI.start());
//        System.out.println(bikeI.displayInfo());
//        System.out.println(bikeI.ride());
//        System.out.println(bikeI.stop());
//        System.out.println();
//
//       Creating object and assigining values for abstract class
//        CarAbstractNagarajanImpl carA = new CarAbstractNagarajanImpl();
//        carA.brand = "BMW";
//        carA.speed = 160;
//
//        BikeAbstractNagarajanImpl bikeA = new BikeAbstractNagarajanImpl();
//        bikeA.brand = "DUCATI";
//        bikeA.speed = 140;
//
//        TruckAbstractNagarajanImpl truckA = new TruckAbstractNagarajanImpl();
//        truckA.brand = "VOLVO";
//        truckA.speed = 80;
//
//        System.out.println("Car Information");
//        System.out.println(carA.start());
//        System.out.println(carA.displayInfo());
//        System.out.println(carA.openCarDoor());
//        System.out.println(carA.stop());
//        System.out.println();
//
//        System.out.println("Truck Information");
//        System.out.println(truckA.start());
//        System.out.println(truckA.displayInfo());
//        System.out.println(truckA.loadingInfo());
//        System.out.println(truckA.stop());
//        System.out.println();
//
//        System.out.println("Bike Information");
//        System.out.println(bikeA.start());
//        System.out.println(bikeA.displayInfo());
//        System.out.println(bikeA.ride());
//        System.out.println(bikeA.stop());
//        System.out.println();

        ArthimeticNagarajan add = new ArthimeticNagarajan();
        System.out.println(add.addNumber(1, 4));
        System.out.println(add.addNumber(1, 3, 4));
        System.out.println();

        CollectionsNagarajan listOfNames = new CollectionsNagarajan();
        List<String> nameList1 = new ArrayList<>();
        nameList1.add("Nagarajan");
        nameList1.add("Chris");
        nameList1.add("Mamtha");
        nameList1.add("Deepshee");
        nameList1.add("Bewin");
        nameList1.add("Aiswarya");

        List<String> nameList2 = new ArrayList<>();
        nameList2.add("Nagarajan");
        nameList2.add("Virat Kohli");
        nameList2.add("Ronaldo");
        nameList2.add("Messi");
        nameList2.add("Vijay");
        nameList2.add("Curry");

        System.out.println("Using for each! - LIST");
        listOfNames.itreateList(nameList1);
        System.out.println();
        System.out.println("Using Lamda - LIST!");
        listOfNames.itreateUsingLamda(nameList1);

        System.out.println();
        System.out.println("Filter using For Each - LIST");
        listOfNames.filterNameUsingForEach(nameList1);
        System.out.println();
        System.out.println("Filter using Lamda - LIST");
        listOfNames.filterNameUsingLamda(nameList1);

        System.out.println();
        System.out.println("Removing name using For Each - LIST");
        listOfNames.removeDuplicateUsingForEach(nameList1, nameList2);

        System.out.println();
        System.out.println("Removing name using Lambda - LIST");
        listOfNames.removeDuplicateUsingLambda(nameList1, nameList2);
        System.out.println();

        //Hash Set Exercise!!
        HashSet<String> nameSet1 = new HashSet<>();
        HashSet<String> nameSet2 = new HashSet<>();

        nameSet1.add("Nagarajan");
        nameSet1.add("Chris");
        nameSet1.add("Mamtha");
        nameSet1.add("Deepshee");
        nameSet1.add("Bewin");
        nameSet1.add("Aiswarya");

        nameSet2.add("Nagarajan");
        nameSet2.add("Virat Kohli");
        nameSet2.add("Ronaldo");
        nameSet2.add("Messi");
        nameSet2.add("Vijay");
        nameSet2.add("Curry");

        System.out.println("Remove Using ForEach - SET");
        listOfNames.removeDuplicateFromSetUsingForEach(nameSet1, nameSet2);
        System.out.println();

        System.out.println("Remove Using Lambda - SET");
        listOfNames.removeDuplicateFromSetUsingLambda(nameSet1, nameSet2);
        System.out.println();

        System.out.println("HashMap Exercise!!");
        HashMap<Integer, String> nameMap1 = new HashMap<>();
        nameMap1.put(308242, "Nagarajan");
        nameMap1.put(308254, "Chris");
        nameMap1.put(308255, "Mamtha");
        nameMap1.put(308256, "Bewin");
        nameMap1.put(308257, "Aiswarya");

        System.out.println("Printing Name from Map");
        System.out.println();

        System.out.println("Printing Using Entry Set");
        listOfNames.toPrintMap(nameMap1);
        System.out.println();

        System.out.println("Printing Using Lambda");
        listOfNames.toPrintMapUsingLambda(nameMap1);
        System.out.println();

        System.out.println("Printing Using KeySet");
        listOfNames.toPrintMapUsingKeySet(nameMap1);
        System.out.println();

//        int[] numArr = {1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println("Finding out occurence");
//        listOfNames.countOccurence(numArr);
//        System.out.println();

        System.out.println("Remove Name from Map ");
        listOfNames.removeNameFromMap(nameMap1);
        System.out.println();

        System.out.println("Remove Name from Map using forEach");
        listOfNames.removeNameFromMapUsingforEach(nameMap1);
        System.out.println();

        System.out.println("Remove Name using Lambda");
        listOfNames.removeNameFromMapUsingLambda(nameMap1);
        System.out.println();

    }
}
