package com.ust;

import java.util.ArrayList;
import java.util.List;

public class CollectionsKushal {

    public void doIteration(List<String>podMembersList){
        for(String podMember:podMembersList){
            System.out.println(podMember);
        }

        podMembersList.forEach(podMember-> System.out.println(podMember));

        System.out.println(podMembersList.stream().toList());
    }
    public void doIterationExcludingNeighbour(List<String>podMembersList){
        for(String podMember:podMembersList){
            if(!podMember.equalsIgnoreCase( "srujaN")){
                System.out.println(podMember);
            }
        }

        System.out.println("c1");
        podMembersList.stream().filter(podMember -> !podMember.equals("Srujan")).toList().forEach(podMember-> System.out.println(podMember));
        System.out.println("c2");
        System.out.println(podMembersList.stream().filter(podMember -> !podMember.equals("Srujan")).toList());
    }

    public  void doIterationRemoveDuplicatesFromTwoLists(List<String>podMembers, List<String>nonPodMembers){
        List<String> resultList = new ArrayList<>();
        List<String> resultList1 = new ArrayList<>();

        podMembers.addAll(nonPodMembers);
        for(String podMember:podMembers){
            if(!resultList.contains(podMember)){
                resultList.remove(podMember);
                continue;
            }
            else{
                resultList.add(podMember);
            }
        }
        resultList.forEach(name-> System.out.println(name));

        resultList1.addAll(podMembers.stream().filter(name->!resultList.contains(name)).toList());
        System.out.println(resultList1);
    }

    public  void doIterationRemoveDuplicatesFromTwoLists1(List<String>podMembers, List<String>nonPodMembers){
        List<String> resultList1 = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        for(String name:podMembers){
            if(!nonPodMembers.contains(name)){
                resultList.add(name);
            }
        }
        for(String name:nonPodMembers){
            if(!podMembers.contains(name)){
                resultList.add(name);
            }
        }
        System.out.println(resultList);
//        resultList.forEach(name -> );
        resultList1.addAll(podMembers.stream().filter(name->!nonPodMembers.contains(name)).toList());
        resultList1.addAll(nonPodMembers.stream().filter(name->!podMembers.contains(name)).toList());
        resultList1.forEach(name-> System.out.println(name));
    }
}
