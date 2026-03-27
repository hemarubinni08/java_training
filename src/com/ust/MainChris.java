package com.ust;

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
/// /        System.out.println("The Brand is " + truck.getBrand());
//        System.out.println("The Insurance Period is " + truck.insurancePeriod() + " Years");
////        System.out.println("NUmber of Doors: " + truck.numberOfDoors(truck.door));
//        System.out.println("Number of Gears: " + truck.numberOfGears());
//        System.out.println("Number of Wheels: " + truck.numberOfWheels());
//        System.out.println("Engine Power: " + truck.engineCc() + " cc");
////        System.out.println("Air Conditioning: " + truck.haveAc(truck.ac));
//        System.out.println("\n");
//
//
//        System.out.println("Bus Information");

import java.util.ArrayList;
import java.util.List;

////        System.out.println("The Brand is " + bike.getBrand());
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

//        List<String> names = new ArrayList<>();
//        names.add("Chris");
//        names.add("Nagarajan");
//        names.add("Mamatha");
//        names.add("Deepshika");
//        names.add("Bewin");
//        names.add("Aiswarya");
//        CollectionCJ namelist = new CollectionCJ();
//        namelist.iterateNames(names);


        List<String> namelist1 = new ArrayList<>();
        List<String> namelist2 = new ArrayList<>();
        namelist1.add("Chris");
        namelist1.add("Nagarajan");
        namelist1.add("Bewin");
        namelist1.add("Aiswarya");
        namelist1.add("Mamatha");

        namelist2.add("Chris");
        namelist2.add("Messi");
        namelist2.add("Pogba");
        namelist2.add("Neymar");
        namelist2.add("Cristiano");
        CollectionCJ namelist = new CollectionCJ();
//        namelist.removeCommonName(namelist1,namelist2);
        System.out.println();
        namelist.removeDuplicateLambda(namelist1, namelist2);
    }
}
