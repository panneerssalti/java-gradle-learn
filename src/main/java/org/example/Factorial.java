package org.example;

public class Factorial {
    public static void main(String[] args) {
        printFactorial(100);
    }

    static void printFactorial(int upto){
        for (long i = 0;i<=upto;i++){
            System.out.println("Number : "+i+" Factorial : "+calculateFactorial(i));
        }
    }

    static long calculateFactorial(long number){
        if(number == 0 || number == 1){
            return 1;
        }else{
            return calculateFactorial(number-1)*number;
        }
    }
}
