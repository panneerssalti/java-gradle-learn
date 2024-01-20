package org.example;

import java.util.Comparator;
import java.util.LinkedList;

public class ReversedLinkedList {
    public static void main(String[] args) {
        var linkedList = new LinkedList<String>();
        linkedList.add("panneer");
        linkedList.add("selvam");
        linkedList.add("hari");
        linkedList.add("prasad");
        System.out.println("original linked list "+ linkedList);
        reverseLinkedList(linkedList);
        System.out.println("reversed linked list "+ linkedList);
    }

    private static void reverseLinkedList(LinkedList<String> linkedList){
         linkedList.sort(Comparator.reverseOrder());
    }
}
