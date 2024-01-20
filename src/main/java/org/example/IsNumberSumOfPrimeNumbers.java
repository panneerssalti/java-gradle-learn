package org.example;

import java.util.ArrayList;

public class IsNumberSumOfPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isSumOfPrimeNumbers(7));
        System.out.println(isSumOfPrimeNumbers(18));
        System.out.println(isSumOfPrimeNumbers(6));
    }

    private static boolean isSumOfPrimeNumbers(int sum){
        var primeNumbersAvailable = new ArrayList<Integer>();
        for(int i=2;i<sum;i++){
            if(isPrime(i)){
                primeNumbersAvailable.add(i);
            }
        }
        for(int i=0;i<primeNumbersAvailable.size();i++){
            for(int j=0;j<primeNumbersAvailable.size();j++){
                if(i!=j){
                    if(primeNumbersAvailable.get(i)+primeNumbersAvailable.get(j)==sum){
                        System.out.println("the sum of the prime numbers "+primeNumbersAvailable.get(i)+" and "+primeNumbersAvailable.get(j)+" forms the sum "+sum+" given");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private static boolean isPrime(int number){
        for(int i =2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }


}
