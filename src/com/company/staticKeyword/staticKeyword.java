package com.company.staticKeyword;

//The working of "static" keyword.
public class staticKeyword {

    public static void main(String[] args) {
        // write your code here
        staticKeyword greet = new staticKeyword();
        greet.fun2();
    }

    static void greeting_1() {
        //throws an error  becuase the non static can't be called at static method;

//        greeting();

        System.out.println("I'm static method");
        //        to call a non static method in static method the non static method have to create its instance;

    }

    void greeting() {
//        A static can be called at non - static method.
        greeting_1();
        System.out.println("I'm non static method");
    }

    void fun2() {
        greeting();
    }
}
