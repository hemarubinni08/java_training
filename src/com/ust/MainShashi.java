package com.ust;

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
    public static void main(String[] args) {
        TractorShashi tractor = new TractorShashi();
        CarShashi car = new CarShashi();
        System.out.println("Tractor details: " + tractor.brandName() + " " + tractor.modelName() + "\n" + tractor.numberOfWheels() + "\n" + tractor.brakeType() + "\n" + tractor.fuelType());
        System.out.println("Car details: " + car.brandName() + " " + car.modelName() + "\n" + car.numberOfWheels() + "\n" + car.brakeType() + "\n" + car.doorOpeningType() + "\n" + car.airConditioning() + "\n" + car.fuelType()+"\n"+car.yearsOfInsurance());
    }
}
