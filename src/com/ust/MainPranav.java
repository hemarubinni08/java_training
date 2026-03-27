package com.ust;

import com.ust.impl.*;

import java.util.ArrayList;
import java.util.List;

public class MainPranav {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Pranav");
        list1.add("Harsha");
        list1.add("Chandu");
        list1.add("Navaneeth");
        list1.add("Varsha");
        list1.add("Deepa");

        List<String> list2 = new ArrayList<>();
        list2.add("Pranav");
        list2.add("manu");
        list2.add("kris");
        list2.add("hari");
        list2.add("ram");
        list2.add("gopal");
        list2.add("john");

        CollectionJavaPranav cp = new CollectionJavaPranav();
        cp.findDuplicate(list1, list2);

    }
}

