package org.example.inheritence;

public class Child extends Parent{
    public static void main(String[] args) {
        new Child().method();
    }

    void method(){
        System.out.println(this.VALUE);
        System.out.println(super.VALUE);
        System.out.println(super.hill);
        System.out.println(this.hill);
        System.out.println(this.bill);
    }
}
