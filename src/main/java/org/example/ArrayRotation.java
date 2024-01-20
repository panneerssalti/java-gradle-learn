package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayRotation {
    public static void main(String[] args) {
        printArrayRotation();
    }

    private static Integer[] rotateArray(Integer[] array,int rotationTimes){
        var ll = new LinkedList<>(Arrays.asList(array));
        for(int i = 0;i<=rotationTimes;i++){
            var first = (Integer) ll.pollFirst();
            ll.addLast(first);
        }
        return ll.toArray(new Integer []{});
    }
    private static void printArrayRotation(){
        int[] array = {1, 2, 3, 4, 5}; // Change this to the desired array
        int steps = 5; // Change this to the desired number of steps

        int length = array.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; ++i) {
            var j = (i + steps) % length;
            System.out.println(j);
            rotatedArray[j] = array[i];
        }

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nRotated array: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
