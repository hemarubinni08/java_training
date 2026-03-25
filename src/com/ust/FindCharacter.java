package com.ust;

public class FindCharacter {
    public static void main(String[] args) {
        String name = "harshavardhan";
        char find = 'a';
        String subName = "";
        char[] splittedArray = name.toCharArray();
        int i = 0;
        while (i < splittedArray.length) {
            if (splittedArray[i] == 'a') {
                System.out.println("Character position is: " + i);
                break;
            }
            subName = subName + splittedArray[i];
            i++;
        }
        System.out.println(subName);
    }
}
