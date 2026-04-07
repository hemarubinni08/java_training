package com.ust;

import java.util.ArrayList;
import java.util.HashSet;

public class MainGokul {
    public static void main(String[] args) {
        ArrayList<String> num1 = new ArrayList<>();
        num1.add("gokul");
        num1.add("harsh");
        num1.add("rohit");
        num1.add("navya");
        num1.add("keerthi");
        num1.add("deepak");
        ArrayList<String> num2 = new ArrayList<>();
        num2.add("raina");
        num2.add("virat");
        num2.add("dhoni");
        num2.add("gokul");
        num2.add("bravo");

        GokulCollection list=new  GokulCollection();

        list.displayNames(num1, num2);


    }
}
