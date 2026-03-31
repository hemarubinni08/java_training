package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainVarsha {
    public static void main(String[] args) {
        List<String> combineList = new ArrayList<>();
        Set<String> combineSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        Map<String, String> combineMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        List<String> names1 = new ArrayList<>();
        names1.add("varsha");
        names1.add("deepa");
        names1.add("navaneeth");
        names1.add("chandra");
        names1.add("pranav");
        names1.add("harsha");

        List<String> names2 = new ArrayList<>();
        names2.add("varsha");
        names2.add("navya");
        names2.add("bubbu");
        names2.add("raju");
        names2.add("manju");
        names2.add("vani");

        Set<String> namesSet = new HashSet<>();
        namesSet.add("varsha");
        namesSet.add("navya");
        namesSet.add("bubbu");
        namesSet.add("raju");
        namesSet.add("manju");
        namesSet.add("vani");

        Set<String> namesSet1 = new HashSet<>();
        namesSet1.add("varsha");
        namesSet1.add("deepa");
        namesSet1.add("pranav");
        namesSet1.add("navaneeth");
        namesSet1.add("harsh");
        namesSet1.add("chandhu");

        Map<String, String> members = new HashMap<>();
        members.put("1", "varsha");
        members.put("2", "deepa");
        members.put("3", "navaneeth");
        members.put("4", "chandhu");
        members.put("5", "pranav");
        members.put("6", "harsh");

        Map<String, String> members1 = new HashMap<>();
        members1.put("1", "varsha");
        members1.put("8", "manju");
        members1.put("9", "raju");
        members1.put("10", "nani");
        members1.put("11", "veena");
        members1.put("12", "vani");


        CollectionVarsha cv = new CollectionVarsha();
        cv.printNames(names1);
        cv.ignoreNamesFromList(names1);
        cv.removeDuplicatesFromList(names1, names2, combineList, result);

        cv.printNames(namesSet);
        cv.ignoreNamesFromSet(namesSet);
        cv.removeDuplicatesFromSet(namesSet, namesSet1, combineSet, duplicateSet);

        cv.printMembers(members);
        cv.ignoreMembersFromMap(members);
        cv.removeDuplicatesFromMap(members, members1, combineMap);

        // VehicleVarsha varshaVehicle = new VehicleVarsha();
        // BikeAbstractVarsha varshaBike = new BikeAbstractVarsha();
        // AutoAbstractVarsha varshaAuto = new AutoAbstractVarsha();
        // CarAbstractVarsha varshaCar = new CarAbstractVarsha();
        // BusAbstractVarsha varshaBus = new BusAbstractVarsha();


        // System.out.println("Bike : " + varshaBike.numberOfWheels() + " " + varshaBike.numberOfLights() + " " + varshaBike.capacityOfFuel() + " " + varshaBike.numberOfDoors() + " " + varshaBike.publicTransportation() + " " + varshaBike.hasAc() + " " + varshaBike.sunRoof());
        // System.out.println("Auto : " + varshaAuto.numberOfWheels() + " " + varshaAuto.numberOfLights() + " " + varshaAuto.capacityOfFuel() + " " + varshaAuto.numberOfDoors() + " " + varshaAuto.publicTransportation() + " " + varshaAuto.hasAc() + " " + varshaAuto.sunRoof());
        // System.out.println("Car : " + varshaCar.numberOfWheels() + " " + varshaCar.numberOfLights() + " " + varshaCar.capacityOfFuel() + " " + varshaCar.numberOfDoors() + " " + varshaCar.publicTransportation() + " " + varshaCar.hasAc() + " " + varshaCar.sunRoof());
        // System.out.println("Bus : " + varshaBus.numberOfWheels() + " " + varshaBus.numberOfLights() + " " + varshaBus.capacityOfFuel() + " " + varshaBus.numberOfDoors() + " " + varshaBus.publicTransportation() + " " + varshaBus.hasAc() + " " + varshaBus.sunRoof());
        // System.out.println("Vehicle : " + varshaVehicle.numberOfWheels() + " " + varshaVehicle.numberOfLights() + " " + varshaVehicle.capacityOfFuel());
    }
}