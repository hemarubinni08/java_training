package com.ust;

import java.util.ArrayList;
import java.util.List;

public class MainMamtha1{
    public static void main(String[] args){

            List<String> names = new ArrayList<>();
            names.add("Mamatha");
            names.add("Deepshi");
            names.add("Nagarajan");
            names.add("CJ");
            names.add("Aishu");
            names.add("Bew");

            List<String> names1=new ArrayList<>();
            names1.add("hema");
            names1.add("nadhi");
            names1.add("deepak");
            names1.add("CJ");
            names1.add("Praneesh");
            names1.add("Visagan");

            CollectionsMamtha pod2=new CollectionsMamtha();
            pod2.printPod2Names(names);
            System.out.println();
            pod2.printExceptDeepshika(names);
            System.out.println();
            System.out.println(pod2.compareTwoLists(names,names1));
            System.out.println();
            pod2.removeDuplicate(names,names1);
//            pod2.compareTwoLists(names,names1);



        }


    }

