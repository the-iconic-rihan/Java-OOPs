package com.company.accessModifier;

class A {
    private int num;
    String name;
    int[] arr;

    public A(String name) {
        this.name = name;
        this.arr = new int[10];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        A obj = new A("rihan");
//        1. access the data member.
//        2.modify the data
        obj.setNum(12);
        System.out.println(obj.getNum());
    }
}
