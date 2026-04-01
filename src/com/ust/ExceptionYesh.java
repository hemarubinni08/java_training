package com.ust;

import java.util.ConcurrentModificationException;
import java.util.List;

public class ExceptionYesh {
    public void HandlingException(List<String> teamMembersNames) {
       try{
           System.out.println(teamMembersNames.get(teamMembersNames.size()));
           for (String name : teamMembersNames) {
            teamMembersNames.remove(1);
        }
    }
       catch (ConcurrentModificationException e){
           System.out.println(e);
       }
       catch (IndexOutOfBoundsException e) {
           System.out.println(e);
       }
    }
    public void HandlingWithMain(List<String> teamMembersNames)throws ConcurrentModificationException{
        for(String name : teamMembersNames){
            teamMembersNames.remove(name);
        }
    }
}
