package org.example;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        findDuplicateElement(new String[]{"panneer","selvam","hari","hari","tons"});
    }

    private static <T> void findDuplicateElement(T[] arrayOfElements) {
        var map = Arrays.stream(arrayOfElements).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((key,value)->{
            if(map.get(key)>1){
                System.out.println(key +" appears more than once");
            }else {
                System.out.println(key +" appears only once");
            }
        });
    }
}
