package com.ust;

import com.ust.impl.*;

import java.util.*;

public class MainChandu {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(308239, "Chandu");
        employeeMap.put(308320, "Navaneeth");
        employeeMap.put(308321, "Pranav");

        Map<Integer, String> employeeMap1 = new HashMap<>();
        employeeMap1.put(308232, "Harsh");
        employeeMap1.put(308233, "Deepa");
        employeeMap1.put(308239, "Chandu");

        CollectionChandu cc = new CollectionChandu();
        System.out.println(cc.removeEmployee1(employeeMap, employeeMap1));
        System.out.println(cc.removeEmployee2(employeeMap, employeeMap1));
        System.out.println(cc.removeEmployeeCombine(employeeMap, employeeMap1));
        System.out.println(cc.removeEmployeeCombine1(employeeMap, employeeMap1));

        cc.displayEmployee(employeeMap);
        cc.removeEmployee(employeeMap, employeeMap1);
        System.out.println(employeeMap);
        System.out.println(employeeMap1);

        cc.displayEmployee(employeeMap);
        cc.findNeighbour(employeeMap);
        cc.findNeighbour1(employeeMap);
        cc.streamMap(employeeMap);

        cc.removeEmployee(employeeMap, employeeMap1);
        cc.removeEmployee1(employeeMap, employeeMap1);
        cc.removeEmployee2(employeeMap, employeeMap1);
        cc.removeEmployeeCombine(employeeMap, employeeMap1);
        cc.removeEmployeeCombine1(employeeMap, employeeMap1);

        List<String> names = new ArrayList<>();
        names.add("Chandu");
        names.add("Pranav");
        names.add("Navaneeth");
        names.add("Harsha");
        names.add("Varsha");
        names.add("Deepa");

        List<String> naming = new ArrayList<>();
        naming.add("Cha");
        naming.add("Pra");
        naming.add("Nav");
        naming.add("Har");
        naming.add("Var");
        naming.add("Chandu");

        Set<Integer> number = new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        Set<Integer> number1 = new HashSet<>();
        number1.add(11);
        number1.add(22);
        number1.add(33);
        number1.add(44);
        number1.add(1);

        System.out.println(cc.iterate(names, naming));
        System.out.println(cc.iterate2(names, naming));
        System.out.println(cc.iterate3(names, naming));
        System.out.println(cc.iterate4(names, naming));
        System.out.println(cc.setIteration2(number, number1));
        System.out.println(cc.setIteration(number, number1));
        System.out.println(cc.setIteration3(number, number1));
    }
}
