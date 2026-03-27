package com.ust.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsShoaib {
    public void printName(List<String>names){
        names.stream().forEach(iterate-> System.out.println(iterate));
    }
    public void printName2(List<String>names){
        for(String iterator:names)
        {
            if(!iterator.equals("Fijul"))
            {
                System.out.println(iterator);
            }
        }
        names.stream().filter(name->!name.equals("Fijul")).toList().forEach(name-> System.out.println(name));

    }
    public void printName3(List<String>names1,List<String>names2)
    {
        List<String> combinedList=new ArrayList<>();
        List<String>temp=new ArrayList<>();
        for(String iterator:names1)
        {
            if(!names2.contains(iterator))
            {
             temp.add(iterator);
            }
        }
        for(String iterator:names2)
        {
            if(!names1.contains(iterator))
            {
                temp.add(iterator);
            }

        }
        for(String iterator:temp)
        {
            System.out.println(iterator);
        }

        var stream1=names1.stream().filter(i->!names2.contains(i));
        var stream2=names2.stream().filter(i->!names1.contains(i));
        Stream.concat(stream1,stream2).forEach(System.out::println);

        combinedList.addAll(names1);
        combinedList.addAll(names2);
       var stream3= combinedList.stream().filter(i->!names2.contains(i));
       var stream4=combinedList.stream().filter(i->!names1.contains(i));
        Stream.concat(stream3,stream4).forEach(System.out::println);




    }
    }

