package com.ust;

public class ReverseName {
    public static void main(String[] args) {
        String Name = "Gopinath";
        System.out.println(reverseName(Name));
    }

    public static String reverseName(String Name) {
        StringBuilder revString = new StringBuilder(" ");
        for (int i = Name.length() - 1; i >= 0; i--) {
            revString.append(Name.charAt(i));
        }
        return revString.toString();
    }
}
