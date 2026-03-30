package com.ust;

import java.util.ArrayList;

public class MainGokul {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("gokul");
        names.add("harsh");
        names.add("rohit");
        names.add("navya");
        names.add("keerthi");
        GokulCollection.displayNames(names);
}
}
