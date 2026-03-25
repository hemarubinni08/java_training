package com.ust;

public class StringHarsh {
    public static void main(String args[]) {
        String name = "harsh Pratap Singh";
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.reverse().toString());

        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}
