package com.company.abstractPractice;

abstract class parent {
    int age;
//    contructor
//    parent(int age){
//        this.age = age;
//    }
    abstract void name(String name);

    abstract void partner(String name, int age);
}

class son extends parent {
//    son(int age){
//        super(age);
//
//    }
    @Override
    void name(String name) {
        System.out.println("My name is : " + name);
    }

    @Override
    public void partner(String name, int age) {
        System.out.println("Age and Name of partner is : " + age + " " + name);
    }
}

public class abtractdemo {
    public static void main(String[] args) {
        son Rihan = new son();
        Rihan.name("rihan");
        Rihan.partner("Komal", 12);
    }

}
