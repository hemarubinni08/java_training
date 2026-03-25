package com.ust;

public class While {
    public static void main(String[] args) {
        String str = "Logeshwaran";
        int i = 0;
        while (i < str.length()) {
            char original = str.charAt(i);
            if (original == 'a')
                break;
            System.out.print(original);
            i++;
        }
    }
}
