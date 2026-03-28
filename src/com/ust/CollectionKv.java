package com.ust;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class CollectionKv {
//     public void collectionIterations(List<String> names) {
  //       for (String name : names) {
    //         System.out.println(name);
      //   }
     //}
    //public void listIteration(List<String> sree) {
      // for (String name : sree) {
        //    System.out.println(sree);
        //}
    //}

    public static void getNonDuplicate(List<String> names, List<String> sree){
        List<String> mergedList = new ArrayList<>();

        //System.out.println(result);
        //for(String name: names) {
            //  if (!sree.contains(name)) {
            //   result.add(name);
            //  }
        //}
        //for(String name: sree) {
            //  if (!names.contains(name)) {
            //   result.add(name);}
        //}
        names.stream().filter(name->!sree.contains(name)).forEach(mergedList::add);
        sree.stream().filter(name->!names.contains(name)).forEach(mergedList::add);

        Stream.concat(
               names.stream().filter(name->!sree.contains(name)),
                sree.stream().filter(name->!names.contains(name))
           ).forEach(System.out::println);
    }

     //public static void collectionIteration(List<String> names) {
     // for(String name: names) {
       // if (!name.equals("navya")) {
         //   System.out.println(name);
        //}
      //}
      //names.stream().filter(name->!name.equals("navya")).toList().forEach( name-> System.out.println(name));
      //}
}







