package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainAishu {
    public static void main(String[] args) {
//        int n=multiplyNum(2,7);
//        System.out.println(n);
//    }
//    public static Integer multiplyNum(int a,int b){
//        return a*b;
//    }

//
        CollectionAish collectionAish = new CollectionAish();
        List<String> names = new ArrayList<>();
        names.add("aishu");
        names.add("bewin");
        names.add("chris");
//        names.add("nagarajan");
//        names.add("mamtha");
//        names.add("deepshika");
        //collectionAish.removeDuplicate(names);

        List<String> name1 = new ArrayList<>();
        name1.add("bewin");
        name1.add("mamtha");
        name1.add("deepshika");
        collectionAish.removeDuplicatesUsingStream(names, name1);

    }
}
