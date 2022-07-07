package com.company.staticKeyword;

class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

//    creating an reference variable of Singleton class


    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

public class singleton {
    public static void main(String[] args) {
        Singleton OBJ = Singleton.getInstance();
        System.out.println(OBJ);
    }
}
