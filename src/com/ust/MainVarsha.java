package com.ust;

import java.lang.reflect.Member;
import java.util.*;

public class MainVarsha {
    public static void main(String[] args) {
        List<String> combineList = new ArrayList<>();
        List<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        Set<String> namesSet = new HashSet<>();
        Set<String> namesSet1 = new HashSet<>();
        Set<String> result = new HashSet<>();
        Set<String> combineSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        Map<String, String> members = new HashMap<>();

        names1.add("varsha");
        names1.add("deepa");
        names1.add("navaneeth");
        names1.add("chandra");
        names1.add("pranav");
        names1.add("harsha");

        names2.add("varsha");
        names2.add("navya");
        names2.add("bubbu");
        names2.add("raju");
        names2.add("manju");
        names2.add("vani");

        namesSet.add("varsha");
        namesSet.add("navya");
        namesSet.add("bubbu");
        namesSet.add("raju");
        namesSet.add("manju");
        namesSet.add("vani");

        namesSet1.add("varsha");
        namesSet1.add("deepa");
        namesSet1.add("pranav");
        namesSet1.add("navaneeth");
        namesSet1.add("harsh");
        namesSet1.add("chandhu");

        members.put("1", "varsha");
        members.put("2", "deepa");
        members.put("3", "navaneeth");
        members.put("4", "chandhu");
        members.put("5", "pranav");
        members.put("6", "harsh");


        CollectionVarsha cv = new CollectionVarsha();
        // cv.printNames(names);
        // cv.removeDuplicates(names1,names2,combineList);
        // cv.printNames(namesSet);
        // cv.ignorenamesSet(namesSet);
        // cv.removeDuplicates(namesSet, namesSet1, result, combineSet,duplicateSet);
        // cv.printMembers(members);
        cv.ignoremembers(members);


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
