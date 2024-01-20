package org.example;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(10));
        primeNumberChecker(150);
    }

    private static boolean primeNumberChecker(int number) {
        var isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static boolean isPrimeNumber(int numbertoBeChecked){
        return primeNumberChecker(numbertoBeChecked);
    }

}
