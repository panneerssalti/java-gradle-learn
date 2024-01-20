package org.example;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println(countCharacters("panneer"));
    }
    static Map<Character,Long> countCharacters(String string){
        string.chars().forEach(System.out::println);
        return string.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    private static Map<Integer,Long> calculateOccurence(List<Integer> numberList){
        return numberList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
