package com.ust;

import com.ust.collections.CollectionsYesh;
import com.ust.impl.HeavyVehicleInterfaceYeshImpl;
import com.ust.impl.VehicleBusYeshImpl;
import com.ust.impl.VehicleCarYeshImpl;
import com.ust.impl.VehicleInterfaceYeshImpl;

import java.util.*;

public class MainYesh {
    public static void main(String[] args) {
        /*VehicleYesh vehicleObject = new VehicleYesh();
        HeavyVehiclesYesh fourWheelerObject = new FourWheelerYesh();
        System.out.println(fourWheelerObject.colorOfVehicle());
        System.out.println(vehicleObject.colorOfVehicle());
        SixWheelerYesh sixWheelObject = new SixWheelerYesh();
        System.out.println(sixWheelObject.numberOfWheels());*/
        //FourWheelerYesh fourWheelObject=new FourWheelerYesh();
        //System.out.println(fourWheelObject.noOfDoors());
        //System.out.println(fourWheelerObject.noOfDoors());
        /*VehicleInterfaceYesh interfaceObj=new VehicleInterfaceYeshImpl();
        HeavyVehicleInterfaceYeshImpl heavyVehicleInterfaceYeshObj=new HeavyVehicleInterfaceYeshImpl();
        System.out.println(interfaceObj.numberOfwheels());
        System.out.println(interfaceObj.colorOfVehicle());
        System.out.println(heavyVehicleInterfaceYeshObj.maxSpeedOfVehicle());
        VehicleBusYeshImpl busObject=new VehicleBusYeshImpl();
        System.out.println(busObject.noOfSeats());
        VehicleCarYeshImpl carObject=new VehicleCarYeshImpl();
        System.out.println(carObject.itHasAc());
        ArithimeticYesh addObject=new ArithimeticYesh();
        System.out.println(addObject.addition(3,4,6));*/
        List<String> teamMembersNames=new ArrayList<String>();
        teamMembersNames.add("Yeshwanth");
        teamMembersNames.add("Hemanth");
        teamMembersNames.add("Ritika");
        teamMembersNames.add("Anudeepika");
        teamMembersNames.add("Ardra");
        teamMembersNames.add("Akash");
        CollectionsYesh collectionObject=new CollectionsYesh();
        collectionObject.doIterate(teamMembersNames);
        collectionObject.EliminateNeighbor(teamMembersNames);
        List<Integer> secondList=new ArrayList<>();
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);
        List<Integer> firstList=new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);
        System.out.println(collectionObject.removingDuplicate(firstList,secondList));
    }
}
