package org.example;

import java.util.regex.Pattern;

public class CountVowelConsonants {
    public static void main(String[] args) {
        System.out.println(countVowelAndConsonants("paneer"));
    }

    private static CountVC countVowelAndConsonants(String input) {
        var vowels = 0;
        var vowelRegex = "[aeiouAEIOU]";
        var pattern = Pattern.compile(vowelRegex);
        var matcher = pattern.matcher(input);
        while (matcher.find()) {
            vowels++;
        }
        return new CountVC(vowels, input.length() - vowels);
    }
}

record CountVC(int vowel, int consonants) {
    @Override
    public String toString() {
        return "count of Vowels is " + vowel + " and count of Consonants is " + consonants;
    }
}
