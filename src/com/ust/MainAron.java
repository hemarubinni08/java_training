package com.ust;

import com.ust.impl.CarInterfaceAronImpl;
import com.ust.impl.BikeInterfaceAronImpl;
import com.ust.impl.LorryInterfaceAronImpl;
import com.ust.impl.AutoInterfaceAronImpl;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class MainAron {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("Aron");
        names1.add("Lekhya");
        names1.add("Shashi");
        names1.add("Logesh");
        names1.add("Chaila");
        List<String> names2 = new ArrayList<>();
        names2.add("Pranav");
        names2.add("Harsh");
        names2.add("Chandra");
        names2.add("Raja");
        names2.add("Chris");
        names2.add("Aron");
        // Class Object
        CollectionsAron collection = new CollectionsAron();
//        collection.doIteration(names);
//        collection.filteredIteration(names);
//        collection.uniqueElement(names1, names2);
        HashSet<String> setNames1 = new HashSet<>();
        setNames1.add("Aron");
        setNames1.add("Lekhya");
        setNames1.add("Shashi");
        setNames1.add("Logesh");
        setNames1.add("Chaila");
        setNames1.add("Raja");
        HashSet<String> setNames2 = new HashSet<>();
        setNames2.add("Pranav");
        setNames2.add("Harsh");
        setNames2.add("Chandra");
        setNames2.add("Raja");
        setNames2.add("Chris");
        setNames2.add("Aron");
        collection.traverseSet(setNames1, setNames2);
        System.out.println();
        collection.filterSet(setNames1);
        System.out.println();
        collection.removeDuplicateSet(setNames1, setNames2);

    }
}
