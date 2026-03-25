package com.ust;

public class WhileLoopVarsha {
    public static void main(String[] args) {
        String name = "varsha";
        int i = 0;
        while (i < name.length()) {
            if (name.charAt(i) == 's') {
                break;
            }

            System.out.print(name.charAt(i));
            i++;
        }
    }
}
