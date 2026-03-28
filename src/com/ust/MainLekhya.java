package com.ust;

import com.ust.imple.CollectionArrayListLekhya;
import com.ust.imple.CollectionHashMapLekhya;
import com.ust.imple.CollectionHashSetLekhya;

import java.util.*;

public class MainLekhya {
    public static void main(String[] args) {
        /*CarAbstractLekhyaImpl car = new CarAbstractLekhyaImpl();
        BikeAbstracLekhyatImpl bike = new BikeAbstracLekhyatImpl();
        System.out.println(car.getRpm());
        System.out.println(bike.fuelUsed());
        System.out.println(car.hasAc());
        */
        /*ArithmeticOperations obj1 = new ArithmeticOperations();
        System.out.println(obj1.addNumbers(2, 3));
        System.out.println(obj1.addNumbers(2, 3, 4));
        */
        /*CollectionArrayListLekhya obj1 = new CollectionArrayListLekhya();
        List<String> names = new ArrayList<>();
        names.add("Lekhya");
        names.add("Chaila");
        names.add("Aron");
        names.add("Logesh");
        names.add("Shashi");
        System.out.println(names);
        obj1.namesOfThePodMembers(names);
        obj1.filteredNames(names);
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(1);
        obj1.removeDuplicatesOfTheList(numbers1, numbers2);

        //CollectionHashSetLekhya class starts here
        CollectionHashSetLekhya obj2 = new CollectionHashSetLekhya();
        HashSet<String> label1 = new HashSet<String>();
        HashSet<String> label2 = new HashSet<String>();
        label1.add("Lekhya");
        label2.add("Chaila");
        label1.add("Aron");
        label2.add("Shashi");
        label1.add("Logesh");
        label2.add("Chaila");
        obj2.addPodMembers(label1, label2);
        HashSet<Integer> label3 = new HashSet<Integer>();
        HashSet<Integer> label4 = new HashSet<Integer>();
        label3.add(1);
        label3.add(2);
        label3.add(4);
        label3.add(5);
        label4.add(1);
        label4.add(8);
        label4.add(2);
        obj2.filterDuplicateNumbers(label3, label4);
        */
        HashMap<Integer, String> newMap = new HashMap<>();
        CollectionHashMapLekhya obj = new CollectionHashMapLekhya();
        newMap.put(1, "Lekhya");
        newMap.put(2, "Aron");
        newMap.put(3, "Chaila");
        newMap.put(4, "Shashi");
        newMap.put(5, "Logesh");
        obj.addEmployee(newMap);
        obj.filteredNamesOne(newMap);
        obj.filteredNames(newMap);
        obj.filteredNamesTwo(newMap);
    }
}
