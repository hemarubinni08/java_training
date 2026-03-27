package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionMainRohit {
    public void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("Rohit");
        names.add("Raj");
        names.add("Saji");
        CollectionRohit C=new CollectionRohit();

        C.printValues(names);
    }

}

