package com.ust;

public class StringHarsh {
    public static void main(String args[]) {
        String s = "harsh Pratap Singh";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse().toString());

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
