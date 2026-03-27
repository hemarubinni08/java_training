package com.ust;

import com.ust.impl.BikeAbstracLekhyatImpl;
import com.ust.impl.BikeLekhyaImpl;
import com.ust.impl.CarAbstractLekhyaImpl;
import com.ust.impl.CarLekhyaImpl;
import com.ust.imple.CollectionLekhya;

import java.util.ArrayList;
import java.util.List;

public class MainLekhya {
    public static void main(String[] args) {
        /*CarAbstractLekhyaImpl car = new CarAbstractLekhyaImpl();
        BikeAbstracLekhyatImpl bike = new BikeAbstracLekhyatImpl();
        System.out.println(car.getRpm());
        System.out.println(bike.fuelUsed());
        System.out.println(car.hasAc());
        */
        /*ArithmeticOperations obj1 = new ArithmeticOperations();
        System.out.println(obj1.addNumbers(2, 3));
        System.out.println(obj1.addNumbers(2, 3, 4));
        */
        CollectionLekhya obj1 = new CollectionLekhya();
        List<String> names = new ArrayList<>();
        names.add("Lekhya");
        names.add("Chaila");
        names.add("Aron");
        names.add("Logesh");
        names.add("Shashi");
        System.out.println(names);
        obj1.namesOfThePodMembers(names);
    }
}
