package com.company.accessModifier;

class A {
    int num;
    String name;
    int[] arr;

    public A(int num, String name) {
        this.name = name;
        this.num = num;
        this.arr = new int[10];
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        A obj = new A(12,"rihan");
//        1. access the data member.
//        2.access
    }
}
