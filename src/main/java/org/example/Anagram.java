package org.example;

import java.util.Arrays;

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
}
