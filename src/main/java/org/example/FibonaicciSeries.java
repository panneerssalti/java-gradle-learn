package org.example;

public class FibonaicciSeries {
    public static void main(String[] args) {
        printFibonaicciSeries(100);
    }

    private static void printFibonaicciSeries(int upto) {
        int num1 = 0,num2 = 1,sum=0;
        System.out.print(num1+" "+num2+" ");
        while(sum<=upto) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum+" ");
        }
    }
}
