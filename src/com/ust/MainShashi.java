package com.ust;

import com.ust.impl.CarAbstractShashiImpl;
import com.ust.impl.CarInterfaceShashiImpl;
import com.ust.impl.TractorAbstractShashiImpl;
import com.ust.impl.TractorInterfaceShashiImpl;

public class MainShashi {
    /*public static void main(String[] args) {
         System.out.println(addTwoNumbers(4, 5));
        System.out.println(subtractTwoNumber(15, 8));
        ArithmeticOperations arithmeticObject = new ArithmeticOperations();
        System.out.println(arithmeticObject.addTwoNumbers(10, 20));
        System.out.println(arithmeticObject.subtractTwoNumbers(40, 28));
        System.out.println(arithmeticObject.multiplicationTwoNumbers(15, 3));
    }

   public static Integer addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static Integer subtractTwoNumber(int a, int b) {
        return a - b;
    }*/
    /*public static void main(String[] args) {
        TractorShashi tractor = new TractorShashi();
        CarShashi car = new CarShashi();
        System.out.println("Tractor details: " + tractor.getBrandName() + " " + tractor.getModelName() + "\n" + tractor.getNumberOfWheels() + "\n" + tractor.getBrakeType() + "\n" + tractor.getFuelType());
        System.out.println("Car details: " + car.getBrandName() + " " + car.getModelName() + "\n" + car.getNumberOfWheels() + "\n" + car.getBrakeType() + "\n" + car.getDoorOpeningType() + "\n" + car.getAirConditioning() + "\n" + car.getFuelType()+"\n"+car.getYearsOfInsurance());
    }*/
    /*public static void main(String[] args) {
        TractorInterfaceShashiImpl tractor = new TractorInterfaceShashiImpl();
        CarInterfaceShashiImpl car = new CarInterfaceShashiImpl();
        System.out.println("Tractor details: " + tractor.getBrandName() + " " + tractor.getModelName() + "\n" + tractor.getNumberOfWheels() + "\n" + tractor.getBrakeType() + "\n" + tractor.getFuelType());
        System.out.println("Car details: " + car.getBrandName() + " " + car.getModelName() + "\n" + car.getNumberOfWheels() + "\n" + car.getBrakeType() + "\n" + car.getDoorOpeningType() + "\n" + car.getAirConditioning() + "\n" + car.getFuelType() + "\n" + car.getYearsOfInsurance());
    }*/
    static void main() {
        TractorAbstractShashiImpl tractor = new TractorAbstractShashiImpl();
        CarAbstractShashiImpl car = new CarAbstractShashiImpl();
        System.out.println("Tractor details: " + tractor.getBrandName() + " " + tractor.getModelName() + "\n" + tractor.getNumberOfWheels() + "\n" + tractor.getBrakeType() + "\n" + tractor.getFuelType());
        System.out.println("Car details: " + car.getBrandName() + " " + car.getModelName() + "\n" + car.getNumberOfWheels() + "\n" + car.getBrakeType() + "\n" + car.getDoorOpeningType() + "\n" + car.getAirConditioning() + "\n" + car.getFuelType() + "\n" + car.getYearsOfInsurance());
    }
}
