package com.ust;

import com.ust.collections.CollectionsYesh;
import com.ust.collections.HashMapYesh;
import com.ust.collections.SortedListYesh;
import com.ust.impl.HeavyVehicleInterfaceYeshImpl;
import com.ust.impl.VehicleBusYeshImpl;
import com.ust.impl.VehicleCarYeshImpl;
import com.ust.impl.VehicleInterfaceYeshImpl;

import java.util.*;

public class MainYesh {
    public static void main(String[] args) {
        List<String> teamMembersNames = new ArrayList<String>();
        teamMembersNames.add("Yeshwanth");
        teamMembersNames.add("Hemanth");
        teamMembersNames.add("Ritika");
        teamMembersNames.add("Anudeepika");
        teamMembersNames.add("Ardra");
        teamMembersNames.add("Akash");

        /*CollectionsYesh collectionObject = new CollectionsYesh();
        collectionObject.doIterate(teamMembersNames);
        collectionObject.EliminateNeighbor(teamMembersNames);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);

        collectionObject.removingDuplicateInSet(firstSet, secondSet);

        Map<Integer, String> employees = new HashMap<>();
        employees.put(308260, "Ritika Kumari");
        employees.put(308347, "Anudeepika");
        employees.put(308279, "Hemanth");
        employees.put(308339, "Ardra");
        employees.put(308303, "Akash");
        employees.put(308331, "Yeshwanth");

        HashMapYesh mapObject = new HashMapYesh();
        mapObject.iterateEmployees(employees);
        mapObject.containsEmployee(employees, 308331);

        Map<Integer, String> secondMap = new HashMap<>();
        secondMap.put(308331, "Yeshwanth");
        secondMap.put(308279, "hemanth");
        secondMap.put(4, "Ritika");
        secondMap.put(5, "akash");

        mapObject.checkForDuplicates(employees, secondMap);*/
        SortedListYesh sortedNames=new SortedListYesh();
        sortedNames.sortingList(teamMembersNames);
    }
}