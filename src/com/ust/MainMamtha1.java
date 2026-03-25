package com.ust;

public class MainMamtha1{
    public static void main(String[] args){

        String str = "Mamatha";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }

}
