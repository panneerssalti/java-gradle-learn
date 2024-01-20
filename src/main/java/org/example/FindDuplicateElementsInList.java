package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementsInList {
    public static void main(String[] args) {
        System.out.println(findDuplicates(List.of(3,4,6,5,5,2,3)));
    }

    private static List<Integer> findDuplicates(List<Integer> listOfNumbers){
        var duplicateList = new ArrayList<Integer>();
        Map<Integer,Long> duplicateMap = listOfNumbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        duplicateMap.forEach((key,value)->{
            if(value>1){
                duplicateList.add(key);
            }
        });
        return duplicateList;
    }
}
