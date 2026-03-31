package com.ust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


//import com.ust.impl.BikeCjImpl;
//import com.ust.impl.BusCJImpl;
//import com.ust.impl.TruckCJImpl;
//
//public abstract class MainChris {
//    public static void main(String[] args) {
//        BusAbstractCJImpl bus = new BusAbstractCJImpl();
//        TruckAbstractCJImpl truck = new TruckAbstractCJImpl();
//
//        System.out.println("Truck Information");
//        System.out.println("The Brand is " + truck.getBrand());
//        System.out.println("The Insurance Period is " + truck.insurancePeriod() + " Years");
//        System.out.println("NUmber of Doors: " + truck.numberOfDoors(truck.door));
//        System.out.println("Number of Gears: " + truck.numberOfGears());
//        System.out.println("Number of Wheels: " + truck.numberOfWheels());
//        System.out.println("Engine Power: " + truck.engineCc() + " cc");
//        System.out.println("Air Conditioning: " + truck.haveAc(truck.ac));
//        System.out.println("\n");
//
//
//        System.out.println("Bus Information");
//
//
//        System.out.println("The Brand is " + bike.getBrand());
//        System.out.println("The Insurance Period is " + bus.insurancePeriod() + " Years");
//        System.out.println("Number of Gears: " + bus.numberOfGears());
//        System.out.println("Number of Wheels: " + bus.numberOfWheels());
//        System.out.println("Engine Power: " + bus.engineCc() + " cc");
//    }
//
//}

//public class MainChris {
//    public static void main(String[] args) {
//        AdditionChris adding = new AdditionChris();
//        int sum;
//        sum=adding.addition(10,2,8);
//        System.out.println(sum);
//    }
//}


public class MainChris {
    public static void main(String[] args) {
        //initializing list names
        List<String> names = new ArrayList<>();
        names.add("Chris");           //adding values into names List.
        names.add("Nagarajan");
        names.add("Mamatha");
        names.add("Deepshika");
        names.add("Bewin");
        names.add("Aiswarya");

        CollectionCJ nameList = new CollectionCJ(); //object initialization
        //nameList.iterateNames(names);

        //Initializing the List
        List<String> namelist1 = new ArrayList<>();
        List<String> namelist2 = new ArrayList<>();
        //adding values into first list
        namelist1.add("Chris");
        namelist1.add("Nagarajan");
        namelist1.add("Bewin");
        namelist1.add("Aiswarya");
        namelist1.add("Mamatha");

        //adding values into second list
        namelist2.add("Chris");
        namelist2.add("Messi");
        namelist2.add("Pogba");
        namelist2.add("Neymar");
        namelist2.add("Cristiano");
        //nameList.removeCommonName(namelist1,namelist2);
        System.out.println();
        //nameList.removeDuplicateLambda(namelist1, namelist2);

        //initializing the Hash set
        HashSet<String> nameSetFirst = new HashSet<>();
        HashSet<String> nameSetSecond = new HashSet<>();

        //appending data into first set
        nameSetFirst.add("Chris");
        nameSetFirst.add("Messi");
        nameSetFirst.add("Pogba");
        nameSetFirst.add("Neymar");
        nameSetFirst.add("Cristiano");

        //appending data into second set
        nameSetSecond.add("Chris");
        nameSetSecond.add("Nagarajan");
        nameSetSecond.add("Bewin");
        nameSetSecond.add("Aiswarya");
        nameSetSecond.add("Mamatha");

        nameList.removeDuplicateSet(nameSetFirst, nameSetSecond);
        nameList.removeDuplicateSetUsingLambda(nameSetFirst, nameSetSecond);
        nameList.removeDuplicateElementInSet(nameSetFirst, nameSetSecond);

        //inserting data into map
        System.out.println("Hash Map Printing");
        HashMap<Integer, String> podMembers = new HashMap<>();
        podMembers.put(308254, "Chris Johnson");
        podMembers.put(308242, "Nagarajan");
        podMembers.put(308566, "Mamatha");
        podMembers.put(308324, "Deepshika");
        podMembers.put(308123, "Bewin");
        podMembers.put(308546, "Aiswarya");

        //inserting values into map
        HashMap<Integer, String> podMembers2 = new HashMap<>();
        podMembers2.put(308254, "Chris Johnson");
        podMembers2.put(308748, "Neymar");
        podMembers2.put(308756, "Kroos");
        podMembers2.put(308890, "Jacob");
        podMembers2.put(308785, "Edward");
        podMembers2.put(308124, "Alice");

        nameList.hashMapIteration(podMembers);
        System.out.println();
        System.out.println("Hash Map Printing Using Lambda");
        nameList.hashMapIterationUsingLambda(podMembers);
        System.out.println("Remove the name of certain person from the hashmap using method");
        nameList.hashMapRemoveElementsUsingMethod(podMembers);
        System.out.println("Remove the name and print the rest from given set");
        nameList.hashMapRemoveSpecifiedNameUsingLoops(podMembers);
        System.out.println("Remove Specific Items Using Lambda From Hash Map");
        nameList.hashMapIterationUsingKeySet(podMembers);
        System.out.println("Remove Specific Item Using Lambda from HashMap");
        nameList.removeSpecificItemUsingLambdaFromHashMap(podMembers);
        System.out.println("Remove Duplicates From Two Maps");
        nameList.removeDuplicatesFromTwoMapsUsing2ForLoops(podMembers, podMembers2);
        System.out.println();
        System.out.println("remove Duplicate From Two Maps Using 1 For Loop");
        nameList.removeDuplicateFromTwoMapsUsing1ForLoop(podMembers, podMembers2);
        System.out.println();
        System.out.println("Remove Duplicate From Maps Using Key Set Lambda");
        nameList.removeDuplicateFromMapsUsingKeySetLambda(podMembers, podMembers2);
        System.out.println();
        System.out.println("Remove Duplicate From Maps Using Values Lambda");
        nameList.removeDuplicateFromMapsUsingValuesLambda(podMembers, podMembers2);
    }
}
