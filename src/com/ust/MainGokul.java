package com.ust;

import java.util.ArrayList;

public class MainGokul {
    public static void main(String[] args) {
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("gokul");
        names1.add("harsh");
        names1.add("rohit");
        names1.add("navya");
        names1.add("keerthi");
        names1.add("deepak");
        ArrayList<String>names2=new ArrayList<>();
        names2.add("raina");
        names2.add("virat");
        names2.add("dhoni");
        names2.add("gokul");
        names2.add("bravo");
        GokulCollection.displayNames(names1,names2);
}
}
