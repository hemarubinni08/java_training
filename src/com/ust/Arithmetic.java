package com.ust;

public class Arithmetic {
    public static void main(String[] args)
    {
        Arithmetic obj=new Arithmetic();
        obj.calculate(2,4);
    }

    public static void calculate(int a,int b){
        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
    }
}
