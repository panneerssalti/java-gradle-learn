package org.example;

import java.util.*;

public class MissingNumberInArray {
    public static void main(String[] args) {
        System.out.println(findMissingNumberInArrayAndReturnArray(new Integer[]{1,2,3,5}));
    }

    private static List<Integer> findMissingNumberInArrayAndReturnArray(Integer[] arrayOfNumbers){
        var arrayList = new ArrayList<>(Arrays.asList(arrayOfNumbers));
        arrayList.sort(Comparator.naturalOrder());
        var max = arrayList.get(arrayList.size()-1);
        var missingNumbers = new ArrayList<Integer>();
        for (Integer i = 0;i<=max;i++){
            if(!arrayList.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
