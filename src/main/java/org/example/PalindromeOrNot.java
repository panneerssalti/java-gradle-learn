package org.example;

public class PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println(isPalindromeOrNot("malayalam"));
    }

    static boolean isPalindromeOrNot(String string){
        return new StringBuilder(string.toLowerCase()).reverse().toString().equals(string);
    }
}
