package com.ust;

import java.io.IOException;
import java.util.ArrayList;

public class GokulException {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("gokul");
        names.add("harsh");
        names.add("deepak");
        names.add("navya");
        names.add("keerthi");
        names.add(null);

        try {

            for (int i = 0; i < names.size(); i++) {
                for (int j = i + 1; j < names.size(); j++) {
                    if (names.get(i).charAt(0) > names.get(j).charAt(0)) {
                        String temp = names.get(i);
                        names.set(i, names.get(j));
                        names.set(j, temp);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            names.remove(null);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught");

        }
        finally {
            System.out.println("completed");
        }

        System.out.println(names);
    }
}