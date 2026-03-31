package com.ust.collections;

import java.util.List;

public class SortedListYesh {
    public void sortingList(List<String> teamMembers){

        for(int i=0;i< teamMembers.size()-1;i++){
            int minIndex= i;
            for(int j=i+1;j< teamMembers.size();j++){
                if ((teamMembers.get(j).compareTo(teamMembers.get(minIndex)))<0){
                    minIndex=j;
                }
            }
            String temporary= teamMembers.get(i);
            teamMembers.set(i,teamMembers.get(minIndex));
            teamMembers.set(minIndex,temporary);
        }
        System.out.println(teamMembers);
    }
}
