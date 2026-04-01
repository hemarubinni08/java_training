package com.ust;

import java.util.List;
import java.util.Set;

public class SortAlphabeticalArdra {
    List<String> sortNamesList(List<String> namesList) {
        String temp;
        for (int i = 0; i < namesList.size(); i++) {
            for (int j = 0; j < (namesList.size() - i - 1); j++) {
                if ((namesList.get(j)).compareTo(namesList.get(j + 1)) > 0) {
                    temp = namesList.get(j);
                    namesList.set(j, namesList.get(j + 1));
                    namesList.set(j + 1, temp);
                }
            }
        }
        return namesList;
    }

    void printList(List<String> namesList) {
        namesList.forEach(System.out::println);
    }
}
