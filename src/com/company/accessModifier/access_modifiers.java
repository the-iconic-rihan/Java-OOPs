package com.company.accessModifier;

import java.util.Arrays;

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
        A obj = new A(12, "rihan");
//        1. access the data member.
//        2.access
        int[] arr = new int[]{1, 2, 3};
        for (int i=0; i<= arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[ arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
