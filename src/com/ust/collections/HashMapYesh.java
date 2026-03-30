package com.ust.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapYesh {
    public void iterateEmployees(Map<Integer, String> employeesMap) {
        for (Map.Entry<Integer, String> entrySet : employeesMap.entrySet()) {
            System.out.println(entrySet.getKey() + "-" + entrySet.getValue());
        }
        employeesMap.entrySet().forEach(entrySet -> System.out.println(entrySet.getKey() + "-" + entrySet.getValue()));
    }

    public void containsEmployee(Map<Integer, String> employeesMap, Integer id, String name) {
        for (Map.Entry<Integer, String> entryset : employeesMap.entrySet()) {
            if (entryset.getKey().equals(id)) {
                continue;
            } else {
                System.out.println(entryset.getKey() + "-" + entryset.getValue());
            }
        }
        employeesMap.entrySet().removeIf(employee -> employee.getKey().equals(id));
        System.out.println(employeesMap);
        employeesMap.entrySet().stream().filter(employee -> !(employee.getKey().equals(id))).forEach(employee -> System.out.println(employee.getKey() + "-" + employee.getValue()));
    }

    public void checkForDuplicates(Map<Integer, String> employees, Map<Integer, String> secondMap) {
        Map<Integer, String> resultMap = new HashMap<>();
        resultMap.putAll(employees);
        resultMap.putAll(secondMap);
        for (Map.Entry<Integer, String> employee : employees.entrySet()) {
            if (secondMap.containsKey(employee.getKey())) {
                resultMap.remove(employee.getKey());
            }
        }
        for (Map.Entry<Integer, String> employee : resultMap.entrySet()) {
            System.out.println(employee.getKey() + "-" + employee.getValue());
        }
        resultMap.entrySet().stream().filter(entry -> !(employees.containsKey(entry.getKey()) && secondMap.containsKey(entry.getKey()))).forEach(entrySet -> System.out.println(entrySet.getKey() + "-" + entrySet.getValue()));
        for (String value : employees.values()) {
            if (secondMap.containsValue(value)) {
                resultMap.values().remove(value);
            }
        }
        for (Map.Entry<Integer, String> employee : resultMap.entrySet()) {
            System.out.println(employee.getKey() + "-" + employee.getValue());
        }
    }
}


