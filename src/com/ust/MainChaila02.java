package com.ust;

public class MainChaila02 {
    public static void main(String[] args) {
        String name = "Chaila";
        int i = 0;
        while (i<=name.length()) {
            if(name.charAt(i)=='a')
                break;
            System.out.print(name.charAt(i));
            i++;
        }
    }
}
