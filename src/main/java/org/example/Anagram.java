package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("pop","ppo"));
    }

    private static boolean isAnagram(String string1,String string2){
        var string1Array = string1.toCharArray();
        var string2Array = string2.toCharArray();
        Arrays.sort(string1Array);
        Arrays.sort(string2Array);
        return new String(string1Array).equals(new String(string2Array));
    }

    private static boolean isAnagram2(String a,String b){
        return sortedCaseInsensitiveString(a).equals(sortedCaseInsensitiveString(b));
    }

    private static String sortedCaseInsensitiveString(String str){
        var collect = str.chars().mapToObj(c -> (char) c).map(Objects::toString).map(String::toLowerCase).collect(Collectors.joining());
        System.out.println(collect);
        return collect;
    }
}
