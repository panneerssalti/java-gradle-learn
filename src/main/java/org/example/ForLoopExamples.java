package org.example;

public class ForLoopExamples {
    public static void main(String[] args) {
        printOutputFromForLooopWithAssignment();
    }

    private static void printOutputFromForLooopWithAssignment(){
        for (int i=0,j=10;i<=5&&j>=5;i++,j--){
            System.out.println("printing i = "+i+" and j = "+j);
        }
    }
}
