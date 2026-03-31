package com.ust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MainNagarajan {

    public static void main(String[] args) {

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
        listOfNames.iterateList(nameList1);
        System.out.println();
        System.out.println("Using Lamda - LIST!");
        listOfNames.iterateUsingLambda(nameList1);
        System.out.println();

        System.out.println("Filter using For Each - LIST");
        listOfNames.filterNameUsingForEach(nameList1);
        System.out.println();
        System.out.println("Filter using Lambda - LIST");
        listOfNames.filterNameUsingLambda(nameList1);

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
        nameMap1.put(1, "Nagarajan");
        nameMap1.put(2, "Chris");
        nameMap1.put(3, "Mamtha");
        nameMap1.put(4, "Bewin");
        nameMap1.put(5, "Aiswarya");

        HashMap<Integer, String> nameMap2 = new HashMap<>();
        nameMap2.put(1, "Nagarajan");
        nameMap2.put(18, "Virat");
        nameMap2.put(7, "Ronaldo");
        nameMap2.put(30, "Curry");
        nameMap2.put(10, "Messi");

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

        System.out.println("Remove Name from Map ");
        listOfNames.removeNameFromMap(nameMap1);
        System.out.println();

        System.out.println("Remove Name from Map using forEach");
        listOfNames.removeNameFromMapUsingForEach(nameMap1);
        System.out.println();

        System.out.println("Remove Name using Lambda");
        listOfNames.removeNameFromMapUsingLambda(nameMap1);
        System.out.println();

        System.out.println("Remove Duplicate From Two Map Using ForEach");
        listOfNames.removeDuplicateFromTwoMapUsingForEach(nameMap1, nameMap2);
        System.out.println();

        System.out.println("Remove Duplicate From Two Map Using Lambda");
        listOfNames.removeDuplicateFromTwoMapUsingLambda(nameMap1, nameMap2);
    }
}
