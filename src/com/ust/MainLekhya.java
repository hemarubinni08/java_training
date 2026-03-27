package com.ust;

import com.ust.impl.BikeAbstracLekhyatImpl;
import com.ust.impl.BikeLekhyaImpl;
import com.ust.impl.CarAbstractLekhyaImpl;
import com.ust.impl.CarLekhyaImpl;

public class MainLekhya {
    public static void main(String[] args) {
        /*CarAbstractLekhyaImpl car = new CarAbstractLekhyaImpl();
        BikeAbstracLekhyatImpl bike = new BikeAbstracLekhyatImpl();
        System.out.println(car.getRpm());
        System.out.println(bike.fuelUsed());
        System.out.println(car.hasAc());
        */
        ArithmeticOperations obj1 = new ArithmeticOperations();
        System.out.println(obj1.addNumbers(2, 3));
        System.out.println(obj1.addNumbers(2, 3, 4));
    }
}
