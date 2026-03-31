package com.ust;

import com.ust.Impl.*;

import com.ust.Impl.BikeKushalImpl;
import com.ust.Impl.TruckAbstractKushal;

import java.util.*;

public class MainKushal {
    static void main() {

        //Arithmetic Operations
        System.out.println();
        System.out.println("ArithMetic Operations");
        ArithmeticOperationKushal aok = new ArithmeticOperationKushal();
        System.out.println("Addition of two numbers is : " + " " + aok.add(6, 2));
        System.out.println("Addition of three numbers is : " + " " + aok.add(6, 2, 10));
        System.out.println("Subtraction of two numbers is : " + " " + aok.subtract(6, 2));
        System.out.println("Multiplication of two numbers is : " + " " + aok.multiply(6, 2));
        System.out.println("Division of two numbers is : " + " " + aok.division(6, 2));

        //CLASSES AND INHERITANCE
        System.out.println();
        System.out.println("Classes & Interfaces");
        BikeKushal bk = new BikeKushal();
        CarKushal ck = new CarKushal();
        BusKushal buk = new BusKushal();
        TruckKushal tk = new TruckKushal();
        System.out.println("Bike Brand is : " + bk.getBrand());
        System.out.println("Bike Doors Count is : " + bk.getDoorsCount());
        System.out.println("Car Colour is : " + ck.getColour());
        System.out.println("Car Wheels Count is : " + ck.getWheelsCount());
        System.out.println("Car Drive Type is is : " + ck.getDriveType());
        System.out.println("Truck Capacity is : " + tk.getVehicleCapacity());
        System.out.println("Truck Wheels Count is : " + tk.getWheelsCount());
        System.out.println("Bus Vehicle Type is : " + buk.getVehicleType());
        System.out.println("Bus has extra Tyre : " + buk.hasExtraTrye());
        System.out.println("Truck has AC : " + tk.hasAC());
//        String carBrand = bk.getBrand();

        //INTERFEACES & METHODS
        System.out.println();
        System.out.println("Using Interfaces & Methods");
        //VehicleKushal carobj = new CarKushal();
        BikeKushalImpl bki = new BikeKushalImpl();
        com.ust.impl.CarKushalImpl cki = new com.ust.impl.CarKushalImpl();
        com.ust.impl.TruckKushalImpl tki = new com.ust.impl.TruckKushalImpl();
        com.ust.impl.BusKushalImpl buki = new com.ust.impl.BusKushalImpl();

        System.out.println("Car Colour is : " + cki.getColour());
        System.out.println("Bus Brand is : " + buki.getBrand());
        System.out.println("Bike Comes Under Category of type : " + bki.getVehicleType());
        System.out.println("Truck Has AC : " + tki.hasAC());
        System.out.println("Truck Has This many Doors : " + tki.getDoorsCount());

        //ABSTRACT CLASSES
        System.out.println();
        System.out.println("Using Abstract Classes");
        // BikeAbstractKushal bak = new com.ust.impl.BikeAbstractKushal();
        com.ust.impl.BusAbstractKushal buak = new com.ust.impl.BusAbstractKushal();
        TruckAbstractKushal tak = new TruckAbstractKushal();
        com.ust.impl.CarAbstractKushal cak = new com.ust.impl.CarAbstractKushal();

        System.out.println("Car Colour is : " + cak.getColour());
        System.out.println("Bus Brand is : " + buak.getBrand());
        //System.out.println("Bike Comes Under Category of type : " + bak.getVehicleType());
        System.out.println("Truck Has Windows : " + tak.hasWindows());
        System.out.println("Truck Has This many Doors : " + tak.hasWindows());

        //COLLECTIONS

        CollectionsKushal colk = new CollectionsKushal();

        //MAPS

        Map<Integer, String> podMembersMap = new HashMap<>();
        podMembersMap.put(308323, "Kushal");
        podMembersMap.put(308348, "Srujan");
        podMembersMap.put(308351, "Fijul");
        podMembersMap.put(308232, "Shoaib");
        podMembersMap.put(308250, "Hema");
        podMembersMap.put(308340, "Gopinath");

        Map<Integer, String> nonPodMembersMap = new HashMap<>();
        nonPodMembersMap.put(308323, "Kushal");
        nonPodMembersMap.put(22235, "Raja");
        nonPodMembersMap.put(2322, "Vignesh");
        nonPodMembersMap.put(3012, "Shabnam");
        nonPodMembersMap.put(3080, "Sanjay");
        nonPodMembersMap.put(3340, "Srujan");

        System.out.println();
        System.out.println("Using Maps");

        colk.doMapIterationUsingForLoop(podMembersMap);
        colk.doMapIterationUsingStreams(nonPodMembersMap);

        colk.doMapIterationExcludingMyNameUsingForLoop(podMembersMap);
        colk.doMapIterationExcludingMyNameUsingStream(nonPodMembersMap);

        colk.doMapIterationRemoveDuplicatesFromTwoMapsUsingLoop(podMembersMap, nonPodMembersMap);
        colk.doMapIterationRemoveDuplicatesFromTwoMapsUsingStream(podMembersMap, nonPodMembersMap);

        //LISTS
        List<String> podMembersList = new ArrayList<>();
        List<String> nonPodMembersList = new ArrayList<>(List.of("Raja", "Kushal", "Vignesh", "Rajith", "Sanjay", "Srujan", "Srujan"));
        podMembersList.add("Kushal");
        podMembersList.add("Srujan");
        podMembersList.add("Faijul");
        podMembersList.add("Shoaib");
        podMembersList.add("Hema");
        podMembersList.add("Gopi");

        System.out.println();
        System.out.println("Using Lists");

        colk.doListIterationUsingForLoop(podMembersList);
        colk.doListIterationUsingStream(podMembersList);

        colk.doListIterationExcludeNeighbourUsingLoop(podMembersList);
        colk.doListIterationExcludeNeighbourUsingStream(podMembersList);

        colk.doListIterationRemoveDuplicatesFromTwoListsUsingForLoop(podMembersList, nonPodMembersList);
        colk.doListIterationRemoveDuplicatesFromTwoListsUsingStream(podMembersList, nonPodMembersList);

        //SETS
        HashSet<String> podMembersSet = new HashSet<>();
        HashSet<String> nonPodMembersSet = new HashSet<>(Set.of("Raja", "Kushal", "Vignesh", "Rajith", "Sanjay", "Srujan"));
        podMembersSet.add("Kushal");
        podMembersSet.add("Srujan");
        podMembersSet.add("Faijul");
        podMembersSet.add("Shoaib");
        podMembersSet.add("Hema");
        podMembersSet.add("Gopi");

        System.out.println();
        System.out.println("Using Sets");

        colk.doSetIterationUsingForLoop(podMembersSet, nonPodMembersSet);
        colk.doSetIterationUsingStream(podMembersSet, nonPodMembersSet);

        colk.doSetIterationRemoveDuplicatesFromTwoSetsUsingForLoop(podMembersSet, nonPodMembersSet);
        colk.doSetIterationRemoveDuplicatesFromTwoSetsUsingStream(podMembersSet, nonPodMembersSet);

    }
}
