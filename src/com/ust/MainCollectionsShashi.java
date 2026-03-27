package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainCollectionsShashi {
    static void main() {
        List<String> names=new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");

        List<String> names1=new ArrayList<>();
        names1.add("f");
        names1.add("g");
        names1.add("h");
        names1.add("i");
        names1.add("e");
        names1.add("j");
       CollectionsShashi collection=new CollectionsShashi();
       collection.doIterate(names);
       collection.filterNeighbour(names);
       collection.removeDuplicate(names,names1);
    }
}
