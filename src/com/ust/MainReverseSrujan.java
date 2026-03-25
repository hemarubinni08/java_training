package com.ust;

public class MainReverseSrujan {
    public static void main(String[] args) {
        String name = "srujan";
        String reversed = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }
        System.out.println("The reversed name is : " + reversed);

    }

}
