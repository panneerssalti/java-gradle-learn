package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArmstrongNumber {
    public static void main(String[] args) {
       printArmstrongNumbers(10000);
    }

    static void printArmstrongNumbers(int numberUpto){
        System.out.println("====================ARMSTRONG NUMBERS=========================");
        for(int number=0;number<=numberUpto;number++) {
            int originalNumber, n = 0, sum;
            var arrLis = new ArrayList<Integer>();
            for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n) {
                arrLis.add(originalNumber%10);
            }
            int finalN = n;
            sum = arrLis.stream().map(digit -> (int) Math.pow(digit, finalN)).reduce(0, Integer::sum);
            if(number == sum){
                System.out.println(number);
            }
        }
    }

    static int countNumberOfDigits(int number){
        int originalNumber,n=0;
        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n){
            System.out.println("original number :- "+originalNumber);
            System.out.println("n :- "+n);
        }
        return n;
    }
}