package com.ust;

import java.util.*;

public class MainCollectionsShashi {
    static void main() {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");

        List<String> names1 = new ArrayList<>();
        names1.add("f");
        names1.add("g");
        names1.add("h");
        names1.add("i");
        names1.add("e");
        names1.add("j");
        CollectionsShashi collection = new CollectionsShashi();
        collection.doIterate(names);
        collection.filterNeighbour(names);
        collection.removeDuplicate(names, names1);

        Set<String> setNames = new HashSet<>();
        setNames.add("a");
        setNames.add("b");
        setNames.add("c");
        setNames.add("d");
        setNames.add("e");

        Set<String> setNames1 = new HashSet<>();
        setNames1.add("f");
        setNames1.add("g");
        setNames1.add("h");
        setNames1.add("a");
        setNames1.add("i");
        collection.setPrintNames(setNames, setNames1);
        collection.setRemoveNeighbour(setNames);
        collection.setPrintUniqueName(setNames, setNames1);

        Map<Integer,String> employeeData=new HashMap<>();
        employeeData.put(1,"a");
        employeeData.put(2,"b");
        employeeData.put(3,"c");
        employeeData.put(4,"d");
        employeeData.put(5,"e");
        collection.mapPrintEmployee(employeeData);
        collection.mapRemoveOurName(employeeData);
    }
}
