package com.ust;

import com.ust.Impl.*;

import java.util.*;

public class MainSrujan {
    public static void main(String[] args) {
        HashSet<String> namesPod1Set = new HashSet<>();
        namesPod1Set.add("Srujan");
        namesPod1Set.add("Kushal");
        namesPod1Set.add("Hema");
        namesPod1Set.add("Gopinath");
        namesPod1Set.add("Fijul");
        namesPod1Set.add("Shoaib");

        HashSet<String> namesPod2Set = new HashSet<>();
        namesPod2Set.add("Srujan");
        namesPod2Set.add("Hemanth");
        namesPod2Set.add("Navya");
        namesPod2Set.add("Varsha");
        namesPod2Set.add("Vinaya");
        namesPod2Set.add("Varshit");

        List<String> namesPod1 = new ArrayList<>();
        namesPod1.add("Srujan");
        namesPod1.add("Kushal");
        namesPod1.add("Hema");
        namesPod1.add("Gopinath");
        namesPod1.add("Fijul");
        namesPod1.add("Shoaib");

        List<String> namesPod2 = new ArrayList<>();
        namesPod2.add("Hemanth");
        namesPod2.add("Navya");
        namesPod2.add("Vinaya");
        namesPod2.add("Varsha");
        namesPod2.add("Varshit");
        namesPod2.add("Srujan");

        Map<Integer, String> namesPod1Map = new HashMap<>();
        namesPod1Map.put(308351, "Fijul");
        namesPod1Map.put(308348, "Srujan");
        namesPod1Map.put(308232, "Shoaib");
        namesPod1Map.put(308250, "Hema");
        namesPod1Map.put(308323, "Kushal");
        namesPod1Map.put(308340, "Gopi");

        Map<Integer, String> namesPod2Map = new HashMap<>();
        namesPod2Map.put(308348, "Srujan");
        namesPod2Map.put(123457, "Durga");
        namesPod2Map.put(123458, "Hema");
        namesPod2Map.put(123459, "Abhinav");
        namesPod2Map.put(123450, "Vishnu");
        namesPod2Map.put(012345, "Madhav");

        CollectionsSrujan objectToTestSrujan = new CollectionsSrujan();
        objectToTestSrujan.doIterationSrujan(namesPod1);
        objectToTestSrujan.doIteration2Srujan(namesPod1);
        objectToTestSrujan.doIteration2SrujanLambda(namesPod1);
        objectToTestSrujan.doIterationNames1Names2(namesPod1,namesPod2);
        objectToTestSrujan.doIterationNames1Names2Lambda(namesPod1,namesPod2);
        objectToTestSrujan.doIterationNames1Names2Merged(namesPod1,namesPod2);
        objectToTestSrujan.doIterationNames1Names2MergedLambda(namesPod1,namesPod2);
        objectToTestSrujan.doIterationHashSet(namesPod1Set);
        objectToTestSrujan.doIteration2NamesSet(namesPod1Set,namesPod2Set);
        objectToTestSrujan.doIteration2NamesSetLambda(namesPod1Set,namesPod2Set);
        objectToTestSrujan.doIterationMergedSet(namesPod1Set,namesPod2Set);
        objectToTestSrujan.doIterationMergedSetLambda(namesPod1Set,namesPod2Set);
        objectToTestSrujan.doIterationTempSet(namesPod1Set,namesPod2Set);
        objectToTestSrujan.doIterationTempSetLambda(namesPod1Set,namesPod2Set);

        CollectionsSrujan2 objectToTestSrujan2 = new CollectionsSrujan2();
        objectToTestSrujan2.doIterationMap(namesPod1Map);
        objectToTestSrujan2.doIterationSkipMap(namesPod1Map);
        objectToTestSrujan2.doIterationContainKey(namesPod1Map);
        objectToTestSrujan2.doIterationContainValue(namesPod1Map);
        objectToTestSrujan2.doIterationContainValueLambda(namesPod1Map);
        objectToTestSrujan2.doIteration2MapsSrujan(namesPod1Map,namesPod2Map);
        objectToTestSrujan2.doIteration2MapsSrujanLambda(namesPod1Map,namesPod2Map);
    }
}
