package com.ust;

public class FindingTheLetterNavaneeth {
    public static void main(){
        String name = "Navaneeth";
        char target = 'a';

        int i = 0;
        boolean found = false;

        while (i < name.length()) {
            char ch = name.charAt(i);
            System.out.println(ch);

            if (ch == target) {
                found = true;
                System.out.println("Letter found at index: " + i);
                break;
            }
            i++;
        }

        if (!found) {
            System.out.println("Letter not found");
        }
    }
}
