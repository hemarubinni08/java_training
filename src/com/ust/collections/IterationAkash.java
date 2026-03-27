package com.ust.collections;
import java.util.ArrayList;
import java.util.List;

public class IterationAkash {
    public void nameIterationForLoop(List<String> names)
    {
        for(String name: names)
        {
            System.out.println(name);
        }
    }
    public void nameIterationStream(List<String> names)
    {
        names.forEach(System.out::println);
    }
    public void deleteNeighbour(List<String> names)
    {
        System.out.println(names.stream().filter(name->!name.equalsIgnoreCase("Yeshwanth")).toList());
    }
}
